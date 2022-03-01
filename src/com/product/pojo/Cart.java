package com.product.pojo;

import java.sql.Blob;

public class Cart {

	private int cartid,productid,quantity;
	private String productname,productcategory,custemail;
	String productimage;
	
	private double productprice;
	public Cart() {
		super();
	}
	public Cart(int productid, int quantity, String custemail) {
		super();
		this.productid = productid;
		this.quantity = quantity;
		this.custemail = custemail;
	}
	public Cart(int cartid, int productid, int quantity, String custemail) {
		super();
		this.cartid = cartid;
		this.productid = productid;
		this.quantity = quantity;
		this.custemail = custemail;
	}
	public Cart(int productid, int quantity, String productname, String productcategory, String custemail,
			double productprice) {
		super();
		this.productid = productid;
		this.quantity = quantity;
		this.productname = productname;
		this.productcategory = productcategory;
		this.custemail = custemail;
		this.productprice = productprice;
	}
	public Cart(int cartid, int productid, int quantity, String productname, String productcategory, String custemail,
			double productprice) {
		super();
		this.cartid = cartid;
		this.productid = productid;
		this.quantity = quantity;
		this.productname = productname;
		this.productcategory = productcategory;
		this.custemail = custemail;
		this.productprice = productprice;
	}
	
	
	
	
	public Cart(int productid, int quantity, String productname, String productcategory, String productimage,
			String custemail, double productprice) {
		super();
		this.productid = productid;
		this.quantity = quantity;
		this.productname = productname;
		this.productcategory = productcategory;
		this.productimage = productimage;
		this.custemail = custemail;
		this.productprice = productprice;
	}
	
	
	
	public Cart(int cartid, int productid, int quantity, String productname, String productcategory,
			String productimage, String custemail, double productprice) {
		super();
		this.cartid = cartid;
		this.productid = productid;
		this.quantity = quantity;
		this.productname = productname;
		this.productcategory = productcategory;
		this.productimage = productimage;
		this.custemail = custemail;
		this.productprice = productprice;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	
	public void setProductimage(String string)
	{
		this.productimage=string;
	}
	
	public String getProductimage()
	{
		return productimage;
	}
	
	public String getCustemail() {
		return custemail;
	}
	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", productid=" + productid + ", quantity=" + quantity + ", productname="
				+ productname + ", productcategory=" + productcategory + ", productimage=" + productimage
				+ ", custemail=" + custemail + ", productprice=" + productprice + "]";
	}
	
	
	
	
	
}
