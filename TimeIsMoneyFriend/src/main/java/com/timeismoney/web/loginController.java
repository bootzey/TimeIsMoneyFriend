package com.timeismoney.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class loginController {
	@RequestMapping("/login")

	public String login() {

		return "login";

	}

	@RequestMapping("/login-error")

	public String loginError(Model model) {

		model.addAttribute("loginError", true);

		return "login";

	}
}