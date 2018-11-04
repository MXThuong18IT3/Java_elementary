import java.util.Scanner;
public class Bai6_C1_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int N, i;
		System.out.println("Nhap N: "); N = kb.nextInt();
		double S=0;
		for(i=1; i<=N; i++) {
			S += (double)(i/(i+1));
			System.out.println("S = ");
		}
		System.out.println(S);
	}

}
