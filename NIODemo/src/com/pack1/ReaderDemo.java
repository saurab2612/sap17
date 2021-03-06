package com.pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("sap.txt");
		FileChannel fc = fis.getChannel();
		ByteBuffer buff = ByteBuffer.allocate(10);
		byte[] arr =null;
		while(fc.read(buff) != -1){
			buff.flip(); // it will keep track of limit
			while(buff.hasRemaining()){
				System.out.print((char)buff.get());
			}
			buff.clear();
			buff.rewind();//same as flip but wont keep track of limit
			
		}
		fc.close();
		

	}

}
