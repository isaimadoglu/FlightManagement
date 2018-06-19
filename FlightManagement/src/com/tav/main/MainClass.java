package com.tav.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.tav.guis.*;
import com.tav.store.*;

public class MainClass {

	public static void main(String[] args) {
		//com.tav.store.MysqlConnect connect_db=new MysqlConnect();
		MysqlConnect.ConnectDb();
		Login.main(args);
	//	AddDeleteFlight.main(args);
	//	MysqlConnect.closeConnection();      System.out.println("connection closed");
	}

}
