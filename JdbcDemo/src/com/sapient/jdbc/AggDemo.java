package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AggDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection conn = DriverManager.getConnection(url, "SYSTEM", "Sapient@123");

		String sql = "select sum(sal) totsal, avg(sal) avgsal,count(eid) noofemp from sap_emp ";
		PreparedStatement st = conn.prepareStatement(sql);
		
		
		

		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			System.out.println("sum = " + rs.getDouble("totsal"));
			System.out.println("average = " + rs.getDouble("avgsal"));
			System.out.println("count = " + rs.getInt("noofemp"));
					
		}
		conn.close();


	}

}
