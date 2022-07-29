package com.hibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Testjdbc {

	public static void main(String[] args) {
		
		String jdbcUrl ="jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSl=false";
		String user="hbstudent";
		String pass="hbstudent";
		try {
			
//			Class.forName("com.mysql.cj.jdbc.Driver");  //registering the driver 

			System.out.println("connection started successful!!!");
			Connection con = DriverManager.getConnection(jdbcUrl,user,pass);

			System.out.println("connection successful!!!");
			
		}
		catch(Exception e){
			e.printStackTrace();		}

	}

}
