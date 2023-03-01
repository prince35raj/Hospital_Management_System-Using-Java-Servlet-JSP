package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnect {

	private static Connection conn;

	public static Connection getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_system", "root", "prince");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

}
