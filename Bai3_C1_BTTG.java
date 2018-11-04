package task_HCP;

public class Bai3_C1_BTTG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("VIET CHUONG TRINH TIM GIA TRI NHO NHAT MANG CAC SO NGUYEN");
		int[] A = {5,3,6,7,978,3,34,9,2};
		int min= A[0];
		for(int i=0; i< A.length; i++) {
			if(A[i]<A[0]) min = A[i];
		}
		System.out.println("Gia Tri Nho Nhat La= "+ min);
	}

}
