package com.jcs_java_sdk.compute_api.model;
/// Class to handle create volume request
/**
	This class manages the request for create volume. User can create an object and and initialize the needed arguments.
*/
public class CreateVolumeRequest
{
	private String snapshotId;
	private int size;

	/// Constructor	
	public CreateVolumeRequest()
	{
		snapshotId = new String();
		size = -1;
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
		@param snapshotId (optional) : snapshot id to create volume similar to the volume from which snapshot is created(unique for each snapshot). Not necessary if size is given
	*/
	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}
	/// Getter for the private variable size
	/**
		@return string
	*/
	public int getSize() {
		return size;
	}
	/// Setter for the private variable size
	/**
		@param size(optional) : size of the volume. Not necessary if snapshot id is given
	*/
	public void setSize(int size) {
		this.size = size;
	}
	
	
}