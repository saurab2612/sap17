package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		try{
			Connection conn = DriverManager.getConnection("");
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}

	}

}
