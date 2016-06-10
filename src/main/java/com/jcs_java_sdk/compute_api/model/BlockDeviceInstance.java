package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;

public class BlockDeviceInstance {
	@XmlElement
	private String status;
	@XmlElement
	private String deviceName;
	@XmlElement
	private boolean deleteOnTermination;
	@XmlElement
	private String volumeId;
	///Getter for Status of the Block Device
		/**
			@return final string
		*/
	public final String getStatus() {
		return status;
	}
	///Getter for Device Name of the Block
		/**
			@return final string
		*/
	public final String getDeviceName() {
		return deviceName;
	}
	///Getter for the boolean of DeleteOntermination Flag of the block
		/**
			@return final boolean
		*/
	public final boolean isDeleteOnTermination() {
		return deleteOnTermination;
	}
	///Getter for Volume ID
		/**
			@return final string
		*/
	public final String getVolumeId() {
		return volumeId;
	}
	void setStatus(String status) {
		this.status = status;
	}
	void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	void setDeleteOnTermination(boolean deleteOnTermination) {
		this.deleteOnTermination = deleteOnTermination;
	}
	void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	
}
