package david_J_Eck;

public class Ex1_C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice1, dice2, countRolls = 0;
		do {
			dice1 = (int)(Math.random()*6)+1;	System.out.print(""+ dice1);
			dice2 = (int)(Math.random()*6)+1;	System.out.println("\t"+ dice2);
			countRolls += 1;
		}
		while(dice1!=1||dice2!=1);
		System.out.println("It took " + countRolls + " to get snake eyes.");
	}

}
