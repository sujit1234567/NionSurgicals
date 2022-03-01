package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.product.pojo.Product;
import com.product.utility.DBConnection;

public class ProductDaoImpl implements ProductDao {

	Connection con=DBConnection.getConnection();
	PreparedStatement ps=null;
	String sql;
    int  result;
	Product p ;
	
	
	
	@Override
	public boolean addProduct(Product p) {
		
		
		try {
			sql="insert into product(productname,productcategory,productimage,productdescription,productprice)values(?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, p.getProductname());
			
			ps.setString(2, p.getProductcategory());
			ps.setString(3, p.getProductimage());
			ps.setString(4,p.getProductdescription());
			ps.setDouble(5, p.getProductprice());
			
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
	public boolean updateProduct(Product p) {
		
		
		try {
			sql="update product set productname=?,productcategory=?,productimage=?,productdescription=?,productprice=? where productid=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, p.getProductname());
			
            ps.setString(2, p.getProductcategory());
            ps.setString(3,p.getProductimage());
            ps.setString(4, p.getProductdescription());
            ps.setDouble(5, p.getProductprice());
            ps.setInt(6, p.getProductid());
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
	public boolean deleteProduct(int productid) {
		
		try {
			sql="delete  from product where productid=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, productid);
			result=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public List<Product> showAllProduct() {
		List<Product> list=new ArrayList<>();
		try {
			sql="select * from product";
			ps=con.prepareStatement(sql);
			
			 ResultSet rs=ps.executeQuery();
			while(rs.next()){
				 p=new Product();
				
				p.setProductid(rs.getInt(1));
				p.setProductname(rs.getString(2));
				
				p.setProductcategory(rs.getString(3));
				p.setProductimage(rs.getString(4));
				p.setProductdescription(rs.getString(5));
				p.setProductprice(rs.getDouble(6));
				list.add(p);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Product searchproductById(int productid) {
		
		
		
		try {
			sql="select * from product where productid=?";
			ps=con.prepareStatement(sql);
		    ps.setInt(1, productid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				p=new Product();
				p.setProductid(rs.getInt(1));
				p.setProductname(rs.getString(2));
				p.setProductcategory(rs.getString(3));
				p.setProductimage(rs.getString(4));
				p.setProductdescription(rs.getString(5));
				p.setProductprice(rs.getDouble(6));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return p;
	}

	@Override
	public List<Product> searchproductByName(String productname) {
		
		  List<Product> plist=new ArrayList<>();
		
		try {
			sql="select * from product where productname=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, productname);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
			 
				p=new Product();
			    p.setProductid(rs.getInt(1));
				p.setProductname(rs.getString(2));
				
				p.setProductcategory(rs.getString(3));
				p.setProductimage(rs.getString(4));
				p.setProductdescription(rs.getString(5));
				p.setProductprice(rs.getDouble(6));
				plist.add(p);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return plist;
	}

	@Override
	public List<Product> searchproductByCategory(String productcategory) {
		
		 List<Product> plist=new ArrayList<>();
			
		
		try {
			sql="select * from product where productcategory=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, productcategory);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
			 
				p=new Product();
			    p.setProductid(rs.getInt(1));
				p.setProductname(rs.getString(2));
				
				p.setProductcategory(rs.getString(3));
				p.setProductimage(rs.getString(4));
				p.setProductdescription(rs.getString(5));
				p.setProductprice(rs.getDouble(6));
				plist.add(p);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return plist;
	}

}
