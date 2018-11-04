package david_J_Eck;
import java.util.Scanner;
public class SumAndMultiple {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen 1 = ");
		int a = kb.nextInt();
		System.out.println("Nhap vao so nguyen 2 = ");
		int b = kb.nextInt();
		int c = a + b;
		int d = a*b;
		System.out.println("Tong: "+a+"+"+b+"="+c);
		System.out.println("Tich: "+a+"*"+b+"="+d);
	}

}
