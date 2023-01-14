package com.main;

public class StudentResult {
	
	
	public void getResult(int marks) {
		//System.out.println("from getresult method "+marks);
		//QuizStart quizStart = new QuizStart();
		if (marks >= 8 && marks <= 10) {
			System.out.println("Excellent performance: You scored Garde A.");
		}else if (marks >=6 && marks < 8) {
			System.out.println("Good performance: You scored Grade B.");
		}else if (marks == 5) {
			System.out.println("Average performance: You scored Grade C.");
		}else {
			System.out.println("You have failed the test.");
		}
	}

}
