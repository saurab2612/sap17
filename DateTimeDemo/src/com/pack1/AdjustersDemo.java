package com.pack1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class AdjustersDemo {

	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-EEE-MMM-yyyy");
		LocalDate ldt = LocalDate.now();
		
		//LocalDate ldt = LocalDate.of(2016, 2, 21);
		System.out.println(ldt.with(TemporalAdjusters.lastDayOfMonth()));
		
		System.out.println(df.format(ldt.with(TemporalAdjusters.firstDayOfNextMonth())));
		System.out.println(df.format(ldt.with(TemporalAdjusters.lastDayOfYear())));
		System.out.println(ldt.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)));
	}

}
