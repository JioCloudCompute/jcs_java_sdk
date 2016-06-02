package com.jcs_java_sdk.compute_api.model;

public class CreateVolumeRequest
{
	private String snapshotId;
	private int size;
	
	public CreateVolumeRequest()
	{
		size = -1;
	}

	public String getSnapshotId() {
		return snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}