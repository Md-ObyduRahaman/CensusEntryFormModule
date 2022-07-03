package com.dpdc.bd.model;

public class EMP_USER_MST {
	private String USER_NAME;
	private String USER_PASSWORD;
	public EMP_USER_MST() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EMP_USER_MST(String uSER_NAME, String uSER_PASSWORD) {
		super();
		USER_NAME = uSER_NAME;
		USER_PASSWORD = uSER_PASSWORD;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getUSER_PASSWORD() {
		return USER_PASSWORD;
	}
	public void setUSER_PASSWORD(String uSER_PASSWORD) {
		USER_PASSWORD = uSER_PASSWORD;
	}
	@Override
	public String toString() {
		return "EMP_USER_MST [USER_NAME=" + USER_NAME + ", USER_PASSWORD=" + USER_PASSWORD + "]";
	}
	
	
}
