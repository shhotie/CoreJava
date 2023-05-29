package com.library;

import java.util.List;

public class Student {
	
	public static int ID = 100;
	private String Name;
	private List<Book> bookList;
	
	public Student() {
		super();
	}

	public Student(String name, List<Book> bookList) {
		super();
		Name = name;
		this.bookList = bookList;
	}

	public static int getID() {
		return ID;
	}

	public static void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", bookList=" + bookList + "]";
	}
	
	
}
