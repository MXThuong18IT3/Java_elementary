package task_HCP;
import java.util.Scanner;
public class Bai4_C1 {
									//	xet 3 canh tam giac 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c;	Scanner triangle = new Scanner(System.in);
		System.out.print("Nhap canh a: ");	a = triangle.nextFloat();
		System.out.print("Nhap canh b: ");	b = triangle.nextFloat();
		System.out.print("Nhap canh c: ");	c = triangle.nextFloat();
		if((a+b)>c && (a+c)>b && (b+c)>a && (a>0) && (b>0) && (c>0)) {
			System.out.print("\n\t a,b,c là 3 cạnh của ");
			if((a==b)&&(b==c))	System.out.print("Tam Giac Deu.");
			else if((a==b)||(b==c)||(a==c))	System.out.print("Tam Giac Can.");
			else if((a*a+b*b==c*c)&&(a==b)||(a*a==b*b+c*c)&&(c==b)||(a*a+c*c==b*b)&&(a==c)) {
				System.out.print("Tam Giac Vuong Can.");
			}
			else if((a*a+b*b==c*c)||(a*a==b*b+c*c)||(a*a+c*c==b*b)) {
				System.out.print("Tam Giac Vuong.");
			}
			else System.out.print("Tam Giac Thuong.");
		}
		else System.out.print(" a,b,c k phai la 3 canh cua Tam Giac.");
	}

}
