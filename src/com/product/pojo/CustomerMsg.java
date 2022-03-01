package com.product.pojo;

public class CustomerMsg {

	private int id;
	private String name;
	private String contact;
	private String email;
	private String massage;
	private String messagedate;
	public CustomerMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerMsg(String name, String contact, String email, String massage, String messagedate) {
		super();
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.massage = massage;
		this.messagedate = messagedate;
	}
	public CustomerMsg(int id, String name, String contact, String email, String massage, String messagedate) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.massage = massage;
		this.messagedate = messagedate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	public String getMessagedate() {
		return messagedate;
	}
	public void setMessagedate(String messagedate) {
		this.messagedate = messagedate;
	}
	@Override
	public String toString() {
		return "CustomerMsg [id=" + id + ", name=" + name + ", contact=" + contact + ", email=" + email + ", massage="
				+ massage + ", messagedate=" + messagedate + "]";
	}
	
	
	
	
}
