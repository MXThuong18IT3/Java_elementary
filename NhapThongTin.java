package SinhVien;
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

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.DriverManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class NhapThongTin extends JFrame {

	private JPanel contentPane;
	private JTextField tfID;
	private JTextField tfName;
	private JTextField tfLop;
	Connection conn;
	Statement stmt;

	/**
	 * Launch the application.
	 */
	public void connectDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/qlnv", "root", "");
			System.out.println("Connect Sucess");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					NhapThongTin frame = new NhapThongTin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NhapThongTin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(10, 35, 46, 14);
		contentPane.add(lblId);
		
		tfID = new JTextField();
		tfID.setBounds(93, 32, 128, 20);
		contentPane.add(tfID);
		tfID.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 74, 46, 14);
		contentPane.add(lblName);
		
		tfName = new JTextField();
		tfName.setBounds(93, 71, 128, 20);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblLop = new JLabel("Lop");
		lblLop.setBounds(10, 119, 46, 14);
		contentPane.add(lblLop);
		
		tfLop = new JTextField();
		tfLop.setBounds(93, 116, 128, 20);
		contentPane.add(tfLop);
		tfLop.setColumns(10);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBackground(new Color(240, 240, 240));
		btnCreate.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					try {
						connectDB();
						stmt = conn.createStatement();
						int n = stmt.executeUpdate("Insert into SinhVien values('"+tfID.getText()+"','"+tfName.getText()+"','"+tfLop.getText()+"' )");
						if(n>0) JOptionPane.showMessageDialog(null, "Success");
						else JOptionPane.showMessageDialog(null, "Fail");
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
			}
		});
		btnCreate.setBounds(35, 212, 89, 23);
		contentPane.add(btnCreate);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					// TODO Auto-generated method stub
					try {
						connectDB();
						stmt = conn.createStatement();
						int n = stmt.executeUpdate("Update sinhvien set Name ='"+tfName.getText()+"',Lop ='"+tfLop.getText()+"'  where id='"+tfID.getText()+" '");
						if(n>0) JOptionPane.showMessageDialog(null, "Success");
						else JOptionPane.showMessageDialog(null, "Fail");
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
			}
				
			}
		);
		btnUpdate.setBounds(170, 212, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					connectDB();
					stmt = conn.createStatement();
					int n = stmt.executeUpdate("Delete From SinhVien where ID ='"+tfID.getText()+" '");
					if(n>0) JOptionPane.showMessageDialog(null, "Success");
					else JOptionPane.showMessageDialog(null, "Fail");
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
		}
			
			
		});
		btnDelete.setBounds(310, 212, 89, 23);
		contentPane.add(btnDelete);
		
		
	}
}