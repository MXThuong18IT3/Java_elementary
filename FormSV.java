package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class FormSV extends JFrame {
	private JTextField tfSearch;
	private JButton btnFind;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormSV frame = new FormSV();
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
	public FormSV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel UserLogin = new JPanel();
		UserLogin.setToolTipText("");
		UserLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(UserLogin);
		UserLogin.setLayout(null);
		UserLogin.setVisible(true);
		
		JLabel lblTim = new JLabel("Google");
		lblTim.setHorizontalAlignment(SwingConstants.CENTER);
		lblTim.setForeground(Color.GREEN);
		lblTim.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTim.setBounds(0, 22, 89, 23);
		UserLogin.add(lblTim);
		
		JLabel label = new JLabel("");
		label.setBounds(269, 51, 46, 14);
		UserLogin.add(label);
		
		tfSearch = new JTextField();
		tfSearch.setBounds(85, 22, 150, 23);
		UserLogin.add(tfSearch);
		tfSearch.setColumns(10);
		
		btnFind = new JButton("Find");
		btnFind.setBounds(245, 22, 70, 23);
		UserLogin.add(btnFind);
		
		JButton btnCreateNew = new JButton("Create New");
		btnCreateNew.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TaoSV obj = new TaoSV();
				obj.setVisible(true);
			}
		});
		btnCreateNew.setBounds(320, 22, 100, 23);
		UserLogin.add(btnCreateNew);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(422, 179, -15, -114);
		UserLogin.add(scrollPane);
		UserLogin.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblTim, label}));
	}
}
