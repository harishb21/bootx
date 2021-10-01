package com.citius.bootx.model;

public class Customer {

	private int id;
	private String name;
	private String email;
	public Customer() {
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId() + " : " + getName() + " : " + getEmail();
	}
}
