package com.sapient.service;

import java.util.HashMap;
import java.util.Map;

public class EmpService implements IEmpSer{
	private static Map<Integer, String> emap;
	
	private static final IEmpSer ser;
	
	private EmpService(){
		
	}
	
	public synchronized static IEmpSer getInstance(){ //sysnchronised to prevent two thread accessing it at the same time
		/*if(ser==null){									//which can cause problems
			System.out.println("new Instance");
			ser = new EmpService();
		}else{
			System.out.println("old instance");
		}*/
		return ser;
	}
	
	static{
		
		ser = new EmpService();
		emap = new HashMap<>();
		emap.put(1001, "ram");
		emap.put(1002, "tom");
		emap.put(1003, "sam");
		
	}
	
	@Override
	public String display(int eid) throws Exception{
		if(!emap.containsKey(eid))
			throw new Exception("no ID found");
		return emap.get(eid);
	}

}
