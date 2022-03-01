package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.product.pojo.Customer;
import com.product.pojo.CustomerMsg;
import com.product.utility.DBConnection;

public class CustomerMsgDaoImpl implements CustomerMsgDao{

	Connection con=DBConnection.getConnection();
	PreparedStatement ps=null;
	String sql;
	
    int  result;
	String msgdate;
	CustomerMsg cmsg;
	
    @Override
	public boolean addMessage(String name, String contact, String email, String message) {
    	
    	Date date=new Date();
    	msgdate=date.toString();
    	
    	try {
			sql="insert into customermsg(name,contact,email,message,msgdate)values(?,?,?,?,?)";
			
			ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, contact);
			ps.setString(3, email);
			ps.setString(4, message);
			ps.setString(5, msgdate);
			
			result=ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		if(result>0)
		{
			return true;
		}
		else{
			
			return false;
		}
		
	}
	

	@Override
	public List<CustomerMsg> showAllMessage() {
		
		List<CustomerMsg> lcustmsg=new ArrayList<>();
		try {
			sql="select * from customermsg";
			ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				cmsg=new CustomerMsg();
				cmsg.setId(rs.getInt(1));
				cmsg.setName(rs.getString(2));
				cmsg.setContact(rs.getString(3));
				cmsg.setEmail(rs.getString(4));
				cmsg.setMassage(rs.getString(5));
				cmsg.setMessagedate(rs.getString(6));
				
				lcustmsg.add(cmsg);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return lcustmsg;
	}

	@Override
	public CustomerMsg searchMessageByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerMsg searchMessageById(int id) {
		
		return null;
	}

	@Override
	public boolean deleteMessageByEmail(String email) {
		
		return false;
	}

	@Override
	public boolean deleteMessageById(int id) {
		sql="delete from customermsg where id=?";
		try {
			
			ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			result=ps.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result>0)
		{
			return true;
		}
		else{
		return false;
	}
	}
	

	@Override
	public List<CustomerMsg> showAllMessageByDate(String messagedate) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
