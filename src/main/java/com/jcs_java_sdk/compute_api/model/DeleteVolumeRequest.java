package com.jcs_java_sdk.compute_api.model;
/// Class to handle delete volume request
/**
	This class manages the request for delete volume. User can create an object and and initialize the needed arguments.
*/
public class DeleteVolumeRequest
{
	private String volumeId;
	
	public DeleteVolumeRequest()
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
		@param volumeId : volume id  to be deleted(unique for each volume)
	*/
	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
}