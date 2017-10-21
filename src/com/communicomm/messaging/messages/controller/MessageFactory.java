package com.communicomm.messaging.messages.controller;

import com.communicom.messaging.messages.BootstrapOperationRequest;
import com.communicom.messaging.messages.BootstrapOperationResponse;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.RequestResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;
import com.communicom.messaging.messages.signals.SignalType;

public class MessageFactory {
    
	public static RequestResponse createRequestResponse(SignalType type) {
		switch(type) {
		    case MANUAL_DATA_REQUEST:
		    	return new BootstrapOperationRequest();
		    case MANUAL_DATA_RESPONSE:
		    	return new BootstrapOperationResponse();
		    case AUTOMATIC_DATA_REQUEST:
		    	return new SetWaitForSignalRequest();
		    case AUTOMATIC_DATA_RESPONSE:
		    	return new SetWaitForSignalResponse();
		    case PING_REQUEST:
		    	return new PingServerRequest();
		    case PING_RESPONSE:
		    	return new PingServerResponse();
		}
		return null;
	}
}
