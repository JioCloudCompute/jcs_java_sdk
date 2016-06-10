package com.jcs_java_sdk.compute_api.model;
/// Class to handle create snaphot request
/**
	This class manages the request for create snaphot. User can create an object and and initialize the needed arguments.
*/
public class CreateSnapshotRequest
{
	private String volumeId;
	/// finalructor	
	public CreateSnapshotRequest()
	{
		volumeId = new String();
	}
	/// Getter for the private variable volumeId
	/**
		@return string
	*/
	public String getVolumeId() {
		return volumeId;
	}
	/// Setter for the private variable volumeId
	/**
		@param volumeId : volume id of the volume for which snapshot will be created(unique for each volume)
	*/
	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	
	
}