<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Struts 2 Payroll Computation</title>
</head>
<body>
	<h2>Struts 2 Payroll Computation Details</h2>
	<p>Name: <b>${name}</b></p>
	<p>Hours Worked: <b>${hoursWorked}</b></p>
	<p>Pay rate: <b>Php${ratePerHour}</b></p>
	<p>Basic Pay: <b>Php${basicPay}</b></p>
	<p>Overtime Pay: <b>Php${overtimePay}</b></p>
	<p>GrossPay: <b>Php${grossPay}</b></p>
	<p>Tax: <b>Php${tax}</b></p>
	<p>NET PAY: <b>Php${netPay}</b></p>
	
	<hr/>
	<p><i>&copy; 2020 iAcademy Game Changers</i></p>
</body>
</html>