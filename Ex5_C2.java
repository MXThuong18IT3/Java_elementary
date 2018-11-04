package david_J_Eck;
import java.util.Scanner;
public class Ex5_C2 {
static public void main(String[] args) {
	Scanner stdio = new Scanner(System.in);
	int eggs , gross, aboveGross, dozen, leftover;
	System.out.print("How manny eggs you have: ");	eggs = stdio.nextInt();
	gross = eggs/144;
	aboveGross = eggs%144;
	dozen = aboveGross/12;
	leftover = aboveGross%12;
	System.out.print("The number of eggs is "+ gross+" gross, "+ dozen+ " dozen and "+ leftover+ " leftover.");
}
}