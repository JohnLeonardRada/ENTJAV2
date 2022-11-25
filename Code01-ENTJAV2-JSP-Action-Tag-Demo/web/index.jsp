<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
<title>JSP Action Tag Demo</title>
</head>
<body>
	<h2>JSP Action Tag Demo</h2>
	<form action="process.jsp" method="post">
		<p>Enter Name:
			<input type="text" name="name" size="50"/></p>
		<p>Enter Course:
			<input type="text" name="course" size="50"/></p>
		<p>Enter Year Level:
			<input type="text" name="yearLevel" size="50"/></p>
		<p><input type="submit" value="Register"/> &nbsp;&nbsp;&nbsp;
		   <input type="reset"/> 		
	</form>
</body>
</html>