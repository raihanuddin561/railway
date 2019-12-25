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

import com.spring.railway.model.Messages;
import com.spring.railway.service.MessageService;

@Controller
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/reply")
	public String message(@RequestParam("id") String trainNo,Model model,Principal principal,Messages messages) {
		messages.setReceiver(trainNo);
		messages.setSender(principal.getName());
		model.addAttribute("messages",messages);
		//model.addAttribute("trainNo");
		return "messageForm";
	}
	
	@RequestMapping("sendMessage")
	public String sendMessage(Model model, @Valid Messages messages, BindingResult result) {
	
		messageService.sendMessage(messages);
		return "sentMessage";
		
	}
	
	@RequestMapping("seeMessage")
	public String seeMessages(Model model, Principal principal) {
		String reciever = principal.getName();
		List<Messages> messages = messageService.getMessage(reciever);
		model.addAttribute("messages",messages);
		return "seeMessage";
	}

}
