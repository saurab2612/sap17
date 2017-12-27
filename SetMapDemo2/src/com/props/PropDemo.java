package com.props;

/**
 * The properties object contains key and value pair both as a string.
 *  The java.util.Properties class is the subclass of Hashtable.
 *  It can be used to get property value based on the property key.
 *  The Properties class provides methods to get data from properties file and store data into properties file.
 */




import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
//resource bundle is new way of handling properties as it doesn't throw exception
public class PropDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties props = new Properties(); //map and property are subclass of hashtable only
											//resource bundle internally uses properties only
		props.put("1001", "ram");
		props.put("1001", "tom");
		
		props.load(new FileReader("src\\sap.properties"));
		System.out.println(props.getProperty("uname"));
		System.out.println(props.getProperty("1001"));
		System.out.println("size " + props.size());
	}

}
