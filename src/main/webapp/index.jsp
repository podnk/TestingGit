<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<title>Заголовок</title>
<body>
<h2>Главная страница</h2>
	<form action="myFirstUrl" method="post">
		Логин: <input type="text" name="login"/><Br>
		Пароль: <input type="password" name="password"/><Br>
		<input type="submit" name="enter" value="Войти"/>
		<input type="submit" name="register" value="Регистрация"/><Br>
		<input type="radio" name="testRadio" value="test"/>test<Br>
	</form>
	
	<b><a href="myFirstUrl">First URL</a></b>
	
</body>
</html>
