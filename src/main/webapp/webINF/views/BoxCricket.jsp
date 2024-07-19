<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Box Cricket Registration</h2>

	<form action = "SaveReg" method="post">
		
		Name: <input type="text" name="StudentName">
		<span style="color:red">${StudentNameError}</span>
		<br><br>
		 Player Type: 
			BetsMan : <input value = "BM"	type="radio" name="PlayerType">
			Bowller : <input value = "BW"	type="radio" name="PlayerType">
			All Rounder : <input value = "AR"	type="radio" name="PlayerType">
			<span style="color:red">${PlayerTypeError}</span>
			<br><br>
		Food : 
			<select name = "Food">
				<option value="-1">-----Select-----</option>
				<option value="jain">Jain</option>
				<option value="Regular">Regular</option>
			</select>
			<span style="color:red">${FoodError}</span>
			<br><br>
		Drink :
			RedBull : <input type="checkbox" name="drink" value="RedBull"/>
			Mountend dio: <input type="checkbox" name="drink" value="Mountend dio"/>
			Coca Cola : <input type="checkbox" name="drink" value="Coca Cola"/>
			Lemon Juice : <input type="checkbox" name="drink" value="Lemon Juice"/>
			<br><br>
		<input type="submit" value="Register"/>
	</form>
</body>
</html>