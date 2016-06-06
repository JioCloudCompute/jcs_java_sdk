package com.jcs_java_sdk.compute_api.model;

import java.util.ArrayList;

public class StartInstancesRequest
{
	private ArrayList<String>instanceIds;
	
	public StartInstancesRequest()
	{
		instanceIds = new ArrayList<String>();
	}

	public ArrayList<String> getInstanceIds() {
		return instanceIds;
	}

	public void setInstanceIds(ArrayList<String> instanceIds) {
		this.instanceIds = instanceIds;
	}
}