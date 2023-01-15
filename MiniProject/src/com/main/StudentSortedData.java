
package com.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.database.ConnectionMiniProject;
import com.interfaces.StudentSortedJavaInterface;

/*
 * 1. Sorts student records on the basis of student_marks
 * 2. Prints sorted records onto the console
 */
public class StudentSortedData implements StudentSortedJavaInterface {

	int flag;

	ConnectionMiniProject cMiniProject = new ConnectionMiniProject();
	Connection connection = cMiniProject.getconnection();
	PreparedStatement preparedStatementSort = null;
	ResultSet resultset = null;

	@Override
	public void getSortedStudentData() throws SQLException {

		try {
			preparedStatementSort = connection.prepareStatement("SELECT * FROM Student ORDER BY student_marks DESC");
			resultset = preparedStatementSort.executeQuery();
			while (resultset.next()) {
				System.out.println("Student Roll number : " + resultset.getString(1));
				System.out.println("Student Name : " + resultset.getString(2));
				System.out.println("Student Marks : " + resultset.getString(3));

			}
			// System.out.println(Objects.isNull(resultset));
			// System.out.println(); // flase
//			if (resultset.isBeforeFirst()) {
//				while (resultset.next()) {
//					System.out.println("Student Roll number : " + resultset.getString(1));
//					System.out.println("Student Name : " + resultset.getString(2));
//					System.out.println("Student Marks : " + resultset.getString(3));
//
//				}
//			} else {
//				flag = 1;
//
//				System.out.println("Flag value " + flag);
//				//passingFlag(flag);
//			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			resultset.close();
			preparedStatementSort.close();
			//connection.close();
		}
		// System.out.println("flag value" + flag);

	}
}
