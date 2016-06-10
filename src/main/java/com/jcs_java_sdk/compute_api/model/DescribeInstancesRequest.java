package com.jcs_java_sdk.compute_api.model;

import java.util.ArrayList;
/// Class to handle describe instances request
/**
	This class manages the request for describe instances. User can create an object and and initialize the needed arguments.
*/
public class DescribeInstancesRequest
{
	private ArrayList<String> instanceIds;
	
	/// Constructor
	public DescribeInstancesRequest()
	{
		instanceIds = new ArrayList<String>();
	}
	/// Getter for the private variable instanceIds
	/**
		@return ArrayList<String>
	*/
	public ArrayList<String> getInstanceIds() {
		return instanceIds;
	}
	/// Setter for the private variable instanceIds
	/**
		@param instanceIds (optional) : Array of instance ids
	*/
	public void setInstanceIds(ArrayList<String> instanceIds) {
		this.instanceIds = instanceIds;
	}
}