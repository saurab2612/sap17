package com.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.pack1.Emp;

public class Demo2 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1005, "ram");
		map.put(1003, "tom");
		map.put(1007, "peter");
		map.put(1001, "raj");
		map.put(1002, "jay");
		map.put(1003, "varun");//replace the duplicates
		map.put(null, "kkkk");
		
		
		System.out.println("iteratinf using keyset ");
		
		Set<Integer> set = map.keySet();
		for(Integer key:set){
			System.out.println(key + " " + map.get(key));
		}
		
		System.out.println("iteratinf uses values(");
		Collection<String> col = map.values();
		for(String str:col){
			System.out.println(str);
		}
		
		System.out.println("iteratinf uses entrySet()");
		Set<Entry<Integer,String>> entries = map.entrySet();
		
		for(Entry e:entries){
			System.out.println(e.getKey() + " " + e.getValue() );
		}
		
		
		
		
		
		
		
		
	}
	
	

}
