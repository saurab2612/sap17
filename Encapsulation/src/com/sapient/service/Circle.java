package com.sapient.service;

public class Circle {

private double radius;
	
	
	public Circle(double radius) throws Exception {
		super();
		if(radius <= 0)
			throw new Exception("radius must be greter than zero");
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
