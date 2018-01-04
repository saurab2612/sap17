package com.sapient.service;

import java.util.HashMap;
import java.util.Map;

public class ProxyImpl implements ISer {

	private ISer ser = new SerImpl();
	
	private static Map<String , String> emap;
	
	private String uname;
	private String pwd;
	
	
	
	public ProxyImpl(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}





	static{
		emap = new HashMap<>();
		emap.put("1001", "ram");
		emap.put("1002", "rm");emap.put("1003", "ra");
	}
	
	
	
	
	
	@Override
	public double calcSimple(double p, int n, float r) {
		if(!emap.containsKey(uname)| !emap.get(uname).equals(pwd)){
			System.out.println("not authenticated");
			return 0;
		}else
			return ser.calcSimple(p, n, r);
	}

}
