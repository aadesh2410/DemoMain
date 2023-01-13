package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMiniProject {
	// design method for creating connection
	public Connection getconnection() {
		Connection con = null;
		try {
			// load driver
			Class.forName("com.mysql.jdbc.Driver");
			// connection Establish
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject_group_h", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
