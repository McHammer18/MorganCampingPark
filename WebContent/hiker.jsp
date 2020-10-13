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
		<input type="text" name="camperFirst" size="45">
		<br>
		Last name:
		<input type="text" name="camperLast" size="45">
		<br>
		Path to hike: 
		<input type="text" name = "path" size = 45>
		<br>
		Date:
		<input type="text" name = "date" size = 45>
		<br>
		
		<input type="submit" value ="Sign form"/>
	</form>
</body>
</html>