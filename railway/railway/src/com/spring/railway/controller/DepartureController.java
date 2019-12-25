package com.spring.railway.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.railway.model.Diparture;
import com.spring.railway.model.Location;
import com.spring.railway.model.Stations;
import com.spring.railway.service.DepartureService;
import com.spring.railway.service.StationService;
import com.spring.railway.utility.UserUtility;

@Controller
public class DepartureController {
	@Autowired
	private DepartureService departureService;
	
	
	@RequestMapping("/addroute")
	public String addLocationPage(Model model,@Valid Diparture diparture, BindingResult result) {
		
		if(result.hasErrors()) {
			model.addAttribute("diparture",diparture);
			System.out.println("has errors");
			return "addroute";
		}else {
			if(diparture.getFromStation()!=null) {
				departureService.addDiparture(diparture);
				return "redirect:/";
			}else {
				System.out.println("form loading");
				model.addAttribute("diparture",diparture);
				return "addroute";
			}
		}
		
	}
	
	@RequestMapping("/route")
	public String routeinfo(Model model,Principal principal) {
		List<Diparture> routeinfo = departureService.getDiparture();
		model.addAttribute("routeinfo", routeinfo);
		
		return "routeinfo";
	}
	
	@RequestMapping("/searchroute")
	public String searchPage(Model model,@RequestParam("stationname") String station) {
		List<Diparture> routeList = departureService.getDiparture(station);
		//boolean hasList = false;
		model.addAttribute("routeinfo",routeList);
		return "routeinfo";
	}
}
