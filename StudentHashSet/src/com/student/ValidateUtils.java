package com.student;

import java.time.LocalDate;

public class ValidateUtils {

	public static LocalDate validateDob(String strDob) {
		LocalDate doB = LocalDate.parse(strDob);
		LocalDate today = LocalDate.now();
		LocalDate requiredDate = today.minusYears(22);
		
		if(doB.isBefore(requiredDate)) {
			return doB;
		}
		return null;
	}
	
	public static Course validateCourse(String course) {
		
		Course courseEnum = Course.valueOf(course);
		return courseEnum;
	}
	
}
