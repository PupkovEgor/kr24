<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Не авторизован</title>
</head>
<body>
        <p>Пожалуйста пройдите авторизацию</p>
        <a href="<c:url value='/logout' />">Авторизация</a>
</body>
</html>