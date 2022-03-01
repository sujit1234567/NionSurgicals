package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.product.utility.DBConnection;

public class LoginDaoImpl implements LoginDao {

	Connection con=DBConnection.getConnection();
	PreparedStatement ps=null;
	ResultSet rs=null;
	boolean flag;
	int result;
	String sql;
	
	@Override
	public boolean userLogin(String username, String password) {
	
		try {
			sql="select * from customers where custemail=? and custpassword=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			
			rs=ps.executeQuery();
			
			if(rs.next())
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}	
	return flag;	
	}
	
	@Override
	public boolean adminLogin(String username, String password) {
	
		try {
			sql="select * from admin where adminname=? and adminpassword=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			
			rs=ps.executeQuery();
			
			if(rs.next())
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	return flag;	
	}

	@Override
	public boolean userChangePassword(String emailid, String password) {
		try {
			sql="update customers set custpassword=? where custemail=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, password);
			ps.setString(2, emailid);
			result=ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(result>0) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

	

	@Override
	public boolean adminChangePassword(String username, String password) {
		
		try {
			sql="update admin set adminpassword=? where adminname=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, password);
			ps.setString(2, username);
			result=ps.executeUpdate();
		} catch (SQLException e) {
				
			e.printStackTrace();
		}
		if(result>0) {
			return true;
		}
		else {
			return false;
			}
		}
	}

