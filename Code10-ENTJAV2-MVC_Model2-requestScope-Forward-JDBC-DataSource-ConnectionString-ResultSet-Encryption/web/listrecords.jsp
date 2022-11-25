<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="utility.Security" %>    
    
<jsp:useBean id="records" type="java.sql.ResultSet" scope="request" />
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Grade Computation using Model View Controller Model 2 Approach</title>
</head>
<body>
	<h2 align="center">List of Student Records</h2>
	<table border="1" cellpadding="2px" cellspacing="2px" align="center">
		<tr>
			<th>#</th>
			<th>ID</th>
			<th>Name</th>
			<th>Midterm</th>
			<th>Pre-Final</th>
			<th>FINAL GRADE</th>
			<th>Remarks</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<% while (records.next()) {%>
				<tr>
					<td align="center"><%=records.getInt("id") %></td>
					
					<%
						String studentId = Security.decrypt(records.getString("studentId"));
					%>
					<td align="center"><%=studentId%></td>
					<td><%= Security.decrypt(records.getString("name")) %></td>
					<td align="center"><%=records.getDouble("midterm")%></td>
					<td align="center"><%=records.getDouble("preFinal")%></td>
					<td align="center"><%=records.getDouble("finalGrade")%></td>
					<td><%=records.getString("remarks")%></td>
					
					<% String urlUpdateStudent = "update.action?studentId="+studentId; 
					  String urlDeleteStudent = "delete.action?studentId="+studentId;
					%>
					
					<td align="center"><a href=<%=urlUpdateStudent%>><img src='images/update.jpg' height="32px" width="32px"/></a></td>
					<td align="center"><a href=<%=urlDeleteStudent%>><img src='images/delete.jpg' height="32px" width="32px"/></a></td>
					
				</tr>
		<% } %>
	</table>
	<hr/>
	<form action='index.html'>
		<input type="submit" value='<< GO BACK >>'>
	</form>
</body>
</html>