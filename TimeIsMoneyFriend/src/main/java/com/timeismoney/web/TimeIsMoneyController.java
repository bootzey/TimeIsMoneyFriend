package com.timeismoney.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TimeIsMoneyController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String getHome() {
		
		return "index";
	}

	@RequestMapping("/login")

	public String login() {

		return "login";

	}

	@RequestMapping("/login-error")

	public String loginError(Model model) {

		model.addAttribute("loginError", true);

		return "login";

	}
	
	@RequestMapping("/user/index")

	public String userIndex() {

		return "user/index";

	}
}
