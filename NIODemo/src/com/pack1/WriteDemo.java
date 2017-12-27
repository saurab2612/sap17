package com.pack1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("sap.txt");
		FileChannel fc = fos.getChannel();
		
		ByteBuffer buff = ByteBuffer.allocate(1024); //1 kb
		buff.put("sapient technology\n".getBytes());
		buff.put("sapient razorfish\n".getBytes());
		
		buff.flip();
		
		fc.write(buff); //to take [pointer from end to start
		System.out.println("file created");
		

	}

}
