package com.main;

import java.sql.SQLException;

/*
 * 1. This class comprises of Main Method
 * 2. Implements a menu and offers multiple options
 */

public class MainTest {

	public static void main(String[] args) {

		
		Questions questions = new Questions();
		questions.UserQuestion();
		 
		// creating required objects
		WelcomeQuiz welcomeQuiz = new WelcomeQuiz();
		try {
			welcomeQuiz.startWelcomeMenu();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
