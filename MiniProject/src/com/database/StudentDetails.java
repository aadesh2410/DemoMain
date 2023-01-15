package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 1. Add student details to the database
 * 2. Table outline is as follows
 * Table name: student
 * 		
 * 		student_id	student_name	student_marks
 * 1.
 * 2.
 */

public class StudentDetails {

	ConnectionMiniProject cMiniProject = new ConnectionMiniProject();
	Connection connection = cMiniProject.getconnection();

	//name and marks are passed upon by Quiz class
	public void StudentDetail(String name, int marks) throws SQLException {

		PreparedStatement preparedStatement = null;

		try {

			preparedStatement = connection
					.prepareStatement("INSERT INTO Student (student_name,student_marks) VALUES (?,?)");
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, marks);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			connection.close();
			preparedStatement.close();

		}
	}

}
