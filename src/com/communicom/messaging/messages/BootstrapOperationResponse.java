package com.communicom.messaging.messages;

public class BootstrapOperationResponse extends RequestResponse{
    
	private String sourceAddress;
    private String targetAddress;
    private String version;
    private int result;
    private int errorMessage;
    
    
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
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(int errorMessage) {
		this.errorMessage = errorMessage;
	}
    
    
}
