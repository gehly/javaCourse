import java.util.Scanner;

public class FahrenheitToCelcius2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  // read keyboard input
		
		System.out.print("Enter a Fahrenheit value: ");
		int fahrenheit = input.nextInt();
		
		System.out.print("Enter a day of the week: ");
		String day = input.next();
		
		double celcius = (5.0/9) * (fahrenheit - 32);
		System.out.printf("%s Fahrenheit: %.1f\n", day, (double)fahrenheit);
		System.out.printf("%s Celcius: %.1f\n", day, celcius);
		
	}
}
