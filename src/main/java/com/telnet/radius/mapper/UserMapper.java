package com.telnet.radius.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.telnet.radius.model.User;

public interface UserMapper {

	public void insert(User user) throws DataAccessException;

	public void updateUser(User user) throws DataAccessException;

	public void deleteUser(int id) throws DataAccessException;

	public int checkAccountExist(String username) throws DataAccessException;

	public List<User> queryUserList() throws DataAccessException;

	public User queryUser(int id) throws DataAccessException;

	public User queryUserByName(String username) throws DataAccessException;

	public User queryUser(User user) throws DataAccessException;

	public List<User> queryUserGroup() throws DataAccessException;

}
