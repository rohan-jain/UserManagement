package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserRegistrationServlet
 */
@WebServlet("/UserRegistrationServlet")
public class UserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UserModel userModel = new UserModel();
		
		DBUtility db = new DBUtility();
		
		userModel.setName(request.getParameter("username"));
		userModel.setAddress(request.getParameter("useraddress"));
		userModel.setEmail(request.getParameter("useremail"));
		userModel.setPhoneNumber(request.getParameter("usernumber"));
		userModel.setPassword(request.getParameter("userpassword"));
		userModel.setOrganization(request.getParameter("userorganization"));
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		/*
		out.println(userModel.getName());
		out.println(userModel.getEmail());
		out.println(userModel.getAddress());
		out.println(userModel.getPhoneNumber());
		out.println(userModel.getOrganization());
		out.println(userModel.getPassword());
		out.println("con :"+db.getConnetcToDB());
		*/
		
		StoreUtility storeUtility = new StoreUtility();
		boolean isUserAdded = storeUtility.storeUser(userModel);
		
		if(isUserAdded == true) {
			out.println("User Registerd !!!!!");
		}else {
			
			out.println("Something went wrong !!");
		}
		
		
		

		
		

	}
	
	

}
