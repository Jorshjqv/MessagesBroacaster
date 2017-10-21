package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;

import com.communicom.messaging.messages.BootstrapOperationRequest;
import com.communicom.messaging.messages.BootstrapOperationResponse;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.RequestResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;
import com.communicom.messaging.messages.signals.SignalType;

public class MessageController {
	private ArrayList<RequestResponse>requests = new ArrayList<RequestResponse>();
	private ArrayList<RequestResponse>responses = new ArrayList<RequestResponse>();
	
	public void sendMessage(int messageOption) {
				if(messageOption == 1 || messageOption == 3 || messageOption == 5) {
					requests.add(MessageFactory.createRequestResponse(SignalType.values()[messageOption - 1]));
				}
				else if(messageOption == 2 || messageOption == 4 || messageOption == 6) {
					responses.add(MessageFactory.createRequestResponse(SignalType.values()[messageOption - 1]));
				}
	}

	
	public void listMessage(int messageOption) {
		if (messageOption == 1){
			for (RequestResponse currentRequest: requests){
				if(currentRequest instanceof PingServerRequest) {
					System.out.println((PingServerRequest)currentRequest);
				}
				
			}
		}
		if (messageOption == 2){
			for (RequestResponse currentResponse: responses){
				if(currentResponse instanceof PingServerResponse) {
					System.out.println((PingServerResponse)currentResponse);
				}
				
			}
		}
		if (messageOption == 3){
			for (RequestResponse currentRequest: requests){
				if(currentRequest instanceof SetWaitForSignalRequest) {
					System.out.println((SetWaitForSignalRequest)currentRequest);
				}
				
			}
		}
		if (messageOption == 4){
			for (RequestResponse currentResponse: responses){
				if(currentResponse instanceof SetWaitForSignalResponse) {
					System.out.println((SetWaitForSignalResponse)currentResponse);
				}
				
			}
		}
		if(messageOption == 5) {
			
			for (RequestResponse currentRequest: requests){
				if(currentRequest instanceof BootstrapOperationRequest) {
					System.out.println((BootstrapOperationRequest)currentRequest);
				}
			}
		}
		if(messageOption == 6) {
			for (RequestResponse currentResponse: responses){
				if(currentResponse instanceof BootstrapOperationResponse) {
					System.out.println((BootstrapOperationResponse)currentResponse);
				}
				
			}
		}
	}

}
