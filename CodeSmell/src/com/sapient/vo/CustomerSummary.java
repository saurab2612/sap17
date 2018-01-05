package com.sapient.vo;

public class CustomerSummary {

	public void getCustomer(Customer cust){
		System.out.println(cust.getAddress().display(this));
		
	}
}
