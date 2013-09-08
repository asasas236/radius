package com.telnet.radius.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.telnet.radius.model.Nas;

public interface NasMapper {
	
	public void insert(Nas nas) throws DataAccessException;
	
	public List<Nas> queryAll() throws DataAccessException;
	
	public List<Nas> queryByNasName(Nas nas) throws DataAccessException;
}
