package com.sapient.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class SerialiazeDemo  {

	
	
	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream fos = new FileOutputStream("employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Emp emp3 = new Emp(1005, "peter", 56000);
		oos.writeObject(emp3);
		
		oos.close();
		fos.close();
		System.out.println("serialized");
		
		
	}

}





