<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>

<%-- useBean Declaration on Creating the Bean Instance --%>
<jsp:useBean id="forex" class="model.ForexBean"></jsp:useBean>

<%-- Perform Form Values Retrieval --%>
<jsp:setProperty name="forex" property="*"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BPI Forex Computation System</title>
</head>
<body>
	<img src='image/bpiforex.jpg'>
	<h2>BPI Forex Computation System</h2>
	
	<%
		forex.convertAmount();
	%>
	
	<h2>Page Content Display using JSP getProperty Action Tag</h2>
	<p>Your equivalent peso amount of <b>
	<jsp:getProperty name="forex" property="pesoAmount"/> is equivalent to
	<jsp:getProperty name="forex" property="currencyEquivalent"/>
	<jsp:getProperty name="forex" property="convertedAmount"/></b>.
	<hr/>
	
	<h2>Page Content Display using JSP Expression</h2>
	<p>Your equivalent peso amount of <b>
	<%=forex.getPesoAmount()%> is equivalent to
	<%=forex.getCurrencyEquivalent()%>
	<%=forex.getConvertedAmount()%></b>.
	<hr/>	
	
	<h2>Page Content Display using JSP Expression Language</h2>
	<p>Your equivalent peso amount of <b>
	${forex.pesoAmount} is equivalent to
	${forex.currencyEquivalent}
	${forex.convertedAmount}</b>.
	<hr/>
	
	<%
		//declare local variables
		double pesoAmount = Double.parseDouble(request.getParameter("pesoAmount"));
		String currency = request.getParameter("currency");
		
		forex.setPesoAmount(pesoAmount);
		forex.setCurrency(currency);
		
		forex.convertAmount();
	%>
	<h2>Page Content Display using Scriptlet Tag</h2>
	<p>Your equivalent peso amount of <b>
	<%=forex.getPesoAmount() %> is equivalent to 
	<%=forex.getCurrencyEquivalent() %>
	<%=forex.getConvertedAmount()%></b>.
	<hr/>
	
	<%!
		double peso(double pesoAmount){
			return pesoAmount;
		}
	%>
	<h2>Page Content Display using Declaration Tag</h2>
	<p>Your equivalent peso amount of <b>
	<%= pesoAmount %> is equivalent to
	<%=forex.getCurrencyEquivalent() %>
	<%=forex.getConvertedAmount()%></b>.
	<hr/>
	
	<form action='index.jsp'>
		<input type="submit" value='<< GO BACK >>'>
	</form>
</body>
</html>