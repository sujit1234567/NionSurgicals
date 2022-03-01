package com.product.dao;

import java.util.List;

import com.product.pojo.Product;

public interface ProductDao {

   boolean addProduct(Product p);
   boolean updateProduct(Product p);
   boolean deleteProduct(int productid);
   List<Product> showAllProduct();
   Product searchproductById(int productid);
   List<Product> searchproductByName(String productname);
   List<Product> searchproductByCategory(String productcategory);	
}
