package task_HCP;
import java.util.Scanner;
public class Bai6_C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int N, i;
		System.out.print("N = ");
		N = kb.nextInt();
		for(i=2 ; i <= Math.round(Math.sqrt(N)); i++)
			if(N%i==0) break;
		if(i <= Math.round(Math.sqrt(N))) 
				System.out.print("N khong phai la so nguyen to.");
		else System.out.print("N la so nguyen to.");
	}
}
