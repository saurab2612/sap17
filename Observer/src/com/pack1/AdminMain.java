package com.pack1;

import java.util.Scanner;

public class AdminMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Order order = new Order();
		Customer cust = new Customer();
		
		order.addObserver(cust);
		
		String str = null;
		do{
			System.out.println("admin changes the staus ");
			str = scan.next();
			order.setStatus(str);
			
		}while(!str.equalsIgnoreCase("delivered"));
		
		scan.close();
		

	}

}
