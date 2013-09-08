package com.telnet.radius.controller;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telnet.radius.mapper.RadacctMapper;
import com.telnet.radius.model.Radacct;

@Controller
@RequestMapping("/admin/report")
public class ReportController {

	@Autowired
	private RadacctMapper radacctMapper;

	@RequestMapping(value = "/onlineuser")
	public ModelAndView onlineUser() {
		System.out.println("onlineUser()");
		List<Radacct> accts = radacctMapper.queryOnlineUser();
		ModelAndView mv = new ModelAndView();
		mv.addObject("accts", accts);
		mv.setViewName("onlineuser");
		return mv;
	}

	@RequestMapping(value = "/trafficreport")
	public ModelAndView trafficReprot(HttpServletRequest req) {
		System.out.println("trafficReprot()");
		List<Radacct> accts = radacctMapper.queryAll();
		ModelAndView mv = new ModelAndView();
		req.setAttribute("reportDate", "Records");
		mv.addObject("report", accts);
		mv.setViewName("trafficreport");
		return mv;
	}

	@RequestMapping(value = "/trafficreport", method = RequestMethod.POST)
	public ModelAndView trafficReprot(Radacct acct, HttpServletRequest req) {
		System.out.println("trafficReprot()");
		List<Radacct> accts = radacctMapper.queryAllParam(acct);
		ModelAndView mv = new ModelAndView();
		req.setAttribute("reportDate", "Records");
		mv.addObject("report", accts);
		mv.setViewName("trafficreport");
		return mv;
	}

	@RequestMapping(value = "/trafficreport/{year}")
	public ModelAndView trafficReprotByYear(
			@PathVariable(value = "year") int year, HttpServletRequest req) {
		System.out.println("trafficReprotByYear()");
		List<Radacct> accts = radacctMapper.queryAllByYear(year);
		ModelAndView mv = new ModelAndView();
		req.setAttribute("reportDate", "Year");
		mv.addObject("report", accts);
		mv.setViewName("trafficreport");
		return mv;
	}
	
	@RequestMapping(value = "/trafficreport/user/{username}/{year}")
	public ModelAndView trafficReprotByYear(
			@PathVariable(value = "year") int year, 
			@PathVariable(value = "username") String username, 
			HttpServletRequest req) {
		System.out.println("trafficReprotByYear()");
		List<Radacct> accts = radacctMapper.queryAllByYearUser(year, username);
		ModelAndView mv = new ModelAndView();
		req.setAttribute("reportDate", "Year");
		mv.addObject("report", accts);
		mv.setViewName("trafficreport");
		return mv;
	}
	
	

	@RequestMapping(value = "/trafficreport/{year}/{month}")
	public ModelAndView trafficReprotByMonth(
			@PathVariable(value = "year") int year,
			@PathVariable(value = "month") int month, HttpServletRequest req) {
		System.out.println("trafficReprotByMonth()");
		List<Radacct> accts = radacctMapper.queryAllByMonth(year, month);
		ModelAndView mv = new ModelAndView();
		req.setAttribute("reportDate", "Month");
		mv.addObject("report", accts);
		mv.setViewName("trafficreport");
		return mv;
	}
	
	@RequestMapping(value = "/trafficreport/user/{username}/{year}/{month}")
	public ModelAndView trafficReprotByMonth(
			@PathVariable(value = "username") String username,
			@PathVariable(value = "year") int year,
			@PathVariable(value = "month") int month, HttpServletRequest req) {
		System.out.println("trafficReprotByMonth()");
		List<Radacct> accts = radacctMapper.queryAllByMonthUser(year, month, username);
		ModelAndView mv = new ModelAndView();
		req.setAttribute("reportDate", "Month");
		mv.addObject("report", accts);
		mv.setViewName("trafficreport");
		return mv;
	}

	@RequestMapping(value = "/trafficreport/{year}/{month}/{day}")
	public ModelAndView trafficReprotByDay(
			@PathVariable(value = "year") int year,
			@PathVariable(value = "month") int month,
			@PathVariable(value = "day") int day, HttpServletRequest req) {
		System.out.println("trafficReprotByDay()");
		List<Radacct> accts = radacctMapper.queryAllByDay(year, month, day);
		ModelAndView mv = new ModelAndView();
		req.setAttribute("reportDate", "Day");
		mv.addObject("report", accts);
		mv.setViewName("usertrafficereport");
		return mv;
	}

	@RequestMapping(value = "/trafficreport/user/{username}/{year}/{month}/{day}")
	public ModelAndView trafficReprotByDay(
			@PathVariable(value = "username") String username,
			@PathVariable(value = "year") int year,
			@PathVariable(value = "month") int month,
			@PathVariable(value = "day") int day, HttpServletRequest req) {
		System.out.println("trafficReprotByDay()");
		List<Radacct> accts = radacctMapper.queryAllByDayUser(year, month, day, username);
		ModelAndView mv = new ModelAndView();
		req.setAttribute("reportDate", "Day");
		mv.addObject("report", accts);
		mv.setViewName("usertrafficereport");
		return mv;
	}
	
	@RequestMapping(value = "/querytrafficreport")
	public String queryTrafficReport(HttpServletRequest req) {
		System.out.println("queryTrafficReport()");
		return "querytrafficreport";
	}
}
