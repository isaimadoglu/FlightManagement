package com.tav.store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.*;
import com.tav.guis.*;

public class AddDeleteFlight {
	public static void wannaAdd(){
		System.out.println("wannaAdd");
		String sql=AddingFlight.eklenecek;
		System.out.println(sql);
		try {
			Statement stat_a=MysqlConnect.conn.createStatement();
			System.out.println("adding statementsonrasi");
			stat_a.execute(sql);

			System.out.println("Eklendi");
			
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("exception at adding "+e.toString());
		}		
	}
	
	public static void wannaDelete(){
		System.out.println("wannaDelete");
		String sql=DeletingFlight.silinecek;
		System.out.println(sql);
		try {
			Statement stat_d=MysqlConnect.conn.createStatement();
			stat_d.execute(sql);
			
			System.out.println("Silindi");
		} catch (SQLException e) {
			System.out.println("exception at deleting "+e.toString());
		}
	}
}
