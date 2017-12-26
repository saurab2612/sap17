package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;

public class AggDemo {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<>();
		lst.add(new Emp(1007,"ram",23000));
		lst.add(new Emp(1009,"tom",53000));
		lst.add(new Emp(2002,"anand",13000));
		lst.add(new Emp(2005,"vikas",28000));
		lst.add(new Emp(1003,"rajesh",23000));
		
		OptionalDouble opt = lst.stream().mapToDouble(e->e.getEsal()).max();
		double max = opt.getAsDouble();
		
		lst.stream().filter(e->e.getEsal()==max).forEach(EmpUtil::display);

	}

}
