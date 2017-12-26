package com.sapient.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindDemo {

	public static void main(String[] args) {
		List<String> lst1 = Arrays.asList("ram","ranjan","rakesh","sam","suresh","sanjeev");
		Optional opt = lst1.stream().filter(s->s.startsWith("a")).findAny();
		System.out.println(opt); //optional ignores null . it handles it as empty
		if(opt.isPresent())
			System.out.println("element found");
		else
			System.out.println("not found");

	}

}
