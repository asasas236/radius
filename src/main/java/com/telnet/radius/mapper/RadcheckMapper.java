package com.telnet.radius.mapper;

import org.springframework.dao.DataAccessException;

import com.telnet.radius.model.Radcheck;

public interface RadcheckMapper {
	
	public void insert(Radcheck rc) throws DataAccessException;
	
	public void update(Radcheck rc) throws DataAccessException;
}
