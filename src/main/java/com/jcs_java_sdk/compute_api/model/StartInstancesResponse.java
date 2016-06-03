package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StartInstancesResponse {
	@XmlElement
	private String requestId;
	@XmlElementWrapper(name = "instancesSet")
	@XmlElement(name = "item")
	private List<InstanceState> instances;
	public final String getRequestId() {
		return requestId;
	}
	public final List<InstanceState> getInstances() {
		return instances;
	}
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setInstances(List<InstanceState> instances) {
		this.instances = instances;
	}
	
	
	

}
