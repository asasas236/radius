package com.telnet.radius.service;

import java.util.List;

import com.telnet.radius.po.Nas;

public interface INasService {

	public int insert(Nas nas);
	
	public List<Nas> queryAll();

	public List<Nas> queryByNasName(Nas nas);
}
