package com.jcs_java_sdk.compute_api.model;

public class UpdateDeleteOnTermination 
{
	private String volumeId;
	private boolean deleteOnTermination;
	
	public UpdateDeleteOnTermination()
	{
		deleteOnTermination = false;
	}

	public String getVolumeId() {
		return volumeId;
	}

	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}

	public boolean isDeleteOnTermination() {
		return deleteOnTermination;
	}

	public void setDeleteOnTermination(boolean deleteOnTermination) {
		this.deleteOnTermination = deleteOnTermination;
	}
}
