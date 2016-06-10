package com.jcs_java_sdk.compute_api.model;

import java.util.ArrayList;
/// Class to handle describe instance types request
/**
	This class manages the request for describe instance types. User can create an object and and initialize the needed arguments.
*/
public class DescribeInstanceTypesRequest
{
	private ArrayList<String>instanceTypeIds;
	
	/// Constructor
	public DescribeInstanceTypesRequest()
	{
		instanceTypeIds = new ArrayList<String>();
	}
	/// Getter for the private variable instanceTypeIds
	/**
		@return ArrayList<String>
	*/
	public ArrayList<String> getInstanceTypeIds() {
		return instanceTypeIds;
	}
	/// Setter for the private variable instanceTypeIds
	/**
		@param instanceTypeIds (optional) : Array of instance type ids
	*/
	public void setInstanceTypeIds(ArrayList<String> instanceTypeIds) {
		this.instanceTypeIds = instanceTypeIds;
	}
}