package com.gapshap.models;


public class User {
	
	private int id;
	private String name;
	private String email;
	private String address;
	private String eduction;
	private String DOB;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String email, String address, String eduction) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.eduction = eduction;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEduction() {
		return eduction;
	}

	public void setEduction(String eduction) {
		this.eduction = eduction;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", eduction="
				+ eduction + "]";
	}
	
	
	
	

}
