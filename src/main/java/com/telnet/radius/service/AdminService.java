package com.telnet.radius.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.telnet.radius.mapper.ManagerMapper;
import com.telnet.radius.mapper.RadcheckMapper;
import com.telnet.radius.mapper.ServiceMapper;
import com.telnet.radius.mapper.UserMapper;
import com.telnet.radius.model.Changesrv;
import com.telnet.radius.model.Manager;
import com.telnet.radius.model.Radcheck;

import com.telnet.radius.model.User;

@Service
public class AdminService {

	private ManagerMapper managerMapper;
	private UserMapper userMappper;
	private ServiceMapper serviceMapper;
	private RadcheckMapper radcheckMapper;

	public AdminService() {

	}

	@Autowired
	public AdminService(ManagerMapper managerMapper, UserMapper userMappper,
			ServiceMapper serviceMapper, RadcheckMapper radcheckMapper) {
		this.managerMapper = managerMapper;
		this.userMappper = userMappper;
		this.serviceMapper = serviceMapper;
		this.radcheckMapper = radcheckMapper;
	}

	@Transactional(readOnly = true)
	public List<User> queryUserList() throws DataAccessException {
		return userMappper.queryUserList();
	}

	@Transactional(readOnly = true)
	public User queryUserByName(String username) throws DataAccessException {
		return this.userMappper.queryUserByName(username);
	}

	@Transactional
	public void updateUser(User user, Changesrv csrv, Radcheck rc)
			throws DataAccessException {
		
		this.userMappper.updateUser(user);
		Changesrv csrvData = this.serviceMapper.queryIsExistChangesrv(user.getUsername());
		if (csrvData != null && csrvData.getNewsrvid() != user.getSrvid()) {
			this.serviceMapper.insertChangesrv(csrv);
		}
		this.radcheckMapper.update(rc);
			

	}

	@Transactional
	public void deleteUser(int id) throws DataAccessException {
	}

	@Transactional(readOnly = true)
	public int checkAccountExist(String username) throws DataAccessException {
		return this.userMappper.checkAccountExist(username);
	}

	@Transactional(readOnly = true)
	public Manager queryManager(String username, String password)
			throws DataAccessException {
		return managerMapper.queryManager(username, password);
	}

	@Transactional(readOnly = true)
	public List<com.telnet.radius.model.Service> queryServices()
			throws DataAccessException {
		return serviceMapper.queryServices();
	}

	@Transactional
	public void createUser(User user, Changesrv csrv, Radcheck rc, Radcheck rc1)
			throws DataAccessException {
		this.userMappper.insert(user);
		this.serviceMapper.insertChangesrv(csrv);
		this.radcheckMapper.insert(rc);
		this.radcheckMapper.insert(rc1);
	}

	@Transactional(readOnly = true)
	public List<User> findUserGroup() throws DataAccessException {
		return this.userMappper.queryUserGroup();
	}

}
