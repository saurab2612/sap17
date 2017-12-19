package com.sapient.service;

public class Loan extends Account {

	public Loan(int accId, String custName, double bal) {
		super(accId, custName, bal);
		
	}

	@Override
	public String deposit(double amt) {
		String res = "loan already cleared";
		double bal = getBal();
		if(amt <= bal && bal > 0 ){
			bal =getBal()-amt;
			setBal(bal);
			res = "deposited";
		}else if(amt > bal && (bal-amt) < 0){
			setBal(0);
			res = "depostited";
		}
		return res;
	}

}
