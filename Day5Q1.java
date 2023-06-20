package basic.exercise;

import java.util.Scanner;

//Create the java program to accept user input which should be even number.
public class Day5Q1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = 0;
		
		boolean a = false;

		do {
			System.out.print("Enter an number");
			int userInput = sc.nextInt();
			if (userInput % 2 == 0)
				a = true;
			else {
				 new Day5Q1ExceptionOddClass("you entered an odd number please enter even number");
			}
		} while (!a);
		
		
	}

}
