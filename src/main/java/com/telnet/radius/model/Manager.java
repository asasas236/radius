package com.telnet.radius.model;

import java.io.Serializable;

public class Manager implements Serializable {

	private static final long serialVersionUID = 1L;

	private String managername;
	private String password;
	private String firstname;
	private String lastname;
	private String phone;
	private String mobile;
	private String address;
	private String city;
	private String zip;
	private String country;
	private String state;
	private String comment;
	private String company;
	private String vatid;
	private String email;
	private String balance;
	private String perm_listusers;
	private String perm_createusers;
	private String perm_editusers;
	private String perm_edituserspriv;
	private String perm_deleteusers;
	private String perm_listmanagers;
	private String perm_createmanagers;
	private String perm_editmanagers;
	private String perm_deletemanagers;
	private String perm_listservices;
	private String perm_createservices;
	private String perm_editservices;
	private String perm_deleteservices;
	private String perm_listonlineusers;
	private String perm_listinvoices;
	private String perm_trafficreport;
	private String perm_addcredits;
	private String perm_negbalance;
	private String perm_listallinvoices;
	private String perm_logout;
	private String perm_cardsys;
	private String perm_editinvoice;
	private String perm_allusers;
	private String perm_allowdiscount;
	private String enablemanager;

	public String getManagername() {
		return managername;
	}

	public void setManagername(String managername) {
		this.managername = managername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getVatid() {
		return vatid;
	}

	public void setVatid(String vatid) {
		this.vatid = vatid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getPerm_listusers() {
		return perm_listusers;
	}

	public void setPerm_listusers(String perm_listusers) {
		this.perm_listusers = perm_listusers;
	}

	public String getPerm_createusers() {
		return perm_createusers;
	}

	public void setPerm_createusers(String perm_createusers) {
		this.perm_createusers = perm_createusers;
	}

	public String getPerm_editusers() {
		return perm_editusers;
	}

	public void setPerm_editusers(String perm_editusers) {
		this.perm_editusers = perm_editusers;
	}

	public String getPerm_edituserspriv() {
		return perm_edituserspriv;
	}

	public void setPerm_edituserspriv(String perm_edituserspriv) {
		this.perm_edituserspriv = perm_edituserspriv;
	}

	public String getPerm_deleteusers() {
		return perm_deleteusers;
	}

	public void setPerm_deleteusers(String perm_deleteusers) {
		this.perm_deleteusers = perm_deleteusers;
	}

	public String getPerm_listmanagers() {
		return perm_listmanagers;
	}

	public void setPerm_listmanagers(String perm_listmanagers) {
		this.perm_listmanagers = perm_listmanagers;
	}

	public String getPerm_createmanagers() {
		return perm_createmanagers;
	}

	public void setPerm_createmanagers(String perm_createmanagers) {
		this.perm_createmanagers = perm_createmanagers;
	}

	public String getPerm_editmanagers() {
		return perm_editmanagers;
	}

	public void setPerm_editmanagers(String perm_editmanagers) {
		this.perm_editmanagers = perm_editmanagers;
	}

	public String getPerm_deletemanagers() {
		return perm_deletemanagers;
	}

	public void setPerm_deletemanagers(String perm_deletemanagers) {
		this.perm_deletemanagers = perm_deletemanagers;
	}

	public String getPerm_listservices() {
		return perm_listservices;
	}

	public void setPerm_listservices(String perm_listservices) {
		this.perm_listservices = perm_listservices;
	}

	public String getPerm_createservices() {
		return perm_createservices;
	}

	public void setPerm_createservices(String perm_createservices) {
		this.perm_createservices = perm_createservices;
	}

	public String getPerm_editservices() {
		return perm_editservices;
	}

	public void setPerm_editservices(String perm_editservices) {
		this.perm_editservices = perm_editservices;
	}

	public String getPerm_deleteservices() {
		return perm_deleteservices;
	}

	public void setPerm_deleteservices(String perm_deleteservices) {
		this.perm_deleteservices = perm_deleteservices;
	}

	public String getPerm_listonlineusers() {
		return perm_listonlineusers;
	}

	public void setPerm_listonlineusers(String perm_listonlineusers) {
		this.perm_listonlineusers = perm_listonlineusers;
	}

	public String getPerm_listinvoices() {
		return perm_listinvoices;
	}

	public void setPerm_listinvoices(String perm_listinvoices) {
		this.perm_listinvoices = perm_listinvoices;
	}

	public String getPerm_trafficreport() {
		return perm_trafficreport;
	}

	public void setPerm_trafficreport(String perm_trafficreport) {
		this.perm_trafficreport = perm_trafficreport;
	}

	public String getPerm_addcredits() {
		return perm_addcredits;
	}

	public void setPerm_addcredits(String perm_addcredits) {
		this.perm_addcredits = perm_addcredits;
	}

	public String getPerm_negbalance() {
		return perm_negbalance;
	}

	public void setPerm_negbalance(String perm_negbalance) {
		this.perm_negbalance = perm_negbalance;
	}

	public String getPerm_listallinvoices() {
		return perm_listallinvoices;
	}

	public void setPerm_listallinvoices(String perm_listallinvoices) {
		this.perm_listallinvoices = perm_listallinvoices;
	}

	public String getPerm_logout() {
		return perm_logout;
	}

	public void setPerm_logout(String perm_logout) {
		this.perm_logout = perm_logout;
	}

	public String getPerm_cardsys() {
		return perm_cardsys;
	}

	public void setPerm_cardsys(String perm_cardsys) {
		this.perm_cardsys = perm_cardsys;
	}

	public String getPerm_editinvoice() {
		return perm_editinvoice;
	}

	public void setPerm_editinvoice(String perm_editinvoice) {
		this.perm_editinvoice = perm_editinvoice;
	}

	public String getPerm_allusers() {
		return perm_allusers;
	}

	public void setPerm_allusers(String perm_allusers) {
		this.perm_allusers = perm_allusers;
	}

	public String getPerm_allowdiscount() {
		return perm_allowdiscount;
	}

	public void setPerm_allowdiscount(String perm_allowdiscount) {
		this.perm_allowdiscount = perm_allowdiscount;
	}

	public String getEnablemanager() {
		return enablemanager;
	}

	public void setEnablemanager(String enablemanager) {
		this.enablemanager = enablemanager;
	}

}
