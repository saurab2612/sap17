package com.pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LiostDemo4 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("peter");
		lst.add("birbal");
		lst.add("sam");
		
		System.out.println("iteratinfg in forward");
		ListIterator<String> it = lst.listIterator();
		while(it.hasNext()){
			System.out.println((it.next()));
		}
		
		System.out.println("iteratinfg in reverse");
		
		while(it.hasPrevious()){
			System.out.println((it.previous()));
		}

	}

}
