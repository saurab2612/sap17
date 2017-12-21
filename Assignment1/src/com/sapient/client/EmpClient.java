package com.sapient.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.sapient.dao.DaoFactory;
import com.sapient.dao.Idao;
import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Emp;

public class EmpClient {
	
	static Scanner scan = new Scanner(System.in);
	static Idao dao = DaoFactory.getDaoInstance();

	public static void main(String[] args) {
		
		String strmenu = null;
		String opt = null;
		Menu emenu = null;
		do{
			
			System.out.println("Choose :ADD\nEDIT\nREMOVE\nVIEW\nVIEWALL");
			strmenu=scan.next();
			try{
				emenu = Menu.valueOf(strmenu);
				processMenu(emenu);
			}catch(Exception ex){
				System.out.println("Invalid Menu option");
			}
			
			System.out.println("press y to continue");
			opt=scan.next();
			
		}while(opt.equals("y"));
		

	}
	
	public static void processMenu(Menu menu){
		switch(menu){
		case VIEWALL:
			viewall();
			break;
		case VIEW:
			viewById();
			break;
		case ADD:
			add();
			break;
			
		}
		
		
	}
	
	public static void viewall(){
		List<Emp> lst = dao.viewEmployee();
		for(Emp emp:lst){
			System.out.println(emp);
		}
		
	}
	public static void viewById(){
		System.out.println("Enter Employee Id");
		int id = scan.nextInt();
		Emp emp = null;
		try {
			emp = dao.viewEmployee(id);
			System.out.println(emp);
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void add(){
		System.out.println("Enter Employee Id");
		int eid = scan.nextInt();
		System.out.println("Enter Employye Name");
		String name = scan.next();
		System.out.println("Enter salary");
		double sal = scan.nextDouble();
		System.out.println("Enter Department Id");
		int did = scan.nextInt();
		System.out.println("Enter date (dd-MM-yyyy");
		String strdt = scan.next();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate doj = LocalDate.parse(strdt,df);
		
		Emp emp = new Emp(eid,name,sal,did,doj);
		
		try {
			dao.addEmployee(emp);
			System.out.println("Employee added");
		} catch (IdException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}



























