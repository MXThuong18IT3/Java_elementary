package task_HCP;
import java.util.Scanner;
public class Bai3_C1 {							// ******Giai PTB2*****
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		float x1,x2,a,b,c,delta ;
		System.out.print("Nhập a: ");	a = kb.nextInt();
		System.out.print("Nhập b: ");	b = kb.nextInt();
		System.out.print("Nhập c: ");	c = kb.nextInt();
		if(a==0) {
			if(b==0)
				if(c==0)	System.out.print("PT Vố Số Nghiệm.");
				else	System.out.print("PT Vô Nghiệm.");
			else	System.out.print("PT có nghiệm: " + -c/b);
		}
		else {
			delta = b*b-4*a*c;
			
			if(delta>0) {
				x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
				x2 = (float) ((-b - Math.sqrt(delta))/(2*a));
				System.out.println("PT có 2 nghiệm xác định: \tx1 = " + x1 + "\t x2 = " + x2);
			}
			else if(delta==0)	System.out.println("PT có nghiệm kép: x = " + -b/(2*a));
			else	System.out.println("PT Vô Nghiệm.");
		}	
	}
}
