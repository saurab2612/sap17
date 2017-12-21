package com.sapient.service;

public class CircleAirth {

	public double radius;
	
	
	public CircleAirth() {
		super();
		
		this.radius = radius;
	}

	public double calcArea(){
		double area = Math.PI * radius * radius ;
		return area;
	}
	
	public double calcPerimeter(){
		double peri = 2 * Math.PI * radius;
		return peri;
	}
}
