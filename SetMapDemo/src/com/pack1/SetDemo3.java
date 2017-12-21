package com.pack1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {

	public static void main(String[] args) {
		Emp e1 = new Emp(1005,"ram", 9000);
		Emp e2 = new Emp(1006,"shyam", 55000);
		Emp e3 = new Emp(1007,"kam", 49000);
		Emp e4 = new Emp(1008,"tam", 89000);
		Emp e5 = new Emp(1009,"nam", 79000);
		Emp e6 = new Emp(1005,"ram", 90000);
		Emp e7 = e2;
		
		Set<Emp> set = new TreeSet<Emp>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);//ignored based on the content (overridden hashcode() and equals()
		set.add(e7); //ignores based on reference
		
		for(Emp emp:set){
			System.out.println(emp);
		}
		

	}

}
