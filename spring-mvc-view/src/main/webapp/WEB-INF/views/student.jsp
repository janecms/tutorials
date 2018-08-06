<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>BORAJI.COM</title>
</head>
<body>
<h2>Spring MVC 4 - ContentNegotiatingViewResolver example</h2>
<table border="1" style="width: 400px;">
  <tr>
    <th>ID</th>
    <td>${student.id}</td>
  </tr>
  <tr>
    <th>NAME</th>
    <td>${student.name}</td>
  </tr>
  <tr>
    <th>DOB</th>
    <td>${student.dob}</td>
  </tr>
  <tr>
    <th>EMAIL</th>
    <td>${student.email}</td>
  </tr>
</table>
</body>
</html>