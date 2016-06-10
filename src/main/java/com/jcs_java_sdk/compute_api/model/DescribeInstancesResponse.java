package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DescribeInstancesResponse")
/// Class to handle Describe Image Request's Response
	/**
		This Response Class has member functions that returns the description of instances requested for.  
	*/
public class DescribeInstancesResponse {
	
	@XmlElement
	private String requestId;
	@XmlElementWrapper(name="instancesSet")
	@XmlElement(name = "item")
	private List<Instance> instances;
	///Getter for the Unique Request ID
		/**
			@return final string
		*/
	public final String getRequestId() {
		return requestId;
	}
	///Getter for the Description of Intances requested
		/**
			@return final vector<model::instance>  
			A vector of objects of class instance
		*/
	public final List<Instance> getInstances() {
		return instances;
	}
	
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setInstances(List<Instance> instances) {
		this.instances = instances;
	}
	
}
