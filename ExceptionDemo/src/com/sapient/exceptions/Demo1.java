package com.sapient.exceptions;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Line 1");
		System.out.println("Line 2");
		try{
			int a =5/0;
			System.out.println("try block");
			
		}catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
			System.out.println("Catch Block");
			ex.printStackTrace();
		}
		
		System.out.println("Line 3");
		System.out.println("Line 4 ");
		System.out.println("Line 5");
		System.out.println("Line 6");

	}

}
