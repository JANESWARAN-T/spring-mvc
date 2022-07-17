<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First on JSP</title>
</head>
<body>
Wassup!!!!  ${name} and ${password}

<form action="log.do" method="post">
<p><font color="red">${errorMessage}</font></p>
	Enter your name:<input type="text" name="name"/><br>
	Enter your password:<input type="password" name="password"/>
	<input type="submit" value="Login"/>
</form>
</body>
</html>