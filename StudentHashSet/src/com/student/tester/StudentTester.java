package com.student.tester;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import com.student.*;

public class StudentTester {
	
	public static void main(String[] args) {
		
		List<Address> addressList = new LinkedList<>();
		
		HashSet<Student> hashSet = DataUtils.getStudentSet();
		
		try(Scanner sc = new Scanner(System.in)){
			int choice= 0;
			do {
				System.out.println("***** MENU *****"
						+ "\n1. Add Student"
						+ "\n2. Print Student"
						+ "\n3. Find Student"
						+ "\n4. Update Student Address"
						+ "\n5. Add current Address of Student"
						+ "\n6. print"
						+ "\n0. exit");
				System.out.println("Please enter your choice");
				choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("Enter Details of Students: Id no, Name, Course");
					int id = sc.nextInt();
					String name = sc.next();
					String course = sc.next();
					Course courseEnum = ValidateUtils.validateCourse(course);
					System.out.println("Enter date in format YYYY-MM-DD");
					String doB = sc.next();
					LocalDate validDob = ValidateUtils.validateDob(doB);
					//Student address = new Student
					System.out.println("Enter line 1 , line 2 , pin code");
					 Address address = new Address(sc.next(),sc.next(),sc.next());
					 addressList.add(address);
					Student student = new Student(id, name, courseEnum, validDob, addressList);
					hashSet.add(student);
					System.out.println("Student Added Successfylly");
					System.out.println(student);
					break;
					
				case 2:
					for(Student student1 : hashSet) {
						System.out.println(student1);
					}
					break;
					
				case 3:
					System.out.println("Enter student id to find Student");
					int id1 = sc.nextInt();
					
					for(Student student1 : hashSet) {
						if(id1 == student1.getId()) {
							System.out.println(student1);
						}
					}
					break;
					
				case 4:
					System.out.println("Enter the id of the Student");
					int id2 = sc.nextInt();
					int i=0;
					for(Student student2 : hashSet) {
						if(student2.getId() == id2) {
							System.out.println("Enter the index(1 or 2) of the address to be updated: ");
							i=sc.nextInt();
							Address address2=student2.getAddressList().get(i-1);
							address2.setAddress(sc.next(), sc.next(), sc.next());
							student2.getAddressList().set(i-1, address2);
//							student2.getAddressList().remove(i-1);
//							Address address2= new Address(sc.next(), sc.next(), sc.next());
//							student2.getAddressList().add(address2);
							
							System.out.println(student2);
							break;
						}
					}
					break;
					
				case 5:
					System.out.println("Enter the id of the student: ");
					int id3=sc.nextInt();
					
					for(Student student3 : hashSet) {
						if(student3.getId()==id3) {
							System.out.println("Enter new address to be added");
							Address address1 = new Address(sc.next(),sc.next(),sc.next());
							student3.addAddress(address1);
							System.out.println(student3);
							break;
						}
					}
					
					break;
					
				case 6:
					for(Address addr : addressList) {
						System.out.println(addr);
					}
					break;
				case 0: System.exit(0);
						break;
				
				default:{
					System.err.println("Please Enter correct choice");
				}
					
				}
			}while(choice!=0);
			
		} catch(InputMismatchException e) {
			e.printStackTrace();
		}
	}

}
