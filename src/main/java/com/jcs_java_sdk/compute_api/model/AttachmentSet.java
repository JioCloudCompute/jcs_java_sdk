package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;

public class AttachmentSet {
	
	@XmlElement
	private String device;
	@XmlElement
	private String instanceId;
	public final String getDevice() {
		return device;
	}
	public final String getInstanceId() {
		return instanceId;
	}
	void setDevice(String device) {
		this.device = device;
	}
	void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	

}
