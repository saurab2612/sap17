package com.sapient.test;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.EmpService;
import com.sapient.service.Factory;
import com.sapient.service.NotFoundException;
import com.sapient.vo.Emp;

@RunWith(JUnitPlatform.class)
@DisplayName("Emp dao test")
public class EmpTest {

	@Test
	public void testEmp1(){
		Emp e1 = new Emp(101, "diksha", 50000.0);
		Emp e2 = new Emp(101, "diksha", 50000.0);
		assertEquals(e1,e2);
	}
	
	@Test
	public void testEmp2() throws NotFoundException, ClassNotFoundException, SQLException{
		EmpService ser = Factory.getEmpService();
		assumeTrue(ser!=null);
		Emp expected = new Emp(102,"shikhar",50000.0);
		assertEquals(expected,ser.getEmployee(102));
	}
	
	@Test
	@DisplayName("test employee by id 103")
	public void testEmp3() throws NotFoundException, ClassNotFoundException, SQLException{
		EmpService ser = Factory.getEmpService();
		assumeTrue(ser!=null);
		Emp expected = new Emp(103,"tarun",70000.0);
		Emp actual = ser.getEmployee(103);
		assertAll("test al states",
				()->assertEquals(expected.getEmpId(), actual.getEmpId()),
				()->assertEquals(expected.getEmpName(), actual.getEmpName()),
				()->assertEquals(expected.getSal(), actual.getSal()));
	}
	
	@Test
	public void testEmp4() throws NotFoundException{
		EmpService ser = Factory.getEmpService();
		assumeTrue(ser!=null);
		assertThrows(NotFoundException.class, ()->ser.getEmployee(1016));
	}
}
