package com.telnet.radius.model;

import java.io.Serializable;
import java.sql.Date;

public class Changesrv implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String username = "";
	private int newsrvid;
	private String newsrvname = "";
	private Date scheduledate = new Date(System.currentTimeMillis());
	private Date requestdate = new Date(System.currentTimeMillis());;
	private int status = 1;
	private String transid = "";
	private String requested = "";

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

	public int getNewsrvid() {
		return newsrvid;
	}

	public void setNewsrvid(int newsrvid) {
		this.newsrvid = newsrvid;
	}

	public String getNewsrvname() {
		return newsrvname;
	}

	public void setNewsrvname(String newsrvname) {
		this.newsrvname = newsrvname;
	}

	public Date getScheduledate() {
		return scheduledate;
	}

	public void setScheduledate(Date scheduledate) {
		this.scheduledate = scheduledate;
	}

	public Date getRequestdate() {
		return requestdate;
	}

	public void setRequestdate(Date requestdate) {
		this.requestdate = requestdate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTransid() {
		return transid;
	}

	public void setTransid(String transid) {
		this.transid = transid;
	}

	public String getRequested() {
		return requested;
	}

	public void setRequested(String requested) {
		this.requested = requested;
	}

}
