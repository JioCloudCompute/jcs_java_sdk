package com.jcs_java_sdk.compute_api.model;

public class DetachVolumeRequest
{
	private String instanceId;
	private String volumeId;
	
	public DetachVolumeRequest(){}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getVolumeId() {
		return volumeId;
	}

	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	
	
}