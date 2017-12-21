package com.sapient.arr;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		String[] arr = {"ram", "amit", "tom", "peter", "birbal"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));   //print all the elements in array as a string
		
		
		System.out.println("length " + arr.length);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to search");
		String str = scan.next();
		
		int res = Arrays.binarySearch(arr, str);
		
		if(res >= 0){
			System.out.println("found at index " + res);
			
		}else{
			System.out.println("not found");
		}

	}

}
