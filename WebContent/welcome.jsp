<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>
<%
if (request.getAttribute("isLoginSuccessful") != null && (Boolean)request.getAttribute("isLoginSuccessful")) {
%>

<h3> Welcome ${name}</h3>

<%
} else {
	%>

<h3> Please go to login page</h3>
	
<%
}
	 %>
	 


</body>
</html>