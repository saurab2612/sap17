package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;

public class CollectDemo {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<>();
		lst.add(new Emp(1007,"ram",23000));
		lst.add(new Emp(1009,"tom",53000));
		lst.add(new Emp(2002,"anand",13000));
		lst.add(new Emp(2005,"vikas",28000));
		lst.add(new Emp(1003,"rajesh",23000));
		
		Stream<Emp> s = lst.stream().filter(e->e.getEsal()>=25000);
		List<Emp> lst1 = s.collect(Collectors.toList());
		
		lst1.forEach(EmpUtil::display);
		
	//	lst.stream().filter(e->e.getEsal()>=25000).sorted().forEach(EmpUtil::display);

	}

}
