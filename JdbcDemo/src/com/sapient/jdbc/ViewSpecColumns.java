package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewSpecColumns {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn = DriverManager.getConnection(url,"SYSTEM","Sapient@123");
		
		String sql = "select e.eid,e.ename,e.sal,d.dname,d.did from sap_dept d INNER JOIN sap_emp e ON d.did = e.dept_id";
		
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("eid"));
			System.out.println(rs.getString("ename"));
			System.out.println(rs.getDouble("sal"));
			System.out.println(rs.getString("dname"));
			System.out.println(rs.getString("did"));
			
			System.out.println("---------------------------------------------------");
		}
		conn.close();
		

	}

}
