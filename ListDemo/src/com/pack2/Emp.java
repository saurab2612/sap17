package com.pack2;

public class Emp implements Comparable<Emp>{
	
	private int empId;
	private String ename;
	private double sal;
	
	public Emp(int empId, String ename, double sal) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
	}
	
	

	public String getEname() {
		return ename;
	}



	public double getSal() {
		return sal;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId +" "+ ename + " "+sal;
	}

	@Override
	public int compareTo(Emp emp) {
		Integer e1=this.empId;
		Integer e2 = emp.empId;
		return e1.compareTo(e2);
	}
	
	
	

}
