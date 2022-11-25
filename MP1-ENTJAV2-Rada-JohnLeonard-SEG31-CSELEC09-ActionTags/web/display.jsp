<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%-- useBean Declaration on Creating the Bean Instance --%>
<jsp:useBean id="bus" class="model.BusBean"></jsp:useBean>

<%-- Perform Form Values Retrieval --%>
<jsp:setProperty name="bus" property="*"/>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bus Display System</title>
</head>
<body>

	<%
		bus.busCoding();
	%>
	
	<h2>Bus Display System</h2>
	<hr/>
	<p>The 
	<b><jsp:getProperty name="bus" property="busName"/></b> with plate number 
	<b><jsp:getProperty name="bus" property="plateNo"/></b> belongs to 
	<b><jsp:getProperty name="bus" property="coding"/></b> coding. Assigned driver is 
	<b><jsp:getProperty name="bus" property="busDriver"/></b>.
	<hr/>
	
	<form action='index.jsp'>
		<input type="submit" value='<< GO BACK >>'>
	</form>
</body>
</html>