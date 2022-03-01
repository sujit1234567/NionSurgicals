package com.product.pojo;

public class FeedBack {

	
	private int feedbackid;
	private String custname,custemail,review,suggestion;
	public FeedBack(int feedbackid, String custname, String custemail, String review, String suggestion) {
		super();
		this.feedbackid = feedbackid;
		this.custname = custname;
		this.custemail = custemail;
		this.review = review;
		this.suggestion = suggestion;
	}
	
	public FeedBack(String custname, String custemail, String review, String suggestion) {
		super();
		this.custname = custname;
		this.custemail = custemail;
		this.review = review;
		this.suggestion = suggestion;
	}
	
	public int getFeedbackid() {
		return feedbackid;
	}
	public void setFeedbackid(int feedbackid) {
		this.feedbackid = feedbackid;
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
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	@Override
	public String toString() {
		return "FeedBack [feedbackid=" + feedbackid + ", custname=" + custname + ", custemail=" + custemail
				+ ", review=" + review + ", suggestion=" + suggestion + "]";
	}
	
	
	
	
	
	
}
