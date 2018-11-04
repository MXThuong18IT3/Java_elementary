package task_HCP;
import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pi = (float) 3.1415;
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap vao ban kinh duong tron= ");
		double r = kb.nextDouble();
		double c = r*2*pi;
		System.out.println("Chu vi hinh tron la "+ c);
		double s = Math.pow(r,2)*pi;
		System.out.println("Dien tich hinh tron la "+s);
	}
}
