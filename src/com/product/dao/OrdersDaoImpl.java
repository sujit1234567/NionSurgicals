package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.product.pojo.Cart;
import com.product.pojo.Orders;
import com.product.utility.DBConnection;



public class OrdersDaoImpl implements OrdersDao{

	Connection con=DBConnection.getConnection();
	PreparedStatement ps= null;
	ResultSet rs=null;
	String sql, orderdate;
	int result;
	double totalprice;
	Orders o;

	@Override
	public Orders placeOrder(String custemail) {
		
		try
		{
		  Date d=new Date();
		  orderdate=d.toString();
		  
		  sql="select sum(productprice*quantity) from product p inner join cart ca on p.productid= ca.productid where custemail=?";
		  ps=con.prepareStatement(sql);
		  ps.setString(1, custemail);
		  rs=ps.executeQuery();
		  
		  while(rs.next())
		  {
			  totalprice=rs.getDouble(1);
		  }
		
		  sql="insert into orders(totalprice, custemail,orderdate,orderstatus) values(?,?,?,?)";
		  ps=con.prepareStatement(sql);
		  ps.setDouble(1, totalprice);
		  ps.setString(2, custemail);
		 
		  ps.setString(3, orderdate);
		  ps.setString(4, "Processing.....");
		  
		  result=ps.executeUpdate();
		  
		// new CartDaoImpl().deleteFromCartByCustEmail(custemail);
		  
		  sql="select * from orders";
		  ps=con.prepareStatement(sql);
		  
		  rs=ps.executeQuery();
		  
		  while(rs.next())
		  {
			  o=new Orders();
			
			  o.setOrderid(rs.getInt(1));
			  o.setTotalprice(rs.getDouble(2));
			  
			  o.setCustemail(rs.getString(3));
			  o.setOrderstatus(rs.getString(4));
			  o.setOrderdate(rs.getString(5));
		  }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return o;
	}

	@Override
	public List<Orders> showAllOrders() {
		
     List<Orders> list = new ArrayList<Orders>();
		
		try {
			sql="select * from orders";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				
				o=new Orders();
				o.setOrderid(rs.getInt(1));
				o.setTotalprice(rs.getDouble(2));
				o.setCustemail(rs.getString(3));
				o.setOrderdate(rs.getString(4));
				o.setOrderstatus(rs.getString(5));
				
				list.add(o);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Orders> showMyOrders(String custemail) {
		
      List<Orders> list = new ArrayList<Orders>();
		
		try {
			sql="select * from orders where custemail=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, custemail);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				o=new Orders();
				o.setOrderid(rs.getInt(1));
				o.setTotalprice(rs.getDouble(2));
				o.setCustemail(rs.getString(3));
				o.setOrderdate(rs.getString(4));
				o.setOrderstatus(rs.getString(5));
				
				list.add(o);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	
}
	
	@Override
	public boolean deleteByOrderId(int orderid)
	{
		try 
		{
        sql="delete from orders where orderid=?";
		ps=con.prepareStatement(sql);
		ps.setInt(1, orderid);
		result=ps.executeUpdate();
		}
		catch (Exception e) 
		{	
			e.printStackTrace();
		}
       if(result>0)
       {
    	   return true;
       }
       else
       {
		return false;
	}
  }

	//override placeOrder() method with 2 parameters
	@Override
	public Orders placeOrder(String custemail, String productname,double totalprice) {
		
		try {
			Date d= new Date();
			orderdate= d.toString();
			
			if(totalprice>0) {
				sql="insert into orders(productname,totalprice, custemail, orderstatus, orderdate) values(?,?,?,?,?)";
				ps=con.prepareStatement(sql);
				ps.setString(1,productname );
				ps.setDouble(2, totalprice);
				ps.setString(3, custemail);
				ps.setString(4, "Processing.....");
				ps.setString(5, orderdate);
				
				result=ps.executeUpdate();
				
				if(result>0)
				{
					sql="select * from orders";
					ps=con.prepareStatement(sql);
					
					rs=ps.executeQuery();
					
					while(rs.next()) {
						o=new Orders();
						o.setOrderid(rs.getInt(1));
						o.setProductname(rs.getString(2));
						o.setTotalprice(rs.getDouble(3));
						o.setCustemail(rs.getString(4));
						o.setOrderstatus(rs.getString(5));
						o.setOrderdate(rs.getString(6));
					}
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return o;
	}	


public Orders placeOrder(String custemail, long productname, double totalprice2) {
	try {
		Date d= new Date();
		orderdate= d.toString();
		
		if(totalprice>0) {
			sql="insert into orders(productname,totalprice, custemail, orderstatus, orderdate) values(?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setLong(1,productname );
			ps.setDouble(2, totalprice);
			ps.setString(3, custemail);
			ps.setString(4, "Processing.....");
			ps.setString(5, orderdate);
			
			result=ps.executeUpdate();
			
			if(result>0)
			{
				sql="select * from orders";
				ps=con.prepareStatement(sql);
				
				rs=ps.executeQuery();
				
				while(rs.next()) {
					o=new Orders();
					o.setOrderid(rs.getInt(1));
					o.setProductname(rs.getString(2));
					o.setTotalprice(rs.getDouble(3));
					o.setCustemail(rs.getString(4));
					o.setOrderstatus(rs.getString(5));
					o.setOrderdate(rs.getString(6));
				}
			}
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return o;
}	
}	

	

