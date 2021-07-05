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
	
	<h1>Details submitted by you::</h1>
	<table>
		<tr>
			<td>Name:</td>
			<td> ${s1.studentName }</td>
		</tr>
		<tr>
			<td>Registration Number:</td>
			<td> ${s1.studentRegd }</td>
		</tr>
		<tr>
			<td>Course:</td>
			<td> ${s1.studentCourse }</td>
		</tr>
		<tr>
			<td>Semester:</td>
			<td> ${s1.studentSem }</td>
		</tr>
		<tr>
			<td>Subject:</td>
			<td> ${s1.studentSubject }</td>
		</tr>
		<tr>
			<td>Issue Date:</td>
			<td> ${s1.issueDate }</td>
		</tr>
		<tr>
			<td>Return Date:</td>
			<td> ${s1.returnDate }</td>
		</tr>
		<tr>
			<td>Book Details:</td>
			
			<td> 
			Serial No.: ${s1.bookDetails.serialNo }</td>
			
			<tr><td></td><td>
			Author: ${s1.bookDetails.author }</td></tr>
			
			<tr><td></td><td>
			Publication: ${s1.bookDetails.publication }</td></tr>
			
			<tr><td></td><td>
			ISBN: ${s1.bookDetails.isbn }</td>
			</tr>
			
		
	</table>
	

</body>
</html>