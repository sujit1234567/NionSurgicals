package com.product.dao;

import java.util.List;

import com.product.pojo.CustomerMsg;

public interface CustomerMsgDao {

	boolean addMessage(String name,String contact,String email,String message);
	List<CustomerMsg> showAllMessage();
	CustomerMsg searchMessageByEmail(String email);
	CustomerMsg searchMessageById(int id);
	boolean deleteMessageByEmail(String email);
	boolean deleteMessageById(int id);
	List<CustomerMsg> showAllMessageByDate(String messagedate);
	
}
