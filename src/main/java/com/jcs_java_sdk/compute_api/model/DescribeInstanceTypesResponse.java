package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DescribeInstanceTypesResponse {
	
	@XmlElement(name = "DescribeInstanceTypesResponse")
	private String requestId;
	@XmlElementWrapper(name="instanceTypes")
	@XmlElement(name="item")
	private List<InstanceTypes> instanceTypes;
	
	public final String getRequestId() {
		return requestId;
	}
	public final List<InstanceTypes> getInstanceTypes() {
		return instanceTypes;
	}
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setInstanceTypes(List<InstanceTypes> instanceTypes) {
		this.instanceTypes = instanceTypes;
	}
	
	
}
