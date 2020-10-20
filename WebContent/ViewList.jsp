<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Guest List</title>
</head>
<body>
	<sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://camper-cis175.cta7wvbywkyo.us-east-1.rds.amazonaws.com/camp"
        user="admin" password="Dmacc2020"
    />
     
    <sql:query var="listHiker" dataSource="${myDS}">
        SELECT * FROM hiker;
    </sql:query>
     
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Hikers</h2></caption>
            <tr>
                <th>ID</th>
                <th>First</th>
                <th>Last</th>
                <th>Phone</th>
            </tr>
            <c:forEach var="hiker" items="${listHiker.rows}">
                <tr>
                    <td><c:out value="${hiker.HIKER_ID}" /></td>
                    <td><c:out value="${hiker.FIRST_NAME}" /></td>
                    <td><c:out value="${hiker.LAST_NAME}" /></td>
                    <td><c:out value="${hiker.PHONE}" /></td>
                </tr>
            </c:forEach>
        </table>
        <sql:query var="listCamper" dataSource="${myDS}">
        SELECT * FROM camper;
    </sql:query>
         <table border="1" cellpadding="5">
            <caption><h2>List of Campers</h2></caption>
            <tr>
                <th>ID</th>
                <th>First</th>
                <th>Last</th>
                <th>Phone</th>
            </tr>
            <c:forEach var="camper" items="${listCamper.rows}">
                <tr>
                    <td><c:out value="${camper.CAMPER_ID}" /></td>
                    <td><c:out value="${camper.FIRST_NAME}" /></td>
                    <td><c:out value="${camper.LAST_NAME}" /></td>
                    <td><c:out value="${camper.PHONE}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    
    <a href="index.html">Return to home page</a>
    
</body>
</html>