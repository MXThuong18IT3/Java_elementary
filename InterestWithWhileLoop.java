package david_J_Eck;
import java.util.Scanner;
public class InterestWithWhileLoop {
public static void main(String[] args) {
	double principal, rate;
	Scanner kb = new Scanner(System.in);
	System.out.println("Enter the initial investment: "); principal = kb.nextDouble();
	System.out.println();
	System.out.println("Enter the annual interest rate.");
	System.out.println("Enter a decimal, not a percentage: ");	rate = kb.nextDouble();
	System.out.println();
	int years = 0;
	while(years<5){
		double interest;
		interest = principal * rate;
		principal = principal + interest;
		years = years + 1;
		System.out.println("The value of the investment after " + years + " years is $");
		System.out.printf("%1.2f\n", principal);
	}
}
}
