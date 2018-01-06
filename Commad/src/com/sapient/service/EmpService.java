package com.sapient.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import com.sapient.vo.Emp;

public class EmpService {
	/**
	 * Command pattern
	 * code process the client request 
	 * @param emp
	 * @return
	 */
	public boolean addToFile(Emp emp){
		 boolean res = false;
		try(PrintWriter pw = new PrintWriter(new FileWriter("sap.txt",true))){ // printwriter also internally uses buffer
		
			pw.write(emp.getEid() + "," + emp.getEname() +","+ emp.getSal() + "," + emp.getPf() + "," + emp.getNetpay());
			res =true;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return res;
	}

}
