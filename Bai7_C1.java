/*package task_HCP;

public class Bai7_C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {5, 7, 2, 4, 8};
		for( int i = 0; i< A.length-1; i++) {
			for(int j= i+1; j< A.length; j++) {
				if(A[i] > A[j]) {
					int t = A[i];
					A[i] = A[j];
					A[j] = t;
				}
			}
		}
		for(int z = 0; z< A.length; z++)
			System.out.print(A[z] +" ");
	}
}*/
package task_HCP;
import java.util.Arrays;
public class Bai7_C1{
	public static void main(String[] args) {
		int[] A = {5, 7, 2, 4, 8};
		Arrays.sort(A);
		for(int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}
}
