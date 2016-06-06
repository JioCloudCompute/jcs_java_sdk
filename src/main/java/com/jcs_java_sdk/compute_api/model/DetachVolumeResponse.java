package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DetachVolumeResponse")
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
	public final String getRequestId() {
		return requestId;
	}
	public final String getDevice() {
		return device;
	}
	public final String getInstanceId() {
		return instanceId;
	}
	public final boolean isDeleteOnTermination() {
		return deleteOnTermination;
	}
	public final String getStatus() {
		return status;
	}
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
