<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Справка:</title>
</head>
<body>
<h1>Номера зачетных книжек указаны ниже:</h1>
<p><strong>Модератор: Пупков Егор Андреевич - 19130149</strong></p>
<p><strong>Первый участник: Шамсутдинов Руслан Маратович - 19130342</strong></p>
<p><strong>Второй участник: Денисов Никита Андреевич - 19130174</strong></p>
<p><strong>Третий участник: Леонтьев Владимир Алексеевич - 19130155</strong></p>
<form action="${pageContext.request.contextPath}/Read" method="post">
	<input type="submit" name="sign" value="Назад">
	</form>
</body>
</html>