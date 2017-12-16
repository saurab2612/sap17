package com.sapient.client;

import com.sapient.service.SalesPerson;
import com.sapient.util.SapUtil;

public class SalesClient {

	public static void main(String[] args) {

		SalesPerson s1 = new SalesPerson(1001, "ram", 45000);

		SalesPerson s2 = new SalesPerson(1002, "tom", 10000);

		SalesPerson s3 = new SalesPerson(1003, "sam", 10000);

		s1.display();
		s2.display();
		s3.display();
		
		System.out.println("No of Persons " + SalesPerson.noOfPersons);
		System.out.println("Total sales " + SapUtil.roundUp2Dec(SalesPerson.tsales));

	}

}
