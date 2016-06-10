package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DetachVolumeResponse")
/// Class to handle Detach Volume Request's Response
	/**
		This Response Class has member functions that returns the description of the Volume requested to detach.  
	*/
public class DetachVolumeResponse {
	@XmlElement
	private String requestId;
	@XmlElement
	private String device;
	@XmlElement
	private String instanceId;
	@XmlElement
	private boolean deleteOnTermination;
	@XmlElement
	private String status;
	@XmlElement
	private String volumeId;
	///Getter for the Unique Request ID
		/**
			@return final string
		*/
	public final String getRequestId() {
		return requestId;
	}
	///Getter for the Device Name of the Volume
		/**
			@return final string
		*/
	public final String getDevice() {
		return device;
	}
	///Getter for the instance ID from which the volume got Dettached
		/**
			@return final string
		*/
		
	public final String getInstanceId() {
		return instanceId;
	}
	///Getter for the Delete On termination Flag
		/**
			@return final bool
			True if volume get's Deleted** on Termination of the instance to which the it is attached
		*/
	public final boolean isDeleteOnTermination() {
		return deleteOnTermination;
	}
	///Getter for the Current Status of the Volume
		/**
			@return final string
		*/
	public final String getStatus() {
		return status;
	}
	///Getter for the Volume ID
		/**
			@return final string
		*/
	public final String getVolumeId() {
		return volumeId;
	}
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setDevice(String device) {
		this.device = device;
	}
	void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	void setDeleteOnTermination(boolean deleteOnTermination) {
		this.deleteOnTermination = deleteOnTermination;
	}
	void setStatus(String status) {
		this.status = status;
	}
	void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	
	

}
