package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GetPasswordDataResponse")
public class GetPasswordDataResponse {
	
	@XmlElement
	private String requestId;
	@XmlElement
	private String instanceId;
	@XmlElement 
	private String timeStamp;
	@XmlElement
	private String passwordData;
	public final String getRequestId() {
		return requestId;
	}
	public final String getInstanceId() {
		return instanceId;
	}
	public final String getTimeStamp() {
		return timeStamp;
	}
	public final String getPasswordData() {
		return passwordData;
	}
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	void setPasswordData(String passwordData) {
		this.passwordData = passwordData;
	}
	
	

}
