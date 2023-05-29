package com.account;

import java.time.LocalDate;

public class ValidateUtils {
	public static LocalDate validateDate(String accOpenDate) {
		LocalDate date = LocalDate.parse(accOpenDate);
		
		LocalDate today = LocalDate.now();
		LocalDate requiredDate = today.minusYears(21);
		
		if(date.isBefore(requiredDate)) {
			return date;
		}
		return null;
	}
}
