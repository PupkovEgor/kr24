<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Результат сложения</title>
</head>
<body>
<h1>Результат сложения</h1>
<h2>Ваши введеные данные:</h2>
<p><strong>Первое слагаемое:</strong> ${first_result}</p>
<p><strong>Второе слагаемое:</strong> ${second_result}</p>
<p><strong>Результат:</strong> ${result}</p>

<form action="${pageContext.request.contextPath}/Form.jsp">
    <input type="submit" name="sign" value="Назад">
    </form>

</body>
</html>