package Ultimate_Computer;
import java.util.Scanner;
public class Binary_Calculator_App {
	static Scanner userinput = new Scanner(System.in);
	public static void binaryCalculator() {
		String x;
		String y;
		
		System.out.print("Enter a binary number for x --> ");
		x = userinput.nextLine();
		
		System.out.print("Enter a binary number for y --> ");
		y = userinput.nextLine();
		
		System.out.println("x+y = " + Integer.toBinaryString(Integer.parseInt(x,2) + Integer.parseInt(y,2)));
		System.out.println("x-y = " + Integer.toBinaryString(Integer.parseInt(x,2) - Integer.parseInt(y,2)));
		System.out.println("x*y = " + Integer.toBinaryString(Integer.parseInt(x,2) * Integer.parseInt(y,2)));
		System.out.println("x/y = " + Integer.toBinaryString(Integer.parseInt(x,2) / Integer.parseInt(y,2)));
		
	}

}
