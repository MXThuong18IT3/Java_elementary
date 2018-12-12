package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Account extends JFrame {
    JLabel lblUser;
    JTextField tfUser;
    JLabel lblPass;
    JTextField tfPass;
    JButton btnDK;
    Connection conn;
    java.sql.Statement stmt;
    public Account() {
        lblUser = new JLabel("UserName");
        tfUser = new JTextField(10);
        btnDK = new JButton("Dang ky");
        btnDK.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
            try {
                Class.forName("com.mysql.jbdc.Driver");
                conn= DriverManager.getConnection("jdbc:mysql://location/qlnv","root","");
                System.out.println("Connected...");
                stmt = conn.createStatement();
                int n = stmt.executeUpdate("Insert into account(email) values ('"+tfUser.getText()+"')");
            } catch  (Exception e2) {
                e2.printStackTrace();
            }
            }
        });
        Container cont = this.getContentPane();
        setLayout(new FlowLayout());
        setSize(400, 300);
        cont.add(lblUser);
        cont.add(tfUser);
        cont.add(lblPass);
        cont.add(tfPass);
        cont.add(btnDK);
        setVisible(true);
    }
    //ham connect tu java den csdl
    public void connectDB() {
        try {
            //load jdbc su dung cac thu vien trong jdbc
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            DriverManager.getConnection("jdbc:sqlserver://DESKTOP-1I94MIJ;"
                        + "    databaseName=StudentDB;integratedSecurity=TRUE");
            System.out.println("Connect thanh cong");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Account();
    }

}
