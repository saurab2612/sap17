package com.sapient.client;

import com.sapient.service.ContractEmp;
import com.sapient.service.Employee;
import com.sapient.service.OnRollEmp;


public class EmpClient {

	public static void main(String[] args) {
		Employee[] arr = new Employee[4];
		arr[0]=new OnRollEmp(101, "Ramesh", 35000);
		arr[1]=new OnRollEmp(102, "tamesh", 15000);
		arr[2]=new ContractEmp(103, "Varun", 4500, 30);
		arr[3]=new ContractEmp(104, "Vasu", 2000, 60);
		
		
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.printf("%10s%20s%10s%10s%10s%10s%10s%20s\n", "EID","ENAME","SALARY","NETSALARY","PF","DA","DAYS","TYPE");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		for(Employee emp: arr){
			emp.display();
		}

	}

}
