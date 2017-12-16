package com.sapient.client;


import java.util.Scanner;

import com.sapient.service.Interest;
import com.sapient.util.SapUtil;

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
		obj.amt = pamt;
		obj.rate = per;
		obj.years = terms;
		
		double si = obj.calcSimple();
		double ci = obj.calcCompound();
		
		System.out.println("Simple "+ SapUtil.roundUp2Dec(si));
		System.out.println("Compound "+ SapUtil.roundUp2Dec(ci));
		
		scan.close();
		

	}

}
