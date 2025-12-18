package Ultimate_Computer;
import java.util.Scanner;
public class Calculator_App {
	static Scanner userinput = new Scanner(System.in);
	public static void calculate() {
		double x;
		double y;
		
		System.out.print("Enter a decimal number for x --> ");
		x = userinput.nextDouble();
		
		System.out.print("Enter a decimal number for y --> ");
		y = userinput.nextDouble();
		
		System.out.format("x+y = %.3f\n", x + y);
		System.out.format("xy = %.3f\n", x * y);
		System.out.format("x/y = %.3f\n", x / y);
		System.out.format("x^y = %.3f\n", Math.pow(x,y));
		System.out.format("log y (x) = %.3f\n", Math.log(x)/Math.log(y));
		
	}

}
