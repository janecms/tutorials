<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>BORAJI.COM</title>
</head>
<body>
<h2>Spring MVC - File Download Example</h2>
<hr>
<ul>
    <li><a href="<spring:url value="/download1"/>">Download File 1</a></li>
    <li><a href="<spring:url value="/download2"/>">Download File 2</a></li>
    <li><a href="<spring:url value="/download3"/>">Download File 3</a></li>
</ul>

<ul>
    <li><a href="<spring:url value="/upload"/>">上传文件</a></li>
</ul>
</body>
</html>