package com.jcs_java_sdk.compute_api.model;

public class ShowDeleteOnTerminationFlagRequest
{
	private String volumeId;
	
	public ShowDeleteOnTerminationFlagRequest(){}

	public String getVolumeId() {
		return volumeId;
	}

	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
}