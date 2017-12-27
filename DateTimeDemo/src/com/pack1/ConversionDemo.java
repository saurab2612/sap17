package com.pack1;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConversionDemo {

	public static void main(String[] args) {
		//convert instant into Local date
		Instant ins = Instant.now();
		ZonedDateTime zt = ins.atZone(ZoneId.systemDefault());
		LocalDate dt = zt.toLocalDate();
		
		//convert localdate into java.sql.date
		
		LocalDate ldt = LocalDate.now();
		java.sql.Date sqldt = Date.valueOf(ldt);
		System.out.println("sql date : " + sqldt);
		
		//convert java.sql.date into local date
		
		LocalDate ldt2 = sqldt.toLocalDate();
		System.out.println(ldt2);
		

	}

}
