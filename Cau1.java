package task_HCP;
import java.util.Scanner;
public class Cau1 {
	public static void InSo(int n) {
		if(0<n&&n<10000) {
			int nghin = n/1000;
			int tram = n%1000/100;
			int chuc = n%1000%100/10;
			int donvi = n%1000%100%10;
			System.out.println("Hang nghin = "+nghin+"\nHang tram = "+tram+"\nHang chuc = "+chuc+"\nHang don vi = "+donvi);
		}
		else System.out.println("\t\tBan da nhap sai so!");
	}
	public static void ChanLe(int n) {
		if(n%2==0)
			System.out.println("So nguyen la so chan!");
		else System.out.println("So nguyen la so le!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap so nguyen co 4 chu so: ");
		int so = kb.nextInt();
		System.out.println("\tIN RA TUNG CHU SO");
		InSo(so);
		System.out.println("\tKIEM TRA SO NGUYEN LA SO CHAN HAY LE");
		ChanLe(so);
	}

}
