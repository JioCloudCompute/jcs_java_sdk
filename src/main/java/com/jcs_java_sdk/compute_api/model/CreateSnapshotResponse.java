package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "CreateSnapshotResponse")
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
	public final String getRequestId() {
		return requestId;
	}
	public final String getStatus() {
		return status;
	}
	public final String getSnapshotId() {
		return snapshotId;
	}
	public final float getVolumeSize() {
		return volumeSize;
	}
	public final String getVolumeId() {
		return volumeId;
	}
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
