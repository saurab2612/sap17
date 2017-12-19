package com.sapient.service;

public class OnRollEmp extends Employee {
	
	private double da;
	private double pf;
	
	public OnRollEmp(int empId, String empName, double salary) {
		super(empId, empName, salary);
		this.da = getSalary()*0.12;
		this.pf = getSalary()*0.14;
	}

	@Override
	public double calcSal() {
		
		double sal = getSalary();
		sal = sal + da - pf;
		return sal;
		
		
	}

	@Override
	public void display() {
		super.display();
		System.out.printf("%10.2f%10.2f%10.2f%30s\n", calcSal(),da , pf,  getClass().getSimpleName());
	}
	
	
	
	
	

}
