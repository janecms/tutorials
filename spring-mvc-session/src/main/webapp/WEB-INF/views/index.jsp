<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BORAJI.COM</title>
</head>
<body>
  <h1>User Login</h1>

  <form:form action="dologin" method="post" modelAttribute="user">
    <table>
      <tr>
        <td>Email</td>
        <td><input type="text" name="email" /></td>
      </tr>
      <tr>
        <td>Password</td>
        <td><input type="text" name="password" /></td>
      </tr>
      <tr>
        <td><button type="submit">Login</button></td>
      </tr>
    </table>
  </form:form>

  <span style="color: red;">${message}</span>
</body>
</html>