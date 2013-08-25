package com.telnet.radius.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telnet.radius.mapper.ManagerMapper;
import com.telnet.radius.po.Manager;
import com.telnet.radius.service.IManagerService;

@Service("managerService")
public class ManagerServiceImpl implements IManagerService {
	
	@Autowired
	private ManagerMapper managerMapper;

	public int checkAccount(Manager manager) {
		return managerMapper.checkAccount(manager);
	}

}
