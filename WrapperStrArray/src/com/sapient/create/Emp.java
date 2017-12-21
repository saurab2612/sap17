package com.sapient.create;

public class Emp {
	
	static{
		System.out.println("I am in static block");
	}
	
	
	public Emp(){
		System.out.println("emp constructor");
	}
	public void display(){
		System.out.println("instance method display");
	}
	

}
