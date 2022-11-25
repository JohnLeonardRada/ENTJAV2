<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="estudyante" type="model.StudentBean" scope="request"/>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Grade Computation using Model View Controller Model 2 Approach</title>
</head>
<body>
	<h2>Grade Computation using Model View Controller Model 2 Approach</h2>
	<p><b>Page Display using JSP 1.2 getProperty</b></p>
	
	<p>ID: <b><jsp:getProperty name="estudyante" property="id" /></b></p>
	<p>Name: <b><jsp:getProperty name="estudyante" property="name" /></b></p>
	<p>Midterm Grade: <b><jsp:getProperty name="estudyante" property="midterm" /></b></p>
	<p>Pre-Final Grade: <b><jsp:getProperty name="estudyante" property="preFinal" /></b></p>
	<p>Final: <b><jsp:getProperty name="estudyante" property="finalGrade" /></b></p>
	<p>Remarks: <b><jsp:getProperty name="estudyante" property="remarks" /></b></p>
	
	<hr/>
	
	<form action='index.jsp'>
		<input type="submit" value='<< GO BACK >>'>
	</form>
</body>
</html>