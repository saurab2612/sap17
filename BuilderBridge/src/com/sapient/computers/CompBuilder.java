package com.sapient.computers;

import java.util.HashMap;
import java.util.Map;

import com.sapient.processors.I3;
import com.sapient.processors.I5;
import com.sapient.processors.IProcessor;

/**
 * Builder pattern assembling object based on client request
 * @author ssah33
 *
 */
public class CompBuilder {
	
	private static Map<String, Computer>cmap = new HashMap<>();
	private static Map<String, IProcessor>pmap = new HashMap<>();

	
	static{
		pmap.put("i3", new I3());
		pmap.put("i5", new I5());
		
		cmap.put("laptop", new Laptop());
		cmap.put("Desktop", new Desktop());
	}
	public static Computer getComputer(String comptype,String pcss) throws Exception{
		Computer comp = null;
		if(!cmap.containsKey(comptype)||!pmap.containsKey(pcss))
			throw new Exception("invalid configuration");
		comp = cmap.get(comptype);
		comp.setPro(pmap.get(pcss));
		return comp;
	}

}
