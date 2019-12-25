package com.spring.railway.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.railway.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/loggedout")
	public String logout() {
		return "loggedout";
	}
	
	@RequestMapping("/denied")
	public String deniedPage() {
		return "denied";
	}
	
	@RequestMapping("/loggedsuccess")
	public String loggedIn(Model model) {
		/*
		 * System.out.println(principal.getName()); String
		 * propic=userService.getProPic(principal.getName());
		 * System.out.println(propic); model.addAttribute("propic",propic);
		 */
		
		return "redirect:/";
		
	}

}
