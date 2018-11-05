package com.mypackage.assessment;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Exercise5 {
	
	public static void main(String[] args) {
		LocalDate secondSundayOfNextMonth = LocalDate
	              .now()
	              .with(TemporalAdjusters.firstDayOfNextMonth())
	              .with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY))
	              .plusDays(7);	
		
		System.out.println(secondSundayOfNextMonth);
	}

}
