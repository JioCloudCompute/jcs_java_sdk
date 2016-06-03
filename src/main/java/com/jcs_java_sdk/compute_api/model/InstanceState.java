package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;

public class InstanceState {
	
	@XmlElement
	private String instanceId;
	@XmlElement
	private String currentState;
	@XmlElement
	private String previousState;
	public final String getInstanceId() {
		return instanceId;
	}
	public final String getCurrentState() {
		return currentState;
	}
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
