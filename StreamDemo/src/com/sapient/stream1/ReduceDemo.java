package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(10);
		lst.add(97);
		lst.add(23);
		lst.add(4);
		lst.add(79);
		lst.add(56);
		
		int res = lst.stream().map(i->i).reduce(0,(x,y)->x+y);
		System.out.println("sum of all elements " + res);
		int res1 = lst.stream().filter(i->(i%2==0)).map(i->i).reduce(0,(x,y)->x+y);
		System.out.println("sum of all elements divisible by 2 " + res1);

	}

}
