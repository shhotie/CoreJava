package com.library;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.exception.BookNotFoundException;

public class BookUtils {
	public static HashSet <Book> getBookList(){
		HashSet<Book> bookSet = new HashSet<>();
		Book b = new Book("Quantum Physics",BookType.valueOf("SCIENCE"),"Carl J. Pratt",3042.00, LocalDate.parse("2021-03-21"),10);
		bookSet.add(b);
		b = new Book("Dreamland",BookType.valueOf("FICTION"),"Nicolas Spark",1050.00, LocalDate.parse("2020-04-02"),20);
		bookSet.add(b);
		b = new Book("Akbar Birbal",BookType.valueOf("COMEDY"),"Amita Vohara Sarin",3042.00, LocalDate.parse("2005-03-11"),50);
		bookSet.add(b);
		b = new Book("C Programming",BookType.valueOf("TECH"),"Yashwant Kanetkar",3042.00, LocalDate.parse("2010-06-20"),70);
		bookSet.add(b);
		b = new Book("Shivaji The Great Maratha",BookType.valueOf("HISTORY"),"RAnjit Desai",3042.00, LocalDate.parse("2019-05-31"),30);
		bookSet.add(b);
		b = new Book("Half Girlfriend",BookType.valueOf("FICTION"),"Chetan Bhagat",2016.00, LocalDate.parse("2011-03-19"),90);
		bookSet.add(b);
		b = new Book("JAVA 8 Features",BookType.valueOf("TECH"),"Kathy Seirra",800.00, LocalDate.parse("2018-08-17"),05);
		bookSet.add(b);

		return bookSet;

	}
	
	public static Book searchByTittle(Set<Book> bookSet, String title) 
			throws BookNotFoundException {
		Iterator<Book> it = bookSet.iterator();
		while (it.hasNext())  {
			Book book = it.next();
			if (book.getTitle().equals(title)) return book;
		}
		
		throw new BookNotFoundException("No such Book element");
	}
}
