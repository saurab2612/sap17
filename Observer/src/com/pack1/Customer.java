package com.pack1;

import java.util.Observable;
import java.util.Observer;

public class Customer implements Observer {

	@Override
	public void update(Observable o, Object msg) {
		
		if(o instanceof Order){
			Order order = (Order)o;
			System.out.println("customer notifies" + order.getStatus());
		}
	}

}
