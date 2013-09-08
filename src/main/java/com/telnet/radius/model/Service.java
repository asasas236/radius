package com.telnet.radius.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Service implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int srvid;
	private String srvname = "";
	private int downrate;
	private int uprate;
	private int limitdl;
	private int limitul;
	private int limitcomb;
	private int limitexpiration;
	private int limituptime;
	private String poolname = "";
	private double unitprice;
	private double unitpriceadd;
	private int timebaseexp;
	private int timebaseonline;
	private int timeunitexp;
	private int timeunitonline;
	private int trafficunitdl;
	private int trafficunitul;
	private int trafficunitcomb;
	private int inittimeexp;
	private int inittimeonline;
	private int initdl;
	private int initul;
	private int inittotal;
	private int srvtype;
	private int timeaddmodeexp;
	private int timeaddmodeonline;
	private int trafficaddmode;
	private int monthly;
	private int enaddcredits;
	private int minamount;
	private int minamountadd;
	private int resetcounters;
	private int pricecalcdownload;
	private int pricecalcupload;
	private int pricecalcuptime;
	private double unitpricetax;
	private double unitpriceaddtax;
	private int enableburst;
	private int dlburstlimit;
	private int ulburstlimit;
	private int dlburstthreshold;
	private int ulburstthreshold;
	private int dlbursttime;
	private int ulbursttime;
	private int enableservice;
	private long dlquota;
	private long ulquota;
	private long combquota;
	private long timequota;
	private int priority;
	private int nextsrvid;
	private int dailynextsrvid;
	private int availucp;
	private int renew;
	private String policymapdl = "";
	private String policymapul = "";
	private String custattr = "";
	
	private Integer[] nasidArray;
	private String[] managernameArray;
	
	private List<Nas> nases;
	private List<Manager> managers;
	
	private BigDecimal downrateKB;
	private BigDecimal uprateKB;
	
	private BigDecimal dlburstlimitKB;
	private BigDecimal ulburstlimitKB;
	private BigDecimal dlburstthresholdKB;
	private BigDecimal ulburstthresholdKB;

	public BigDecimal getDlburstlimitKB() {
		BigDecimal unit = BigDecimal.valueOf(1024);
		return BigDecimal.valueOf(this.dlburstlimit).divide(unit);
	}

	public void setDlburstlimitKB(BigDecimal dlburstlimitKB) {
		BigDecimal unit = BigDecimal.valueOf(1024);
		this.setDlburstlimit(dlburstlimitKB.multiply(unit).intValue());
		this.dlburstlimitKB = dlburstlimitKB;
	}

	public BigDecimal getUlburstlimitKB() {
		BigDecimal unit = BigDecimal.valueOf(1024);
		return BigDecimal.valueOf(this.ulburstlimit).divide(unit);
	}

	public void setUlburstlimitKB(BigDecimal ulburstlimitKB) {
		BigDecimal unit = BigDecimal.valueOf(1024);
		this.setUlburstlimit(ulburstlimitKB.multiply(unit).intValue());
		this.ulburstlimitKB = ulburstlimitKB;
	}

	public BigDecimal getDlburstthresholdKB() {
		BigDecimal unit = BigDecimal.valueOf(1024);
		return BigDecimal.valueOf(this.dlburstthreshold).divide(unit);
	}

	public void setDlburstthresholdKB(BigDecimal dlburstthresholdKB) {
		BigDecimal unit = BigDecimal.valueOf(1024);
		this.setDlburstthreshold(dlburstthresholdKB.multiply(unit).intValue());
		this.dlburstthresholdKB = dlburstthresholdKB;
	}

	public BigDecimal getUlburstthresholdKB() {
		BigDecimal unit = BigDecimal.valueOf(1024);
		return BigDecimal.valueOf(this.ulburstthreshold).divide(unit);
	}

	public void setUlburstthresholdKB(BigDecimal ulburstthresholdKB) {
		BigDecimal unit = BigDecimal.valueOf(1024);
		this.setUlburstthreshold(ulburstthresholdKB.multiply(unit).intValue());
		this.ulburstthresholdKB = ulburstthresholdKB;
	}

	public BigDecimal getDownrateKB() {
		BigDecimal unit = BigDecimal.valueOf(1024);
		return BigDecimal.valueOf(this.downrate).divide(unit);
	}

	public void setDownrateKB(BigDecimal downrateKB) {
		BigDecimal unit = BigDecimal.valueOf(1024);
		this.setDownrate(downrateKB.multiply(unit).intValue());
		this.downrateKB = downrateKB;
	}

	public BigDecimal getUprateKB() {
		BigDecimal unit = BigDecimal.valueOf(1024);
		return BigDecimal.valueOf(this.uprate).divide(unit);
	}

	public void setUprateKB(BigDecimal uprateKB) {
		BigDecimal unit = BigDecimal.valueOf(1024);
		this.setUprate(uprateKB.multiply(unit).intValue());
		this.uprateKB = uprateKB;
	}

	public Integer[] getNasidArray() {
		return nasidArray;
	}

	public void setNasidArray(Integer[] nasidArray) {
		this.nasidArray = nasidArray;
	}

	public String[] getManagernameArray() {
		return managernameArray;
	}

	public void setManagernameArray(String[] managernameArray) {
		this.managernameArray = managernameArray;
	}
	
	public List<Nas> getNases() {
		return nases;
	}

	public void setNases(List<Nas> nases) {
		this.nases = nases;
	}

	public List<Manager> getManagers() {
		return managers;
	}

	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	public int getSrvid() {
		return srvid;
	}

	public void setSrvid(int srvid) {
		this.srvid = srvid;
	}

	public String getSrvname() {
		return srvname;
	}

	public void setSrvname(String srvname) {
		this.srvname = srvname;
	}

	public int getDownrate() {
		return downrate;
	}

	public void setDownrate(int downrate) {
		this.downrate = downrate;
	}

	public int getUprate() {
		return uprate;
	}

	public void setUprate(int uprate) {
		this.uprate = uprate;
	}

	public int getLimitdl() {
		return limitdl;
	}

	public void setLimitdl(int limitdl) {
		this.limitdl = limitdl;
	}

	public int getLimitul() {
		return limitul;
	}

	public void setLimitul(int limitul) {
		this.limitul = limitul;
	}

	public int getLimitcomb() {
		return limitcomb;
	}

	public void setLimitcomb(int limitcomb) {
		this.limitcomb = limitcomb;
	}

	public int getLimitexpiration() {
		return limitexpiration;
	}

	public void setLimitexpiration(int limitexpiration) {
		this.limitexpiration = limitexpiration;
	}

	public int getLimituptime() {
		return limituptime;
	}

	public void setLimituptime(int limituptime) {
		this.limituptime = limituptime;
	}

	public String getPoolname() {
		return poolname;
	}

	public void setPoolname(String poolname) {
		this.poolname = poolname;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public double getUnitpriceadd() {
		return unitpriceadd;
	}

	public void setUnitpriceadd(double unitpriceadd) {
		this.unitpriceadd = unitpriceadd;
	}

	public int getTimebaseexp() {
		return timebaseexp;
	}

	public void setTimebaseexp(int timebaseexp) {
		this.timebaseexp = timebaseexp;
	}

	public int getTimebaseonline() {
		return timebaseonline;
	}

	public void setTimebaseonline(int timebaseonline) {
		this.timebaseonline = timebaseonline;
	}

	public int getTimeunitexp() {
		return timeunitexp;
	}

	public void setTimeunitexp(int timeunitexp) {
		this.timeunitexp = timeunitexp;
	}

	public int getTimeunitonline() {
		return timeunitonline;
	}

	public void setTimeunitonline(int timeunitonline) {
		this.timeunitonline = timeunitonline;
	}

	public int getTrafficunitdl() {
		return trafficunitdl;
	}

	public void setTrafficunitdl(int trafficunitdl) {
		this.trafficunitdl = trafficunitdl;
	}

	public int getTrafficunitul() {
		return trafficunitul;
	}

	public void setTrafficunitul(int trafficunitul) {
		this.trafficunitul = trafficunitul;
	}

	public int getTrafficunitcomb() {
		return trafficunitcomb;
	}

	public void setTrafficunitcomb(int trafficunitcomb) {
		this.trafficunitcomb = trafficunitcomb;
	}

	public int getInittimeexp() {
		return inittimeexp;
	}

	public void setInittimeexp(int inittimeexp) {
		this.inittimeexp = inittimeexp;
	}

	public int getInittimeonline() {
		return inittimeonline;
	}

	public void setInittimeonline(int inittimeonline) {
		this.inittimeonline = inittimeonline;
	}

	public int getInitdl() {
		return initdl;
	}

	public void setInitdl(int initdl) {
		this.initdl = initdl;
	}

	public int getInitul() {
		return initul;
	}

	public void setInitul(int initul) {
		this.initul = initul;
	}

	public int getInittotal() {
		return inittotal;
	}

	public void setInittotal(int inittotal) {
		this.inittotal = inittotal;
	}

	public int getSrvtype() {
		return srvtype;
	}

	public void setSrvtype(int srvtype) {
		this.srvtype = srvtype;
	}

	public int getTimeaddmodeexp() {
		return timeaddmodeexp;
	}

	public void setTimeaddmodeexp(int timeaddmodeexp) {
		this.timeaddmodeexp = timeaddmodeexp;
	}

	public int getTimeaddmodeonline() {
		return timeaddmodeonline;
	}

	public void setTimeaddmodeonline(int timeaddmodeonline) {
		this.timeaddmodeonline = timeaddmodeonline;
	}

	public int getTrafficaddmode() {
		return trafficaddmode;
	}

	public void setTrafficaddmode(int trafficaddmode) {
		this.trafficaddmode = trafficaddmode;
	}

	public int getMonthly() {
		return monthly;
	}

	public void setMonthly(int monthly) {
		this.monthly = monthly;
	}

	public int getEnaddcredits() {
		return enaddcredits;
	}

	public void setEnaddcredits(int enaddcredits) {
		this.enaddcredits = enaddcredits;
	}

	public int getMinamount() {
		return minamount;
	}

	public void setMinamount(int minamount) {
		this.minamount = minamount;
	}

	public int getMinamountadd() {
		return minamountadd;
	}

	public void setMinamountadd(int minamountadd) {
		this.minamountadd = minamountadd;
	}

	public int getResetcounters() {
		return resetcounters;
	}

	public void setResetcounters(int resetcounters) {
		this.resetcounters = resetcounters;
	}

	public int getPricecalcdownload() {
		return pricecalcdownload;
	}

	public void setPricecalcdownload(int pricecalcdownload) {
		this.pricecalcdownload = pricecalcdownload;
	}

	public int getPricecalcupload() {
		return pricecalcupload;
	}

	public void setPricecalcupload(int pricecalcupload) {
		this.pricecalcupload = pricecalcupload;
	}

	public int getPricecalcuptime() {
		return pricecalcuptime;
	}

	public void setPricecalcuptime(int pricecalcuptime) {
		this.pricecalcuptime = pricecalcuptime;
	}

	public double getUnitpricetax() {
		return unitpricetax;
	}

	public void setUnitpricetax(double unitpricetax) {
		this.unitpricetax = unitpricetax;
	}

	public double getUnitpriceaddtax() {
		return unitpriceaddtax;
	}

	public void setUnitpriceaddtax(double unitpriceaddtax) {
		this.unitpriceaddtax = unitpriceaddtax;
	}

	public int getEnableburst() {
		return enableburst;
	}

	public void setEnableburst(int enableburst) {
		this.enableburst = enableburst;
	}

	public int getDlburstlimit() {
		return dlburstlimit;
	}

	public void setDlburstlimit(int dlburstlimit) {
		this.dlburstlimit = dlburstlimit;
	}

	public int getUlburstlimit() {
		return ulburstlimit;
	}

	public void setUlburstlimit(int ulburstlimit) {
		this.ulburstlimit = ulburstlimit;
	}

	public int getDlburstthreshold() {
		return dlburstthreshold;
	}

	public void setDlburstthreshold(int dlburstthreshold) {
		this.dlburstthreshold = dlburstthreshold;
	}

	public int getUlburstthreshold() {
		return ulburstthreshold;
	}

	public void setUlburstthreshold(int ulburstthreshold) {
		this.ulburstthreshold = ulburstthreshold;
	}

	public int getDlbursttime() {
		return dlbursttime;
	}

	public void setDlbursttime(int dlbursttime) {
		this.dlbursttime = dlbursttime;
	}

	public int getUlbursttime() {
		return ulbursttime;
	}

	public void setUlbursttime(int ulbursttime) {
		this.ulbursttime = ulbursttime;
	}

	public int getEnableservice() {
		return enableservice;
	}

	public void setEnableservice(int enableservice) {
		this.enableservice = enableservice;
	}

	public long getDlquota() {
		return dlquota;
	}

	public void setDlquota(long dlquota) {
		this.dlquota = dlquota;
	}

	public long getUlquota() {
		return ulquota;
	}

	public void setUlquota(long ulquota) {
		this.ulquota = ulquota;
	}

	public long getCombquota() {
		return combquota;
	}

	public void setCombquota(long combquota) {
		this.combquota = combquota;
	}

	public long getTimequota() {
		return timequota;
	}

	public void setTimequota(long timequota) {
		this.timequota = timequota;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getNextsrvid() {
		return nextsrvid;
	}

	public void setNextsrvid(int nextsrvid) {
		this.nextsrvid = nextsrvid;
	}

	public int getDailynextsrvid() {
		return dailynextsrvid;
	}

	public void setDailynextsrvid(int dailynextsrvid) {
		this.dailynextsrvid = dailynextsrvid;
	}

	public int getAvailucp() {
		return availucp;
	}

	public void setAvailucp(int availucp) {
		this.availucp = availucp;
	}

	public int getRenew() {
		return renew;
	}

	public void setRenew(int renew) {
		this.renew = renew;
	}

	public String getPolicymapdl() {
		return policymapdl;
	}

	public void setPolicymapdl(String policymapdl) {
		this.policymapdl = policymapdl;
	}

	public String getPolicymapul() {
		return policymapul;
	}

	public void setPolicymapul(String policymapul) {
		this.policymapul = policymapul;
	}

	public String getCustattr() {
		return custattr;
	}

	public void setCustattr(String custattr) {
		this.custattr = custattr;
	}
}
