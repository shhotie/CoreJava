package com.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java7 {
	public static void main(String[] args) {
		//initialize this list with Arrays.asList = 
		// method which takes inline elements and it creates an object
		List<Person> personList = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carrol",30),
				new Person("Thomas","Carlyle",32),
				new Person("Charlotte","Bronte",61),
				new Person("Matthew","Arnold",50)
				);
		
		//step1 : Sort List by last name 
				//using utility Collections
				Collections.sort(personList, new Comparator<Person>() {

					@Override
					public int compare(Person o1, Person o2) {
						return o1.getLastName().compareTo(o2.getLastName());
					}
				});
				
				//step2: Create the method that prints all elements in the list

				printAll(personList);
				
				//Step3: Create a method that prints all people that have last name beginning with C	
				printLastNameBeginWithC(personList);
	}
	
	
	// Static Methods
				private static void printLastNameBeginWithC(List<Person> personList) {
					for(Person p : personList) {
						if(p.getLastName().startsWith("C")) {
							System.out.println(p);
						}
					}
				}
				
				private static void printAll(List<Person> personList) {

					for(Person p : personList) {
						System.out.println(p);
					}
				}

}


