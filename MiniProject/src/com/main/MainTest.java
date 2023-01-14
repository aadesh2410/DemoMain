package com.main;

import java.sql.SQLException;
import java.util.Scanner;
/*
 * 1. This class comprises of Main Method
 * 2. Implements a menu and offers multiple options
 */

public class MainTest {

	public static void main(String[] args) {

		/*
		 * Questions questions = new Questions(); questions.UserQuestion();
		 */
		// creating required objects
		Scanner scanner = new Scanner(System.in);
		QuizStart quizStart = new QuizStart();
		StudentSortedData studentSortedData = new StudentSortedData();
		StudentById studentById = new StudentById();

		// implements a infinite loop
		while (true) {
			System.out.println("********Menu card*********");
			System.out.println();
			System.out.println("1. Start quiz");
			System.out.println("2. Get sorted Student records");
			System.out.println("3. Get student marks");
			System.out.println();

			// taking input from user for selecting menu options
			System.out.println("Select one of the above options");
			String temp = scanner.next();
			switch (temp) {
			case "1":
				// quiz start
				try {
					System.out.println();
					System.out.println("Quiz started");
					// calling startQuiz from QuizStart
					quizStart.startQuiz();
					System.out.println("You have successfully completed the Quiz");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case "2":
				// sorted wala logic
				System.out.println();
				System.out.println("Printing sorted Student Records on the basis of their marks");
				studentSortedData.getSortedStudentData();
				break;
			case "3":
				// get student record
				System.out.println();
				System.out.println("To know your marks, enter your Roll-No");
				studentById.getStudentScore(scanner.nextInt());
				break;
			default:
				System.out.println("INVALID OPTION");
			}
		}
	}
}
