package com.telnet.radius.model;

import java.io.Serializable;

public class Nas implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String nasname;
	private String shortname;
	private String type;
	private String ports;
	private String secret;
	private String community;
	private String description;
	private String starospassword;
	private String ciscobwmode;
	private String apiusername;
	private String apipassword;
	private String enableapi;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNasname() {
		return nasname;
	}

	public void setNasname(String nasname) {
		this.nasname = nasname;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPorts() {
		return ports;
	}

	public void setPorts(String ports) {
		this.ports = ports;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStarospassword() {
		return starospassword;
	}

	public void setStarospassword(String starospassword) {
		this.starospassword = starospassword;
	}

	public String getCiscobwmode() {
		return ciscobwmode;
	}

	public void setCiscobwmode(String ciscobwmode) {
		this.ciscobwmode = ciscobwmode;
	}

	public String getApiusername() {
		return apiusername;
	}

	public void setApiusername(String apiusername) {
		this.apiusername = apiusername;
	}

	public String getApipassword() {
		return apipassword;
	}

	public void setApipassword(String apipassword) {
		this.apipassword = apipassword;
	}

	public String getEnableapi() {
		return enableapi;
	}

	public void setEnableapi(String enableapi) {
		this.enableapi = enableapi;
	}

}
