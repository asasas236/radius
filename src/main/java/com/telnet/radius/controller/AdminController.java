package com.telnet.radius.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.telnet.radius.model.Changesrv;
import com.telnet.radius.model.Manager;
import com.telnet.radius.model.Radcheck;
import com.telnet.radius.model.Service;
import com.telnet.radius.model.User;
import com.telnet.radius.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private AdminService adminService;
	
	@Autowired
	public AdminController(AdminService adminService){
		this.adminService = adminService;
	}
	
	@RequestMapping(value= {""})
	public String toAdmin() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doLogin(
			@RequestParam(value = "managername") String managername,
			@RequestParam(value = "password") String password,
			HttpServletRequest req) {
		Manager manager = adminService.queryManager(managername, password);
		String url = "";
		if (manager != null) {
			req.getSession().setAttribute("manager", manager);
			req.getSession().setAttribute("success", "管理员登入成功");
			url = "redirect:welcome";
		} else {
			req.getSession().setAttribute("error", "管理员账户或密码错误。");
			url = "redirect:/admin";
		}
		return url;
	}
	
	@RequestMapping("/welcome")
	public String toWelcome() {
		return "welcome";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest req) {
		req.getSession().invalidate();
		return "redirect:/admin";
	}
	
	@RequestMapping(value = "/user/list")
	public ModelAndView userList() {
		ModelAndView mv = new ModelAndView();
		List<User> users = adminService.queryUserList();
		mv.addObject("users", users);
		mv.setViewName("userlist");
		return mv;
	}
	
	
	
	@RequestMapping(value = "/user/create")
	public ModelAndView toCreateUser() {
		List<Service> services = adminService.queryServices();
		List<User> groups = adminService.findUserGroup();
		ModelAndView mv = new ModelAndView();
		mv.addObject("services", services);
		mv.addObject("groups", groups);
		mv.addObject("title", "Create A New User");
		mv.addObject("action", "create");
		mv.addObject("actionstr", "Create User");
		mv.setViewName("createuser");
		return mv;
	}
	
	@RequestMapping(value = "/user/create", method = RequestMethod.POST)
	public String createUser(User user, HttpServletRequest req) {
		
		Manager manager = (Manager)req.getSession().getAttribute("manager");
		user.setCreatedby(manager.getManagername());
		user.setOwner(manager.getManagername());
		
		Changesrv csrv = new Changesrv();
		csrv.setUsername(user.getUsername());
		csrv.setNewsrvid(user.getSrvid());
		String srvname = req.getParameter("srvname");
		csrv.setNewsrvname(srvname);
		csrv.setRequested(manager.getManagername());
		
		Radcheck rc = new Radcheck();
		rc.setUsername(user.getUsername());
		rc.setAttribute("Cleartext-Password");
		rc.setValue(user.getPassword());
		
		Radcheck rc1 = new Radcheck();
		rc1.setUsername(user.getUsername());
		rc1.setAttribute("Simultaneous-Use");
		rc1.setValue("1");
		
		adminService.createUser(user, csrv, rc, rc1);
		
		String href = "<a href='/radius/admin/user/edit/" + user.getUsername() + "'>" + user.getUsername() + "</a>";
		req.getSession().setAttribute("success", "创建用户成功，用户名： " + href);
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/user/edit/{username}")
	public ModelAndView toEditUser(@PathVariable(value = "username") String username) {
		List<Service> services = adminService.queryServices();
		List<User> groups = adminService.findUserGroup();
		User user = this.adminService.queryUserByName(username);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.addObject("services", services);
		mv.addObject("groups", groups);
		mv.addObject("title", "Update the User");
		mv.addObject("action", "/radius/admin/user/edit/" + username);
		mv.addObject("actionstr", "Update User");
		mv.setViewName("createuser");
		return mv;
	}
	
	@RequestMapping(value = "/user/edit/{username}", method = RequestMethod.POST)
	public String editUser(User user, HttpServletRequest req) {
		
		Manager manager = (Manager)req.getSession().getAttribute("manager");
		user.setCreatedby(manager.getManagername());
		user.setOwner(manager.getManagername());
		
		Changesrv csrv = new Changesrv();
		csrv.setUsername(user.getUsername());
		csrv.setNewsrvid(user.getSrvid());
		String srvname = req.getParameter("srvname");
		csrv.setNewsrvname(srvname);
		csrv.setRequested(manager.getManagername());
		
		Radcheck rc = new Radcheck();
		rc.setUsername(user.getUsername());
		rc.setAttribute("Cleartext-Password");
		rc.setValue(user.getPassword());
		
		adminService.updateUser(user, csrv, rc);
		
		String href = "<a href='/radius/admin/user/edit/" + user.getUsername() + "'>" + user.getUsername() + "</a>";
		req.getSession().setAttribute("success", "修改用户成功，用户名： " + href);
		
		return "redirect:/admin/user/list";
	}
	
	@RequestMapping(value = "/user/check")
	@ResponseBody
	public int checkUser(
			@RequestParam(value = "username") String username,
			HttpServletRequest req) {
		int count = adminService.checkAccountExist(username);
		
		return count;
	}
	
	@RequestMapping("/weblogin")
	public String webLogin() {
		return "weblogin";
	}
	

}
