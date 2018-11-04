package task_HCP;
import java.util.Scanner;
public class NumberDescriptor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, rem, rever = 0;
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap vao so co 5 chu so = ");
		int n = kb.nextInt();
		temp = n;
		while(temp != 0) {
			rem = temp % 10;
			rever = rever*10 + rem;
			temp /= 10;
		}
		if(rever == n) System.out.println("La so doi xung");
		else System.out.println("La so khong doi xung");
	}

}
