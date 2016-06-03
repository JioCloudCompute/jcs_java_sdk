package com.jcs_java_sdk.compute_api.model;

public class AttachVolumeResponse {
	String requestID;
	String deviceName;
	String instanceId;
	boolean deleteOnTermination;
	String status;
	String volumeId;
	
	public AttachVolumeResponse(final String xmlDoc)
	{
		
	}
}
