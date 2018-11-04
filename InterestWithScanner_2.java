package david_J_Eck;
import java.util.Scanner;// Make the scanner available
public class InterestWithScanner_2 {
	public static void main(String[] args) {
		Scanner standardinput = new Scanner(System.in);//Create a scanner
		double principal, rate, interest;
		System.out.print("Enter the initial investment: ");	
		principal = standardinput.nextDouble();
		System.out.print("Enter the annual interest rate (decimal): ");
		rate = standardinput.nextDouble();
		interest = principal*rate;// Compute this year's interest
		principal = interest+principal;// Add it to principal
		System.out.print("The value of the investment after one year is $: " + principal);
	}
}