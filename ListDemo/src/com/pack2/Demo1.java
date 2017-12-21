package com.pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		Emp e1 = new Emp(1005,"ram", 9000);
		Emp e2 = new Emp(1006,"shyam", 55000);
		Emp e3 = new Emp(1007,"kam", 49000);
		Emp e4 = new Emp(1008,"tam", 89000);
		Emp e5 = new Emp(1009,"nam", 79000);
		Emp e6 = new Emp(1010,"ham", 90000);
		
		
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		lst.add(e5);
		lst.add(e6);
		
		Collections.sort(lst);
		
		System.out.println("sort on emp id");
		
		for(Emp emp:lst){
			System.out.println(emp);
		}
		Collections.sort(lst,new NameComparator());
		System.out.println("sort on name.............................................");
		for(Emp emp:lst){
			System.out.println(emp);
		}
		
		
		Collections.sort(lst,new SalComparator());
		System.out.println("sort on sal.............................................");
		for(Emp emp:lst){
			System.out.println(emp);
		}
		
		
		

	}

}
