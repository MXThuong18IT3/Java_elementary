package task_HCP;

public class Bai2_C1_BTTG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("VIET CHUONG TRINH SAP XEP MANG VAV SO NGUYEN THEO CHIEU GIAM DAN GIA TRI CAC PHAN TU");
		int[] A = {5,3,6,7,2,9,8,4};
		for(int i=0; i< A.length-1; i++) {
			for(int j=i+1; j< A.length; j++) {
				if(A[i]<A[j]) {
					int t=A[i];
					A[i]=A[j];
					A[j]=t;
				}
			}
		}
		for(int i=0; i< A.length; i++)
			System.out.print(A[i]+ " ");
	}
}