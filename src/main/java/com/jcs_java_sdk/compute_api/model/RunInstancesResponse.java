package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RunInstancesResponse")
/// Class to handle Run Instance Request's Response
	/**
		This Response Class has member functions that returns the description of the Instances requested to run(create).  
	*/
public class RunInstancesResponse {
	
	@XmlElement
	private String requestId;
	@XmlElementWrapper(name = "instancesSet")
	@XmlElement(name= "item")
	private List<Instance> instances;
	
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setInstances(List<Instance> instances) {
		this.instances = instances;
	}
	///Getter for the Unique Request ID
		/**
			@return final string
		*/
	public final String getRequestId() {
		return requestId;
	}
	///Getter for the Description of the instances that were requested to run
		/**
			@return final vector<instance>
			A List of objects of class instance
		*/
	public final List<Instance> getInstances() {
		return instances;
	}
	
	
	

}
