package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RebootInstancesResponse")

	/// Class to handle Reboot Instance Request's Response
	/**
		This Response Class has member functions that returns the description of the Instances requested to Reboot.  
	*/
public class RebootInstancesResponse {
	
	@XmlElement
	private String requestId;
	@XmlElementWrapper(name="instancesSet")
	@XmlElement(name = "item")
	private List<InstanceState> instances;
		///Getter for the Unique Request ID
		/**
			@return final string
		*/
	public final String getRequestId() {
		return requestId;
	}
		///Getter for the Description of the instances that were requested to reboot
		/**
			@return final vector<instance_set>
			A Lis of objects of class instance_set
		*/
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
