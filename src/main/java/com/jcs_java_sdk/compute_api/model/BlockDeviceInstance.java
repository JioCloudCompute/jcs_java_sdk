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
	public final String getStatus() {
		return status;
	}
	public final String getDeviceName() {
		return deviceName;
	}
	public final boolean isDeleteOnTermination() {
		return deleteOnTermination;
	}
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
