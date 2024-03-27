package com.abhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.abhi.entity.User;
import com.abhi.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	// login page display
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}

	// login button handle
	@PostMapping("/login")
	public String handleLogin(User user, Model model) {
		User userObject = userService.getUser(user.getEmail(), user.getPwd());
		if (userObject == null) {
			model.addAttribute("emsg", "Invalid Credentials");
			return "index";
		} else {
			model.addAttribute("msg", userObject.getName() + ",Welcome to Ashok IT");
			return "dashborad";

		}
	}

	// register page display
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "registerView";
	}

	@PostMapping("/register")
	public String handleRegister(User user, Model model) {
		boolean status = userService.saveUser(user);
		if (status) {
			model.addAttribute("smsg", "User Register");
		} else {
			model.addAttribute("emsg", "Registration Faild");

		}
		return "registerView";
	}
//log out
	@GetMapping("/Logout")
	public String logOut(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}
	
	@GetMapping("/forgot")
	public String forgot(Model model) {
		model.addAttribute("user", new User());
		return "forgotPwdView";
	}
	
	
	
	@PostMapping("/forgot")
	public String handleForgotPassword(String email, Model model) {
		boolean resetStatus = userService.resetPassword(email);
		if(resetStatus) {
			model.addAttribute("msg", "Password reset instruction have been sent to your email.. ");
			
		}else {
			model.addAttribute("emsg","Email not found");
		}
		return "dashborad";
	}

}
