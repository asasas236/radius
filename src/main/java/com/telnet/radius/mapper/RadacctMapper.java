package com.telnet.radius.mapper;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.telnet.radius.model.Radacct;

public interface RadacctMapper {

	public List<Radacct> queryOnlineUser() throws DataAccessException; 
	
	public List<Radacct> queryAll() throws DataAccessException;
	
	public List<Radacct> queryAllParam(Radacct acct) throws DataAccessException;
	
	public List<Radacct> queryAllByYear(int year) throws DataAccessException;
	
	public List<Radacct> queryAllByYearUser(int year, String username) throws DataAccessException;
	
	public List<Radacct> queryAllByMonth(int year, int month) throws DataAccessException;
	
	public List<Radacct> queryAllByMonthUser(int year, int month, String username) throws DataAccessException;
	
	public List<Radacct> queryAllByDay(int year, int month, int day) throws DataAccessException;
	
	public List<Radacct> queryAllByDayUser(int year, int month, int day, String username) throws DataAccessException;
}
