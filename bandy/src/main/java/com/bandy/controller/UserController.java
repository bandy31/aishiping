package com.bandy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.bandy.model.Resource;
import com.bandy.service.ResourceService;

@Controller
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	private ResourceService resourceService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView userLogin(){
		ModelAndView model = new ModelAndView("success");
		List<Resource> videos = resourceService.getShowResource(2);
		System.out.println(videos.size());
		return model;
	}
}
