package com.main;

/*
 * 1. Fetching questions randomly one by one from the DBase
 * 2. Quiz implements collection class- ARRAYLIST approach
 * 3. implements shuffle method for randomness
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
import com.interfaces.QuizInterface;

public class Quiz implements QuizInterface {

	// global variable for student marks
	public int marks;

	Scanner scanner = new Scanner(System.in);
	ConnectionMiniProject cMiniProject1 = new ConnectionMiniProject();
	Connection connection1 = cMiniProject1.getconnection();
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;

	@Override
	public void startQuiz(String name) throws SQLException {

		StudentResult sResult = new StudentResult();
		StudentDetails studentDetails = new StudentDetails();

		// list creation
		ArrayList<Integer> arrayList = new ArrayList<>();

		// Adding question_id's serially into arrayList
		for (int i = 1; i <= 10; i++) {
			arrayList.add(i);
		}

		// Shuffling the arrayList
		Collections.shuffle(arrayList);

		// count for printing question number onto the console
		int questionNumber = 1;

		// looping to get 10 questions from database
		for (int j = 0; j < arrayList.size(); j++) {

			try {
				preparedStatement = connection1.prepareStatement("SELECT * FROM question WHERE question_id = ?");
				preparedStatement.setInt(1, arrayList.get(j));
				resultSet = preparedStatement.executeQuery();

				// printing question onto the console using resultSet object
				while (resultSet.next()) {
					System.out.println("Question " + questionNumber + " :");
					System.out.println(resultSet.getString(2));
					System.out.println("A: " + resultSet.getString(3));
					System.out.println("B: " + resultSet.getString(4));
					System.out.println("C: " + resultSet.getString(5));
					System.out.println("D: " + resultSet.getString(6));
					System.out.println("Select A/B/C/D from above given options");
					String answer = scanner.next();

					// if student enter wrong option
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
						System.out.println();
						j--;
						questionNumber--;
						break;
					}
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				resultSet.close();
				preparedStatement.close();
				//connection1.close();
			}
			questionNumber++;
		}
		System.out.println("You have successfully completed the Quiz");
		
		//updating the student details and passing its values : name and marks
		studentDetails.StudentDetail(name, marks);
		System.out.println("You scored = " + marks + " marks");
		System.out.println();
		
		//calling getResult for calculating the grades
		sResult.getResult(marks);

	}
}
