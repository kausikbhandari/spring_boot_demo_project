package com.kausik.service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class UserDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String address;
		
	public UserDetails() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
