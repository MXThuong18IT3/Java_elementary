package task_HCP;
import java.util.Scanner;
public class Bai5_C1_BTTG {
	public static int gtln(int a, int b, int c) {
		int max;
		if(a>=b&&a>=c) return max=a;
		else if(b>=a&&b>=c) return max=b;
		else return max=c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c, max;
		Scanner kb = new Scanner(System.in);
		System.out.println("CHUONG TRINH TIM GIA TRI LON NHAT TRONG 3 SO");
		System.out.print("Nhap a= "); a = kb.nextInt();
		System.out.print("Nhap b= "); b = kb.nextInt();
		System.out.print("Nhap c= "); c = kb.nextInt();
		max = gtln(a,b,c); 
		System.out.print("Gia tri lon nhat trong 3 so la= "+ max);
	}

}