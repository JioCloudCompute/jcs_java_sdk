package com.jcs_java_sdk.compute_api.model;

import java.util.ArrayList;

public class DescribeInstancesRequest
{
	private ArrayList<String> instanceIds;
	
	public DescribeInstancesRequest(){}

	public ArrayList<String> getInstanceIds() {
		return instanceIds;
	}

	public void setInstanceIds(ArrayList<String> instanceIds) {
		this.instanceIds = instanceIds;
	}
}