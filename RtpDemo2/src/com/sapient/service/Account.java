package com.sapient.service;

public abstract class Account {
	
	private int accId;
	private String custName;
	private double bal;
	


	public Account(int accId, String custName, double bal) {
		super();
		this.accId = accId;
		this.custName = custName;
		this.bal = bal;
	}
	
	

	public double getBal() {
		return bal;
	}


	public void setBal(double bal) {
		this.bal = bal;
	}



	public void display(){
		System.out.println("------------------------------------------");
		System.out.println("Acc ID" + accId);
		System.out.println("Cust Name" + custName);
		System.out.println("balance" + bal);
		System.out.println("------------------------------------------");
		
	}
	
	public abstract String deposit(double amt);

}
