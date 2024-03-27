package com.abhi.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = ProductNotFoundException.class)
	public String handleProductEx(Model model) {
		return "exView";
	}
	
	
	@ExceptionHandler(value = Exception.class)
	public String handleAe(Exception e) {
		return "exView";
	}
}
