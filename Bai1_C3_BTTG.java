package task_HCP;
import java.util.Scanner;
public class Bai1_C3_BTTG {
	public static void USCLN(int a, int b) {
		int max, min, uocln = 0;
		if(a>b) {
			max = a;
			min = b;
		}
		else if(a<b) {
			max = b;
			min = a;
		}
		else {
			min = max = a;
		}
		
		for(int i = min; i>1; i--) {
			if(max%i==0&&min%i==0) {
				uocln = i;
				break;
			}
		}
		System.out.println("Uoc so chung lon nhat cua 2 so la: "+uocln);
	}
	public static void BSCNN(int a, int b) {
		int max, min, boinn = 0;
		if(a>b) {
			max = a;
			min = b;
		}
		else if(a<b) {
			max = b;
			min = a;
		}
		else {
			min = max = a;
		}
		
		for(int i = max;; i++) {
			if(i%max==0&&i%min==0) {
				boinn = i;
				break;
			}
		}
		System.out.println("Boi so chung lon nhat cua 2 so la: "+boinn);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int a,b;
		System.out.println("Nhap a: ");
		a = kb.nextInt();
		System.out.println("Nhap b: ");
		b = kb.nextInt();
		USCLN(a,b);
		BSCNN(a,b);
	}

}