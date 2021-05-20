package com.iu.s1.home;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ErrorController {
	
	@ExceptionHandler(Exception.class)
	public ModelAndView getNull(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		System.out.println(request.getRequestURI());
		mv.setViewName("index");
		
		return mv;
	}

}
