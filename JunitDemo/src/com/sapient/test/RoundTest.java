package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.CalcService;

@RunWith(JUnitPlatform.class)
public class RoundTest {
	
	@Test
	public void testround1(){
		CalcService ser = new CalcService();
		double expected = 56.328;
		double actual =ser.round2N(56.32768, 3);
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void testround2(){
		CalcService ser = new CalcService();
		double expected = 56.32;
		double actual =ser.round2N(56.3248, 2);
		assertEquals(expected, actual);
		
		
	}
	
	@Disabled
	@Test
	public void testround3(){
		CalcService ser = new CalcService();
		double expected = 56.33;
		double actual =ser.round2N(56.32768, 2);
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void testround4(){
		CalcService ser = new CalcService();
		double expected = 56.3277;
		double actual =ser.round2N(56.32768, 4);
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void testround5(){
		CalcService ser = new CalcService();
		double expected = 56.0;
		double actual =ser.round2N(56.32768, 0);
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void testround6(){
		CalcService ser = new CalcService();
		double expected = 57;
		double actual =ser.round2N(56.72768, 0);
		assertEquals(expected, actual);
		
		
	}
	
	
	

}
