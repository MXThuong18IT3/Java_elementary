package david_J_Eck;
import java.util.Scanner;
public class Ex4_C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdio = new Scanner(System.in);
		int quarters, dimes, pennies, nickels;	double dollars;
		System.out.print("Enter the number of quarters: ");	quarters= stdio.nextInt();	stdio.nextLine();
		System.out.print("Enter the number of nickels: ");	nickels= stdio.nextInt();	stdio.nextLine();
		System.out.print("Enter the number of pennies: ");	pennies= stdio.nextInt();	stdio.nextLine();
		System.out.print("Enter the number of dimes: ");	dimes= stdio.nextInt();	stdio.nextLine();
		dollars = 0.25*quarters + 0.1*dimes + 0.05*nickels + 0.01*pennies;
		System.out.print("\nThe total in dollars is $");
		System.out.printf("%1.2f\n", dollars);
	}

}
