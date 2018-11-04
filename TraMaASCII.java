package task_HCP;
import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class TraMaASCII {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap vao 1 ki tu");
		String str = kb.nextLine();
		for(int i = 0; i< str.length(); i++) {
			char c = str.charAt(i);
			int j = (int) c;
			System.out.println("Ma ASCII la "+ j+ "");
		}
	}

}
