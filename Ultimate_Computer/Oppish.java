package Ultimate_Computer;
import java.util.Scanner;
public class Oppish {
	static Scanner userinput = new Scanner(System.in);
	public static void oppish() {
		String sentence;
		String oppish;
		boolean consonant = false;
		boolean vowel = false;
		int length;
		int len_oppish;
		int index = 0;
		int i;
		
		System.out.print("Enter a sentence: ");
		sentence = userinput.nextLine();
		oppish = sentence;
		length = sentence.length();
		for (i=0; i<length; i++) {
			len_oppish = oppish.length();
			if (sentence.charAt(i)==(char)65||sentence.charAt(i)==(char)69||sentence.charAt(i)==(char)73
					||sentence.charAt(i)==(char)79||sentence.charAt(i)==(char)85||sentence.charAt(i)==(char)89
					||sentence.charAt(i)==(char)97||sentence.charAt(i)==(char)101||sentence.charAt(i)==(char)105
					||sentence.charAt(i)==(char)111||sentence.charAt(i)==(char)117||sentence.charAt(i)==(char)121) 
					{vowel = true;}
			else {consonant = true; vowel = false;}
			
			if (sentence.charAt(i)==(char)32) {consonant = false;}
			
			if (consonant && vowel) {
				oppish = oppish.substring(0,index) + "opp" + oppish.substring(index,len_oppish);
				index += 3;
				consonant = false;}
			
			index += 1;
		}
		System.out.println(oppish);
	}
}
