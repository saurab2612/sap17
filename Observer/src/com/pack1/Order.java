package com.pack1;

import java.util.Observable;

public class Order extends Observable{
	
	private String status;

	public void setStatus(String status) {
		this.status = status;
		setChanged();
		notifyObservers();
	}

	public String getStatus() {
		return status;
	}
	
	
}
