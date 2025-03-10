package com.yaksha.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForwardController {

	@GetMapping(value = "/")
	public String index() {
		return "index";
	}

	@GetMapping(value = "/submitForm")
	public String redirect() {
		return "forward:finalPage";
	}

	@GetMapping(value = "/finalPage")
	public String finalPage(Model model) {
		model.addAttribute("message", "Form Submitted Successfully!");
		return "final";
	}
}
