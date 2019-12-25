package com.spring.railway.utility;

import java.security.Principal;

import org.springframework.ui.Model;

import com.spring.railway.service.UserService;

public class UserUtility {

	public static void getUserProfile(Model model, Principal principal, UserService userService) {
		 String propic=userService.getProPic(principal.getName());
		 String firstName = userService.getFirstName(principal.getName());
		  model.addAttribute("firstname",firstName);
		  model.addAttribute("propic",propic);
		// TODO Auto-generated method stub
		
	}
	
}
