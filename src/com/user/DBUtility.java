package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {

	public static final String URL = "jdbc:mysql://localhost:3306/usermanagement";
	public static final String USER = "dbadmin";
	public static final String PASSWORD = "randompass";
	public static Connection con;	
	
	
	public static Connection getConnetcToDB() {
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection(URL, USER, PASSWORD);
			return con;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
		
	}

	public static ResultSet getData(String query) {
		
		con = getConnetcToDB();
		try {
			Statement stmt = con.createStatement();
			ResultSet list = stmt.executeQuery(query);
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}  
}

