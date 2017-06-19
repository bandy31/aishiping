package com.bandy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="user")
public class UserController {
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView userLogin(){
		ModelAndView model = new ModelAndView("success");
		return model;
	}
}
