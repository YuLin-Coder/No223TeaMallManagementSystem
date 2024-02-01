package com.shop.po;


public class Message {
	private Integer messageid; 

	private String message;

	private String messagedate; 
	
	private Integer uid;
		
	// 关联用户
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
 
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getMessageid() {
		return messageid;
	}

	public void setMessageid(Integer messageid) {
		this.messageid = messageid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessagedate() {
		return messagedate;
	}

	public void setMessagedate(String messagedate) {
		this.messagedate = messagedate;
	}
 
}