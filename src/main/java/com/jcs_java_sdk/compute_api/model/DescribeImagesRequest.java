package com.jcs_java_sdk.compute_api.model;

import java.util.*;
/// Class to handle describe images request
/**
	This class manages the request for describe images. User can create an object and and initialize the needed arguments.
*/
public class DescribeImagesRequest 
{
	private ArrayList<String>imageIds;
	
	/// Constructor
	public DescribeImagesRequest()
	{
		imageIds = new ArrayList<String>();
	}
	/// Getter for the private variable imageIds
	/**
		@return ArrayList<String>
	*/
	public List<String> getImageIds() {
		return imageIds;
	}
	/// Setter for the private variable imageIds
	/**
		@param imageIds (optional) : Array of image ids for which description is needed
	*/
	public void setImageIds(ArrayList<String> imageIds) {
		this.imageIds = imageIds;
	}
	
}
