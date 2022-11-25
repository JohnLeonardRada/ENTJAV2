<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Struts 2 Payroll Computation</title>
</head>
<body>
	<h2>Struts 2 Payroll Computation</h2>
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
	</form>
</body>
</html>