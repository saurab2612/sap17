package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.sapient.dao.IDao;
import com.sapient.service.ISer;
import com.sapient.service.SerImpl;
import com.sapient.vo.Emp;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class EmpTest {
	
	@Mock
	static
	IDao dao;
	
	@InjectMocks
	ISer ser = new SerImpl();
	
	static List<Emp> idlist;
	static List<Emp> namelist;
	static List<Emp> sallist;
	static List<Emp> lst;
	
	static Emp e1 = new Emp(1003,"ram",9000);
	static Emp e2 = new Emp(1001,"tam",19000);
	static Emp e3 = new Emp(1007,"anup",8000);
	static Emp e4 = new Emp(1002,"shubham",7000);
	
	@BeforeAll
	public static void beforeAll(){
	
		
		idlist = new ArrayList<>();
		idlist.add(e2);
		idlist.add(e4);
		idlist.add(e1);
		idlist.add(e3);
		
		namelist = new ArrayList<>();
		namelist.add(e3);
		namelist.add(e1);
		namelist.add(e4);
		namelist.add(e2);
		
		sallist = new ArrayList<>();
		sallist.add(e2);
		sallist.add(e1);
		sallist.add(e3);
		sallist.add(e4);
		
	}
	
	@BeforeEach
	public void before(){
		List<Emp> lst = new ArrayList<>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		when(dao.getEmployee()).thenReturn(lst);
	}
	
	@Test
	public void testEmp1(){
		List<Emp> actual = ser.viewEmployee("id");
		assertEquals(idlist, actual);
		verify(dao).getEmployee();
	}
	
	@Test
	public void testEmp2(){
		List<Emp> actual = ser.viewEmployee("id");
		assertTrue(actual.size() == idlist.size());
	
		
	}
	
	@Test
	public void testEmp3(){
		List<Emp> actual = ser.viewEmployee("name");
		assertTrue(actual.size() == namelist.size());
	
		
	}
	
	@Test
	public void testEmp4(){
		List<Emp> actual = ser.viewEmployee("name");
		assertEquals(namelist, actual);
		
	}
	
	@Test
	public void testEmp5(){
		List<Emp> actual = ser.viewEmployee("sal");
		assertTrue(actual.size() == sallist.size());
	
		
	}
	
	@Test
	public void testEmp6(){
		List<Emp> actual = ser.viewEmployee("sal");
		assertEquals(sallist, actual);
		
	}
	
	@Test
	public void testEmp7(){
		assertNull(ser.viewEmployee("aaa"));
		
	}
}


















