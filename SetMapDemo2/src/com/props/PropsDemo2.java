package com.props;

import java.util.Properties;
import java.util.Set;

public class PropsDemo2 {

	public static void main(String[] args) {
		Properties props = System.getProperties(); //properties set by jvm when it is launched sgp returns property object
		Set<Object> keys = props.keySet();
		for(Object key: keys){
			System.out.println(key + " " + props.getProperty((String)key));
		}

	}

}
