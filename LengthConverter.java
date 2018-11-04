package david_J_Eck;
import java.util.Scanner;
public class LengthConverter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double measurement;
		String units;
		double inches, feet, yards, miles;
		System.out.println("Enter measurements in inches, yards, feet, miles");
		System.out.println("For example: 1 inch 17 feet 2.73 miles");
		System.out.println("You can use abbreviations: in  ft  yd  mi");
		System.out.println("I will convert your input into the other units of measure.\n");
		while(true) {
			System.out.println("Enter your measurement, or 0 to end:  ");
			measurement = kb.nextDouble();
			if(measurement==0)	break;
			units = kb.next().toLowerCase();
			if(units.equals("inch")||units.equals("inches")||units.equals("in"))
				inches = measurement;
			else if(units.equals("foot")||units.equals("feet")||units.equals("ft"))
				inches = measurement*12;
			else if(units.equals("yards")||units.equals("yd")||units.equals("yard"))
				inches = measurement*36;
			else if(units.equals("mile")||units.equals("mi")||units.equals("miles"))
				inches = measurement*12*5280;
			else {
				System.out.println("Sorry, but I don't understand\"" + units + "\".");
				continue;
			}
			feet = inches/12;
			yards = inches/36;
			miles = inches/(12*5280);
			System.out.println("\nThat's equivalent to: ");
			System.out.printf("%12.5g", inches);
			System.out.println(" inches");
			System.out.printf("or %12.5g", feet);
			System.out.println(" feet");
			System.out.printf("or %12.5g", yards);
			System.out.println(" yards");
			System.out.printf("or %12.5g", miles);
			System.out.println(" miles");
		}
		System.out.println("\nOK! Bye for now.");
	}
}
