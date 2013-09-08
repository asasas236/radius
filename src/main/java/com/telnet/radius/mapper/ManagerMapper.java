package com.telnet.radius.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.telnet.radius.model.Manager;

public interface ManagerMapper {

	public int checkAccount(Manager manager) throws DataAccessException;

	public Manager queryManager(String username, String password)
			throws DataAccessException;

	public List<Manager> queryManagerList() throws DataAccessException;

}
