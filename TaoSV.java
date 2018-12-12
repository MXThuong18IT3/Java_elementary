package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class TaoSV extends JFrame {

	private JPanel contentPane;
	private JTextField tfID;
	private JTextField tfTen;
	//tao doi tuong connect
	Connection conn;
	Statement stmt;
	//tao ham connect DB
	public void connectDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/studentdb", "root", "");
			System.out.println("Connect Sucess");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaoSV frame = new TaoSV();
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
	public TaoSV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblID = new JLabel("ID");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblID.setBounds(25, 23, 27, 15);
		contentPane.add(lblID);
		
		tfID = new JTextField();
		tfID.setBounds(80, 18, 86, 20);
		contentPane.add(tfID);
		tfID.setColumns(10);
		
		JLabel lblTen = new JLabel("Ten");
		lblTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTen.setBounds(25, 72, 46, 14);
		contentPane.add(lblTen);
		
		tfTen = new JTextField();
		tfTen.setBounds(80, 72, 86, 20);
		contentPane.add(tfTen);
		tfTen.setColumns(10);
		
		JButton btnTaoMoi = new JButton("Tao Moi");
		btnTaoMoi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					connectDB();
					stmt = conn.createStatement();
					int a = stmt.executeUpdate("Update SinhVien set ID ='"+tfID.getText()+"',TenSV ='"+tfTen.getText()+"");
					if(a>0) JOptionPane.showMessageDialog(null, "Successed!!!");
					else JOptionPane.showMessageDialog(null, "Fail!!!");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnTaoMoi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTaoMoi.setBounds(25, 132, 89, 23);
		contentPane.add(btnTaoMoi);
		
		JButton btnCapNhat = new JButton("Cap Nhat");
		btnCapNhat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					connectDB();
					stmt = conn.createStatement();
					int b = stmt.executeUpdate("Update SinhVien set TenSV ='"+tfTen.getText()+"'where ID ='"+tfID.getText()+"'");
					if(b>0) JOptionPane.showMessageDialog(null, "Successed!!!");
					else JOptionPane.showMessageDialog(null, "Fail!!!");
				}
				catch(SQLException e2) {
					e2.printStackTrace();
				}
			}
		});
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCapNhat.setBackground(new Color(240, 240, 240));
		btnCapNhat.setBounds(150, 132, 89, 23);
		contentPane.add(btnCapNhat);
		
		JButton btnXoa = new JButton("Xoa");
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				try {
					connectDB();
					stmt = conn.createStatement();
					int c = stmt.executeUpdate("Delete set TenSV ='"+tfTen.getText()+"'where ID ='"+tfID.getText()+"'");
					if(c>0) JOptionPane.showMessageDialog(null, "Successed!!!");
					else JOptionPane.showMessageDialog(null, "Fail!!!");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnXoa.setBackground(new Color(200, 200, 200));
		btnXoa.setBounds(300, 132, 89, 23);
		contentPane.add(btnXoa);
	}

}
