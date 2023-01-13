package com.main;

import java.sql.SQLException;

public class Main {
 
	public static void main(String[] args) {
		

		/*	Questions questions = new Questions();
			questions.UserQuestion();
		*/
		
		QuizStart quizStart = new QuizStart();
		try {
			quizStart.startQuiz();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		 * 1. quize should be started
		 * 2. student table should be updated
		 * 3. all questions must be poped form the database
		 * 4. marks value must be incremented if correct ans are given 
		 */
	}
}
