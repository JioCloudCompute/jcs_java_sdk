package com.jcs_java_sdk.compute_api.model;

public class DeleteSnapshotRequest
{
	private String snapshotId;
	
	public DeleteSnapshotRequest()
	{
		snapshotId = new String();
	}

	public String getSnapshotId() {
		return snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}
}