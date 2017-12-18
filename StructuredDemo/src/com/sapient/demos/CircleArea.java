package com.sapient.demos;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Radius ");
		float radius = scan.nextFloat();
		double area = calcArea(radius);
		double peri = calcPerimeter(radius);
		
		System.out.println("Area : " + area);
		System.out.println("Perimeter : " + peri);
		
		scan.close();
		

	}
	
	public static double calcArea(float radius){
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public static double calcPerimeter(float radius){
		double Peri = 2 * Math.PI * radius;
		return Peri;
	}

}
