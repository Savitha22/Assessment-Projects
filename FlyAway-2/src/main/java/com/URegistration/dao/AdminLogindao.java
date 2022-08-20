package com.URegistration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLogindao {
	
	
	String url ="jdbc:mysql://localhost:3306/savitha";
	String username="root";
	String password="Savitha2@";
	String sql = "select * from AdminLogin where Name=? and Password=?";
	
	public boolean check(String user, String pass){
		boolean flag =false;
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			PreparedStatement st = con.prepareStatement(sql);
			
			
			st.setString(1, user);
			st.setString(2, pass);
			
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()){
				flag =true;
				return flag;
			}
			
		
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		return flag;
		
	
	
	
}

}
