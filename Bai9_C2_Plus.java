package task_HCP;

public class Bai9_C2_Plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int S=0, dem=0, dema=0, demb=0, demc=0;
		do{
			
			for(int a=0; a<=200; a+=5) {
				dem++;
				S= S+a;
				if(a>0) dema++;
				for(int b=0; b<=200; b+=2) {
					S= S+b;
					if(b>0) demb++;
					for(int c=0; c<=200; c++) {
					
						S= S+c;
						if(c>0) demc++;	
						if(S>200) break;
						
					}
				}
			}
			System.out.println("Phuong an "+ dem+ ": "+dema+" to 5k, "+demb+" to 2k, "+demc+" to 1k");
		}
		while(S<=200);
	}
}//    SAI ROI