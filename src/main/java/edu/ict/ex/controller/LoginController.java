package edu.ict.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {

	@GetMapping("/login")
	public String login(Model model) {
		
		log.info("login()..");
		
		return "login/login";
	}
	
	@GetMapping("/Eshopper/login2")
	public String login2(Model model) {
		
		log.info("login2()..");
		
		return "/Eshopper/login2";
	}
	
	
	
}
