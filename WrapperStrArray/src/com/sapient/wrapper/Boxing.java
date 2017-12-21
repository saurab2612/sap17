package com.sapient.wrapper;

public class Boxing {

	public static void main(String[] args) {
		Integer a = 10; //auto boxing
		Integer b = new Integer(20); //boxing
		int res = a.intValue() + b.intValue(); //unboxing
		Integer c = Integer.valueOf(res);//boxing
		System.out.println(c); // to string method overridden 
		
	}

}
