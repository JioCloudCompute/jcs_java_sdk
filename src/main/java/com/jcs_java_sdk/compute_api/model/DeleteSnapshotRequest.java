package com.jcs_java_sdk.compute_api.model;

class DeleteSnapshotRequest
{
	private String snapshotId;
	
	public DeleteSnapshotRequest(){}

	public String getSnapshotId() {
		return snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}
}