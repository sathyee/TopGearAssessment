package com.mypackage.assessment;

import java.time.LocalDate;
import java.time.Period;

public class Exercise6 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate wiproJoiningDate = LocalDate.of(2007, 4, 2);
		Period period = Period.between(wiproJoiningDate, now);

	    System.out.println("It has been " + period.getYears() + " years, " + period.getMonths() + " months," + period.getDays() + " days since joining Wipro");
	}
}
