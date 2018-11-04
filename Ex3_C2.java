package david_J_Eck;
import java.util.Scanner;
public class Ex3_C2 {
public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in);
	String usersName;
	String upperCaseName;
	System.out.print("Please enter your name: ");
	usersName = stdin.nextLine();
	upperCaseName = usersName.toUpperCase();
	System.out.println("Hello, "+upperCaseName+", nice to meet you!");
}
}
