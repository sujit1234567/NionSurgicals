package com.product.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.product.pojo.Cart;
import com.product.utility.DBConnection;

public class CartDaoImpl implements CartDao {
Connection con=DBConnection.getConnection();
PreparedStatement ps=null;
ResultSet rs=null;
Cart ca;
int result;
String sql;


	@Override
	public boolean addToCart(Cart ca) {
               
		sql="insert into cart(productid,custemail,quantity) values(?,?,?)";
		try{
            	 
            	   
            	   ps=con.prepareStatement(sql);
            	   ps.setInt(1, ca.getProductid());
            	  
                   ps.setString(2, ca.getCustemail());
                   ps.setInt(3, ca.getQuantity());
            	 
            	  result=ps.executeUpdate();
            	 
            	 
            	 
            	 
            	   
               }	catch(Exception e)
               {
            	   
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
	public boolean updateCart(Cart ca) {
		 
		sql="update cart set productid=?,custemail=?,quantity=? where cartid=?";
		
		try{
        	 ps=con.prepareStatement(sql);
        	  
              ps.setInt(1,ca.getProductid());
              
              ps.setString(2, ca.getCustemail());
              ps.setInt(3, ca.getQuantity());
              ps.setInt(4, ca.getCartid());
                      
              result=ps.executeUpdate();
        	   
           }	catch(Exception e)
           {
        	   
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
	public boolean deleteFromCart(int cartid) {
		sql="delete from cart where cartid=?"; 
		try{
        	 ps=con.prepareStatement(sql);
        	 ps.setInt(1, cartid);
        	 result=ps.executeUpdate();
        	 
        	 
        	   
           }	catch(Exception e)
           {
        	   
        	   e.printStackTrace();
           }
		if(result>0)
		{
			return true;
		}
		else{
		return false;
	}}

	@Override
	public boolean deleteFromCartByCustEmail(String custemail) {
		try
		{
			sql="delete from cart where custemail=?";
			ps=con.prepareStatement(sql);	
			ps.setString(1,custemail);
			
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

	@Override
	public List<Cart> showCart(String custemail) {
List<Cart> list = new ArrayList<Cart>();
		
		try {
			sql="select c.cartid, p.productid, p.productname, p.productcategory,p.productimage,c.custemail, p.productprice, c.quantity from cart c inner join product p on c.productid=p.productid where custemail=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, custemail);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				ca= new Cart();
				ca.setCartid(rs.getInt(1));
				ca.setProductid(rs.getInt(2));
				ca.setProductname(rs.getString(3));
				ca.setProductcategory(rs.getString(4));
			    ca.setProductimage(rs.getString(5));
				ca.setCustemail(rs.getString(6));
				ca.setProductprice(rs.getDouble(7));
				ca.setQuantity(rs.getInt(8));
				
				
				list.add(ca);
			     
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Cart searchFromCartById(int cartid) {
		
		sql="select cartid,p.productid,p.productname,p.productprice,p.productcategory,c.custemail,c.quantity from product p  inner join cart c on p.productid=c.productid where cartid=?";
		try{
        	 ps=con.prepareStatement(sql);
        	   ps.setInt(1, cartid);
        	   rs=ps.executeQuery();
        	   
        	   while(rs.next())
       		{
       			ca=new Cart();
       			
       			 
       		}
           }	
		catch(Exception e)
           {
        	   
        	   e.printStackTrace();
           }
		
	
		        return ca;	
	}
	
	@Override
	public Cart searchFromCartByCustEmail(String custemail) {
		try 
		{
			sql="select cartid, p.productid, p.productname, p.productcategory, c.custemail, p.productprice, c.quantity from cart c inner join product p on c.productid=p.productid where custemail=?" ;
			ps=con.prepareStatement(sql);
			ps.setString(1,custemail);
			
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				ca= new Cart();
				
			}
		}
		catch (Exception e) 
		{	
			e.printStackTrace();
		}
		return ca;
	}

	
	
	
	
}
