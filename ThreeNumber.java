package task_HCP;
import java.util.Scanner;
public class ThreeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int so = kb.nextInt();
		if(0<so&&so<1000) {
			int tram = so/100;
			int chuc = so%100/10;
			int donvi = so%100%10;
			System.out.println("Hang tram = "+tram+"\nHang chuc = "+chuc+"\nHang don vi = "+donvi);
		}
		else System.out.println("Ban da nhap sai");
	}

}
