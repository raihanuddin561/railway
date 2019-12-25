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

import com.spring.railway.model.Scheduling;
import com.spring.railway.model.Stations;
import com.spring.railway.service.ScheduleService;


@Controller
public class ScheduleController {
	@Autowired
	private ScheduleService scheduleService;
	
	
	@RequestMapping("/addSchedule")
	public String addLocationPage(Model model,@Valid Scheduling scheduling, BindingResult result) {
		
		if(result.hasErrors()) {
			model.addAttribute("scheduling",scheduling);
			System.out.println("has errors");
			return "addSchedule";
		}else {
			if(scheduling.getStartingStation()!=null) {
				scheduleService.addSchedule(scheduling);
				return "redirect:/service";
			}else {
				System.out.println("form loading");
				model.addAttribute("scheduling",scheduling);
				return "addSchedule";
			}
		}
		
	}
	
	@RequestMapping("/schedule")
	public String routeinfo(Model model,@RequestParam("s") String stationName) {
		List<Scheduling> schedule = scheduleService.getSchedule(stationName);
		System.out.println("Scheduling: "+schedule);
		model.addAttribute("schedule", schedule);
		model.addAttribute("stationName", stationName);
		return "schedule";
	}
}
