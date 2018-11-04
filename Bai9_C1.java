package task_HCP;
import java.util.Scanner;
public class Bai9_C1 {
	public static int comDiv(int a, int b) {
		return (b==0)?a:comDiv(b, a%b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int a, b;
		System.out.print("Nhap a: ");
		a = kb.nextInt();
		System.out.print("Nhap b: ");
		b = kb.nextInt();
		System.out.println("USCLN cua "+a+" va "+b+" la: "+comDiv(a,b));
	}

}
