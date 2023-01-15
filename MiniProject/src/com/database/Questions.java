package com.database;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
* Adding 10MCQ questions to the database table named question:
* question table outline is as follows
* Table name : question
* 	question_id		question	option_A	option_B	option_C	option_D	correct_Answer
* 1.
* 2.
* 3.
* 
* USerQuestion method must be called only once, or Database will get updated by 10 question everytime program is executed.
*/
public class Questions {
	// method

	public void UserQuestion() throws SQLException {

		// loading driver
		ConnectionMiniProject cMiniProject = new ConnectionMiniProject();
		Connection connection = cMiniProject.getconnection();
		PreparedStatement prepareStatement1 = null;
		PreparedStatement prepareStatement2 = null;
		PreparedStatement prepareStatement3 = null;
		PreparedStatement prepareStatement4 = null;
		PreparedStatement prepareStatement5 = null;
		PreparedStatement prepareStatement6 = null;
		PreparedStatement prepareStatement7 = null;
		PreparedStatement prepareStatement8 = null;
		PreparedStatement prepareStatement9 = null;
		PreparedStatement prepareStatement10 = null;
		try {
			// Prepared statement ---question 1
			prepareStatement1 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement1.setString(1, "___ is used to find and fix bugs in the Java programs");
			prepareStatement1.setString(2, " JVM");
			prepareStatement1.setString(3, " JRE");
			prepareStatement1.setString(4, " JDK");
			prepareStatement1.setString(5, "JDB");
			prepareStatement1.setString(6, "D");
			prepareStatement1.executeUpdate();
			// question 2
			prepareStatement2 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement2.setString(1, "Which of the following is not a Java features?");
			prepareStatement2.setString(2, "Dynamic");
			prepareStatement2.setString(3, "Architecture Neutral");
			prepareStatement2.setString(4, "Use of pointers");
			prepareStatement2.setString(5, "Object-oriented");
			prepareStatement2.setString(6, "C");
			prepareStatement2.executeUpdate();

			// question 3
			prepareStatement3 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement3.setString(1, "What is the return type of the hashCode() method in the Object class? ");
			prepareStatement3.setString(2, "Object");
			prepareStatement3.setString(3, "int");
			prepareStatement3.setString(4, "long");
			prepareStatement3.setString(5, "void");
			prepareStatement3.setString(6, "A");
			prepareStatement3.executeUpdate();

			// question 4
			prepareStatement4 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement4.setString(1, " What does the expression float a = 35 / 0 return? ");
			prepareStatement4.setString(2, "0");
			prepareStatement4.setString(3, "Not a Number");
			prepareStatement4.setString(4, "Infinity");
			prepareStatement4.setString(5, "Run time exception");
			prepareStatement4.setString(6, "D");
			prepareStatement4.executeUpdate();

			// question 5
			prepareStatement5 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement5.setString(1, " What are the major components of the JDBC? ");
			prepareStatement5.setString(2, "DriverManager, Driver, Connection, Statement, and ResultSet");
			prepareStatement5.setString(3, "DriverManager, Driver, Connection, and Statement");
			prepareStatement5.setString(4, "DriverManager, Statement, and ResultSet");
			prepareStatement5.setString(5, "DriverManager, Connection, Statement, and ResultSet");
			prepareStatement5.setString(6, "A");
			prepareStatement5.executeUpdate();

			// question 6
			prepareStatement6 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement6.setString(1, " Select the packages in which JDBC classes are defined?");
			prepareStatement6.setString(2, "jdbc and javax.jdbc");
			prepareStatement6.setString(3, "rdb and javax.rdb");
			prepareStatement6.setString(4, "jdbc and java.jdbc.sql");
			prepareStatement6.setString(5, "sql and javax.sql");
			prepareStatement6.setString(6, "D");
			prepareStatement6.executeUpdate();

			// question 7
			prepareStatement7 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement7.setString(1, " Which exception is thrown when java is out of memory?");
			prepareStatement7.setString(2, "MemoryError");
			prepareStatement7.setString(3, "OutOfMemoryError");
			prepareStatement7.setString(4, "MemoryOutOfBoundsException");
			prepareStatement7.setString(5, "MemoryFullException");
			prepareStatement7.setString(6, "B");
			prepareStatement7.executeUpdate();

			// question 8
			prepareStatement8 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement8.setString(1, " Which of these are selection statements in Java?");
			prepareStatement8.setString(2, "break");
			prepareStatement8.setString(3, "continue");
			prepareStatement8.setString(4, "for()");
			prepareStatement8.setString(5, "if()");
			prepareStatement8.setString(6, "D");
			prepareStatement8.executeUpdate();

			// question 9
			prepareStatement9 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement9.setString(1, "Which of the following is a superclass of every class in Java");
			prepareStatement9.setString(2, "ArrayList ");
			prepareStatement9.setString(3, "Abstractclass");
			prepareStatement9.setString(4, "Objectclass");
			prepareStatement9.setString(5, "String");
			prepareStatement9.setString(6, "C");
			prepareStatement9.executeUpdate();

			// question 10
			prepareStatement10 = connection.prepareStatement(
					"INSERT INTO question(question, option_A, option_B,option_C,option_D,correct_Answer) VALUES (?,?,?,?,?,?)");

			prepareStatement10.setString(1, "Which of these packages contains the exception Stack Overflow in Java? ");
			prepareStatement10.setString(2, "java.io");
			prepareStatement10.setString(3, "java.system");
			prepareStatement10.setString(4, "java.lang");
			prepareStatement10.setString(5, "java.util");
			prepareStatement10.setString(6, "C");
			prepareStatement10.executeUpdate();

			// printing query insertion message
			System.out.println("Insertion of questions done");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
			prepareStatement1.close();
			prepareStatement2.close();
			prepareStatement3.close();
			prepareStatement4.close();
			prepareStatement5.close();
			prepareStatement6.close();
			prepareStatement7.close();
			prepareStatement8.close();
			prepareStatement9.close();
			prepareStatement10.close();
		}
	}

}