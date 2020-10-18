<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hiker details</title>
</head>
<body>
	<h1>Enter details of hiker here</h1>
	<form action = "OnSubmitServlet" method="post">
		First name:
		<input type="text" name="firstName" size="45">
		<br>
		Last name:
		<input type="text" name="lastName" size="45">
		<br>
		Date:
		<input type="date" name = "date" value="YYYY-MM-DD">
		<br>
		Phone Number:
		<input type="text" name = "phone" size = 45>
		<br>
		
		<input type="submit" value ="Sign form"/>
	</form>
</body>
</html>