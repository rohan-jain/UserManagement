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
	

	
	public static int delete(String id){  
	    int status=0;  
	    try{  
	    	con = DBUtility.getConnetcToDB(); 
	    	Statement stmt = (Statement)con.createStatement();
	    	String query ="delete from users where userid="+id+"";
	    	//PreparedStatement ps=con.prepareStatement("delete from register where id=?");  
	        status = stmt.executeUpdate(query);  
	          
	    }catch(Exception e){System.out.println(e);}  
	  
	    return status;  
	}
	
	public static ResultSet getDataByEmail(String email){  
	      
	    try{  
	    	con = DBUtility.getConnetcToDB(); 
	    	Statement stmt = con.createStatement();
	    	String query ="select * from users where email='"+email+"'";
	    	//PreparedStatement ps=con.prepareStatement("delete from register where id=?");  
	       ResultSet status = stmt.executeQuery(query);  
	         return status;
	    }catch(Exception e){System.out.println(e);}  
	  
	    return null;  
	}

}

