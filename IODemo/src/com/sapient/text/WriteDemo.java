package com.sapient.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("sap.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Sapient Razorfish Training held in Gurgaon\n");
		bw.write("Sapient Clients are Audi,Ferrari\n");
		
		bw.close();
		fw.close();
		System.out.println("FileCreated....");

	}

}
