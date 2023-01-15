package com.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.database.ConnectionMiniProject;
import com.interfaces.StudentByIdInterface;

/*
 * 1. Implements logic for retriving student details from Database
 * 
 */
public class StudentById implements StudentByIdInterface{
	
	ConnectionMiniProject cMiniProject = new ConnectionMiniProject();
	Connection connection = cMiniProject.getconnection();
	PreparedStatement preparedStatement = null;
	ResultSet resultset = null;

	
	//takes id as an input
	//prints corresponding marks for given id
	@Override
	public int getStudentScore(int id) throws SQLException {

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
			System.out.println("Entered student_id/rollNumber not found");			
		}finally {
			resultset.close();
			preparedStatement.close();
			//connection.close();
		}
		return 0;
	}

}
