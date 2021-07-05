package com.swami.controller;

import java.util.Date;

public class Library {
	private String studentName;
	private String studentRegd;
	private String studentCourse;
	private String studentSem;
	private String studentSubject;
	private Date issueDate;
	private Date returnDate;
	private Book bookDetails;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentRegd() {
		return studentRegd;
	}
	public void setStudentRegd(String studentRegd) {
		this.studentRegd = studentRegd;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public String getStudentSem() {
		return studentSem;
	}
	public void setStudentSem(String studentSem) {
		this.studentSem = studentSem;
	}
	public String getStudentSubject() {
		return studentSubject;
	}
	public void setStudentSubject(String studentSubject) {
		this.studentSubject = studentSubject;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Book getBookDetails() {
		return bookDetails;
	}
	public void setBookDetails(Book bookDetails) {
		this.bookDetails = bookDetails;
	}
}
	

