<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Grade Computation using Model View Controller Model 2 Approach</title>
</head>
<body>
	<h2>Grade Computation using Model View Controller Model 2 Approach</h2>
	<p><b>Page Display using JSP 2.0 Expression Language</b></p>
	
	<p>ID: <b>${applicationScope.estudyante.id}</b></p>
	<p>Name: <b>${applicationScope.estudyante.name}</b></p>
	<p>Midterm Grade: <b>${applicationScope.estudyante.midterm}</b></p>
	<p>Pre-Final Grade: <b>${applicationScope.estudyante.preFinal}</b></p>
	<p>Final: <b>${applicationScope.estudyante.finalGrade}</b></p>
	<p>Remarks: <b>${applicationScope.estudyante.remarks}</b></p>
	
	<hr/>
	
	<form action='index.jsp'>
		<input type="submit" value='<< GO BACK >>'>
	</form>
	
</body>
</html>