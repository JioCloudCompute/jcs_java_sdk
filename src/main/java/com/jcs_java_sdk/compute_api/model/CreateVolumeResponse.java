package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "CreateVolumeResponse")
/// Class to handle Create Volume Request's Response.
	/**
		This class object describes the volume created
	*/
public class CreateVolumeResponse {
	@XmlElement
	private String requestId;
	@XmlElement
	private String status;
	@XmlElement
	private String volumeId;
	@XmlElement
	private String snapshotId;
	@XmlElement
	private float size;
	@XmlElement
	private String createTime;
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setStatus(String status) {
		this.status = status;
	}
	void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}
	void setSize(float size) {
		this.size = size;
	}
	void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	///Getter for the Unique Request ID
		/**
			@return const string
		*/
	public final String getRequestId() {
		return requestId;
	}
	///Getter for the Status of the volume created
		/**
			@return const string
		*/
	public final String getStatus() {
		return status;
	}
	///Getter for the ID of the volume created
		/**
			@return const string
		*/
	public final String getVolumeId() {
		return volumeId;
	}
	///Getter for the ID of the snapshot to which the volume is attached
		/**
			@return const string
		*/
	public final String getSnapshotId() {
		return snapshotId;
	}
	///Getter for the Size of the Volume Created
		/**
			@return float
		*/
	public final float getSize() {
		return size;
	}
	///Getter for the time Volume was created
		/**
			@return const string
		*/
	public final String getCreateTime() {
		return createTime;
	}

}
