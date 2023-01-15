package com.database;

/*
 * Implements connection pooling
 * Uses JDBC to open connections and schemaName given
 */


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMiniProject {
	
	// design method for creating connection
	public Connection getconnection() {
		Connection con = null;
		try {
			// load driver
			Class.forName("com.mysql.jdbc.Driver");
			// connection Established
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject_group_h", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
