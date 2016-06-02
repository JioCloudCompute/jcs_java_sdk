package com.jcs_java_sdk.compute_api.model;

public class DeleteVolumeRequest
{
	private String volumeId;
	
	public DeleteVolumeRequest(){}

	public String getVolumeId() {
		return volumeId;
	}

	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
}