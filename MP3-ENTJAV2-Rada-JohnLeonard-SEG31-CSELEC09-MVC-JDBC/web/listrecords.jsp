<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="utility.Security" %>    
    
<jsp:useBean id="records" type="java.sql.ResultSet" scope="request" />
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bus Display System</title>
</head>
<body>
	<h2 align="center">List of Bus Coding</h2>
	<table border="1" cellpadding="2px" cellspacing="2px" align="center">
		<tr>
			<th>#</th>
			<th>Bus Name</th>
			<th>Plate Number</th>
			<th>Driver</th>
			<th>Coding Day</th>

		</tr>
		<% while (records.next()) {%>
				<tr>
					<td align="center"><%=records.getInt("id") %></td>
					<td align="center"><%=records.getString("busName")%></td>
					<td align="center"><%=records.getString("plateNumber")%></td>
					<td align="center"><%=records.getString("driver")%></td>
					<td align="center"><%=records.getString("codingDayAssigned")%></td>
				</tr>
		<% } %>
	</table>
	<hr/>
	<form action='index.jsp'>
		<input type="submit" value='<< GO BACK >>'>
	</form>
</body>
</html>