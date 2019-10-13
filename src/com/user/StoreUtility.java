package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoreUtility {

	static Connection con = DBUtility.getConnetcToDB();
	
	public boolean storeUser(UserModel um) {
		

		String query = "insert into users values(default,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, um.getName());
			ps.setString(2, um.getAddress());
			ps.setString(3, um.getEmail());
			ps.setString(4, um.getPhoneNumber());
			ps.setString(5, um.getPassword());
			ps.setString(6, um.getOrganization());
			
			int rs=ps.executeUpdate();
			if(rs > 0)

			 {

			 return true;

			 }

			 else

			 {

			 return false;

			 }
		}catch(SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
}

	
	public static boolean validate(String name,String pass){  
		boolean status=false;  
		try{  
			con = DBUtility.getConnetcToDB();
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from users where name=? and password=?");  
		ps.setString(1,name);  
		ps.setString(2,pass);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		}  
}


