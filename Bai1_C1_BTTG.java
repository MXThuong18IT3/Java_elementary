package task_HCP;

public class Bai1_C1_BTTG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CHUONG TRINH TINH TONG CAC SO LE TU 1 --> 100");
		int i, S=0;
		for(i=1; i<=100; i++) {
			if(i%2==1) S += i;
		}
		System.out.println("Tong S= "+ S);
	}

}
