package com.sapient.service;

public class LoanService {
	
	public String approveLoan(int age,double income) throws AgeException,IncomeException{
		
		if(age < 20)
			throw new AgeException(" age should be more than equal to 20");
		else if(income < 400000)
			throw new IncomeException("income should be more than 400000");
		else 
			return "approved";
	
	}

}
