package com.timeismoney.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontEndController {
	@RequestMapping(value="/index*", method=RequestMethod.GET)
	public String getHome() {
		
		return "index";
	}
}
