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

public class QuizStart {

	public int marks;

	
	
	public void getResult(int marks) {
		if (this.marks >= 8 && this.marks <= 10) {
			System.out.println("Excellent performance: You scored Garde A.");
		}else if (this.marks >=6 && this.marks < 8) {
			System.out.println("Good performance: You scored Grade B.");
		}else if (this.marks == 5) {
			System.out.println("Average performance: You scored Grade C.");
		}else {
			System.out.println("You have failed the test.");
		}
	}

	public void startQuiz() throws SQLException {

		System.out.println("Quiz started");

		QuizStart qStart = new QuizStart();
		StudentDetails studentDetails = new StudentDetails();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student name");
		String s_name = scan.next();
		//studentDetails.StudentDetail();

		ArrayList<Integer> arrayList = new ArrayList<>();

		// Adding question_id's serially into arraylist
		for (int i = 1; i <= 10; i++) {
			arrayList.add(i);
		}

		/*
		 * // printing before shuffling for (Integer integer : arrayList) {
		 * System.out.println(integer); }
		 */

		// Shuffling the arraylist
		Collections.shuffle(arrayList);

		// printing after shuffling
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}

		// looping to get particular question from database
		for (int j = 0; j < arrayList.size(); j++) {
			Scanner scanner = new Scanner(System.in);
			ConnectionMiniProject cMiniProject1 = new ConnectionMiniProject();
			Connection connection1 = cMiniProject1.getconnection();
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				preparedStatement = connection1.prepareStatement("SELECT * FROM question WHERE question_id = ?");
				preparedStatement.setInt(1, arrayList.get(j));
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
					System.out.println("Enter the answer from above given choices");
					String answer = scanner.next();
					if (resultSet.getString(7).equalsIgnoreCase(answer)) {
						marks++;
					} else {
						break;
					}

				}

				// doubtful

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		studentDetails.StudentDetail(s_name,marks);
		System.out.println("MArks = " + marks);
		System.out.println("You have successfully completed the Quiz");
		
		qStart.getResult(marks);
		
	}

}
