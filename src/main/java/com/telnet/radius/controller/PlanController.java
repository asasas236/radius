package com.telnet.radius.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.telnet.radius.model.Manager;
import com.telnet.radius.model.Nas;
import com.telnet.radius.model.Service;
import com.telnet.radius.service.PlanService;

@Controller
@RequestMapping(value = "/admin")
public class PlanController {

	private PlanService planService;

	@Autowired
	public PlanController(PlanService planService) {
		this.planService = planService;
	}

	@RequestMapping(value = "/plan/list")
	public ModelAndView planList() {

		List<Service> services = planService.planList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("services", services);
		mv.setViewName("servicelist");
		return mv;
	}

	@RequestMapping(value = "/plan/create")
	public ModelAndView toCreatePlan(Service service, HttpServletRequest req) {

		List<Manager> managers = this.planService.mangaerList();
		List<Nas> nases = this.planService.nasList();
		List<Service> services = planService.planList();

		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "Create A New Service");
		mv.addObject("managers", managers);
		mv.addObject("nases", nases);
		mv.addObject("services", services);
		mv.addObject("action", "create");
		mv.addObject("actionsrc", "Create Service");
		mv.setViewName("createservice");

		return mv;
	}

	@RequestMapping(value = "/plan/create", method = RequestMethod.POST)
	public String createPlan(Service service, HttpServletRequest req) {

		planService.createPlan(service);
		req.getSession().setAttribute(
				"success",
				"创建服务成功，Service名： <a href='/radius/admin/plan/edit/"
						+ service.getSrvid() + "' >" + service.getSrvname()
						+ "</a>");
		return "redirect:list";
	}

	@RequestMapping(value = "/plan/edit/{srvid}")
	public ModelAndView toEditPlan(@PathVariable(value = "srvid") int srvid) {

		List<Manager> managers = this.planService.mangaerList();
		List<Nas> nases = this.planService.nasList();
		List<Service> services = planService.planList();

		Service service = this.planService.findServiceById(srvid);
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "Update the Service");
		mv.addObject("service", service);
		mv.addObject("managers", managers);
		mv.addObject("nases", nases);
		mv.addObject("services", services);
		mv.addObject("action", "/radius/admin/plan/edit/" + srvid);
		mv.addObject("actionsrc", "Update Service");

		mv.setViewName("createservice");
		return mv;
	}

	@RequestMapping(value = "/plan/edit/{srvid}", method = RequestMethod.POST)
	public String editPlan(@PathVariable(value = "srvid") int srvid,
			Service service, HttpServletRequest req) {

		planService.updatePlan(service);
		req.getSession().setAttribute(
				"success",
				"更新服务成功，Service名： <a href='/radius/admin/plan/edit/"
						+ service.getSrvid() + "' >" + service.getSrvname()
						+ "</a>");
		
		return "redirect:/admin/plan/list";
	}
}
