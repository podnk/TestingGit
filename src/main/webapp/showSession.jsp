<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String s1 = (String) session.getAttribute("loginLog");
    	String s2 = (String) session.getAttribute("passwordLog");
    %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>SHOW SESSION</title>
</head>
<body>
	<h2><b>SHOW SESSION</b></h2>
	
    
	Session 1: <font color="red"> <%= s1 %> </font> <br/>
	Session 2: <font color="green"> <%= s2 %> </font> <br/>
	
</body>
</html>