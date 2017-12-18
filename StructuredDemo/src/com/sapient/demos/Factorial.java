package com.sapient.demos;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		System.out.println(Fact(num));
		
		scan.close();
		

	}
	public static BigInteger Fact(int num){
		BigInteger sum=BigInteger.ONE;
		for(int i=1;i<=num;i++){
			
			sum = sum.multiply(BigInteger.valueOf(i));
			
		}
		return sum;
		
	}

}
