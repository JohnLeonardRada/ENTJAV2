<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
<title>Pokemon Center</title>
</head>
<body>
	<img src='image/pokemon.jpg'>
	<h2>Pokemon Center</h2>
	<fieldset>
		<legend>Pokemon Adoption Form</legend>
		<form action='adoptpokemon.jsp' method='post'>
			<p>Enter Pokemon:
				<input type='text' name='pokemon' required="required"/>
			</p>
			<p>Select Type:
				<select name="pokemonType">
					<option value="Fire">Bug</option>
					<option value="Dark">Dark</option>
					<option value="Dragon">Dragon</option>
					<option value="Electric">Electric</option>
					<option value="Fairy">Fairy</option>
					<option value="Fighting">Fighting</option>
					<option value="Fire">Fire</option>
					<option value="Flying">Flying</option>
					<option value="Ghost">Ghost</option>
					<option value="Grass">Grass</option>
					<option value="Ground">Ground</option>
					<option value="Ice">Ice</option>
					<option value="Normal">Normal</option>
					<option value="Poison">Poison</option>
					<option value="Psychic">Psychic</option>
					<option value="Rock">Rock</option>
					<option value="Steel">Steel</option>
					<option value="Water">Water</option>
				</select>
			</p>
			<p>
				<input type='submit' value='Adopt Pokemon'/>&nbsp;&nbsp;&nbsp;
				<input type='reset'/>
			</p>
		</form>
	</fieldset>
	<hr/>
	<p><i>&copy; 2020 Hoenn Pokemon Center</i></p>
</body>
</html>