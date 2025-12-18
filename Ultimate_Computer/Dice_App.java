package Ultimate_Computer;
import java.util.Scanner;
public class Dice_App {
	static Scanner userinput = new Scanner(System.in);
	public static void rollDice() throws InterruptedException {
		int x;
		int y;
		String roll_again;
		roll_again = "";
		while (!roll_again.equals("n")) {
			System.out.println("Rolling dice...");
			Thread.sleep(500);
			x = ((int)(Math.random()*6 + 1));
			y = ((int)(Math.random()*6 + 1));
			System.out.println(x + " + " + y + " = " + (x+y));
			System.out.print("Would you like to roll the dice again? (y or n): ");
			roll_again = userinput.nextLine();
		}
		
	}

}
