<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>~~  Restaurant ~~</h1>
	<h3>Order your ${type}-Indian Dish.</h3>
	<form action="submitOrder.html"  method="post">
	<table>
	<tr>
		<td>Name :</td> 
		<td><input type="text" name="name"/></td>
	</tr>
	<tr>
		<td>Table No. :</td> 
		<td><input type="text" name="table"/></td>
	</tr>
	</table>
	Your Dish :
	<input type="radio" id="dish1" name="dish" value="${dish1}">
	<label for="dish1">${dish1}</label>
	<input type="radio" id="dish2" name="dish" value="${dish2}">
	<label for="dish2">${dish2}</label>
	<input type="radio" id="dish3" name="dish" value="${dish3}">
	<label for="dish3">${dish3}</label>
	
	<br>
	<p>
	<input type="submit" value="ORDER"/>
	</form>
	
</body>
</html>