package com.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Java8v2 {

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
		Collections.sort(personList, (p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
		
		
		//step2: Create the method that prints all elements in the list
		System.out.println("Printing all person");
		performConditionally(personList, p->true, p-> System.out.println(p));
		
		//Step3: Create a method that prints all people that have last name beginning with C	
		System.out.println("Printing all person with last name beginning with C");
		performConditionally(personList , p->p.getLastName().startsWith("C"), p->System.out.println(p));
		
		System.out.println("Printing all person eith first name beginning with C");
		performConditionally(personList , p-> p.getFirstName().startsWith("C"),p-> System.out.println(p.getFirstName()));
	}

	/*
	 * In Java 7 for sorting list by some filter you always need to write different
	 * method for different filters
	 */
	private static void performConditionally(List<Person> personList, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : personList) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
