package com.jcs_java_sdk.compute_api.model;

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
	
	public String getInstanceId() 
	{
		return instanceId;
	}
	public void setInstanceId(String instanceId) 
	{
		this.instanceId = instanceId;
	}
	public String getVolumeId() 
	{
		return volumeId;
	}
	public void setVolumeId(String volumeId) 
	{
		this.volumeId = volumeId;
	}
	public String getDevice() 
	{
		return device;
	}
	public void setDevice(String device) 
	{
		this.device = device;
	}
	

		
}
