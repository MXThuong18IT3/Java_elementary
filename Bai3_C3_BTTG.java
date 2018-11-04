package task_HCP;
import  java.util.Scanner;
public class Bai3_C3_BTTG {
	public static void UocLeLN(int n) {
		for(int i=n-1; i >= 1; i--) {
			if(n%i==0&&i%2==0||i==1) {
				System.out.println("Ban da nhap so k co uoc le"); break;
			}
			if(n%i==0&&i%2==1) {
				System.out.println("Uoc so le lon nhat cua "+n+" la "+i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = kb.nextInt();
		UocLeLN(n);
	}

}
