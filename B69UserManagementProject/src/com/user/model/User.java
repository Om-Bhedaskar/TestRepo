package com.user.model;

public class User {
	private int uid;
	private String uname;
	private String address;
	private String mobileno;
	private String addharcard;
	private String pancard;
	private String email;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddharcard() {
		return addharcard;
	}

	public void setAddharcard(String addharcard) {
		this.addharcard = addharcard;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", address=" + address + ", mobileno=" + mobileno
				+ ", addharcard=" + addharcard + ", pancard=" + pancard + ", email=" + email + "]";
	}
}
