package com.jcs_java_sdk.compute_api.model;

import java.util.ArrayList;

public class TerminateInstancesRequest
{
	private ArrayList<String>instanceIds;
	
	public TerminateInstancesRequest(){}

	public ArrayList<String> getInstanceIds() {
		return instanceIds;
	}

	public void setInstnaceIds(ArrayList<String> instanceIds) {
		this.instanceIds = instanceIds;
	}
}
