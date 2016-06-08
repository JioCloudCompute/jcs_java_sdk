package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;

public class VolumeTerminationInfo {
	
	@XmlElement
	private String instanceId;
	@XmlElement
	private String volumeId;
	@XmlElement
	private boolean DeleteOnTermination;
	public final String getInstanceId() {
		return instanceId;
	}
	public final String getVolumeId() {
		return volumeId;
	}
	public final boolean isDeleteOnTermination() {
		return DeleteOnTermination;
	}
	void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	void setDeleteOnTermination(boolean deleteOnTermination) {
		DeleteOnTermination = deleteOnTermination;
	}
	
	

}
