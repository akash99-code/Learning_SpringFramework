<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Form</title>
</head>
<body>
	<h1>${head}</h1>
	<h2>Student's Library Form</h2>
	<form action="submitLibraryForm.html"  method="post">
	<form:errors path="s1.*"/>
	
	<table>
	<tr>
		<td>Student's Name:</td><td> <input type="text" name="studentName"/></td>
	</tr>
	<tr>
		<td>Registration Number:</td><td> <input type="text" name="studentRegd"/></td>
	</tr>
	<tr>
		<td>Course: </td><td><input type="text" name="studentCourse"/></td>
	</tr>
	<tr>
		<td>Semester:</td><td> <input type="text" name="studentSem"/></td>
	</tr>
	
	<tr>
		<td>Subject: </td>
		<td>
		<select name="studentSubject" >
		<option value="Adv-Java" >Adv-Java</option>
		<option value="Microprocessor" >Microprocessor</option>
		<option value="E-Com" >E-Com</option>
		<option value="System Software" >System Software</option>
		<option value="Linux " >Linux</option>
		<option value="Awareness" >Awareness</option></select>
		</td>
	</tr>
	
	<tr>
		<td>Issue Date:</td><td> <input type="text" name="issueDate"/></td>
	</tr>
	<tr>
		<td> Return Date:</td><td> <input type="text" name="returnDate"/></td>
	</tr>
	</table>
	<p> </p>
	<table>
	<tr> <td> Book Details ~</td></tr>
	<tr>
		<td>Serial No.: <input type="text" name="bookDetails.serialNo"/></td>
		<td>Author: <input type="text" name="bookDetails.author"/></td>
		<td>Publication: <input type="text" name="bookDetails.publication"/></td>
		<td>ISBN-No.: <input type="text" name="bookDetails.isbn"/></td>
		
	</tr>
	</table>
	
	<p> </p>
	<input type="submit" value="Submit the form"/>
	</form>
	
</body>
</html>