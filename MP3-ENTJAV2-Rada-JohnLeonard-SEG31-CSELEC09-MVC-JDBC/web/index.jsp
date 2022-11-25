<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
<title>Bus Display System</title>
</head>
<body>
	<h2>Bus Display System</h2>
	<fieldset>
		<legend>Bus Form</legend>
		<form action='getcoding.action' method='post'>
			<p>Enter Bus Name: 
				<input type='text' name='busName' required="required"/>
			</p>
			<p>Enter Plate No.: 
				<input type='text' name='plateNo' required="required"/>
			</p>
			<p>Enter Driver's Name: 
				<input type='text' name='busDriver' required="required"/>
			</p>
			<p>
				<input type='submit' value='Submit'/>&nbsp;&nbsp;&nbsp;
				<input type='reset'/>
			</p>
		</form>
		
		<form action='listrecords.action'>
			<input type='submit' value="List ALL Records"/>
		</form>
	</fieldset>
	<hr/>
	<p><i>&copy; 2020 iAcademy Game Changers</i></p>
</body>
</html>