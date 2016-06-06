package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RunInstancesResponse")
public class RunInstancesResponse {
	
	@XmlElement
	private String requestId;
	@XmlElement
	private List<Instance> instances;
	
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setInstances(List<Instance> instances) {
		this.instances = instances;
	}
	public final String getRequestId() {
		return requestId;
	}
	public final List<Instance> getInstances() {
		return instances;
	}
	
	
	

}
