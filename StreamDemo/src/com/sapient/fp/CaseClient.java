package com.sapient.fp;

public class CaseClient {
/**
 * demo on - functional programming
 * @param args
 */
	public static void main(String[] args) {
		//ICase lower = s -> s.toLowerCase();
		//ICase upper = (s)->{return s.toUpperCase();};
		display(s -> s.toLowerCase(),"RamA");
		display((String s)->{return s.toUpperCase();},"jill");

	}
	
	public static void display(ICase obj, String str){
		String res = obj.changeCase(str);
		System.out.println(res);
	}

}
