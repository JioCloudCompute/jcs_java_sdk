package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "AttachVolumeResponse")
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
	
	public final String getRequestId() {
		return requestId;
	}
	
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	
	public final String getDeviceName() {
		return deviceName;
	}
	void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public final String getInstanceId() {
		return instanceId;
	}
	
	void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	public final boolean isDeleteOnTermination() {
		return deleteOnTermination;
	}
	void setDeleteOnTermination(boolean deleteOnTermination) {
		this.deleteOnTermination = deleteOnTermination;
	}
	public final String getStatus() {
		return status;
	}
	void setStatus(String status) {
		this.status = status;
	}
	public final String getVolumeId() {
		return volumeId;
	}
	void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	
}
