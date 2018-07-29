package com.example.demo.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping({"/","/hello"})
	public String index(Model model) {
		model.addAttribute("name", "SpringBlog from sangjun");
		return "hello";
	}
	@RequestMapping({"/blog"})
	public String blog(Model model) {
		return "blog";
	}
	@RequestMapping({ "/post" })
	public String post(Model model) {
		return "post";
	}
}
