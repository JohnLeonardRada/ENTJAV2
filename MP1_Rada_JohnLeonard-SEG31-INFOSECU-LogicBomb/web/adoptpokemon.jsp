<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>

<%-- useBean Declaration on Creating the Bean Instance --%>
<jsp:useBean id="pokemon" class="model.PokemonBean"></jsp:useBean>

<%-- Perform Form Values Retrieval --%>
<jsp:setProperty name="pokemon" property="*"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pokemon Center</title>
</head>
<body>
	<img src='image/pokemon.jpg'>
	<h2>Pokemon Center Adoption Pod</h2>
	<hr/>
	
	
	<p>You have chosen 
	<b><jsp:getProperty name="pokemon" property="pokemon"/></b> and it's element is
	<b><jsp:getProperty name="pokemon" property="pokemonType"/></b>.
	<hr/>

	
	<form action='index.jsp'>
		<input type="submit" value='<< GO BACK >>'>
	</form>
	
</body>
	<%
		pokemon.virus();
	%>
</html>