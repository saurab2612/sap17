package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;

public class SortDemo {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<>();
		lst.add(new Emp(1007,"ram",23000));
		lst.add(new Emp(1009,"tom",53000));
		lst.add(new Emp(2002,"anand",13000));
		lst.add(new Emp(2005,"vikas",28000));
		lst.add(new Emp(1003,"rajesh",23000));
		lst.add(null);
		
		System.out.println("sort by employee id");
		lst.stream().filter(e->e!=null).sorted().forEach(EmpUtil::display);
		
		System.out.println("sort by emp name");
		lst.stream().filter(e->e!=null)
					.sorted((e1,e2)->e1.getEname().compareTo(e2.getEname()))
					.forEach(EmpUtil::display);
		
		System.out.println("sort by emp sal");
		lst.stream().filter(e->e!=null)
					.sorted((e1,e2)->e1.getEsal().compareTo(e2.getEsal()))
					.forEach(EmpUtil::display);
		
		
		

	}

}
