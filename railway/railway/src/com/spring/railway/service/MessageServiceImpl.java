package com.spring.railway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.railway.dao.MessageDao;
import com.spring.railway.model.Messages;

@Service("messageService")
public class MessageServiceImpl implements MessageService {
	@Autowired
	private MessageDao messageDao;

	@Override
	public void sendMessage(Messages messages) {
		messageDao.sendMessage(messages);
		
	}

	@Override
	public List<Messages> getMessage(String reciever) {
		// TODO Auto-generated method stub
		return messageDao.getMessage(reciever);
	}

	

}
