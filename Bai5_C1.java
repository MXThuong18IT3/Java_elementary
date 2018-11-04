package task_HCP;
import java.util.Scanner;
public class Bai5_C1 {		//	Tinh tong chan tu 2 den N

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int N;
		System.out.print("Nhap N: ");	N = kb.nextInt();
		int sum = 0;
		for(int i=2;i<=N;i++) {
			if(i%2==0)
				sum += i;
		}
		System.out.println("Tong cac so chan tu 2 den N la: " + sum);
	}
}
