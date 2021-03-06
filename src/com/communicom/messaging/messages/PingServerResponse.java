package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerResponse extends RequestResponse{
	private String sourceAddress;
	private String targetAddress;
	
	public PingServerResponse(){
		this.messageNumber = 2;
		this.emisionTime = LocalDateTime.now();
	}
	
	public String getSourceAddress() {
		return sourceAddress;
	}
	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}
	public String getTargetAddress() {
		return targetAddress;
	}
	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
	}
	
	
}
