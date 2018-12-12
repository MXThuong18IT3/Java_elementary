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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class GiaoDien extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDien frame = new GiaoDien();
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
	public GiaoDien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTimKiem = new JLabel("Tim Kiem");
		lblTimKiem.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblTimKiem.setBounds(33, 38, 92, 22);
		contentPane.add(lblTimKiem);
		
		textField = new JTextField();
		textField.setBounds(131, 36, 229, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnFind = new JButton("Find");
		btnFind.setBounds(401, 35, 97, 25);
		contentPane.add(btnFind);
		
		JButton btnCreate = new JButton("CREATE");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NhapThongTin obj = new NhapThongTin();
				obj.setVisible(true);
			}
		});
		btnCreate.setBounds(532, 35, 97, 25);
		contentPane.add(btnCreate);
	}
}
