package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class StudentManagement extends JFrame implements ActionListener, MouseListener{
	Connection conn;
	Statement stm;
	ResultSet rst;
	
	Vector vData = new Vector();
	Vector vTitle = new Vector();
	JScrollPane tableResult;
	DefaultTableModel model;
	JTable tb = new JTable();
	
	JButton edit, delete, insert;
	int selectedrow = 0;
	public StudentManagement(String s) {
		super(s);
		try {
			Class.forName("com.mysql.jdbc.driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","");
			stm = conn.createStatement();
//			Tao p de nhom cac nut va dat vao giao dien chinh
			JPanel p = new JPanel();
//			Tao cac nut va gan ong nghe
			edit = new JButton("Edit");
			edit.addActionListener(this);
			delete = new JButton("Delete");
			delete.addActionListener(this);
			insert = new JButton("Insert");
			insert.addActionListener(this);
//			Dat cac nut vao Jpanel p
			p.add(edit);
			p.add(delete);
			p.add(insert);
//			Dat p vao vung duoi cung cua cua so chinh
			this.add(p, "South");
			
		}
		
	}
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentManagement frame = new StudentManagement();
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
	public StudentManagement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
