package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.CircleAirth;

public class CircleAirthClient {

	public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);
		
		CircleAirth obj = new CircleAirth();
		
		System.out.println("Enter Radius ");
		obj.radius = scan.nextFloat();
		double area = obj.calcArea();
		double peri = obj.calcPerimeter();
		
		System.out.println("Area : " + area);
		System.out.println("Perimeter : " + peri);
		
		scan.close();

	}

}
