package task_HCP;
import java.util.Scanner;
public class TriangleCalculation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap chieu dai = ");
		double cd = kb.nextDouble();
		System.out.println("Nhap chieu rong = ");
		double cr = kb.nextDouble();
		double c = (cd+cr)*2;
		System.out.println("Chu vi hinh chu nhat = "+c);
		double s = cd*cr;
		System.out.println("Dien tich hinh chu nhat = "+s);
		double dc = Math.sqrt(Math.pow(cd, 2)+Math.pow(cr, 2));
		System.out.println("Do dai duong cheo = "+dc);
	}
}