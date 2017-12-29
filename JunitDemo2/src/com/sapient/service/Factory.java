package com.sapient.service;

public class Factory {
	
	public static CalcService getCalclService(){
		CalcService ser = new CalcService();
		return null;
	}
	
	public static Palindrome getPalindromeService(){
		Palindrome ser = new Palindrome();
		return ser;
	}
	
	public static EmpService getEmpService(){
		EmpService ser = new EmpService();
		return ser;
	}
	
	public static String[] getInput(){
		return new String[]{"amar","vikas","ravi","suresh","manish","shubham","rajendra","keshav","rahul","janit",
				"jay","harman","praveen","ganesh","saurabh","vasu","varun"};
	}
	
	
	
	
	

}
