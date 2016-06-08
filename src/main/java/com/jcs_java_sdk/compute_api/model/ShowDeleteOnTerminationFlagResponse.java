package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ShowDeleteOnTerminationFlagResponse")
public class ShowDeleteOnTerminationFlagResponse {
	@XmlElement
	private String requestId;
	
	@XmlElement(name = "volume")
	private VolumeTerminationInfo volume;
	
	public final String getRequestId() {
		return requestId;
	}
	
	public final String getInstanceId() {
		return volume.getInstanceId();
	}
	public final String getVolumeId() {
		return volume.getVolumeId();
	}
	public final boolean isDeleteOnTermination() {
		return volume.isDeleteOnTermination();
	}
	
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	void setVolume(VolumeTerminationInfo volume) {
		this.volume = volume;
	}
		
	
	
}
