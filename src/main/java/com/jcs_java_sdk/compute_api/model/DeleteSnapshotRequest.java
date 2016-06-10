package com.jcs_java_sdk.compute_api.model;
/// Class to handle delete snapshot request
/**
	This class manages the request for delete snapshot. User can create an object and and initialize the needed arguments.
*/
public class DeleteSnapshotRequest
{
	private String snapshotId;
	
	/// Constructor
	public DeleteSnapshotRequest()
	{
		snapshotId = new String();
	}
	/// Getter for the private variable snapshotId
	/**
		@return string
	*/
	public String getSnapshotId() {
		return snapshotId;
	}
	/// Setter for the private variable snapshotId
	/**
		@param snapshotId : snapshot id to be deleted(unique for each snapshot)
	*/
	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}
}