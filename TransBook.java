package com.infinite.LibraryProj;

import java.sql.Date;

public class TransBook {
 private String userName;
 private int bookId;
 private Date fromDate;
public TransBook() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "TransBook [userName=" + userName + ", bookId=" + bookId + ", fromDate=" + fromDate + "]";
}
public TransBook(String userName, int bookId, Date fromDate) {
	super();
	this.userName = userName;
	this.bookId = bookId;
	this.fromDate = fromDate;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public Date getFromDate() {
	return fromDate;
}
public void setFromDate(Date fromDate) {
	this.fromDate = fromDate;
}
 
}
