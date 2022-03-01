package com.product.dao;

public interface LoginDao {
boolean userLogin(String username,String password);
boolean adminLogin(String username,String password);
boolean userChangePassword(String emailid,String password);
boolean adminChangePassword(String username,String password);

}
