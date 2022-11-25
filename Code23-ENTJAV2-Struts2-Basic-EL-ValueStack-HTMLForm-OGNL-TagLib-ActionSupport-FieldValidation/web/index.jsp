<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Struts 2 Payroll Computation</title>
</head>
<body>
	<!-- <h2>Struts 2 Payroll Computation Using Traditional HTML Form</h2>
	<form action='compute.action' method='post'>
		<p>Name:
			<input type='text' name='name' size='25'/> 
		</p>
		<p>Hours Worked:
			<input type='text' name='hoursWorked' size='5'/> 
		</p>
		<p>Rate Per Hour:
			<input type='text' name='ratePerHour' size='5'/> 
		</p>
		<p>
			<input type='submit' value='Compute Salary'/>
			<input type='reset'/>
	</form> -->
	
	<h2>Struts 2 Payroll Computation Using Struts 2 OGNL TagLib Form</h2>
	<s:form action="compute.action" method="post">
		<s:textfield key="name" label="Name" size="25"></s:textfield>
		<s:textfield key="hoursWorked" label="Hours Worked" size="5"></s:textfield>
		<s:textfield key="ratePerHour" label="Rate Per Hour" size="5"></s:textfield>
		<s:submit value="Compute Salary"></s:submit>
		<s:reset/>
	</s:form>

</body>
</html>