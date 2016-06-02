package com.jcs_java_sdk.compute_api.model;

import java.util.*;

public class DescribeImagesRequest 
{
	private ArrayList<String>imageIds;
	
	public DescribeImagesRequest(){}
	
	public List<String> getImageIds() {
		return imageIds;
	}

	public void setImageIds(ArrayList<String> imageIds) {
		this.imageIds = imageIds;
	}
	
}
