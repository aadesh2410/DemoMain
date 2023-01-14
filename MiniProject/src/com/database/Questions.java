package com.database;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Scanner;

/*
* 1. Adding 10MCQ questions to the database table named Question:
* 
*/
public class Questions {
	// method

	public void UserQuestion() {

		// loading driver
		ConnectionMiniProject cMiniProject = new ConnectionMiniProject();
		Connection connection = cMiniProject.getconnection();
		try {
			// Prepared statement ---question 1
			PreparedStatement prepareStatement1 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement1.setString(1, "___ is used to find and fix bugs in the Java programs");
			prepareStatement1.setString(2, " JVM");
			prepareStatement1.setString(3, " JRE");
			prepareStatement1.setString(4, " JDK");
			prepareStatement1.setString(5, "JDB");
			prepareStatement1.setString(6, "JDB");
			prepareStatement1.executeUpdate();
			// question 2
			PreparedStatement prepareStatement2 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement2.setString(1, "Which of the following is not a Java features?");
			prepareStatement2.setString(2, "Dynamic");
			prepareStatement2.setString(3, "Architecture Neutral");
			prepareStatement2.setString(4, "Use of pointers");
			prepareStatement2.setString(5, "Object-oriented");
			prepareStatement2.setString(6, "Use of pointers");
			prepareStatement2.executeUpdate();

			// question 3
			PreparedStatement prepareStatement3 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement3.setString(1, "What is the return type of the hashCode() method in the Object class? ");
			prepareStatement3.setString(2, "Object");
			prepareStatement3.setString(3, "int");
			prepareStatement3.setString(4, "long");
			prepareStatement3.setString(5, "void");
			prepareStatement3.setString(6, "Object");
			prepareStatement3.executeUpdate();

			// question 4
			PreparedStatement prepareStatement4 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement4.setString(1, " What does the expression float a = 35 / 0 return? ");
			prepareStatement4.setString(2, "0");
			prepareStatement4.setString(3, "Not a Number");
			prepareStatement4.setString(4, "Infinity");
			prepareStatement4.setString(5, "Run time exception");
			prepareStatement4.setString(6, "Run time exception");
			prepareStatement4.executeUpdate();

			// question 5
			PreparedStatement prepareStatement5 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement5.setString(1, " What are the major components of the JDBC? ");
			prepareStatement5.setString(2, "DriverManager, Driver, Connection, Statement, and ResultSet");
			prepareStatement5.setString(3, "DriverManager, Driver, Connection, and Statement");
			prepareStatement5.setString(4, "DriverManager, Statement, and ResultSet");
			prepareStatement5.setString(5, "DriverManager, Connection, Statement, and ResultSet");
			prepareStatement5.setString(6, "DriverManager, Driver, Connection, Statement, and ResultSet");
			prepareStatement5.executeUpdate();

			// question 6
			PreparedStatement prepareStatement6 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement6.setString(1, " Select the packages in which JDBC classes are defined?");
			prepareStatement6.setString(2, "jdbc and javax.jdbc");
			prepareStatement6.setString(3, "rdb and javax.rdb");
			prepareStatement6.setString(4, "jdbc and java.jdbc.sql");
			prepareStatement6.setString(5, "sql and javax.sql");
			prepareStatement6.setString(6, "sql and javax.sql");
			prepareStatement6.executeUpdate();

			// question 7
			PreparedStatement prepareStatement7 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement7.setString(1, " Which exception is thrown when java is out of memory?");
			prepareStatement7.setString(2, "MemoryError");
			prepareStatement7.setString(3, "OutOfMemoryError");
			prepareStatement7.setString(4, "MemoryOutOfBoundsException");
			prepareStatement7.setString(5, "MemoryFullException");
			prepareStatement7.setString(6, "OutOfMemoryError");
			prepareStatement7.executeUpdate();

			// question 8
			PreparedStatement prepareStatement8 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement8.setString(1, " Which of these are selection statements in Java?");
			prepareStatement8.setString(2, "break");
			prepareStatement8.setString(3, "continue");
			prepareStatement8.setString(4, "for()");
			prepareStatement8.setString(5, "if()");
			prepareStatement8.setString(6, "if()");
			prepareStatement8.executeUpdate();

			// question 9
			PreparedStatement prepareStatement9 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement9.setString(1, "Which of the following is a superclass of every class in Java");
			prepareStatement9.setString(2, "ArrayList ");
			prepareStatement9.setString(3, "Abstractclass");
			prepareStatement9.setString(4, "Objectclass");
			prepareStatement9.setString(5, "String");
			prepareStatement9.setString(6, "Objectclass");
			prepareStatement9.executeUpdate();

			// question 10
			PreparedStatement prepareStatement10 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement10.setString(1, "Which of these packages contains the exception Stack Overflow in Java? ");
			prepareStatement10.setString(2, "java.io");
			prepareStatement10.setString(3, "java.system");
			prepareStatement10.setString(4, "java.lang");
			prepareStatement10.setString(5, "java.util");
			prepareStatement10.setString(6, "java.lang");
			prepareStatement10.executeUpdate();

			// printing query insertion message
			System.out.println("Insertion of questions done");

//			// resultset
//			PreparedStatement pSelect1 = connection.prepareStatement("SELECT * FROM question where question_id = '1'");
//			ResultSet resultSet = pSelect1.executeQuery();
//
//			System.out.println("db updated");
//			// using resultset object
//			while (resultSet.next()) {
//				System.out.println("Question >>" + resultSet.getString(2));
//				System.out.println("Options are as follows");
//				System.out.println("Option A : " + resultSet.getString(3));
//				System.out.println("Option B : " + resultSet.getString(4));
//				System.out.println("Option C : " + resultSet.getString(5));
//				System.out.println("Option D : " + resultSet.getString(6));
//				System.out.println("Correct ans : " + resultSet.getString(7));
//
//				System.out.println(marks_count);
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}