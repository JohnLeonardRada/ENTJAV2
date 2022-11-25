<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
    
<%-- This is the jspUseBean tag. Here, we will create an object named student of
type Model.StudentBean. The use of the id attribute is the same as
Student student = new Student(); --%>
<jsp:useBean id="student" class="model.StudentBean"/>

<%-- We will then retrieve all the form parameters and automatically set and convert (if needed).
For us to perform auto-mapping of form parameters retrieval, the name of the form ids must
be the same as the name of the privately declared instance variables in the JavaBean.

Note: The value of the name attribute of the setProperty must be the id value of the useBean.

The property="*" means all that matches the names of the forms and names of the bean
will be retrieved and set. It's the same as these statements

	String name = request.getParameter("name");
	student.setName(name); 
 --%>
<jsp:setProperty name="student" property="*"/>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
<title>JSP Action Tag Demo</title>
</head>
<body>
	<h2>JSP Action Tag Demo</h2>
	
	<%-- Display all the attributes from the student object using 
	the jsp:getProperty. Please take note that name equivalent is 
	the id value of the useBean tag. This is also the same like 
	the setProperty. --%>
	<h2>Page Content Display using JSP getProperty Action Tag</h2>
	<p>Name: <b><jsp:getProperty  name="student" property="name"/></b></p>
	<p>Course: <b><jsp:getProperty  name="student" property="course"/></b></p>
	<p>Year Level: <b><jsp:getProperty  name="student" property="yearLevel"/></b></p>
	<hr/>
	
	<h2>Page Content Display using JSP Expression</h2>
	<p>Name: <b><%=student.getName()%></b></p>
	<p>Course: <b><%=student.getCourse()%></b></p>
	<p>Year Level: <b><%=student.getYearLevel()%></b></p>
	<hr/>
	
	<%-- In the JSP Expression Language, using it especially on grabbing JavaBean properties is
	very simple. All we have to do is use the object name followed by the dot(.) notation when the
	actual privately declared instance variable name. I know you have this question, why is it possible
	to call an access modifier private outside the class? Actually, it is the getter methods that are
	being called. This feature is what you called auto-mapping. --%>
	<h2>Page Content Display using JSP Expression Language</h2>
	<p>Name: <b>${student.name}</b></p>
	<p>Course: <b>${student.course} <%=student.getCourse()%></b></p>
	<p>Year Level: <b>${student.yearLevel}</b></p>
	<hr/>
	
	<form action = "index.jsp">
		<input type="submit" value="<< GO BACK >>">
	</form>

</body>
</html>