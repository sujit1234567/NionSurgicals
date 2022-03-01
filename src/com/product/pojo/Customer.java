package com.product.pojo;

public class Customer {

	private int custid;
	private String custname,custemail,custpassword,custcontact,custaddress;
	public Customer() {
		super();
	}
	public Customer(String custname, String custemail, String custpassword, String custcontact, String custaddress) {
		super();
		this.custname = custname;
		this.custemail = custemail;
		this.custpassword = custpassword;
		this.custcontact = custcontact;
		this.custaddress = custaddress;
	}
	public Customer(int custid, String custname, String custemail, String custpassword, String custcontact,
			String custaddress) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custemail = custemail;
		this.custpassword = custpassword;
		this.custcontact = custcontact;
		this.custaddress = custaddress;
	}
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustemail() {
		return custemail;
	}
	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}
	public String getCustpassword() {
		return custpassword;
	}
	public void setCustpassword(String custpassword) {
		this.custpassword = custpassword;
	}
	public String getCustcontact() {
		return custcontact;
	}
	public void setCustcontact(String custcontact) {
		this.custcontact = custcontact;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", custemail=" + custemail + ", custpassword="
				+ custpassword + ", custcontact=" + custcontact + ", custaddress=" + custaddress + "]";
	}
	
	
}
