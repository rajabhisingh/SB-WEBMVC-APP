package com.abhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public String getUser(Model model) {
		model.addAttribute("msg", "User email : abhi123@gmail.com");
		
		String s = null;
		s.length(); 
		return "index";
	}
}
