package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@RequestMapping("/home")
	public String home(ModelMap map) {
		
		map.put("title", "for_test");
		return "index";
	}
	
}
