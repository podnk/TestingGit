<%@page import="java.beans.PropertyEditorSupport"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<%
		String nameCookie = "login";
		Cookie[] cookies = request.getCookies();
		Cookie cookie = null;
		
		if(cookies != null)
		{
			for(int i = 0; i < cookies.length; i++)
			{
				String cookieName = cookies[i].getName();			
				if(cookieName.equals(nameCookie))
				{
					cookie = cookies[i];
					break;
				}
			}			
		}
		
	%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Show Cookies</title>
</head>
<body>
	Value: <%= cookie.getValue() %>
</body>
</html>