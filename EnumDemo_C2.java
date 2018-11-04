package david_J_Eck;
public class EnumDemo_C2 {
	// Define two enum types -- remember that the definitions
	// go OUTSIDE The main() routine!
enum Day {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
enum Month {JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC}
public static void main(String[] args) {
	Day tgif;	// Declare a variable of type Day.
	Month libra;	// Declare a variable of type Month.
	tgif = Day.FRIDAY;//Assign a variable of type Day to tgif.
	libra = Month.OCT;//Assign a variable of type Month to libra.
	System.out.println("My sign is libra, since I was born in " + libra);
	System.out.println("That's the " + libra.ordinal() + "-th month of the year.");
	System.out.println("(Counting from 0, of course!)\n");
	System.out.println("Isn't it nice to get to " + tgif);
	System.out.println(tgif + " is the " + tgif.ordinal() + "-th day of the week.");
}
}