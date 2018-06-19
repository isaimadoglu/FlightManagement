package com.tav.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.tav.store.MysqlConnect;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;


public class Login extends JFrame {
//database connection
	Connection conn=null;
	
	
	private JPanel contentPane;
	private JTextField usernameField;
	private JTextField passwordField;
	private JLabel lblUsername;
	private JLabel lblPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		//establish connection
	//	conn=MysqlConnect.ConnectDb();
		
		setTitle("FlightManagement");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 540);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usernameField = new JTextField();
		usernameField.setText("admin");
		usernameField.setBounds(336, 287, 116, 22);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(336, 333, 116, 22);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\isa\\flightmanagement\\logos\\tav_it_270ve160.png"));
		lblNewLabel_1.setBounds(227, 49, 275, 169);
		contentPane.add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(usernameField.getText().equals("admin") && passwordField.getText().equals("pas")){
					
					FlightManagement fm = new FlightManagement();
					fm.setVisible(true);
					Login.this.dispose();
					
				}
				else{
					JOptionPane.showMessageDialog(null, "Hatalı Giriş Yaptınız.", "Hata!", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		btnLogin.setBounds(336, 392, 97, 25);
		contentPane.add(btnLogin);
		
		lblUsername = new JLabel("username");
		lblUsername.setBounds(227, 287, 97, 22);
		contentPane.add(lblUsername);
		
		lblPassword = new JLabel("password");
		lblPassword.setBounds(227, 335, 74, 19);
		contentPane.add(lblPassword);
	}
}
