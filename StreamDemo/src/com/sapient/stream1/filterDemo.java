package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class filterDemo {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		
		Stream s = lst.stream().filter(i->i%2==0);
		s.forEach(System.out::println);
		//s.forEach(System.out::println); once terminated cant be used again

	}

}
