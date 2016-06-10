package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "CreateSnapshotResponse")
/// Class to handle Create Snapshot Request's Response
	/**
		This Response Class has member variables and functions to get details of
		the snapshot that was created.
	*/
public class CreateSnapshotResponse {
	
	@XmlElement
	private String requestId;
	@XmlElement
	private String status;
	@XmlElement
	private String snapshotId;
	@XmlElement
	private float volumeSize;
	@XmlElement
	private String volumeId;
	@XmlElement
	private String startTime;
	///Getter for the Unique Request ID
		/**
			@return final string
		*/
	public final String getRequestId() {
		return requestId;
	}
	///Getter for the Status of the Snapshot created
		/**
			@return final string
		*/
	public final String getStatus() {
		return status;
	}
	///Getter for the ID of the snapshot created
		/**
			@return final string
		*/
	public final String getSnapshotId() {
		return snapshotId;
	}
	///Getter for the Volume Size attached with the Snapshot created
		/**
			@return float
		*/
	public final float getVolumeSize() {
		return volumeSize;
	}
	///Getter for the Volume ID attached with the Snapshot created
		/**
			@return final string
		*/
	public final String getVolumeId() {
		return volumeId;
	}
	///Getter for the time Snapshot was created
		/**
			@return final string
		*/
	public final String getStartTime() {
		return startTime;
	}
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setStatus(String status) {
		this.status = status;
	}
	void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}
	void setVolumeSize(float volumeSize) {
		this.volumeSize = volumeSize;
	}
	void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	

}
