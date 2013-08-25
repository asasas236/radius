package com.telnet.radius.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telnet.radius.mapper.NasMapper;
import com.telnet.radius.po.Nas;
import com.telnet.radius.service.INasService;

@Service("nasService")
public class NasServiceImpl implements INasService {
	
	@Autowired
	private NasMapper nasMapper;

	public int insert(Nas nas) {
		return nasMapper.insert(nas);
	}

	public List<Nas> queryAll() {
		return nasMapper.queryAll();
	}

	public List<Nas> queryByNasName(Nas nas) {
		return nasMapper.queryByNasName(nas);
	}

}
