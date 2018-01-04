package com.sapient.service;

public class Palindrome {

	
	public void checkPalidrome(String str){
		StringBuffer str1= new StringBuffer(str);
		if(str1.reverse().toString().equals(str))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a plaindrome");
	}
}
