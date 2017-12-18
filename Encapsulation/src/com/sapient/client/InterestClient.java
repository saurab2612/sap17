package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Interest;

public class InterestClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount");
		double pamt =scan.nextDouble();
		System.out.println("Enter the rate");
		int terms = scan.nextInt();
		System.out.println("Enter the rate");;
		float per = scan.nextFloat();
		
		
		Interest obj = new Interest();
		
		try {
			obj.setAmt(pamt);
			obj.setRate(per);
			obj.setYears(terms);
			double si = obj.calcSimple();
			double ci = obj.calcCompound();
			System.out.println("simple "+ si);
			System.out.println("Compound "+ ci);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		scan.close();

	}

}
