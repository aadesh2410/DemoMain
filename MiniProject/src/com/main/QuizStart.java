package com.main;
/*
 * 1. Implementing logic for student score
 * 2. Fetching questions from the DBase
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.database.ConnectionMiniProject;
import com.database.StudentDetails;
import com.mysql.cj.protocol.Resultset;

public class QuizStart {

	int marks;

	public void setGrades(int score) {
		if (this.marks >= 8 && this.marks <= 10) {

		}
	}

	public void startQuiz() throws SQLException {

		StudentDetails studentDetails = new StudentDetails();
		studentDetails.StudentDetail();

		ArrayList<Integer> arrayList = new ArrayList<>();

		// Adding question_id's serially into arraylist
		for (int i = 0; i < 10; i++) {
			arrayList.add(i);
		}

		// printing before shuffling
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}

		// Shuffling the arraylist
		Collections.shuffle(arrayList);

		// printing after shuffling
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}

		// looping to get particular question from database
		for (int i = 0; i < arrayList.size(); i++) {
			Scanner scanner = new Scanner(System.in);
			ConnectionMiniProject cMiniProject1 = new ConnectionMiniProject();
			Connection connection1 = cMiniProject1.getconnection();
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				preparedStatement = connection1.prepareStatement("SELECT * FROM question WHERE question_id = ?");
				preparedStatement.setInt(1, arrayList.get(i));
				resultSet = preparedStatement.executeQuery();

				// printing question onto the console using resultset object
				while (resultSet.next()) {
					System.out.println("Question " + resultSet.getString(1) + " :");
					System.out.println(resultSet.getString(2));
					System.out.println("A: " + resultSet.getString(3));
					System.out.println("B: " + resultSet.getString(4));
					System.out.println("C: " + resultSet.getString(5));
					System.out.println("D: " + resultSet.getString(6));
					// String tempCheck = resultSet.getString(7);
				}
				System.out.println("Enter the answer from above given option");
				String answer = scanner.next();
				// doubtful
				if (resultSet.getString(7) == answer) {
					marks++;
				}

			} catch (SQLException e) {

				e.printStackTrace();
			} finally {
				connection1.close();
				preparedStatement.close();
				// scanner.close();
				resultSet.close();
			}
			//scanner.close();
		}

	}

}
