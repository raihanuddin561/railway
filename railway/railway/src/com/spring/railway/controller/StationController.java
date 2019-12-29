package com.spring.railway.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.railway.model.Diparture;
import com.spring.railway.model.Stations;
import com.spring.railway.model.Trains;
import com.spring.railway.service.StationService;
import com.spring.railway.service.TrainService;

@Controller
public class StationController {
	@Autowired
	private StationService stationService;

	@RequestMapping("/addstation")
	public String addLocationPage(Model model, @Valid Stations station, BindingResult result) {

		if (result.hasErrors()) {
			model.addAttribute("station", station);
			System.out.println("has errors");
			return "addstation";
		} else {
			if (station.getStationName() != null) {
				stationService.addStation(station);
				return "redirect:/";
			} else {
				System.out.println("form loading");
				model.addAttribute("station", station);
				return "addstation";
			}
		}

	}

	@RequestMapping("/stations")
	public String routeinfo(Model model, Principal principal) {
		List<Stations> stations = stationService.getStations();
		model.addAttribute("stations", stations);

		return "stations";
	}

	@RequestMapping("/contactStation")
	public String contactStation(Model model, Principal principal) {
		List<Stations> stations = stationService.getStations();
		model.addAttribute("stationContact", stations);

		return "contactStation";
	}

}
