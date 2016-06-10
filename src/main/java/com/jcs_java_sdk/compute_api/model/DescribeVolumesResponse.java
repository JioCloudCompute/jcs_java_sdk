package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DescribeVolumesResponse")
/// Class to handle Describe Volume Request's Response
	/**
		This Response Class has member functions that returns the description of the Volumes requested.  
	*/
public class DescribeVolumesResponse {
	
	@XmlElement
	private String requestId;
	@XmlElementWrapper(name = "volumeSet")
	@XmlElement(name = "item")
	private List<Volume> volumes;
	///Getter for the Unique Request ID
		/**
			@return final string
		*/
	public final String getRequestId() {
		return requestId;
	}
	///Getter for the Description of Volumes Requested
		/**
			@return final vector<model::volume>  
			A vector of objects of class volume
		*/
	public final List<Volume> getVolumes() {
		return volumes;
	}
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setVolumes(List<Volume> volumes) {
		this.volumes = volumes;
	}
	

}
