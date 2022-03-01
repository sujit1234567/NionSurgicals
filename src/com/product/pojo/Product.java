package com.product.pojo;

public class Product {

	private int productid;
	private String productname;
	private String productimage;
	private String productcategory;
	private String productdescription;
	private double productprice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productname, String productimage, String productcategory, String productdescription,
			double productprice) {
		super();
		this.productname = productname;
		this.productimage = productimage;
		this.productcategory = productcategory;
		this.productdescription = productdescription;
		this.productprice = productprice;
	}
	public Product(int productid, String productname, String productimage, String productcategory,
			String productdescription, double productprice) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productimage = productimage;
		this.productcategory = productcategory;
		this.productdescription = productdescription;
		this.productprice = productprice;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductimage() {
		return productimage;
	}
	public void setProductimage(String productimage) {
		this.productimage = productimage;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productimage=" + productimage
				+ ", productcategory=" + productcategory + ", productdescription=" + productdescription
				+ ", productprice=" + productprice + "]";
	}
	
	
	
	
}
