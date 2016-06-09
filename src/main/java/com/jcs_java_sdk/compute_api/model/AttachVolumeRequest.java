package com.jcs_java_sdk.compute_api.model;
/// Class to handle attach volume request
	/**
		This class manages the request for attach volume. User can create an object and and initialize the needed arguments.
	*/
public class AttachVolumeRequest {
	private String instanceId;
	private String volumeId;
	private String device;
	
	public AttachVolumeRequest()
	{
		instanceId = new String();
		volumeId = new String();
		device = new String();

	}
	/// Getter for the private variable instanceId
	/**
		@return string
	*/ 	
	public String getInstanceId() 
	{
		return instanceId;
	}
	/// Setter for the private variable instanceId 
	/**
		@param instanceId : instance id  with which volume will be attached(unique for each instance)
	*/
	public void setInstanceId(String instanceId) 
	{
		this.instanceId = instanceId;
	}
	/// Getter for the private variable volumeId 
	/**
		@return string
	*/
	public String getVolumeId() 
	{
		return volumeId;
	}
	/// Setter for the private variable volumeId
	/**
		@param volumeId : volume id which will be attached(unique for each volume)
	*/
	public void setVolumeId(String volumeId) 
	{
		this.volumeId = volumeId;
	}
	/// Getter for the private variable device 
	/**
		@return string
	*/
	public String getDevice() 
	{
		return device;
	}
	/// Setter for the private variable device 
	/**
		@param device : device where the volume will be attached(/dev/vdb, /dev/vdc)
	*/
	public void setDevice(String device) 
	{
		this.device = device;
	}
	

		
}
