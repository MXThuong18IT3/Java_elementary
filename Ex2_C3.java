package david_J_Eck;

public class Ex2_C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, maxDivisors = 1, numWithMax = 1;
		for(N=2; N<= 10000; N++) {
			int D, divisorCount = 0;
			for(D=1; D <= N; D++) {
				if(N%D == 0)	divisorCount++;
			}
			if(divisorCount>maxDivisors) {
				maxDivisors = divisorCount;
				numWithMax = N;
			}
		}
		System.out.println("Among integers between 1 and 10000: ");
		System.out.println("The maximum number of divosors is " + maxDivisors);
		System.out.println("A number with " + maxDivisors + " divisors is " + numWithMax);
}
}