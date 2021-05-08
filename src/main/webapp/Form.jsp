<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script>
function myFunction1(e) {
	document.getElementById("priceForOneChair").value = e.target.value
}
function myFunction2(e) {
	document.getElementById("priceKarkas").value = e.target.value
}
function myFunction3(e) {
	document.getElementById("priceObivka").value = e.target.value
}
function myFunction4(e) {
	document.getElementById("priceNapolnitel").value = e.target.value
}
function myFunction5(e) {
	var x = document.getElementById("kk").value;
	var x1 = document.getElementById("priceForOneChair").value = x*1.5;
	 var cb = document.getElementById("checkbox_check");
	  if (cb.checked) {
		  document.getElementById("priceForOneChair").value = x*1.5;
	  } else {
		  document.getElementById("priceForOneChair").value = x1/1.5;
	  }
}
</script>
<meta charset="UTF-8">
<title>Калькулятор стоимости производства мягкой мебели</title>
</head>
<body>
<h1 style="position:relative;text-align:center">Калькулятор стоимости производства мягкой мебели</h1>
<form action="${pageContext.request.contextPath}/JavaCalc" method="post">
<label style="position:relative;left: 45%">Вид стула:</label>
		<select id="kk" name="VidStula" required onchange="myFunction1(event);" style="position:relative;left: 45%">
    <option selected disabled =""></option>
    <option value="3000">Игровое кресло</option>
    <option value="2000">Офисное кресло</option>
    <option value="500">Пуфик</option>
    <option value="1500">Кресло-качалка</option>
    <option value="1000">Стул с мягкой спинкой</option>
   </select>
  <p><label style="position:relative;left: 34%;">Материал каркаса:</label>
		<select name="priceKarkas" required onchange="myFunction2(event);"  style="position:relative;left: 34%;width:8%">
    <option selected disabled =""></option>
    <option value="500">Металл</option>
    <option value="250">Дерево</option>
    <option value="100">Пластик</option>
   </select>
   <label style="position:relative;left: 38.5%">Стоимость каркаса:</label>
		<input id="priceKarkas" readonly size="15" style="position:relative;left: 38.5%">
</p>
    <p><label style="position:relative;left: 34%">Материал обивки:</label>
		<select name="priceObivka" required onchange="myFunction3(event);" style="position:relative;left: 34%;width:8%" >
    <option selected disabled =""></option>
    <option value="500">Искусственная кожа</option>
    <option value="800">Эко-кожа</option>
    <option value="550">Ткань</option>
    <option value="1800">Замша</option>
    <option value="830">Вельвет</option>
   </select> 
   <label style="position:relative;left: 35%">Стоимость материала обивки:</label>
		<input id="priceObivka" readonly size="15" style="position:relative;left:35%">
</p>
    <p><label style="position:relative;left: 34%">Материал наполнителя:</label>
		<select name="priceNapolnitel" required onchange="myFunction4(event);" style="position:relative;left: 34%;width:6%">
    <option selected disabled =" "></option>
    <option value="400">Поролон</option>
    <option value="130">Синтепон</option>
    <option value="2700">Войлок</option>
   </select> 
    <label style="position:relative;left: 36.9%">Стоимость наполнителя:</label>
		<input id="priceNapolnitel"  readonly size="15" style="position:relative;left: 36.9%">
</p>
<p> <label style="position:relative;left: 40%">Количество стульев:</label>
		<input type="number" min="1"  name="NumberChair"  required style="position:relative;left: 40%"> </p>
<p> <label style="position:relative;left: 37%">Стоимость работы за 1 стул:</label>
		<input id="priceForOneChair" name="priceForOneChair"  readonly style="position:relative;left: 37%"> </p>
<p><label style="position:relative;left: 41.5%">Срочный заказ:</label>
        <input type ="checkbox" onclick="myFunction5(event);" id="checkbox_check" name="check" style="position:relative;left: 41.5%"> </p>
	<input style="position:relative;left: 45%" type="submit" value=" Рассчитать ">
	</form>
	<form action="${pageContext.request.contextPath}/Spravka.jsp" method="post">
	<input style="position:relative;left: 45%" type="submit" value=" Справка ">
	</form>
	</body>
</html>
