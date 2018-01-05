package com.sapient.service;

public class NeftPayment implements PaymentStrategy{

	private final static NeftPayment obj = new NeftPayment();
	
	private NeftPayment() {
		
	}
	/*
	 * Singleton code
	 */
	
	public static PaymentStrategy getNEFT(){
		return obj;
	}
	
	@Override
	public void doPayment() {
		System.out.println("NEFT payment");
		
	}
	
	
}
