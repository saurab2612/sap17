package com.sapient.demos;

public class varArgsDemo {

	public static void main(String[] args) {
		int res=sum(1,1,1,1,1,1);
		System.out.println(res);

		
	}
	
	public static int sum(int ...arr){
		System.out.println("var args called");
		int sum = 0;
		for(int i=0;i< arr.length;i++){
			sum = sum+arr[i];
		}
		return sum;
	}

}
