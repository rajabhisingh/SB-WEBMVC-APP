package com.abhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	@GetMapping("/greet")
	public ModelAndView getMsg1() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg78", "Good Morning...!!");
		mav.setViewName("index.html");
		return mav;

	}

	@GetMapping("/welcome")
	public ModelAndView getMsg2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg87", "Welcome to India");
		mav.setViewName("index");
		return mav;
	}
	@GetMapping("/abcd")
	 public ModelAndView getAbhi() {
		 ModelAndView mav = new ModelAndView();
		 mav.addObject("msg50","Najesh lauraghrhi");
		 mav.setViewName("abhi");
		 return mav;
	 }

}
