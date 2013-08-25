package com.telnet.radius.mapper;

import java.util.List;

import com.telnet.radius.po.Nas;

public interface NasMapper {
	
	int insert(Nas nas);
	
	List<Nas> queryAll();
	
	List<Nas> queryByNasName(Nas nas);
}
