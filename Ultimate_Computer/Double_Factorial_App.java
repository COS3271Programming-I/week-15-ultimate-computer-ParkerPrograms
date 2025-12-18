package Ultimate_Computer;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Double_Factorial_App {
	static Scanner userinput = new Scanner(System.in);
	
	public static int getInt(String message) {
		//this method gets a valid integer from the user
		int response;
		String dummy;
		while (1 == 1) {
			try {
				System.out.print(message);
				response = userinput.nextInt();
				if ((response < 20 ) && (response > 0)) {
					return response;
				}
			} catch (InputMismatchException e) {
				dummy = userinput.nextLine();
				continue;
			}
		}
	}
	public static int double_factorial(int value) {
		//this method calculates the double factorial
		if (value == 1) {return 1;}
		if (value == 2) {return 2;}
		return double_factorial(value - 2) * value;
	}
	public static void doubleFactorial() {
		//get a valid integer
		int user_value = getInt("Enter a positive integer less than 20: ");
		//call the double_factorial method and display the results
		System.out.println("The double factorial of " + user_value + " is " + double_factorial(user_value));
	}
}
