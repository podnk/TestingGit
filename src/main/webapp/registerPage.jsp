<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Регистрация</title>
</head>
<body>
	<form action="" method="post">
		Имя: <input type="text" name="name"><br/>
		Фамилия: <input type="text" name="surname"><br/>
		Дата рождения: <input type="date" name="calendar"><br/>
		Email: <input type="text" name="email"><br/>
		Логин: <input type="text" name="loginReg"><br/>
		Пароль: <input type="password" name="passwordReg"><br/>
		Пол: <select name="sex">
				<option>Мужской</option>
				<option>Женский</option>
			</select>
		<input type="submit" name="finishReg" value="Зарегистрироваться"><br/>
		
	</form>
</body>
</html>