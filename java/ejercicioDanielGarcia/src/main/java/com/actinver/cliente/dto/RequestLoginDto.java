package com.actinver.cliente.dto;

public class RequestLoginDto {

	private String user;
	private String password;
	
	public RequestLoginDto() {}
	
	public RequestLoginDto(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
