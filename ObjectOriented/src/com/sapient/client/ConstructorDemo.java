package com.sapient.client;

import com.sapient.service.Car;

public class ConstructorDemo {

	public static void main(String[] args) {

			Car car2;
			try {
				car2 = new Car(1002,"ford",5000000);
				car2.display();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
	}

}
