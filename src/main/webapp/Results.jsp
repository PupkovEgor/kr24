<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Стоимость производства мягкой мебели:</title>
</head>
<body>
<h1>Итоговая стоимость производства мягкой мебели:</h1>
<h2>Ваши введеные данные:</h2>
<p><strong>Вид стула: </strong>${vidstula_result}</p>
<p><strong>Материал каркаса:</strong>${karkas_result}</p>
<p><strong>Материал обивки:</strong>${obivka_result}</p>
<p><strong>Материал наполнителя:</strong>${napolnitel_result}</p>
<p><strong>Стоимость каркаса:</strong> ${first_result}</p>
<p><strong>Стоимость обивки:</strong> ${second_result}</p>
<p><strong>Стоимость наполнителя:</strong> ${third_result}</p>
<p><strong>Количество стульев:</strong> ${four_result}</p>
<p><strong>Стоимость работы за 1 стул:</strong> ${five_result}</p>
<p><strong>Срочный заказ:</strong> ${checked}</p>
<p><strong>Итоговая стоимость:</strong> ${result}</p>
<a href="Check.pdf"> Open PDF-file</a>	
<a href="Check.pdf" download> Download PDF-file</a>
<form action="${pageContext.request.contextPath}/Read" method="post" >
	<input type="submit" name="sign" value="Назад">
	</form>
<a href="<c:url value='/logout' />" style="position:relative;left: 45%">Logout</a>
</body>
</html>