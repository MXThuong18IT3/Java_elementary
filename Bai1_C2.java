package task_HCP;

public class Bai1_C2 {
	// Khai bao thuoc tinh msg cua lop
	private String msg;
	// Ham khoi tao
	public Bai1_C2(String str) {
		// Khoi tao gia tri cho thuoc tinh
		msg = str;
	}
	//Thiet lap gia tri cho thuoc tinh
	public void setMsg(String s) {
		msg = s;
	}
	//Lay gia tri cho thuoc tinh
	public String getMsg() {
		return msg;
	}
	public static void main(String[] args) {
		// Tao doi tuong cua lop Bai1_C1
		Bai1_C2 f = new Bai1_C2("Hello");
		//Goi ham getMsg de lay gia tri cua Mgs
		String msg = f.getMsg();
		System.out.println(msg);
		//Thay doi thuoc tinh Msg
		msg = msg + " Java";
		f.setMsg(msg);
		//Hien thi gia tri cua thuoc tinh Msg
		System.out.println(f.getMsg());
	}
}