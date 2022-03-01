package com.product.pojo;


public class Orders {
	
	private int orderid;
	private String productname;
	private double totalprice;
	private String custemail, orderdate, orderstatus;
	
	public Orders() {
		super();
	}

	
	public Orders(double totalprice, String custemail, String orderdate, String orderstatus) {
		super();
		this.totalprice = totalprice;
		this.custemail = custemail;
		this.orderdate = orderdate;
		this.orderstatus = orderstatus;
	}

	public Orders(int orderid, double totalprice, String custemail, String orderdate, String orderstatus) {
		super();
		this.orderid = orderid;
		this.totalprice = totalprice;
		this.custemail = custemail;
		this.orderdate = orderdate;
		this.orderstatus = orderstatus;
	}


	
	
	public Orders(String productname, double totalprice, String custemail, String orderdate, String orderstatus) {
		super();
		this.productname = productname;
		this.totalprice = totalprice;
		this.custemail = custemail;
		this.orderdate = orderdate;
		this.orderstatus = orderstatus;
	}

	

	public Orders(int orderid, String productname, double totalprice, String custemail, String orderdate,
			String orderstatus) {
		super();
		this.orderid = orderid;
		this.productname = productname;
		this.totalprice = totalprice;
		this.custemail = custemail;
		this.orderdate = orderdate;
		this.orderstatus = orderstatus;
	}


	public int getOrderid() {
		return orderid;
	}


	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	
	public void setProductname(String productname)
	{
		this.productname=productname;
	}
	
	public String getProductname()
	{
		return productname;
	}

	public double getTotalprice() {
		return totalprice;
	}


	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}


	public String getCustemail() {
		return custemail;
	}


	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}


	public String getOrderdate() {
		return orderdate;
	}


	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}


	public String getOrderstatus() {
		return orderstatus;
	}


	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}


	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", productname=" + productname + ", totalprice=" + totalprice
				+ ", custemail=" + custemail + ", orderdate=" + orderdate + ", orderstatus=" + orderstatus + "]";
	}


	
}
