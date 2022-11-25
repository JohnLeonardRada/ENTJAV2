<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bus Display System</title>
</head>
<body>
	<h2>Bus Display System</h2>
	
	<hr/>
	<p>The
	<b>${applicationScope.vehicle.busName}</b> with plate number
	<b>${applicationScope.vehicle.plateNo}</b> belongs to
	<b>${applicationScope.vehicle.coding}</b> coding. Assigned driver is 
	<b>${applicationScope.vehicle.busDriver}</b></p>
	
	<hr/>
	
	<form action='index.jsp'>
		<input type="submit" value='<< GO BACK >>'>
	</form>
	
</body>
</html>