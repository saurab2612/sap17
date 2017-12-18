package com.sapient.demos;

import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter first value");
		 int v1 = scan.nextInt();
		 System.out.println("Enter second value");
		 int v2 = scan.nextInt();
		 System.out.println("Choose 1-- ADD\n 2--Sub\n 3--Multiply\n");
		 String str = scan.next();
		 
		 try{

			 Menu menu = Menu.valueOf(str.toUpperCase());

			 switch(menu){
			 case ADD:
				 System.out.println("ADD "+(v1+v2));
				 break;
			 case SUB:
				 System.out.println("substraction "+ (v1-v2));
				 break;
			 case MULTIPLY:
				 System.out.println("Multiplt "+ (v1*v2));
				 break;
				 default:
					 System.out.println("invalid number");
			 }
			 

			 
		 }catch(Exception e){
			 System.out.println("invalid option");
		 }
		 scan.close();
		 
		 
	}

}
enum Menu{
	ADD,SUB,MULTIPLY
}
