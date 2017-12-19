package com.sapient.service;

public class ContractEmp extends Employee{
	
	private int days;

	public ContractEmp(int empId, String empName, int salary, int days) {
		super(empId, empName, salary);
		this.days = days;
	}

	@Override
	public double calcSal() {
		double sal = getSalary();
		sal = sal*days;
		return sal;
	}

	@Override
	public void display() {
		super.display();
		System.out.printf("%10.2f%30d%20s\n", calcSal(),days, getClass().getSimpleName());
	}
	
	
	
	
	
	
	

}
