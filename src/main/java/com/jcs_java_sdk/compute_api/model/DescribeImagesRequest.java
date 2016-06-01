package com.jcs_java_sdk.compute_api.model;

import java.util.*;

public class DescribeImagesRequest 
{
	private List<String>imageIds;
	
	public DescribeImagesRequest(){}
	
	public List<String> getImageIds() {
		return imageIds;
	}

	public void setImageIds(List<String> imageIds) {
		this.imageIds = imageIds;
	}
	
}
