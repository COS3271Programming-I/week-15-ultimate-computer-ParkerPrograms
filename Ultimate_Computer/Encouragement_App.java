package Ultimate_Computer;
import java.util.Scanner;
public class Encouragement_App {
	static Scanner userinput = new Scanner(System.in);
	public static void encourage() {
		int age;
		String feelings;
		System.out.print("How old are you? ");
		age = userinput.nextInt();
		userinput.nextLine();
		
		System.out.print("How are you doing today? (good, bad, okay, or busy) ");
		feelings = userinput.nextLine();
		
		if (age < 20) {System.out.println(age + " is a good age to be.");}
		if ((age >= 20) && (age < 40)) {System.out.println(age + " is a great age to be.");}
		if ((age >= 40) && (age < 60)) {System.out.println(age + " is a wonderful age to be.");}
		if (age >= 60) {System.out.println(age + " is a splendid age to be.");}
		
		if (feelings .equals("good")) {System.out.println("Finish the day strong.");}
			else if (feelings .equals("bad")) {System.out.println("Remember, this world is not our home.");}
			else if (feelings .equals("okay")) {System.out.println("Make today a good day.");}
			else if (feelings .equals("busy")) {System.out.println("Keep up the hard work.");}
			else {System.out.println("I do not know what you mean by '" + feelings + "'");}
			
	}

}
