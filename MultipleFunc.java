package david_J_Eck;
import java.util.Scanner;
public class MultipleFunc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap vao n: ");
		int n = kb.nextInt();
		int s = 0;	int test = 1; 
		for(int i=1; i<=n; i++) {
			test = test * i;
			s += test;
		}
		System.out.println("S("+n+") = "+s);
	}

}
