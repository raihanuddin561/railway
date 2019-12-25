package com.spring.railway.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.railway.model.Location;
import com.spring.railway.model.Stations;
import com.spring.railway.model.Ticket;
import com.spring.railway.model.Trains;
import com.spring.railway.service.TrainService;
import com.spring.railway.utility.ImageUtility;

@Controller
public class TicketController {
	
	
	@RequestMapping("/ticket")
	public String addLocationPage(Model model,@Valid Ticket ticket,BindingResult result ) {
		model.addAttribute("ticket",ticket);
		return "ticket";
		
	}
	
	
	
	
}
