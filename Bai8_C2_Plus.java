package task_HCP;
import java.util.Scanner;
public class Bai8_C2_Plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, tram, chuc, donvi;
		Scanner kb = new Scanner(System.in);
		do
		{
			System.out.println("\nNhap so nguyen duong co 3 chu so: ");
			n = kb.nextInt();
		}
		while(n < 100 || n > 999 );
		 
		  System.out.print("\n Chu so hang tram cua "+n+ " la= "+ n/100);
		  System.out.print("\n Chu so hang chuc cua "+n+ " la= "+ (n%100)/10);
		  System.out.print("\n Chu so hang don vi cua "+n+" la= "+ (n%100)%10);
	}

}
