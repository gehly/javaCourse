// This program prompts a user for inputs and performs simple 
// calculations

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);  // read keyboard input
		
		// Print options for user
		System.out.println("Choose an operation: add, subtract, multiply, divide, or alphabetize");
		
		// Retrieve user input and reformat
		String operation = input.next();
		operation = operation.toLowerCase();
		
		// Perform requested operation
		if (operation.equals("add")){
			System.out.println("Enter two integers: ");
			int ii = input.nextInt();
			int jj = input.nextInt();
			int output = ii + jj;
			System.out.println("The answer is: " + output);
		}
		else if (operation.equals("subtract")){
			System.out.println("Enter two integers: ");
			int ii = input.nextInt();
			int jj = input.nextInt();
			int output = ii - jj;
			System.out.println("The answer is: " + output);
		}
		else if (operation.equals("multiply")){
			System.out.println("Enter two doubles: ");
			double ii = input.nextDouble();
			double jj = input.nextDouble();
			double output = ii*jj;
			System.out.printf("The answer is: %.2f", output);
		}
		else if (operation.equals("divide")){
			System.out.println("Enter two doubles: ");
			double ii = input.nextDouble();
			double jj = input.nextDouble();
			if (jj == 0.0){
				System.out.println("Error: Divide by zero!");
			}
			else {
				double output = ii/jj;
				System.out.printf("The answer is: %.2f", output);
			}
		}
		else if (operation.equals("alphabetize")){
			System.out.println("Enter two words: ");
			String ii = input.next();
			String jj = input.next();
			int output = (ii.toLowerCase()).compareTo(jj.toLowerCase());
			if (output < 0){
				System.out.println(ii + " comes before " + jj + " alphabetically");
			}
			else if (output > 0){
				System.out.println(jj + " comes before " + ii + " alphabetically");
			}
			else{
				System.out.println("Chicken or egg.");
			}
		}
		else {
			System.out.println("Invalid input entered. Terminating...");
		}
		
		
		
		
	}
}
