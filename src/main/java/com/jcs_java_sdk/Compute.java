package com.jcs_java_sdk;

import com.jcs_java_sdk.compute_api.Image;
import com.jcs_java_sdk.compute_api.model.DescribeImagesRequest;

public class Compute 
{
	private HttpVar info = new HttpVar();
	private Image image = new Image();
	
	public Compute()
	{
		info.url = Config.getServiceUrl();
		info.verb = "GET";
		info.headers = "";
		info.version = "2016-03-01";
	}
	public String describeImages(DescribeImagesRequest req)
	{
		return image.describeImages(info, req);
	}
	

}
