package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortDemo {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("ram");
		lst.add("tom");
		lst.add("anand");
		lst.add("ravi");
		lst.add("suresh");
		
		System.out.println("asceneding order");
		Stream s = lst.stream().sorted();
		s.forEach(System.out::println);
		System.out.println("descending order");
		lst.stream().sorted((i,j)->j.compareTo(i)).forEach(System.out::println);
		
		

	}

}
