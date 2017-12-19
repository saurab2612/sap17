package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Account;
import com.sapient.service.Loan;
import com.sapient.service.Savings;

public class AccountClient {
	private static Account[] arr = new Account[2];
	static {
		arr[0] = new Savings(1001, "ram", 5000);
		arr[1] = new Loan(1002, "amith", 25000);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String opt = null;
		int accType = 0;
		double amt = 0;

		do {
			System.out.println("Enter acc type 0--savings 1-- loan");
			accType = scan.nextInt();

			if (accType < 0 || accType > 1) {
				System.out.println("invalid accType");
			} else {

				System.out.println("enter amont to deposit");
				amt = scan.nextDouble();

				arr[accType].deposit(amt);
				arr[accType].display();

			}

			System.out.println("Press y to continue");
			opt = scan.next();
		} while (opt.equals("y"));

	}

}
