package com.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.database.ConnectionMiniProject;

public class StudentById {

	ConnectionMiniProject cMiniProject = new ConnectionMiniProject();
	Connection connection = cMiniProject.getconnection();
	PreparedStatement preparedStatement = null;
	ResultSet resultset = null;

	public int getStudentScore(int id) {

		System.out.println("Your score is >>");

		try {
			preparedStatement = connection.prepareStatement("SELECT student_marks FROM student WHERE student_id = ?");
			preparedStatement.setInt(1, id);
			resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				// System.out.println("Student name : " + resultset.getString(1));
				System.out.println("score : " + resultset.getInt(1));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}

}
