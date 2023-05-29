package com.library;

import java.time.LocalDate;

public class Book {

	private String title;
	private BookType bookType;
	private String authorName;
	private double price;
	LocalDate publishedDate;
	private int quantity;

	public Book() {
		super();
	}
	public Book(String title, BookType bookType, String authorName, double price, LocalDate publishedDate,
			int quantity) {
		super();
		this.title = title;
		this.bookType = bookType;
		this.authorName = authorName;
		this.price = price;
		this.publishedDate = publishedDate;
		this.quantity = quantity;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BookType getBookType() {
		return bookType;
	}
	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", bookType=" + bookType + ", authorName=" + authorName + ", price=" + price
				+ ", publishedDate=" + publishedDate + ", quantity=" + quantity + "]"+"\n";
	}






}
