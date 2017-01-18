<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>SHOW SESSION</title>
</head>
<body>
	<h2><b>SHOW SESSION</b></h2>
	
    <%
    	String s1 = (String) session.getAttribute("loginLog");
    %>
    
	Session 1: <font color="red"> <%= s1 %> </font><br/>
	
</body>
</html>