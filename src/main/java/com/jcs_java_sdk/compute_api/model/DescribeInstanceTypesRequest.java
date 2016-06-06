package com.jcs_java_sdk.compute_api.model;

import java.util.ArrayList;

public class DescribeInstanceTypesRequest
{
	private ArrayList<String>instanceTypeIds;
	
	public DescribeInstanceTypesRequest()
	{
		instanceTypeIds = new ArrayList<String>();
	}

	public ArrayList<String> getInstanceTypeIds() {
		return instanceTypeIds;
	}

	public void setInstanceTypeIds(ArrayList<String> instanceTypeIds) {
		this.instanceTypeIds = instanceTypeIds;
	}
}