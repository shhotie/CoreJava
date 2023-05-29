package com.student;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class DataUtils {

	public static HashSet<Student> getStudentSet(){

		HashSet<Student> hashSet = new HashSet<>( );

		LocalDate validDob1 = ValidateUtils.validateDob("1996-02-15");
		LocalDate validDob2 = ValidateUtils.validateDob("1997-07-25");
		LocalDate validDob3 = ValidateUtils.validateDob("1999-05-10");
		LocalDate validDob4 = ValidateUtils.validateDob("1198-09-12");

		Course validCourse1 = ValidateUtils.validateCourse("DAC");
		Course validCourse2 = ValidateUtils.validateCourse("DESD");
		Course validCourse3 = ValidateUtils.validateCourse("VLSI");

		Address address1 = new Address("Pashan", "Pune", "411007");
		Address address2 = new Address("Pimpri", "Pune", "411061");
		List<Address> addressList1 = new LinkedList<>();
		addressList1.add(address1);
		addressList1.add(address2);
		
		Address address3 = new Address("Wathoda", "Nagpur", "440008");
		Address address4 = new Address("Pardi", "Nagpur", "4400012");
		List<Address> addressList2 = new LinkedList<>();
		addressList2.add(address3);
		addressList2.add(address4);
		
		Address address5 = new Address("Juhu", "Mumbai", "411067");
		Address address6 = new Address("Mannat", "Mumbai", "411061");
		List<Address> addressList3 = new LinkedList<>();
		addressList3.add(address5);
		addressList3.add(address6);
		
		Address address7 = new Address("CSTPS", "Chandrapur", "415507");
		Address address8 = new Address("Warora", "Chandrapur", "412361");
		List<Address> addressList4 = new LinkedList<>();
		addressList4.add(address7);
		addressList4.add(address8);
		
		Address address9 = new Address("Gadchiroli", "Gondia", "422007");
		Address address10 = new Address("Arvi", "Gondia","401061");
		List<Address> addressList5 = new LinkedList<>();
		addressList5.add(address9);
		addressList5.add(address10);
		
		
		hashSet.add(new Student (101,"Swati", validCourse1, validDob1,addressList1));
		hashSet.add(new Student (110,"Shweta", validCourse2, validDob3, addressList2));
		hashSet.add(new Student (105,"Srushti", validCourse3, validDob2,addressList3));
		hashSet.add(new Student (103,"Sheeela", validCourse3, validDob4, addressList4));
		hashSet.add(new Student (106,"Sagar", validCourse1, validDob1, addressList5));

		return hashSet;

	}

}
