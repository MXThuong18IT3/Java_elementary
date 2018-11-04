package david_J_Eck;
import java.util.Scanner;
public class Ex3_C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstNum, secondNum, value;
		char operator;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter expressions such as 2 + 2 or 34.2 * 7.81");
		System.out.println("using any of the operators +, -, *, /.");
		System.out.println("To end, enter a 0.\n");
		while(true) {
			System.out.print("? ");	firstNum = kb.nextDouble();
			if(firstNum == 0) break;
			operator = kb.next().charAt(0);
			secondNum = kb.nextDouble();
			switch(operator) {
				case '+': value = firstNum + secondNum;
					break;
				case '-': value = firstNum - secondNum;
					break;
				case '*': value = firstNum * secondNum;
					break;
				case '/': value = firstNum / secondNum;
					break;
			default: System.out.println("Unknown operator: "+ operator);
					 continue;
			}
			System.out.println("Value is "+ value);
			System.out.println("");
		}
		System.out.println("Good bye");
	}

}
