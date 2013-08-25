package com.telnet.radius.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.telnet.radius.po.Nas;
import com.telnet.radius.service.INasService;

@Controller("nasController")
@RequestMapping("/nas")
public class NasController {
	
	@Autowired
	private INasService nasService;
	
	@RequestMapping("/insert")
	@ResponseBody
	public int insert(Nas nas){
		return nasService.insert(nas);
	}
	
	@RequestMapping("/queryAll")
	@ResponseBody
	public List<Nas> queryAll(){
		return nasService.queryAll();
	}
	
	@RequestMapping("/queryByNasName")
	@ResponseBody
	public List<Nas> queryByNasName(Nas nas){
		return nasService.queryByNasName(nas);
	}
}
