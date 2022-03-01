package com.product.dao;


import java.util.List;

import com.product.pojo.Orders;

public interface OrdersDao {
	Orders placeOrder(String custemail);
	List<Orders> showAllOrders();
	List<Orders> showMyOrders(String custemail);
	boolean deleteByOrderId(int orderid);
	Orders placeOrder(String custemail,String productname ,double totalprice);
	
}
