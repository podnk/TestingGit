<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<%
		Cookie loginCookie = new Cookie("login", request.getParameter("login"));
		loginCookie.setMaxAge(365*24*60*60);
		response.addCookie(loginCookie);
	%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Set Cookies</title>
</head>
<body>
	<a href="showCookies.jsp">COOKIES!</a>
</body>
</html>