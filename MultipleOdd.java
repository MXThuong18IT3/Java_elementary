package david_J_Eck;
import java.util.Scanner;
public class MultipleOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap vao n: ");
		int n = kb.nextInt();
		int s = 1;
		for(int i=1; i<=n; i++) {
			s *= (2*i+1);
		}
		System.out.println("P("+n+") = "+s);
	}

}
