package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.vo.Emp;

public class SumDemo {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<>();
		lst.add(new Emp(1007,"ram",23000));
		lst.add(new Emp(1009,"tom",53000));
		lst.add(new Emp(2002,"anand",13000));
		lst.add(new Emp(2005,"vikas",28000));
		lst.add(new Emp(1003,"rajesh",23000));
		
		double totalSal = lst.stream().map(e->e.getEsal()).reduce( 0.0,(x,y)->x+y);
		System.out.println("sum of emplopye salry " + totalSal);
		
		double totalSal2 = lst.stream().mapToDouble(e->e.getEsal()).sum();
		System.out.println("sum of emplopye salry " + totalSal2);

	}

}
