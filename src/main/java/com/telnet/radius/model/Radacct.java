package com.telnet.radius.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Radacct implements Serializable {

	private static final long serialVersionUID = 1L;

	private long radacctid;
	private String acctsessionid;
	private String acctuniqueid;
	private String username = "";
	private String groupname;
	private String realm;
	private String nasipaddress;
	private String nasportid;
	private String nasporttype;
	private Timestamp acctstarttime;
	private Timestamp acctstoptime;
	private int acctsessiontime;
	private String acctauthentic;
	private String connectinfo_start;
	private String connectinfo_stop;
	private long acctinputoctets;
	private long acctoutputoctets;
	private String calledstationid;
	private String callingstationid;
	private String acctterminatecause;
	private String servicetype;
	private String framedprotocol;
	private String framedipaddress;
	private int acctstartdelay;
	private int acctstopdelay;
	private String xascendsessionsvrkey;
	private Date _accttime;
	private int _srvid;
	private int _dailynextsrvactive;

	/**
	 * 额外属性，用于呈现数据
	 */
	private BigDecimal downloadKB;
	private BigDecimal uploadKB;
	private BigDecimal downloadMB;
	private BigDecimal uploadMB;
	private String reportDate = "";
	private String reportY = "";
	private String reportM = "";
	private String reportD = "";
	private String strM = "";
	private String strD = "";

	public String getStrM() {
		if (!"".equals(reportM)) {
			if (reportM.length() == 1)
				strM = "-0" + reportM;
			else if (reportM.length() == 2)
				strM = "-" + reportM;
		}
		return strM;
	}

	public void setStrM(String strM) {

		this.strM = strM;
	}

	public String getStrD() {
		if (!"".equals(reportD)) {
			if (reportD.length() == 1)
				strD = "-0" + reportD;
			else if (reportD.length() == 2)
				strD = "-" + reportD;
		}
		return strD;
	}

	public void setStrD(String strD) {

		this.strD = strD;
	}

	public String getReportY() {
		return reportY;
	}

	public void setReportY(String reportY) {
		this.reportY = reportY;
	}

	public String getReportM() {

		return reportM;
	}

	public void setReportM(String reportM) {
		this.reportM = reportM;
	}

	public String getReportD() {
		return reportD;
	}

	public void setReportD(String reportD) {
		this.reportD = reportD;
	}

	public String getReportDate() {
		reportDate = this.getReportY() + this.getStrM() + this.getStrD();
		return reportDate;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public BigDecimal getDownloadMB() {
		downloadMB = this.getMB(this.getAcctoutputoctets());

		return downloadMB;
	}

	public void setDownloadMB(BigDecimal downloadMB) {
		this.downloadMB = downloadMB;
	}

	public BigDecimal getUploadMB() {
		uploadMB = this.getMB(this.getAcctinputoctets());
		return uploadMB;
	}

	public void setUploadMB(BigDecimal uploadMB) {
		this.uploadMB = uploadMB;
	}

	private String onlineTime;

	public String getOnlineTime() {
		onlineTime = this.getTime(this.getAcctsessiontime());
		return onlineTime;
	}

	public void setOnlineTime(String onlineTime) {
		this.onlineTime = onlineTime;
	}

	public BigDecimal getDownloadKB() {
		downloadKB = this.getKB(this.getAcctoutputoctets());
		return downloadKB;
	}

	public BigDecimal getUploadKB() {
		uploadKB = this.getKB(this.getAcctinputoctets());
		return uploadKB;
	}

	public void setDownloadKB(BigDecimal downloadKB) {
		this.downloadKB = downloadKB;
	}

	public void setUploadKB(BigDecimal uploadKB) {
		this.uploadKB = uploadKB;
	}

	public long getRadacctid() {
		return radacctid;
	}

	public void setRadacctid(long radacctid) {
		this.radacctid = radacctid;
	}

	public String getAcctsessionid() {
		return acctsessionid;
	}

	public void setAcctsessionid(String acctsessionid) {
		this.acctsessionid = acctsessionid;
	}

	public String getAcctuniqueid() {
		return acctuniqueid;
	}

	public void setAcctuniqueid(String acctuniqueid) {
		this.acctuniqueid = acctuniqueid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getRealm() {
		return realm;
	}

	public void setRealm(String realm) {
		this.realm = realm;
	}

	public String getNasipaddress() {
		return nasipaddress;
	}

	public void setNasipaddress(String nasipaddress) {
		this.nasipaddress = nasipaddress;
	}

	public String getNasportid() {
		return nasportid;
	}

	public void setNasportid(String nasportid) {
		this.nasportid = nasportid;
	}

	public String getNasporttype() {
		return nasporttype;
	}

	public void setNasporttype(String nasporttype) {
		this.nasporttype = nasporttype;
	}

	public Timestamp getAcctstarttime() {
		return acctstarttime;
	}

	public void setAcctstarttime(Timestamp acctstarttime) {
		this.acctstarttime = acctstarttime;
	}

	public Timestamp getAcctstoptime() {
		return acctstoptime;
	}

	public void setAcctstoptime(Timestamp acctstoptime) {
		this.acctstoptime = acctstoptime;
	}

	public int getAcctsessiontime() {
		return acctsessiontime;
	}

	public void setAcctsessiontime(int acctsessiontime) {
		this.acctsessiontime = acctsessiontime;
	}

	public String getAcctauthentic() {
		return acctauthentic;
	}

	public void setAcctauthentic(String acctauthentic) {
		this.acctauthentic = acctauthentic;
	}

	public String getConnectinfo_start() {
		return connectinfo_start;
	}

	public void setConnectinfo_start(String connectinfo_start) {
		this.connectinfo_start = connectinfo_start;
	}

	public String getConnectinfo_stop() {
		return connectinfo_stop;
	}

	public void setConnectinfo_stop(String connectinfo_stop) {
		this.connectinfo_stop = connectinfo_stop;
	}

	public long getAcctinputoctets() {
		return acctinputoctets;
	}

	public void setAcctinputoctets(long acctinputoctets) {
		this.acctinputoctets = acctinputoctets;
	}

	public long getAcctoutputoctets() {
		return acctoutputoctets;
	}

	public void setAcctoutputoctets(long acctoutputoctets) {
		this.acctoutputoctets = acctoutputoctets;
	}

	public String getCalledstationid() {
		return calledstationid;
	}

	public void setCalledstationid(String calledstationid) {
		this.calledstationid = calledstationid;
	}

	public String getCallingstationid() {
		return callingstationid;
	}

	public void setCallingstationid(String callingstationid) {
		this.callingstationid = callingstationid;
	}

	public String getAcctterminatecause() {
		return acctterminatecause;
	}

	public void setAcctterminatecause(String acctterminatecause) {
		this.acctterminatecause = acctterminatecause;
	}

	public String getServicetype() {
		return servicetype;
	}

	public void setServicetype(String servicetype) {
		this.servicetype = servicetype;
	}

	public String getFramedprotocol() {
		return framedprotocol;
	}

	public void setFramedprotocol(String framedprotocol) {
		this.framedprotocol = framedprotocol;
	}

	public String getFramedipaddress() {
		return framedipaddress;
	}

	public void setFramedipaddress(String framedipaddress) {
		this.framedipaddress = framedipaddress;
	}

	public int getAcctstartdelay() {
		return acctstartdelay;
	}

	public void setAcctstartdelay(int acctstartdelay) {
		this.acctstartdelay = acctstartdelay;
	}

	public int getAcctstopdelay() {
		return acctstopdelay;
	}

	public void setAcctstopdelay(int acctstopdelay) {
		this.acctstopdelay = acctstopdelay;
	}

	public String getXascendsessionsvrkey() {
		return xascendsessionsvrkey;
	}

	public void setXascendsessionsvrkey(String xascendsessionsvrkey) {
		this.xascendsessionsvrkey = xascendsessionsvrkey;
	}

	public Date get_accttime() {
		return _accttime;
	}

	public void set_accttime(Date _accttime) {
		this._accttime = _accttime;
	}

	public int get_srvid() {
		return _srvid;
	}

	public void set_srvid(int _srvid) {
		this._srvid = _srvid;
	}

	public int get_dailynextsrvactive() {
		return _dailynextsrvactive;
	}

	public void set_dailynextsrvactive(int _dailynextsrvactive) {
		this._dailynextsrvactive = _dailynextsrvactive;
	}

	public static void main(String[] args) {

		//Radacct acct = new Radacct();
		// System.out.println(acct.getKB(0));
		// System.out.println(acct.getMB(601456));
		//
		// System.out.println(acct.getTime(172799));
		// SimpleDateFormat s = new SimpleDateFormat("YYYY-MM");
		// new Date("2013-7");
		// String dateStr = s.format("2013-7");
		// System.out.println(dateStr);

		// System.out.println(acct.getTime(7998));
	}

	public BigDecimal getKB(long b) {
		BigDecimal unit = BigDecimal.valueOf(1024);
		BigDecimal kb = BigDecimal.valueOf(b).divide(unit);
		return kb.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public BigDecimal getMB(long b) {
		BigDecimal unit = BigDecimal.valueOf(1024 * 1024);
		BigDecimal mb = BigDecimal.valueOf(b).divide(unit);
		return mb.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public String getTime(int sec) {
		int hh = sec / 3600;
		SimpleDateFormat s = new SimpleDateFormat("mm:ss");
		String dateStr = s.format(sec % 3600 * 1000);
		return String.valueOf(hh) + ":" + dateStr;
	}
}
