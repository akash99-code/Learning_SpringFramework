<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>~~ Restaurant ~~</h1>
	<h4>Congratulations, your order has been processed successfully </h4>
	
	<h4>Oreder Details ::</h4>
	<table>
		<tr>
			<td>Name:</td>
			<td> ${ORD.name}</td>
		</tr>
		<tr>
			<td>Table No.:</td>
			<td> ${ORD.table}</td>
		</tr>
		<tr>
			<td>Dish Name:</td>
			<td> ${ORD.dish}</td>
		</tr>
		
		
	</table>
	
	
</body>
</html>