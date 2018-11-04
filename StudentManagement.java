package task_HCP;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class StudentManagement {
	Vector list = new Vector();
	Vector chuyen= new Vector();
	public StudentManagement(){
	while(true) {
		//hien thi chuong trinh quanly
		System.out.println(" CHUONG TRINH QUAN LY SINH VIEN");
		System.out.println(" - Chuc nang cua chuong trinh");
		System.out.println(" 1. Nhap danh sach sinh vien");
		System.out.println(" 2. Xem danh sach sinh vien");
		System.out.println(" 3. Sap xep danh sach sinh vien tang dan theo diem tring binh");
		System.out.println(" 4. Tim sinh vien theo ten");
		System.out.println(" 5. Diem dnh sinh vien");
		System.out.println(" 6. Xem thong tin chuyen can theo ten");
		System.out.println(" 7. Thoat chuong trinh");
		System.out.println("---------------------");
		int n;
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap chuc nang ma ban muon thuc hien");
		n=key.nextInt();
		switch (n) {
		case 1: input();break;
		case 2: view();break;
		case 3: sort();break;
		case 4: search();break;
		case 5: diemdanh();break;
		case 6: xemchuyencan();break;
		case 7: System.out.println(" Chuong trinh ket thuc");break;
		}	
	}
}
		public void input() {
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("nhap so sinh vien");
			n=key.nextInt();
			for(int i=1;i<=n;i++) {
				System.out.println("Nhap thong tin cho sinh vien thu "+i);
				System.out.println(" ID: ");
				int id=key.nextInt();
				key.nextLine();
				System.out.println(" NAME: ");
				String name=key.nextLine();
				System.out.println(" DIEM TB:");
				float aver=key.nextFloat();
				Student st=new Student(id,name,aver);
				list.add(st);
			}
			System.out.println("-------------------------------------------------------");
		}

		public void view() {
			System.out.println("Thong tin danh sach sinh vien");
			Enumeration vEnum =list.elements();
			int i=1;
			while(vEnum.hasMoreElements()) {
				Student sts = (Student)vEnum.nextElement();
				System.out.println("    "+i+"   ID="+sts.getId()+"  Ten="+sts.getName()+"   Diem TB="+sts.getAver());
				i++;
			}
			System.out.println("------------------------------------------------------");
			}
		public void sort()
		{
			Student[] sts = new Student[list.size()];
			int index=0;
			Enumeration vEnum = list.elements();
			while(vEnum.hasMoreElements())
			{
				sts[index]= (Student)vEnum.nextElement();
				index++;
			}
			Arrays.sort(sts);
			System.out.println(" Danh sach sinh vien sau khi sap xep la");
			for(index=0;index< sts.length; index++) {
				System.out.println("    "+(index+1)+"   ID="+sts[index].getId()+"  Ten="+sts[index].getName()+"   Diem TB="+sts[index].getAver());	
			}
			System.out.println("-------------------------------------");
		}
		public void search() {
			Scanner key = new Scanner(System.in);
			System.out.println(" Nhap ten sinh vien can tim kiem");
			String name = key.nextLine();
			Enumeration vEnum = list.elements();
			while(vEnum.hasMoreElements()) {
				Student sts = (Student)vEnum.nextElement();
				if (sts.getName().indexOf(name)!=-1) 
					System.out.println("   ID="+sts.getId()+"  Ten="+sts.getName()+"   Diem TB="+sts.getAver());
			}
			System.out.println("-----------------------------------------------");
			
		}
		public void diemdanh() {
			int songayden=0;
			int songayvang=0;
			int x;
			System.out.println("Bat dau diem danh");
			Enumeration vEnum =list.elements();
			int i=1;
			while(vEnum.hasMoreElements()) {
				Student sts = (Student)vEnum.nextElement();
				System.out.println("Sinh vien thu "+i+":   "+sts.getName());
				System.out.println("neu co mat nhap 1, neu vang mat nhap 0");
				Scanner key = new Scanner(System.in);
				x=key.nextInt();
				if(x==1) songayden++;
				else songayvang++;
				Student dihoc = new Student(songayden,songayvang);
				chuyen.add(dihoc);
				i++;
			}
			System.out.println("------------------------------------------------------");
			
		}
		public void xemchuyencan() {
			Scanner key = new Scanner(System.in);
			System.out.println(" Nhap ten sinh vien can xem thong tin chuyen can");
			String name = key.nextLine();
			Enumeration vEnum =list.elements();
			Enumeration ccan =chuyen.elements();
			int i=1;
			while(vEnum.hasMoreElements()) {
				Student sts = (Student)vEnum.nextElement();
				Student chuyenc = (Student)ccan.nextElement();
				if (sts.getName().indexOf(name)!=-1) 
					System.out.println("   So ngay di hoc: ="+chuyenc.getSongayden()+"  So ngay vang hoc: "+sts.getSongayvang());
				
				
				i++;
			}
			System.out.println("-----------------------------------------------");
		}
		public static void main(String[] agrs) {
			new StudentManagement();
		}
}

import javax.management.loading.PrivateClassLoader;

public class Student implements Comparable {
	private int id;
	private String name;
	private float aver;
	private int songayden;
	private int songayvang;
	public Student()
	{
		name= new String();
		id=0;
		aver=0;
	}
	public Student(int i,String n, float a)
	{
		id=i;
		name=n;
		aver=a;
	}
	public Student(int x,int y) {
		songayden=x;
		songayvang=y;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getAver() {
		return aver;
	}
	public int getSongayden() {
		return songayden;
	}
	public int getSongayvang() {
		return songayvang;
	}
	public int compareTo(Object other) {
		Student otherRect = (Student)other;
		return (int)(this.aver-otherRect.aver);
	}
}

 

