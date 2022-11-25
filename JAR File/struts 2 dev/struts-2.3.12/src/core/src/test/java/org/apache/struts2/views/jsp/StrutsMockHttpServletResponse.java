uest.setMethod("DELETE");
		restActionInvocation.selectTarget();
		assertEquals(null, restActionInvocation.target);

        // disable content restriction to GET only
        model = new ArrayList<String>();
        model.add("Item1");
        restAction.model = model;

        request.setMethod("POST");
        restActionInvocation.setRestrictToGet("false");
        restActionInvocation.selectTarget();
        assertEquals(model, restActionInvocation.target);
        assertEquals(model.get(0), "Item1");
    }

	/**
	 * Test the not modified status code.
	 * @throws Exception
	 */
	public void testResultNotModified() throws Exception {

		request.addHeader("If-None-Match", "123");
		request.setMethod("GET");

		RestAction restAction = (RestAction)restActionInvocation.getAction();
		List<String> model = new ArrayList<String>() {
			@Override
			public int hashCode() {
				return 123;
			}
		};
		model.add("Item");
		restAction.model = model;
		
		restActionInvocation.processResult();
		assertEquals(SC_NOT_MODIFIED, response.getStatus());
        
    }
	
	/**
	 * Test the default error result.
	 * @throws Exception
	 */
	public void testDefaultErrorResult() throws Exception {
		
		// Exception
		Exception e = new Exception();
		restActionInvocation.getStack().set("exception", e);
		request.setMethod("GET");

		RestAction restAction = (RestAction)restActionInvocation.getAction();
		List<String> model = new ArrayList<String>();
		model.add("Item");
		restAction.model = model;
		
		restActionInvocation.setDefaultErrorResultName("default-error");
		ResultConfig resultConfig = new ResultConfig.Builder("default-error", 
			"org.apache.struts2.dispatcher.HttpHeaderResult")
	    	.addParam("status", "123").build();
	    ActionConfig actionConfig = new ActionConfig.Builder("org.apache.rest", 
				"RestAction", "org.apache.rest.RestAction")
	    	.addResultConfig(resultConfig)
	    	.build();
	    ((MockActionProxy)restActionInvocation.getProxy()).setConfig(actionConfig);
		
		restActionInvocation.processResult();
		assertEquals(123, response.getStatus());
		
	}
	
	public void testNoResult() throws Exception {
		
		RestAction restAction = (RestAction)restActionInvocation.getAction();
		List<String> model = new ArrayList<String>();
		model.add("Item");
		restAction.model = model;
		request.setMethod("GET");
		restActionInvocation.setResultCode("index");

		try {
			restActionInvocation.processResult();

    		// ko
    		assertFalse(true);
    		
    	} catch (ConfigurationException c) {
    		// ok, no result
    	}

	}
	
	/**
	 * Test the global execution
	 * @throws Exception
	 */
	public void testInvoke() throws Exception {
        
	    // Default index method return 'success'
	    ((MockActionProxy)restActionInvocation.getProxy()).setMethod("index");

	    // Define result 'success'
		ResultConfig resultConfig