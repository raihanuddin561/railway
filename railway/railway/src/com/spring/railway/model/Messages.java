package com.spring.railway.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="messages")
@Table(name="messages")
public class Messages implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mid;
	
	private String sender;
	private String receiver;
	private String message;
	private String time;
	private String status;
	public Messages() {
		
		
	}
	public Messages(String sender, String receiver, String message, String time, String status) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
		this.time = time;
		this.status = status;
	}
	public Messages(int mid, String sender, String receiver, String message, String time, String status) {
		super();
		this.mid = mid;
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
		this.time = time;
		this.status = status;
	}
	
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Messages [mid=" + mid + ", sender=" + sender + ", receiver=" + receiver + ", message=" + message
				+ ", time=" + time + ", status=" + status + "]";
	}
	

	
}
