package com.jcs_java_sdk.compute_api.model;

import java.util.ArrayList;

public class StopInstancesRequest
{
	private ArrayList<String>instanceIds;
	
	public StopInstancesRequest(){}

	public ArrayList<String> getInstanceIds() {
		return instanceIds;
	}

	public void setInstanceIds(ArrayList<String> instanceIds) {
		this.instanceIds = instanceIds;
	}
}