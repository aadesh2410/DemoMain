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

	public void startQuiz() throws SQLException {

		StudentResult sResult = new StudentResult();
		StudentDetails studentDetails = new StudentDetails();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student name");
		String s_name = scan.next();
		

		ArrayList<Integer> arrayList = new ArrayList<>();

		// Adding question_id's serially into arraylist
		for (int i = 1; i <= 10; i++) {
			arrayList.add(i);
		}

		// Shuffling the arraylist
		Collections.shuffle(arrayList);

		
		// looping to get particular question from database
		int questionNumber = 1;
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
					System.out.println("Question " + questionNumber + " :");
					System.out.println(resultSet.getString(2));
					System.out.println("A: " + resultSet.getString(3));
					System.out.println("B: " + resultSet.getString(4));
					System.out.println("C: " + resultSet.getString(5));
					System.out.println("D: " + resultSet.getString(6));
					// String tempCheck = resultSet.getString(7);
					System.out.println("Select A/B/C/D from above given options");
					String answer = scanner.next();
					
					if (answer.charAt(0) == 'A' || answer.charAt(0) == 'B' || answer.charAt(0) == 'C'
							|| answer.charAt(0) == 'D' || answer.charAt(0) == 'a' || answer.charAt(0) == 'b'
							|| answer.charAt(0) == 'c' || answer.charAt(0) == 'd') {
						if (resultSet.getString(7).equalsIgnoreCase(answer)) {
							marks++;
						} else {
							break;
						}

					} else {
						System.out.println("Invalid option selected ... please select from A/B/C/D only");
						j--;
						questionNumber--;
						break;
					}
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			questionNumber++;
		}
		studentDetails.StudentDetail(s_name, marks);
		System.out.println("Marks = " + marks);
		sResult.getResult(marks);

	}

}
