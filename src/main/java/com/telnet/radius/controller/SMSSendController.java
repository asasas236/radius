package com.telnet.radius.controller;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.telnet.radius.mapper.RadcheckMapper;
import com.telnet.radius.mapper.ServiceMapper;
import com.telnet.radius.mapper.UserMapper;
import com.telnet.radius.model.Changesrv;
import com.telnet.radius.model.Radcheck;
import com.telnet.radius.model.User;
import com.telnet.radius.module.SMSSender;

@Controller
public class SMSSendController {

	@Autowired
	private UserMapper userMappper;

	@Autowired
	private RadcheckMapper radcheckMapper;

	@Autowired
	private ServiceMapper servicesMapper;

	@RequestMapping(value = "/sms")
	@ResponseBody
	public void sendSMS(
			@RequestParam(value = "mobileNumber") String mobileNumber) {

		System.out.println(mobileNumber);

		User user = userMappper.queryUserByName(mobileNumber);
		String result = "";
		if (user != null) {
			try {
				result = SMSSender.sendSMS(mobileNumber, "your login password:"
						+ user.getPassword());
			} catch (HttpException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			int randpwd = (int) (Math.random() * 999999);

			try {
				result = SMSSender.sendSMS(mobileNumber, "your login password: "
						+ String.valueOf(randpwd));

				if (result.indexOf("ok") > 0) {

					User newUser = new User();
					newUser.setUsername(mobileNumber);
					newUser.setPassword(String.valueOf(randpwd));
					userMappper.insert(newUser);

					Changesrv csrv = new Changesrv();
					csrv.setUsername(newUser.getUsername());
					csrv.setNewsrvname("testplan");

					servicesMapper.insertChangesrv(csrv);

					Radcheck rc = new Radcheck();
					rc.setUsername(newUser.getUsername());
					rc.setAttribute("Cleartext-Password");
					rc.setValue(newUser.getPassword());

					Radcheck rc1 = new Radcheck();
					rc1.setUsername(newUser.getUsername());
					rc1.setAttribute("Simultaneous-Use");
					rc1.setValue("1");

					radcheckMapper.insert(rc);
					radcheckMapper.insert(rc1);
				}
			} catch (HttpException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
