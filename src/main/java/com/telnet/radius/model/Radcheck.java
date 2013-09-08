package com.telnet.radius.model;

import java.io.Serializable;

public class Radcheck implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String username = "";
	private String attribute = "";
	private String op = ":=";
	private String value = "";
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
}
