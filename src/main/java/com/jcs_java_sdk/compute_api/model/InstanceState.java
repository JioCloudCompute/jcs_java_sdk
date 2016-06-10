package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
///Class Describing the Details of a Instance
public class InstanceState {
	
	@XmlElement
	private String instanceId;
	@XmlElement
	private String currentState;
	@XmlElement
	private String previousState;
	///Getter for the Instance ID
		/**
			@return final string
		*/
	public final String getInstanceId() {
		return instanceId;
	}
	///Getter for the Current State of the Instance
		/**
			@return final string
			pending, running, shutting-down, terminated, stopping, stopped
		*/
	public final String getCurrentState() {
		return currentState;
	}
	///Getter for the Previous State of the Instance
	/**
		@return final string
		pending, running, shutting-down, terminated, stopping, stopped
	*/
	public final String getPreviousState() {
		return previousState;
	}
	void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	void setPreviousState(String previousState) {
		this.previousState = previousState;
	}
	
	

}
