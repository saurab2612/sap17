package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class AggDemo {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(10);
		lst.add(97);
		lst.add(23);
		lst.add(4);
		lst.add(79);
		lst.add(56);
		
		long size = lst.stream().filter(i->i>=50).count();
		System.out.println("no of items greater than 50 " + size);

		OptionalInt opt1 = lst.stream().mapToInt(i->i).max();
		System.out.println("max value " + opt1.getAsInt());
		
		OptionalInt opt2 = lst.stream().mapToInt(i->i).min();
		System.out.println("min value " + opt2.getAsInt());
		
		int opt3 = lst.stream().mapToInt(i->i).sum();
		System.out.println("sum value " + opt3);
		
		OptionalDouble opt4 = lst.stream().mapToInt(i->i).average();
		System.out.println("avg value " + opt4.getAsDouble());
		
		

	}

}
