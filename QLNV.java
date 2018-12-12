package gui;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class QLNV extends JFrame {
JLabel lblMaNV;
JLabel lblTenNV;
JLabel lblNgayBD;
JLabel lblTrinhDo;
JLabel lblCoQuan;
JTextField tfMaNV;
JTextField tfTenNV;
JTextField tfNgayBD;
JTextField tfCQ;
JButton btnThem;
JButton btnUpdate;
JButton btnXoa;
Connection conn;
Statement s;
public void connectDB() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost/qlnv", "root", "");
		System.out.println("connected ok");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}
public QLNV() {
	lblMaNV = new JLabel("Ma NV");
	tfMaNV = new JTextField(10);
	lblTenNV = new JLabel("TenNV");
	tfTenNV = new JTextField(10);
	lblNgayBD = new JLabel("Ngay bat dau");
	tfNgayBD = new JTextField(10);
	btnThem = new JButton("Them moi");
	btnThem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try {
				connectDB();
				s= conn.createStatement();
				int n = s.executeUpdate("Insert into nhanvien values('"+tfMaNV.getText()+"','"+tfTenNV.getText()+"','"+tfNgayBD.getText()+"')");
				if(n>0) JOptionPane.showMessageDialog(null, "Sucess");
				else JOptionPane.showMessageDialog(null, "Fail");
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	});
	btnUpdate = new JButton("Cap nhat");
	btnXoa = new JButton("Xoa");
	Container cont = this.getContentPane();
	setSize(400,300);
	setLayout(new FlowLayout());
	cont.add(lblMaNV);
	cont.add(tfMaNV);
	cont.add(lblTenNV);
	cont.add(tfTenNV);
	cont.add(lblNgayBD);
	cont.add(tfNgayBD);
	cont.add(btnThem);
	cont.add(btnUpdate);
	cont.add(btnXoa);
	setVisible(true);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	new QLNV();
}
}

