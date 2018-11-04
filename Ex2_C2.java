package david_J_Eck;
public class Ex2_C2 {
public static void main(String[] args) {
	int dice1, dice2, ttdice;
	dice1 = (int)(Math.random()*6)+1;
	dice2 = (int)(Math.random()*6)+1;
	System.out.println("The first die comes up " + dice1);
	System.out.println("The second die comes up " + dice2);
	ttdice = dice1 + dice2;
	System.out.println("Your totals roll is " + ttdice);
	}
}
