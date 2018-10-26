package com.timeismoney.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.timeismoney.domain.User;
import com.timeismoney.repositories.UserRepository;


@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/user/index")

	public String userIndex() {
		
		return "user/index";

	}
	
	@GetMapping(path="/register")
	public String showRegisterForm() {
		
		return "register";
	}
	
	@PostMapping(path="/register")
	public String registerUser(@RequestParam String username, @RequestParam String password) {
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(
				new BCryptPasswordEncoder(11).encode(password));//Encode the password
		userRepository.save(user);
		
		return "login"; // returns login page??  Where should this return us to?
	}
	
}
