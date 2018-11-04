package task_HCP;
import java.util.Scanner;
public class Cau2 {
	
//	public static void NhapMang(int[] A, int n) {
		//Scanner kb = new Scanner(System.in);
		
	//}
//	static double TBC(int[] A, int n) {
		

//	static long TongChan(int[] A, int n) {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int A[] = new int[100]; int n;
		System.out.println("Nhap so phan tu = ");
		n = kb.nextInt();
		System.out.println("NHAP MANG CHUA n PHAN TU");
		//NhapMang(A,n);
		
		for(int i=0; i<n; i++) {
			int sc;
			System.out.println("A["+i+"] = ");
			sc = kb.nextInt(); 
		}
		long tong = 0;
		for(int i=0; i<n; i++) {
			tong += A[i];
		
		}
		double S = ((double)tong/n);
		System.out.println("Trung binh cong cua cac phan tu = "+S);
		long M = 0;
		for(int i=0; i<n; i++) {
			if(A[i]%2==0) {
				M += A[i];
			}
		}
		System.out.println("Tong cac so nguyen chan = "+M);
	}

}