<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String loginLog = (String)request.getAttribute("loginLog");
    	String passwordLog = (String)request.getAttribute("passwordLog");
    
    	session.setAttribute("loginLog", loginLog);
    	session.setAttribute("passwordLog", passwordLog);
    %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<a href="showSession.jsp">showSession</a>
</body>
</html>