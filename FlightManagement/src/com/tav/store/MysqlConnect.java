package com.tav.store;

import java.sql.*;

import javax.swing.JOptionPane;

public class MysqlConnect {
	public static Connection conn;

	public static Connection ConnectDb() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String bag="jdbc:mysql://localhost:3306/flightmanagement?autoReconnect=true&useSSL=false";
			String kullanici="root";
			String sifre="asd123";
			 conn = DriverManager.getConnection(bag, kullanici, sifre);
			 System.out.println("connected");
			return conn;
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	public static void closeConnection(){
		try {
			conn.close();
			System.out.println("connection closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}