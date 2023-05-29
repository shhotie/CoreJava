package com.library.tester;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

import com.exception.BookNotFoundException;
import com.library.Book;
import com.library.BookType;
import com.library.BookUtils;

public class LibraryTester {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){
			HashSet<Book> bookSet = BookUtils.getBookList();
			int choice = 0;
			do {
				System.out.println("1. Add Book"
						+ "\n2. Display all the books"
						+ "\n3. Allot book to student"
						+ "\n4. Take book Return"
						+ "\n5. remove Book");
				System.out.println("Enter the choice");
				choice = sc.nextInt();

				switch(choice) {
				case 1:
					sc.nextLine();
					System.out.println("Enter title, bookType, authorName, price, published date qnd quantity of book");
					String title = sc.nextLine();
					BookType booktype = BookType.valueOf(sc.next());
					sc.nextLine();
					String authorName = sc.nextLine();
					Double price = sc.nextDouble();
					LocalDate date = LocalDate.parse(sc.next());
					int quantity = sc.nextInt();
					Book b = new Book(title,booktype, authorName, price, date, quantity);
					bookSet.add(b);
					System.out.println("Books Added Successfully");
					break;
				case 2:

					for(Book book : bookSet) {
						System.out.println(book);
					}
					break;
				case 3:
				
						System.out.println("Enter the title of the book to be alloted: ");
						title = sc.next();
						Book b1 =null;
						try {
							b1 = BookUtils.searchByTittle(bookSet, title);
						} catch (BookNotFoundException bnfe) {
							System.out.println(bnfe.getMessage());
						}
						
						System.out.println("Book Alloted");
						b1.setQuantity(b1.getQuantity()-1);
						System.out.println("Book Quantity remained: "+ b1.getQuantity());

					

					break;
				case 4:
					System.out.println("Enter the title of the book to be return: ");
					title = sc.next();
					for(Book book : bookSet) {
						if(book.getTitle().equals(title)) {
							System.out.println("Book Returned");
							book.setQuantity(book.getQuantity()+1);
							System.out.println("Book Quantity remained: "+ book.getQuantity());
						}
					}
					break;
				case 5:
					System.out.println("Enter the title of book to be removed");
					String title1 = sc.next();
					Book b2 = null;
					for(Book book : bookSet) {
						if(book.getTitle().equals(title1)) {
							b2 = book;
						}
					}
					bookSet.remove(b2);
					break;
				case 0: 
					System.exit(0);
					break;
				default :
					System.err.println("Please Enter correct choice");
					break;


				}
			}while(choice!= 0);
		}
		
	}
	
}
