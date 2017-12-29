package com.sapient.service;

import java.util.List;

import com.sapient.dao.IDao;
import com.sapient.vo.Emp;

public class SerImpl implements ISer {
	
	private IDao dao;
	
	

	public void setDao(IDao dao) {
		System.out.println("injecting mocks");
		this.dao = dao;
	}



	@Override
	public List<Emp> viewEmployee(String order) {
		List<Emp> lst = dao.getEmployee();
		if(order.equals("id")){
			lst.sort((x,y)->((Integer)x.getEid()).compareTo((Integer)y.getEid()));
		}else if(order.equals("name")){
			lst.sort((x,y)->((String)x.getEname()).compareTo((String)y.getEname()));
		}else if(order.equals("sal")){
			lst.sort((x,y)->((Double)x.getSal()).compareTo((Double)y.getSal()));
		}else{
			return null;
		}
		return lst;
	}

}
