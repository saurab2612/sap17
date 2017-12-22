package com.sapient.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) {
		
		String str = null;
		try(BufferedReader br = new BufferedReader(new FileReader("sap.txt"))){
			while((str = br.readLine())!=null){
				System.out.println(str);
			}
		}catch(FileNotFoundException ex){
			System.out.println(ex.getMessage());
		}catch(IOException ex){
			System.out.println(ex.getMessage());
			
		}

	}

}
