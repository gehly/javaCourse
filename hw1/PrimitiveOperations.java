// This file contains simple math and casting operations
public class PrimitiveOperations{
	public static void main(String[] args){
		
		// Basic setup and print to check values
		int x = 5;
		double y = 3.5;
		double z = x * y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);		
		System.out.println("z = " + z);
		
		// Casting 
		double xdouble = (double)x;
		int yint = (int)y;
		System.out.println("xdouble = " + xdouble);		
		System.out.println("yint = " + yint);
		
		// Char
		char letter = 'C';
		char lowerLetter = (char)((int)letter + 32);
		System.out.println("letter = " + letter);
		System.out.println("lowerLetter = " + lowerLetter);
	}
}
