package Ultimate_Computer;
import java.util.Arrays;
import java.util.Scanner;
public class Fibonacci_Sequence {
	static Scanner userinput = new Scanner(System.in);
	public static void fibonacci() {
		int size = 0; 
		int value = 1;
		System.out.println("How many Fibonacci numbers would you like displayed?");
		while (size<1 || size>32) {
			System.out.print("Enter a number between 1 and 32: ");
			size = userinput.nextInt();
		}
		
		int[] fibonacci = new int[size];
				
		for (int i=0; i<size; i++) {
			if (i==0||i==1) {fibonacci[i] = value;}
			else {fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];}
		}
		
		System.out.println(Arrays.toString(fibonacci));
		
	}
}
