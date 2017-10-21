package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class RequestResponse {
	protected String messageName;
	protected int messageNumber;
	protected LocalDateTime emisionTime;
	
	
	public String getMessageName() {
		return messageName;
	}
	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}
	public int getMessageNumber() {
		return messageNumber;
	}
	public void setMessageNumber(int messageNumber) {
		this.messageNumber = messageNumber;
	}
	public LocalDateTime getEmisionTime() {
		return emisionTime;
	}
	public void setEmisionTime(LocalDateTime emisionTime) {
		this.emisionTime = emisionTime;
	}
	
	@Override
	public String toString() {
		return "RequestResponse [messageName=" + messageName + ", messageNumber=" + messageNumber + ", emisionTime="
				+ emisionTime + "]";
	}
	
	
	
}
