package com.telnet.radius.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.telnet.radius.po.Manager;
import com.telnet.radius.service.IManagerService;

@Controller
@RequestMapping("/user")
public class ManagerController {

	@Autowired
	private IManagerService managerService;

	private Log log = LogFactory
			.getLog(ManagerController.class.getSimpleName());

	@RequestMapping("/login")
	@ResponseBody
	public int login(Manager manager, HttpServletRequest request) {
		int result = managerService.checkAccount(manager);
		if (result == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("user", manager);
		}
		return result;
	}

	@RequestMapping("/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().invalidate();
		String url = "";
		try {
			response.sendRedirect(url);
		} catch (IOException e) {
			log.warn("logout is error", e);
			throw new RuntimeException("logout is error");
		}
	}

	@RequestMapping("/test")
	public void testMethod(HttpServletResponse response) throws IOException {
		System.out.println("hello world");
		response.getOutputStream().print("hello word!~~~");
	}
}
