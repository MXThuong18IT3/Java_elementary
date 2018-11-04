package task_HCP;
import java.util.Scanner;
public class ArrayItem {
	// NHAP MANG
	public static void ArrayInput(int[] mang, int n) {
		Scanner kb = new Scanner(System.in);
		for(int i=0; i<n; i++) {
			System.out.println("Nhap phan tu thu "+i);
			mang[i] = kb.nextInt();			
		}
	}
	// XUAT MANG
	public static void ArrayOutput(int[] mang, int n) {
		for(int i=0; i<n; i++) {
			System.out.println("Cac phan tu mang A["+i+"] la "+mang[i]);		
		}
	}
	// CAC SO CHAN CO TRONG MANG
	public static void ArrayEven(int[] mang, int n) {
		for(int i=0; i<n; i++) {
			if(mang[i]%2==0) {
			System.out.println("Cac phan tu chan cua mang la A["+i+"] la "+mang[i]);
			}
		}
	}
	// KIEM TRA SO NHAP VAO LA SO NGUYEN TO
	public static int isPrime(int num) {
		int i;
		for(i=2; i<=Math.round(Math.sqrt(num)); i++) {
			if(num%2==0) break;
		}
		if(i<=Math.round(Math.sqrt(num))) return 0;
		else return 1;
	}
	// DEM CAC SO NGUYEN TO TRONG MANG
	public static void ArrayPrime(int[] mang, int n) {
		int dem=0;
		for(int i=0; i<n; i++) {
			if(isPrime(mang[i])==1) {
				dem++;
			System.out.println("Cac phan tu nguyen to cua mang la A["+i+"] la "+mang[i]);
			}
		}
		System.out.println("Trong mang co "+dem+" la so nguyen to ");
	}
	// TINH TONG CAC SO CHIA HET CHO 5 TRONG MANG
	public static void Array5Divide(int[] mang, int n) {
		int tong = 0;
		for(int i=0; i<n; i++) {
			if(mang[i]%5==0) {
				tong += mang[i];
			}
		}
		System.out.println("Tong cac so chia het cho 5 trong mang la "+ tong);
	}
	// XUAT CAC SO CHINH PHUONG NAM TAI VI TRI LE TRONG MANG
	public static void ArrayPrimeOdd(int[] mang, int n) {
		for(int i=0; i<n; i++) {
			if(isPrime(mang[i])==1&&i%2==1) {
				System.out.println("Cac so chinh phuong nam o vi tri le trong mang la: "+mang[i]+" tai vi tri "+i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[100];
		int n;
		System.out.println("Nhap so phan tu cua mang: ");
		Scanner kb = new Scanner(System.in);
		n= kb.nextInt();
		// goi ham nhap cac phan tu cua mang
		System.out.println("Nhap cac phan tu cua mang: ");
		ArrayInput(A,n);
		// goi ham in cac phan tu cua mang
		System.out.println("Cac phan tu cua mang la: ");
		ArrayOutput(A,n);
		// goi ham in cac phan tu chan cua mang
		System.out.println("Cac phan tu chan cua mang la: ");
		ArrayEven(A,n);
		// goi ham dem cac phan tu nguyen to cua mang
		System.out.println("Dem cac phan tu nguyen to cua mang: ");
		ArrayPrime(A,n);
		// goi ham tinh tong cac phan tu chia het cho 5 trong mang
		Array5Divide(A,n);
		// foi ham xuat cac so chinh phuong nam o vi tri le trong mang
		ArrayPrimeOdd(A,n);
	}
}