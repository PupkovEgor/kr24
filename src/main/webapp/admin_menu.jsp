<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>ADMIN</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/WriteFile" method="post">
<h1 style="position:relative;text-align:center">Панель администратора</h1>
<h3>Стоимость вида стула:</h3>
   <p>Игровой стул:
   <input name="v1" type="number" min="1" max="10000" name="NumberChair"></p>
   <p>Офисное кресло:
   <input name="v2" type="number" min="1" max="10000" name="NumberChair"></p>
   <p>Пуфик:
   <input name="v3" type="number" min="1" max="10000" name="NumberChair"></p>
   <p>Кресло-качалка:
   <input name="v4" type="number" min="1" max="10000" name="NumberChair"></p>
   <p>Стул с мягкой спинкой:
   <input name="v5" type="number" min="1" max="10000" name="NumberChair"></p>
<h3>Стоимость материала каркаса:</h3>
   <p>Металл:
   <input name="k1" type="number" min="1" max="10000" name="NumberChair"></p>
   <p>Дерево:
   <input name="k2" type="number" min="1" max="10000" name="NumberChair"></p>
   <p>Пластик:
   <input name="k3" type="number" min="1" max="10000" name="NumberChair"></p>
<h3>Стоимость материала обивки:</h3>
   <p>Искусственная кожа:
   <input name="ob1" type="number" min="1" max="10000" name="NumberChair" ></p>
   <p>Эко-кожа:
   <input name="ob2" type="number" min="1" max="10000" name="NumberChair"></p>
   <p>Ткань:
   <input name="ob3" type="number" min="1" max="10000" name="NumberChair"></p>
   <p>Замша:
   <input name="ob4" type="number" min="1" max="10000" name="NumberChair"></p>
   <p>Вельвет:
   <input name="ob5" type="number" min="1" max="10000" name="NumberChair"></p>
<h3>Стоимость материала наполнителя:</h3>
   <p>Поролон:
   <input name="nap1" type="number" min="1" max="10000" name="NumberChair"></p>
   <p>Синтепон:
   <input name="nap2" type="number" min="1" max="10000" name="NumberChair"></p>
   <p>Войлок:
   <input name="nap3" type="number" min="1" max="10000" name="NumberChair"></p>
   <input style="position:relative;left: 45%" type="submit" value="Изменить значения">
      </form>
  <a href="<c:url value='/logout' />" style="position:relative;left: 45%">Logout</a>
</body>
</html>