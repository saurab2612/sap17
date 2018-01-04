package com.sapient.service;

public class PalindromeBuffer {
	
	private Palindrome obj;

	public PalindromeBuffer(Palindrome obj) {
		super();
		this.obj = obj;
	}
	
	public void checkPalindrome(String[] arr){ //method name shoud be same
		for(String str:arr){
			obj.checkPalidrome(str);
		}
	}

}
