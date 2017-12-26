package com.sapient.def;

import java.util.Collections;
import java.util.List;

public class DaoImpl3 implements IDao {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3(List<String> lst) {
		Collections.sort(lst);
		IDao.super.m3(lst);
	}

	
}
