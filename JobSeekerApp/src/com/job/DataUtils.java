package com.job;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataUtils {

	public static List<JobSeeker> getData(){
		List <JobSeeker> seekerList = new ArrayList<>();

		seekerList.add(new JobSeeker(101, "Suresh", "suresh@gmail.com", "Suresh@123", LocalDate.parse("1993-08-08"),"452136987856", "9890296566", LocalDate.parse("2013-06-01"), Degree.valueOf("BE"))) ;
		seekerList.add(new JobSeeker(102, "Ramesh", "ramesh@gmail.com", "Ramesh@123", LocalDate.parse("1994-06-28"),"452136981234", "9890653241", LocalDate.parse("2014-06-01"), Degree.valueOf("BTECH"))) ;
		seekerList.add(new JobSeeker(103, "Ujwal", "ujwal@gmail.com", "Ujwal@123", LocalDate.parse("1996-04-18"),"452136989865", "8765426566", LocalDate.parse("2019-06-01"), Degree.valueOf("BE"))) ;
		seekerList.add(new JobSeeker(110, "Swati", "swati@gmail.com", "Swati@123", LocalDate.parse("1997-08-25"),"653236987856", "9890968566", LocalDate.parse("2018-06-01"), Degree.valueOf("BCOM"))) ;
		seekerList.add(new JobSeeker(112, "Sumedh", "sumedh@gmail.com", "Sumedh@123", LocalDate.parse("1999-11-08"),"365436987856", "9890297425", LocalDate.parse("2020-06-01"), Degree.valueOf("BA"))) ;
		seekerList.add(new JobSeeker(106, "Akshay", "akshay@gmail.com", "Akshay@123", LocalDate.parse("1995-02-21"),"986536987856", "8632296566", LocalDate.parse("2016-06-01"), Degree.valueOf("BE"))) ;
		seekerList.add(new JobSeeker(108, "Rajesh", "rajesh@gmail.com", "Rajesh@123", LocalDate.parse("1991-08-08"),"965236987856", "7854296566", LocalDate.parse("2013-06-01"), Degree.valueOf("BCOM"))) ;
		return seekerList;

		
	}


	
}