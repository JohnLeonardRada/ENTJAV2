<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Account Details</title>
</head>
<body>
	
	<h2>Bank Account Details Using Struts 2 OGNL TagLib Form</h2>
	<s:form action="compute.action" method="post">
		<s:textfield key="bank.name" label="Name" size="25"></s:textfield>
		<s:select key="bank.accountType" list="{'Savings Account', 'Current Account'}" label="Account Type"></s:select> 
		<s:textfield key="bank.accountBalance" label="Account Balance" size="5"></s:textfield>
		<s:submit value="Compute Salary"></s:submit>
		<s:reset/>
	</s:form>

</body>
</html>