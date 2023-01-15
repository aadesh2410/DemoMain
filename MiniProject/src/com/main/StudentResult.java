package com.main;

import com.interfaces.StudentResultInterface;

/*
 * Implements logic for calulating Grades according to the marks
 */

public class StudentResult implements StudentResultInterface {

	// takes marks as an input
	@Override
	public void getResult(int marks) {
		if (marks >= 8 && marks <= 10) {
			System.out.println("Excellent performance: You scored Garde A.");
		} else if (marks >= 6 && marks < 8) {
			System.out.println("Good performance: You scored Grade B.");
		} else if (marks == 5) {
			System.out.println("Average performance: You scored Grade C.");
		} else {
			System.out.println("You have failed the test.");
		}
	}

}
