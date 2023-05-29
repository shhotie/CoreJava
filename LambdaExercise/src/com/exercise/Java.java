package com.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java {

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
		System.out.println(personList.toString());
		//step1 : Sort List by last name 
		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());}
		});
		System.out.println(personList.toString());
		
		//step2: Create the method that prints all elements in the list
		
		//Step3: Create a method that prints all people that have last name beginning with C	
		}
}
