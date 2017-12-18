package com.sapient.service;

public class NokiaLumia extends Nokia1100{
	public void captureImage(){
		System.out.println("Capture image");
	}
	
	public void browseNet(){
		System.out.println("browse net");
	}

	@Override
	public void doConverse() {
		System.out.println("4g converse");
	}
	
	

}
