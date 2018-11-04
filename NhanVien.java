import java.util.Scanner;
public class NhanVien {
	Scanner key = new Scanner(System.in);
	float sogio;
	String hoten;
	String manv;
public NhanVien(){
	this.hoten = hoten;
	this.sogio = sogio;
	this.manv = manv;
}
public void NhapTT()
{
	this.hoten=key.nextLine();
	this.sogio= key.nextFloat();
	this.manv=key.nextLine();
}
public void InTT()
{
	System.out.println("ma nhan vien la"+this.manv+"ten la"+this.hoten+"so gio ="+this.sogio);
}
class vanphong extends NhanVien{
	float hsl;
	int phucap;

public vanphong(float hsl, int phucap) {
	this.hsl=key.nextFloat();
	this.phucap=key.nextInt();
}
	super(sogio, hoten, manv);
}

}
}