package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDetails {

	// take student details such as
	// student_id, student_name
	public void StudentDetail() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		ConnectionMiniProject cMiniProject = new ConnectionMiniProject();
		Connection connection = cMiniProject.getconnection();
		PreparedStatement preparedStatement = null;

		try {
			System.out.println("Enter student name");
			preparedStatement = connection.prepareStatement("INSERT INTO Student (student_name) VALUES (?)");
			preparedStatement.setString(1, scanner.next());
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
