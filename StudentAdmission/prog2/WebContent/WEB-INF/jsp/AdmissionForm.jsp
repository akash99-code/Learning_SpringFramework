<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${head}</h1>
	<h2>Student Admission Form</h2>
	<form action="submitAdmissionForm.html"  method="post">
	<form:errors path="s1.*"/>
	<p>
		Student's Name: <input type="text" name="studentName"/>
	</p>
	<p>
		Student's Hobby: <input type="text" name="studentHobby"/>
	</p>
	<p>
		Student's Mobile: <input type="text" name="studentMobile"/>
	</p>
	<p>
		Student's DOB: <input type="text" name="studentDOB"/>
	</p>
	<p>
		Student's Skills set: 
		<select name="studentSkills" multiple>
		<option value="java core" >java core</option>
		<option value="spring core" >Spring core</option>
		<option value="spring mvc" >Spring mvc</option></select>
	</p>
	<table>
	<tr><td>Student's Address</td></tr>
	<tr>
		<td>country: <input type="text" name="studentAddress.country"/></td>
		<td>city: <input type="text" name="studentAddress.city"/></td>
		<td>street: <input type="text" name="studentAddress.street"/></td>
		<td>pin code: <input type="text" name="studentAddress.pincode"/></td>
		
	</tr>
	</table>
	<input type="submit" value="Submit the form"/>
	</form>
	
</body>
</html>