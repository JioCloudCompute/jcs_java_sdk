package com.jcs_java_sdk.compute_api.model;
/// Class to handle detach volume request
/**
	This class manages the request for detach volume. User can create an object and and initialize the needed arguments.
*/
public class DetachVolumeRequest
{
	private String instanceId;
	private String volumeId;
	
	/// Constructor
	public DetachVolumeRequest()
	{
		instanceId = new String();
		volumeId = new String();
	}
	/// Getter for the private variable instanceId
	/**
		@return string
	*/
	public String getInstanceId() {
		return instanceId;
	}
	/// Setter for the private variable instanceId
	/**
		@param instanceId (optional): instance id (unique for each instance)
	*/
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
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
		@param volumeId : volume id (unique for each volume)
	*/
	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	
	
}