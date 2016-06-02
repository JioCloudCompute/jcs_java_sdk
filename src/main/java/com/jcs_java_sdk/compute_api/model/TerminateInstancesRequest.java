package com.jcs_java_sdk.compute_api.model;

import java.util.ArrayList;

public class TerminateInstancesRequest
{
	private ArrayList<String>instnaceIds;
	
	public TerminateInstancesRequest(){}

	public ArrayList<String> getInstnaceIds() {
		return instnaceIds;
	}

	public void setInstnaceIds(ArrayList<String> instnaceIds) {
		this.instnaceIds = instnaceIds;
	}
}
