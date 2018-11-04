package task_HCP;

public class Bai10_C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Write a Java program very easily";
		int count = 0;
		for(int i=0; i<s.length(); i++)
			if(s.charAt(i)=='a') count++;
				System.out.println("so luong ky tu 'a' co trong chuoi= "+ count);
		int index = s.indexOf("Java");
		if(index>=0) System.out.println("Tu java dau tien cua chuoi o vi tri "+ index);
		else System.out.println("Chuoi k chua tu Java");
		if(s.startsWith("Write")==true) System.out.println("Tu Write bat dau chuoi");
		else System.out.println("Tu Write k bat dau truoc chuoi");
		if(s.endsWith("easily")==true) System.out.println("Tu easily ket thuc chuoi");
		else System.out.println("Tu easily k ket thuc chuoi");
	}

}
