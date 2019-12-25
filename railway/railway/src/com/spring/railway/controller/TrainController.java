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
import com.spring.railway.model.Trains;
import com.spring.railway.service.TrainService;
import com.spring.railway.utility.ImageUtility;

@Controller
public class TrainController {
	@Autowired
	private TrainService trainService;
	
	
	@RequestMapping("/addtrain")
	public String addLocationPage(Model model,@Valid Trains train, BindingResult result) {
		
		if(result.hasErrors()) {
			model.addAttribute("train",train);
			System.out.println("has errors");
			return "addtrain";
		}else {
			if(train.getTrainName()!=null) {
				trainService.addTrain(train);
				return "redirect:/service";
			}else {
				System.out.println("form loading");
				model.addAttribute("train",train);
				return "addtrain";
			}
		}
		
	}
	
	
	@RequestMapping("/contactTrain")
	public String routeinfo(Model model,Principal principal) {
		List<Trains> trains = trainService.getTrains();
		model.addAttribute("trainContact", trains);
		
		return "contactTrain";
	}
	
}
