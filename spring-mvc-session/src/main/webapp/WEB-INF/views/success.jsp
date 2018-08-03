<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BORAJI.COM</title>
</head>
<spring:url value="/user/info" var="user_info" />
<body>
  <h1>Login Success Page</h1>
  <p>You are logged in with email ${user.email}.</p>
 
  <!-- Click here to view the session attributes -->
  <a href="${user_info}">View profile</a>
</body>
</html>