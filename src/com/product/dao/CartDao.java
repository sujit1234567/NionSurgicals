package com.product.dao;

import java.util.List;

import com.product.pojo.Cart;

public interface CartDao {
    
	boolean addToCart(Cart ca);
	
	boolean updateCart(Cart ca);
	boolean deleteFromCart( int cartid);
	boolean deleteFromCartByCustEmail(String custemail);
	List<Cart> showCart(String custemail);
	Cart searchFromCartById(int cartid);
	Cart searchFromCartByCustEmail(String custemail);
	
	
	
	
	
	
}