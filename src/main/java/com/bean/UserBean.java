package com.bean;

public class UserBean {

	String userName, password;
	AddressBean addressBean;

	UserBean() {
		System.out.println("UserBean() instance Created");
	}

	UserBean(AddressBean address) {
		System.out.println("UserBean(address)");
		addressBean = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AddressBean getAddressBean() {
		return addressBean;
	}

	public void setAddressBean(AddressBean addressBean) {
		this.addressBean = addressBean;
	}

}
