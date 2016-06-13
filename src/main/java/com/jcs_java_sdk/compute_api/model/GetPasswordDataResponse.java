package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GetPasswordDataResponse")

	/// Class to handle Get Password Request's Response
	/**
	*/
public class GetPasswordDataResponse {
	
	@XmlElement
	private String requestId;
	@XmlElement
	private String instanceId;
	@XmlElement 
	private String timeStamp;
	@XmlElement
	private String passwordData;
	///Getter for the Request ID
		/**
			@return  String
		*/
	public final String getRequestId() {
		return requestId;
	}
	///Getter for the Instance ID
		/**
			@return  String
		*/
	public final String getInstanceId() {
		return instanceId;
	}
	///Getter for the time stamp
		/**
			@return  String
		*/
	public final String getTimeStamp() {
		return timeStamp;
	}
	//Getter for the Password Data
		/**
			@return  String
		*/
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
	
	public void setData(String passwordData){
		this.passwordData = passwordData;
	}
	
	

}
