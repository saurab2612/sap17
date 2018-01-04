package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.EmpService;
import com.sapient.service.IEmpSer;

public class Client {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String opt = null;
		IEmpSer ser =null;
		int eid = 0;
		do{
			ser = EmpService.getInstance();
			System.out.println("enter eid");
			eid = scan.nextInt();
			try {
				System.out.println(ser.display(eid));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("press y to continue");
			opt = scan.next();
		}while(opt.equalsIgnoreCase("y"));
		
		scan.close();

	}

}
