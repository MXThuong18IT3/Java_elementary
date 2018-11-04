package task_HCP;
import java.util.Scanner;
public class ElectricBill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap so kw dau ki ");
		float dk = kb.nextFloat();
		System.out.println("Nhap kw cuoi ki ");
		float ck = kb.nextFloat();
		System.out.println("Nhap vao m1 ");
		float m1 = kb.nextFloat();
		System.out.println("Nhap vao m2 ");
		float m2 = kb.nextFloat();
		System.out.println("Nhap vao m3 ");
		float m3 = kb.nextFloat();
		if(ck>=dk) {
			float n = ck - dk;
			if(n<=200) {
				if(n<=100) {
					float tien = m1*n;
					System.out.println("Tien dien thang m1 = "+tien);
				}
				else {
					float tien = m2*n;
					System.out.println("Tien dien thang m2 = "+tien);
				}
			}
			else {
				float tien = m3*n;
				System.out.println("Tien dien thang m3 = "+tien);
			}
		}
		else {
			System.out.println("Ban da nhap sai");
		}
	}

}
