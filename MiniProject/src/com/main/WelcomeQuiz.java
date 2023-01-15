package com.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.database.ConnectionMiniProject;

/*
 * 1. Offers a menu list with multiple options as per project requirements
 * 2. Base of all the classes.
 */
public class WelcomeQuiz {

	ConnectionMiniProject cMiniProject = new ConnectionMiniProject();
	Connection connection = cMiniProject.getconnection();
	PreparedStatement preparedStatementSort = null;
	ResultSet resultset = null;
	Scanner scanner = new Scanner(System.in);
	Quiz quiz = new Quiz();
	StudentSortedData studentSortedData = new StudentSortedData();
	StudentById studentById = new StudentById();

	public void startWelcomeMenu() throws SQLException {

		// implements a infinite loop
		while (true) {
			System.out.println("********Welcome to the JAVA Quiz*********");
			System.out.println();
			System.out.println("1. Start quiz");
			System.out.println("2. Get Student records");
			System.out.println("3. Get Student marks");
			System.out.println("4. Exit");
			System.out.println();

			// taking input from user for selecting menu options
			System.out.println("Select one of the above options");
			String temp = scanner.next();
			switch (temp) {
			case "1":

				try {
					System.out.println();
					System.out.println("Enter student name");
					String s_name = scanner.next();
					System.out.println("Quiz started");
					// calling startQuiz from Quiz
					quiz.startQuiz(s_name);
					System.out.println();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case "2":
				// sorted logic
				System.out.println();
				try {
					preparedStatementSort = connection.prepareStatement("SELECT * FROM Student");
					resultset = preparedStatementSort.executeQuery();
					if (!resultset.isBeforeFirst()) {
						System.out.println("No records present... Kindly take the quiz first");
					} else {
						System.out.println("Printing sorted Student Records on the basis of their marks");
						studentSortedData.getSortedStudentData();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println();
				break;
			case "3":
				// get student record
				System.out.println();
				preparedStatementSort = connection.prepareStatement("SELECT * FROM Student");
				resultset = preparedStatementSort.executeQuery();
				if (!resultset.isBeforeFirst()) {
					System.out.println("No records present... Kindly take the quiz first");
				} else {
					System.out.println("To know your marks, enter your Roll-No");
					int temp1 = scanner.nextInt();
					studentById.getStudentScore(temp1);
				}
				// System.out.println();

				System.out.println();
				break;
			// exiting the infinite loop
			case "4":
				break;
			default:
				System.out.println();
				System.out.println("INVALID OPTION");
				System.out.println();
			}
			if (temp.equals("4")) {
				break;
			} else {
				continue;
			}
		}

	}
}
