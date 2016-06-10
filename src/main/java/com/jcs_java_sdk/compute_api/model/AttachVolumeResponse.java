package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "AttachVolumeResponse")
/// Class to handle Attach Volume Response
	/**
		This Response Class has member variables and functions to get details of
		the volume that was requested to attach to a particular instance. 
	*/
public class AttachVolumeResponse {
	@XmlElement
	String requestId;
	@XmlElement
	String deviceName;
	@XmlElement
	String instanceId;
	@XmlElement
	boolean deleteOnTermination;
	@XmlElement
	String status;
	@XmlElement
	String volumeId;

	///Getter for the Request ID
		/**
			\return  String
		*/
	public final String getRequestId() {
		return requestId;
	}
	
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	///Getter for the Device Name
		/**
			\return  String
		*/
	public final String getDeviceName() {
		return deviceName;
	}
	void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	///Getter for the Instance ID
		/**
			\return  String
		*/
	public final String getInstanceId() {
		return instanceId;
	}
	
	void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	///Getter for the Delete On Termination Flag 
		/**
			\return  Bool
		*/
	public final boolean isDeleteOnTermination() {
		return deleteOnTermination;
	}
	void setDeleteOnTermination(boolean deleteOnTermination) {
		this.deleteOnTermination = deleteOnTermination;
	}
	///Getter for the Status of the Request
		/**
			\return  String
		*/
		
	public final String getStatus() {
		return status;
	}
	void setStatus(String status) {
		this.status = status;
	}
	///Getter for the Volume Id
		/**
			\return  String
		*/
	public final String getVolumeId() {
		return volumeId;
	}
	void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	
}
