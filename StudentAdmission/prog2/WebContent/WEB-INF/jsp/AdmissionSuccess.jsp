<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${head}</h1>
	<h2>Congratulations, ${head} has processed your application successfully </h2>
	
	<h1>Details submitted by you::</h1>
	<table>
		<tr>
			<td>Student name:</td>
			<td> ${s1.studentName }</td>
		</tr>
		<tr>
			<td>Student hobby:</td>
			<td> ${s1.studentHobby }</td>
		</tr>
		<tr>
			<td>Student mobile:</td>
			<td> ${s1.studentMobile }</td>
		</tr>
		<tr>
			<td>Student DOB:</td>
			<td> ${s1.studentDOB }</td>
		</tr>
		<tr>
			<td>Student SKills:</td>
			<td> ${s1.studentSkills }</td>
		</tr>
		<tr>
			<td>Student Address:</td>
			<td> 
			country: ${s1.studentAddress.country }
			city: ${s1.studentAddress.city }
			street: ${s1.studentAddress.street }
			pin code: ${s1.studentAddress.pincode }</td>
			
		</tr>
		
	</table>
	
	
</body>
</html>