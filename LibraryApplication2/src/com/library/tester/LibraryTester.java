	package com.library.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.library.Book;
import com.library.BookType;
import com.library.cart.Cart;
import com.library.cart.Status;
import com.library.student.Student;
import com.library.student.StudentUtils;
import com.library.utils.BookUtils;

public class LibraryTester {

	public static void main(String[] args) {


		try(Scanner sc = new Scanner(System.in)){

			HashMap<String, Book> bookMap = BookUtils.getBookList();
			Set<String> bookSet = bookMap.keySet();
			Set<Student> studentSet = StudentUtils.getStudentSet();
			List<Cart> cartList = new ArrayList<>();

			int choice = 0;
			do {
				System.out.println("1. Add Book"
						+ "\n2. Display all the books"
						+ "\n3. Allot book to student"
						+ "\n4. Take book Return"
						+ "\n5. remove Book"
						+ "\n6. Display all students"
						+ "\n7. Show Student cart content"
						+ "\n8. Check out");
				System.out.println("Enter the choice");
				choice = sc.nextInt();
				sc.nextLine();

				switch(choice) {

				case 1:
					try {
						//System.out.println("Enter title, bookType, authorName, price, published date qnd quantity of book");
						System.out.println("Enter title of the Book : ");
						String title1 = sc.nextLine();
						for(String bookTitle : bookSet){
							while(title1.equalsIgnoreCase(bookTitle)) {
								System.out.println("Title already exit please enter another title");
								title1 = sc.nextLine();
							}
						}
						System.out.println("Enter Type of book:"
								+ "\nSCIENCE"
								+ "\nFICTION"
								+ "\nCOMEDY"
								+ "\nTECH"
								+ "\nHISTORY");
						BookType booktype = BookType.valueOf(sc.next().toUpperCase());
						sc.nextLine();
						System.out.println("Enter Author Name: ");
						String authorName = sc.nextLine();
						System.out.println("Enter price of the book");
						Double price = sc.nextDouble();

						System.out.println("Enter published date in yyyy-MM-DD format");
						LocalDate date = LocalDate.parse(sc.next());
						while(date.isAfter(LocalDate.now())) {
							System.out.println(" incorect date: please enter correct date");
							date = LocalDate.parse(sc.next());
						}
						System.out.println("Enter the Quantity of Books");
						int quantity = sc.nextInt();
						Book b = new Book(title1, booktype, authorName, price, date, quantity);
						bookMap.put(b.getTitle(),b);
						System.out.println("Books Added Successfully");
					}
					catch (Exception e) {
						e.printStackTrace();				
					}
					break;
				case 2:

					System.out.println(bookMap);

					break;

				case 3:// Allot book to the student
					System.out.println("Enter the id of the Student");
					int id3 = sc.nextInt();
					boolean found = false;
					for(Student s: studentSet ){
						if(s.getId()==id3) {
							found = true;
						}
					}
					if(!found){
						System.out.println("Student not found in a database");
					}
					else{
						System.out.println("Enter the title of the book to be alloted: ");
						for(String title : bookSet) {
							System.out.println(" "+title);
						}
						String title3 = sc.next();
						System.out.println("Enter the quantity of book");
						int quantity3 = sc.nextInt();
						
						Book b3 = bookMap.get(title3);
						System.out.println(b3);
						for(Book title : bookMap.values()) {
							if(quantity3< b3.getQuantity() && b3.getQuantity()>0) {
								if(b3.getTitle().equals(title.getTitle())) {
									System.out.println("Book Alloted to the student");
									b3.setQuantity(b3.getQuantity()-quantity3);
									Cart c1 = new Cart(b3.getTitle(), quantity3, Status.ALLOTED);
									cartList.add(c1);
									System.out.println("Book Remained : "+b3.getQuantity());
								}
								
							}
						}
					}
					

				break;
				case 4:
				{
					System.out.println("Enter the title of the book to be return: ");
					String title4 = sc.next();
					Book b = bookMap.get(title4);
					for(String title : bookSet) {
						if(bookMap.get(title).equals(b)) {
							System.out.println("Book Returned");
							b.setQuantity(b.getQuantity()+1);
							System.out.println("Book Quantity remained: "+ b.getQuantity());
							break;
						}
					}
				}
				break;
				case 5:
					System.out.println("Enter the book to be removed");
					for(String title : bookSet) {
						System.out.println(" "+title);
					}
					String book = sc.next();
					bookMap.remove(book);
					System.out.println("Book Removed : "+book);
					System.out.println(bookMap);
					break;
				case 6:
					System.out.println(studentSet);
					break;
				case 7://Display user cart content
					System.out.println(cartList);
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
