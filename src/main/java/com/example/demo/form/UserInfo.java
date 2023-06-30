package com.example.demo.form;


public class UserInfo {
	
	private static String name;
	private static String address;

	public void setName(String name) {
		UserInfo.name = name;
	}

	public void setAddress(String address) {
		UserInfo.address = address;
	}
	
	public String getName() {
		return UserInfo.name;
	}
	
	public String getAddress() {
		return UserInfo.address;
	}
	
}
