package com.spring.railway.service;

import java.util.List;

import com.spring.railway.model.Messages;

public interface MessageService {
	public void sendMessage(Messages messages);

	public List<Messages> getMessage(String reciever);
}
