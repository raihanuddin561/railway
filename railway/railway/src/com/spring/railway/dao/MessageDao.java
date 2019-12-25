package com.spring.railway.dao;

import java.util.List;

import com.spring.railway.model.Messages;

public interface MessageDao {

	void sendMessage(Messages messages);

	List<Messages> getMessage(String reciever);

}
