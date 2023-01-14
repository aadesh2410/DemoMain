package com.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.database.ConnectionMiniProject;

public class StudentSortedData {

	ConnectionMiniProject cMiniProject = new ConnectionMiniProject();
	Connection connection = cMiniProject.getconnection();
	PreparedStatement preparedStatementSort = null;
	ResultSet resultset = null;

	public void getSortedStudentData() {

		try {
			preparedStatementSort = connection.prepareStatement("SELECT * FROM Student ORDER BY student_marks DESC");
			resultset = preparedStatementSort.executeQuery();
//			List<ArrayList<Integer>> listOfStudentData = new ArrayList<>();

			while (resultset.next()) {
				System.out.println("Student Roll number : " + resultset.getString(1));
				System.out.println("Student Name : " + resultset.getString(2));
				System.out.println("Student Marks : " + resultset.getString(3));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
