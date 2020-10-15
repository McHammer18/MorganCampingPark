<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Camper Sign up</title>
</head>
<body>
<form action ="addItemServlet"method="post">
First Name: <input type ="text"name ="firstName">
Last Name: <input type ="text"name ="lastName">
Phone: <input type ="text"name ="phone">
<input type ="submit"value="Add Item">
</form>
<br />
<a href ="index.html">change to hiker</a>
</body>
</html>