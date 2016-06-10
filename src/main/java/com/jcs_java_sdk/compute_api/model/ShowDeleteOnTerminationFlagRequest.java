package com.jcs_java_sdk.compute_api.model;
/// Class to handle show delete on termination flag request
/**
	This class manages the request for show delete on termination flag. User can create an object and and initialize the needed arguments.
*/
public class ShowDeleteOnTerminationFlagRequest
{
	private String volumeId;
	
	///Constructor
	public ShowDeleteOnTerminationFlagRequest()
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
		@param volumeId : volume id(unique for each volume)
	*/
	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
