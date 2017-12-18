package com.sapient.service;

public class Interest {
	
	private double amt;
	private int years;
	private float rate;
	
	
	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) throws Exception {
		if(amt < 5000)
			throw new Exception("amount should be min 5000");
		this.amt = amt;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) throws Exception {
		if(years<0 || years>30)
			throw new Exception("year should be between 0 and 30");
		this.years = years;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) throws Exception {
		if(rate <0 || rate > 1)
			throw new Exception("rate should be between 0-1");
		this.rate = rate;
	}

	public double calcSimple(){
		double si = amt * years * rate;
		return si;
	}
	
	public double calcCompound(){
		double ci = amt * Math.pow((1+ rate),years);
		return ci;
		
	}

}
