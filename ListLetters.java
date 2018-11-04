package david_J_Eck;
import java.util.Scanner;
public class ListLetters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str;
	char letter;
	Scanner kb = new Scanner(System.in);
	System.out.println("Please type in a line of text.");
	str = kb.next();	str = str.toUpperCase();
	System.out.println("Your input contains the following letters: \n\t");
	int count = 0;
	for(letter = 'A'; letter <= 'Z'; letter++)
		for(int i = 0; i < str.length(); i++)
			if(letter == str.charAt(i)) {
				System.out.print(" " + letter);
				count++;
				break;
			}
	System.out.println("");
	System.out.println("There were " + count + " different letters.");
	}
}
