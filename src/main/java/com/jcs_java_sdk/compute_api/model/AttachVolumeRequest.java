package com.jcs_java_sdk.compute_api.model;

public class AttachVolumeRequest {
	private String instanceId;
	private String VolumeId;
	private String Device;
	
	public AttachVolumeRequest(){}
	
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
		return VolumeId;
	}
	public void setVolumeId(String volumeId) 
	{
		VolumeId = volumeId;
	}
	public String getDevice() 
	{
		return Device;
	}
	public void setDevice(String device) 
	{
		Device = device;
	}
	

		
}
