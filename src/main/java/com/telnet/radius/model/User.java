package com.telnet.radius.model;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username = "";
	private String password = "";
	private int groupid;
	
	private String groupname;
	private String descr;

	private int enableuser = 1;
	private long uplimit = 0;
	private long downlimit = 0;
	private long comblimit = 0;
	private String firstname = "";
	private String lastname = "";
	private String company = "";
	private String phone = "";
	private String mobile = "";
	private String address = "";
	private String city = "";
	private String zip = "";
	private String country = "";
	private String state = "";
	private String comment = "";
	private String mac = "";
	private int usemacauth;
	private Date expiration = new Date(System.currentTimeMillis());
	private long uptimelimit = 0;
	private int srvid;
	private String staticip = "";
	private int usestaticip;
	private Date createdon = new Date(System.currentTimeMillis());
	private int acctype;
	private double credits;
	private int cardfails;
	private String createdby = "";
	private String owner = "";
	private String taxid = "";
	private String email = "";
	private String maccm = "";
	private String custattr = "";
	private int warningsent;
	private String verifycode = "";
	private int verified;
	private int selfreg;
	private int verifyfails;
	private int verifysentnum;
	private String verifymobile = "";
	
	private Service service;
	
	
	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getGroupid() {
		return groupid;
	}

	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}

	public int getEnableuser() {
		return enableuser;
	}

	public void setEnableuser(int enableuser) {
		this.enableuser = enableuser;
	}

	public long getUplimit() {
		return uplimit;
	}

	public void setUplimit(long uplimit) {
		this.uplimit = uplimit;
	}

	public long getDownlimit() {
		return downlimit;
	}

	public void setDownlimit(long downlimit) {
		this.downlimit = downlimit;
	}

	public long getComblimit() {
		return comblimit;
	}

	public void setComblimit(long comblimit) {
		this.comblimit = comblimit;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
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

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public int getUsemacauth() {
		return usemacauth;
	}

	public void setUsemacauth(int usemacauth) {
		this.usemacauth = usemacauth;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	public long getUptimelimit() {
		return uptimelimit;
	}

	public void setUptimelimit(long uptimelimit) {
		this.uptimelimit = uptimelimit;
	}

	public int getSrvid() {
		return srvid;
	}

	public void setSrvid(int srvid) {
		this.srvid = srvid;
	}

	public String getStaticip() {
		return staticip;
	}

	public void setStaticip(String staticip) {
		this.staticip = staticip;
	}

	public int getUsestaticip() {
		return usestaticip;
	}

	public void setUsestaticip(int usestaticip) {
		this.usestaticip = usestaticip;
	}

	public Date getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public int getAcctype() {
		return acctype;
	}

	public void setAcctype(int acctype) {
		this.acctype = acctype;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public int getCardfails() {
		return cardfails;
	}

	public void setCardfails(int cardfails) {
		this.cardfails = cardfails;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTaxid() {
		return taxid;
	}

	public void setTaxid(String taxid) {
		this.taxid = taxid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMaccm() {
		return maccm;
	}

	public void setMaccm(String maccm) {
		this.maccm = maccm;
	}

	public String getCustattr() {
		return custattr;
	}

	public void setCustattr(String custattr) {
		this.custattr = custattr;
	}

	public int getWarningsent() {
		return warningsent;
	}

	public void setWarningsent(int warningsent) {
		this.warningsent = warningsent;
	}

	public String getVerifycode() {
		return verifycode;
	}

	public void setVerifycode(String verifycode) {
		this.verifycode = verifycode;
	}

	public int getVerified() {
		return verified;
	}

	public void setVerified(int verified) {
		this.verified = verified;
	}

	public int getSelfreg() {
		return selfreg;
	}

	public void setSelfreg(int selfreg) {
		this.selfreg = selfreg;
	}

	public int getVerifyfails() {
		return verifyfails;
	}

	public void setVerifyfails(int verifyfails) {
		this.verifyfails = verifyfails;
	}

	public int getVerifysentnum() {
		return verifysentnum;
	}

	public void setVerifysentnum(int verifysentnum) {
		this.verifysentnum = verifysentnum;
	}

	public String getVerifymobile() {
		return verifymobile;
	}

	public void setVerifymobile(String verifymobile) {
		this.verifymobile = verifymobile;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
