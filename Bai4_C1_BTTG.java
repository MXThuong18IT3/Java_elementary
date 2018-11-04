package task_HCP;
import java.util.Scanner;
public class Bai4_C1_BTTG {
	public static void NhapMang(int[] A, int n) {
		Scanner kb = new Scanner(System.in);
		for(int i=0; i<n; i++) {
			System.out.print("A["+i+"] = ");
			kb.nextInt();
		}
		kb.close();
	}
	public static void PTNC(int[] A, int n) {
		int min = A[0];
		for(int i=1; i<=n; i++) {
			if(A[i]<A[0]) min = A[i];
		}	
		if(A[n] == min) System.out.println("Phan tu cuoi cua day la phan tu nho nhat");
		else System.out.println("Day co phan tu nho nhat la "+min+" nhung khong phai la phan tu cuoi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong phan tu: ");
		n = kb.nextInt();
		int A[] = new int[100];
		NhapMang(A,n);
		PTNC(A,n);
		kb.close();
	}

}
