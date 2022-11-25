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
	<h2>Struts 2 Payroll Computation Details Using JSP Expression Language</h2>
	<p>Name: <b>${name}</b></p>
	<p>Hours Worked: <b>${hoursWorked}</b></p>
	<p>Pay rate: <b>Php${ratePerHour}</b></p>
	<p>Basic Pay: <b>Php${basicPay}</b></p>
	<p>Overtime Pay: <b>Php${overtimePay}</b></p>
	<p>GrossPay: <b>Php${grossPay}</b></p>
	<p>Tax: <b>Php${tax}</b></p>
	<p>NET PAY: <b>Php${netPay}</b></p>
	
	<hr/>
	<h2>Struts 2 Payroll Computation Details Using OGNL Tag Library</h2>
	<p>Name: <b><s:property value="name"/></b></p>
	<p>Hours Worked: <b><s:property value="hoursWorked"/></b></p>
	<p>Pay rate: <b>Php<s:property value="ratePerHour"/></b></p>
	<p>Basic Pay: <b>Php<s:property value="basicPay"/></b></p>
	<p>Overtime Pay: <b>Php<s:property value="overtimePay"/></b></p>
	<p>GrossPay: <b>Php<s:property value="grossPay"/></b></p>
	<p>Tax: <b>Php<s:property value="tax"/></b></p>
	<p>NET PAY: <b>Php<s:property value="netPay"/></b></p>
	<p><i>&copy; 2020 iAcademy Game Changers</i></p>
	
	<hr/>
	<s:form action="index.jsp">
		<s:submit value="GO BACK"></s:submit>
	</s:form>
</body>
</html>