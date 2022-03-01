package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.product.pojo.Customer;
import com.product.utility.DBConnection;

public class CustomerDaoImpl implements CustomerDao {

	Connection con=DBConnection.getConnection();
	PreparedStatement ps=null;
	String sql;
	Customer cust;
    int  result;
	@Override
	public boolean AddCustomer(Customer c) {
		
		try {
			sql="insert into customers(custname,custemail,custpassword,custcontact,custaddress) values(?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, c.getCustname());
			ps.setString(2, c.getCustemail());
			ps.setString(3, c.getCustpassword());
			ps.setString(4, c.getCustcontact());
			ps.setString(5, c.getCustaddress());
			
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
	public boolean UpdateCustomer(Customer c) {
		try {
			sql="update customers set custname=?,custcontact=?,custaddress=? where custemail=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, c.getCustname());
			/*ps.setString(2, c.getCustemail());
			ps.setString(3, c.getCustpassword());*/
			ps.setString(2, c.getCustcontact());
			ps.setString(3, c.getCustaddress());
			//ps.setInt(6, c.getCustid());
			ps.setString(4, c.getCustemail());
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
	public boolean deleteCustomer(int Customerid) {
		try {
			sql="delete from  customers  where custid=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, Customerid);
			
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
	public List<Customer> showAllCustomer() {
		List<Customer> list1=new ArrayList<>();
		sql="select * from customers";
		try {
			
		    
			ps=con.prepareStatement(sql);
		    ResultSet rs=ps.executeQuery();
              
		   while(rs.next())
		   {
			   cust=new Customer();
			   cust.setCustid(rs.getInt(1));
			   cust.setCustname(rs.getString(2));
			   cust.setCustemail(rs.getString(3));
			   cust.setCustpassword(rs.getString(4));
			   cust.setCustcontact(rs.getString(5));
			   cust.setCustaddress(rs.getString(6));
	     
			   
			   list1.add(cust);
			   
			  
	 }
		   
	  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
		
		return list1;		
	}

	@Override
	public Customer searchCustomerById(int Customerid) {
		sql="select * from customers where custid=?";
		try {
			
		    
			ps=con.prepareStatement(sql);
			ps.setInt(1, Customerid);
		    ResultSet rs=ps.executeQuery();
              
		   while(rs.next())
		   {
			   cust=new Customer();
			   cust.setCustid(rs.getInt(1));
			   cust.setCustname(rs.getString(2));
			   cust.setCustemail(rs.getString(3));
			   cust.setCustpassword(rs.getString(4));
			   cust.setCustcontact(rs.getString(5));
			   cust.setCustaddress(rs.getString(6));
	     
			   
			
			   
			  
	 }
		   
	  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
		
		return cust;
	}

	@Override
	public List<Customer> searchCustomerByName(String Customername) {
		List<Customer> list1=new ArrayList<>();
		sql="select * from customers where custname=?";
		try {
			
		    
			ps=con.prepareStatement(sql);
			ps.setString(1, Customername);
		    ResultSet rs=ps.executeQuery();
              
		   while(rs.next())
		   {
			   cust=new Customer();
			   cust.setCustid(rs.getInt(1));
			   cust.setCustname(rs.getString(2));
			   cust.setCustemail(rs.getString(3));
			   cust.setCustpassword(rs.getString(4));
			   cust.setCustcontact(rs.getString(5));
			   cust.setCustaddress(rs.getString(6));
	     
			   
			   list1.add(cust);
			   
			  
	 }
		   
	  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
		
		return list1;
	}

	@Override
	public Customer searchCustomerByEmail(String custmail) {
		sql="select * from customers where custemail=?";
		try {
			
		    
			ps=con.prepareStatement(sql);
			ps.setString(1, custmail);
		    ResultSet rs=ps.executeQuery();
              
		   while(rs.next())
		   {
			   cust=new Customer();
			   cust.setCustid(rs.getInt(1));
			   cust.setCustname(rs.getString(2));
			   cust.setCustemail(rs.getString(3));
			   cust.setCustpassword(rs.getString(4));
			   cust.setCustcontact(rs.getString(5));
			   cust.setCustaddress(rs.getString(6));
	     
			   
			
			   
			  
	 }
		   
	  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
		
		return cust;
	}

}
