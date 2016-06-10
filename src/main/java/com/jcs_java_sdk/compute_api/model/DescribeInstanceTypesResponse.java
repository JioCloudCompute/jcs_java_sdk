package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DescribeInstanceTypesResponse")
/// Class to handle Describe Image Request's Response
	/**
		This Response Class has member functions that returns the description of instances requested for.  
	*/
public class DescribeInstanceTypesResponse {
	
	@XmlElement(name = "DescribeInstanceTypesResponse")
	private String requestId;
	@XmlElementWrapper(name="instanceTypes")
	@XmlElement(name="item")
	private List<InstanceTypes> instanceTypes;
	///Getter for the Unique Request ID
		/**
			\return final string
		*/
	public final String getRequestId() {
		return requestId;
	}
	///Getter for the Description of Intance Types requested
		/**
			\return final vector<model::instance_type>  
			A vector of objects of class instance_type
		*/
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
