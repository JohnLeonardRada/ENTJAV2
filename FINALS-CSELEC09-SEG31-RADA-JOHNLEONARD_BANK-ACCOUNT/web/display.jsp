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
	<hr/>
	<h2>Bank Account Details Using OGNL Tag Library</h2>
	<p>Name: <b><s:property value="name"/></b></p>
	<p>Account Type: <b><s:property value="accountType"/></b></p>
	<p>Account Balance: <b>Php <s:property value="accountBalance"/></b></p>
	<p><b><s:property value="message"/></b></p>

	<p><i>&copy; 2020 iAcademy Game Changers</i></p>
	<p></p>
	<hr/>
	<s:form action="index.jsp">
		<s:submit value="GO BACK"></s:submit>
	</s:form>
</body>
</html>