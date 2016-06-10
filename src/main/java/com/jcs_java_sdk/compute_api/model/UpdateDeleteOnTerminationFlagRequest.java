package com.jcs_java_sdk.compute_api.model;
/// Class to handle update delete on termination flag request
/**
	This class manages the request for update delete on termination flag. User can create an object and and initialize the needed arguments.
*/
public class UpdateDeleteOnTerminationFlagRequest 
{
	private String volumeId;
	private boolean deleteOnTermination;
	
	///Constructor
	public UpdateDeleteOnTerminationFlagRequest()
	{
		volumeId = new String();
		deleteOnTermination = false;
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
		@param volumeId : Particular volume id to be updated for DeleteOnTermination flag.
	*/
	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	/// Getter for the private variable deleteOnTermination
	/**
		@return bool
	*/
	public boolean isDeleteOnTermination() {
		return deleteOnTermination;
	}
	/// Setter for the private variable deleteOnTermination
	/**
		@param deleteOnTermination : Boolean value for the DeleteOnTermination flag 
	*/
	public void setDeleteOnTermination(boolean deleteOnTermination) {
		this.deleteOnTermination = deleteOnTermination;
	}
}
