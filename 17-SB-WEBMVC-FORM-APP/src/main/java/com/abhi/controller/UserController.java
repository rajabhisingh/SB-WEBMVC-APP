package com.abhi.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.abhi.bindings.User;

@Controller
public class UserController {
	@GetMapping("/user")
	public ModelAndView loadForm() {
		ModelAndView mav =new  ModelAndView();
		mav.addObject("userObj",new User());
		mav.setViewName("index");
		return mav;
	}
	@PostMapping("/user")
	public ModelAndView handleUserFormSubmit(User user) {
		
		System.out.println(user);
		//TODO: save data in db
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "User Datails Saved");
		mav.setViewName("success");
		return mav;
	}
	
	

}