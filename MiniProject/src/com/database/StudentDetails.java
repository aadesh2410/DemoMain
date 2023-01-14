package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDetails {

	ConnectionMiniProject cMiniProject = new ConnectionMiniProject();
	Connection connection = cMiniProject.getconnection();

	// take student details such as
	// student_id, student_name

	public void StudentDetail(String name, int marks) throws SQLException {
		// Scanner scanner = new Scanner(System.in);

		PreparedStatement preparedStatement = null;

		try {
			// System.out.println("Enter student name");
			preparedStatement = connection
					.prepareStatement("INSERT INTO Student (student_name,student_marks) VALUES (?,?)");
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, marks);
			preparedStatement.executeUpdate();
//			PreparedStatement preparedStatement1=connection.prepareStatement("INSERT INTO Student (student_marks) VALUES (?)");
//			preparedStatement1.setInt(1, marks);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// scanner.close();
			connection.close();
			preparedStatement.close();

		}
	}

}
