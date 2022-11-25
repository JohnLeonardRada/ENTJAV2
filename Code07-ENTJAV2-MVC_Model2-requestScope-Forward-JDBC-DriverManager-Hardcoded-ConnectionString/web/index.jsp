<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Grade Computation using Model View Controller</title>
</head>
<body>
	<h2>Grade Computation using Model View Controller</h2>
	<fieldset>
		<legend>Grade Compute Form</legend>
		<form action='computegrade.action' method="post">
			<p>Enter Student Id:
				<input type='text' name='id' size='15' required="required"/>
			</p>
			<p>Enter Name:
				<input type='text' name='name' size='35' required="required"/>
			</p>
			<p>Enter Midterm Grade:
				<input type='number' name='midterm' min='1' max="100" required="required"/>
			</p>
			<p>Enter Pre-Final Grade:
				<input type='number' name='preFinal' min='1' max="100" required="required"/>
			</p>
			<p>
				<input type='submit' value='Compute Final Grade'/>&nbsp;&nbsp;&nbsp;
				<input type='reset'/>
			</p>
		</form>
	</fieldset>
</body>
</html>