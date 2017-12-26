package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.vo.Emp;

public class CountDemo {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<>();
		lst.add(new Emp(1007,"ram",23000));
		lst.add(new Emp(1009,"tom",53000));
		lst.add(new Emp(2002,"anand",13000));
		lst.add(new Emp(2005,"vikas",28000));
		lst.add(new Emp(1003,"rajesh",23000));
		
		long count = lst.stream().filter(e->e.getEsal()>=25000).count();
		System.out.println("Count of employee with salary >=25000 :" + count);

	}

}
