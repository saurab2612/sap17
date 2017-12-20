package com.sapient.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("sap.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Christmas is celebrated in Sapint lobby\n");
		bw.write("assessment is on 4-jan-2018\n");
		
		bw.close();
		fw.close();
		System.out.println("FileAppended....");

	}

}
