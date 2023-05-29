package com.library.student;

import java.util.List;
import java.util.Objects;
import com.library.Book;

public class Student {
	
	private int id;
	private String Name;
	private List<Book> bookList;
	public static int ID = 100;
	


	public Student(String name, List<Book> bookList) {
		super();
		this.id = ID++;
		Name = name;
		this.bookList = bookList;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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
	public int hashCode() {
		return Objects.hash(Name, bookList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Name, other.Name) && Objects.equals(bookList, other.bookList);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", bookList=" + bookList + "]"+"\n";
	}

	
	
}
