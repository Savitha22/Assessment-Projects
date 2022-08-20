package com.URegistration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ChangePasswordAdmindao {
	String url ="jdbc:mysql://localhost:3306/savitha";
	String username="root";
	String password="Savitha2@";
	String sql = "Update AdminLogin set PassWord=? Where Name=?;";
	
	public boolean check(String pass){
		boolean flag =false;
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			PreparedStatement st = con.prepareStatement(sql);
			
			
			st.setString(1,pass);
			st.setString(2,"Savitha");
			
			
			int rs = st.executeUpdate();
			
			if(rs == 1){
				flag =true;
				return flag;
			}
			
		
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		return flag;
		
		
		
		
		
	}
}
