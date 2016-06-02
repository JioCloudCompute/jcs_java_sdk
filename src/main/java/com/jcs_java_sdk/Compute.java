package com.jcs_java_sdk;

import java.io.IOException;

import com.jcs_java_sdk.compute_api.Image;
import com.jcs_java_sdk.compute_api.model.DescribeImagesRequest;

public class Compute 
{
	private HttpVar info;
	private Image image;
	private Config config;
	
	public Compute()
	{
		info = new HttpVar();
		image = new Image();
		try 
		{
			config = new Config();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		info.url = config.getServiceUrl("compute");
		info.verb = "GET";
		info.headers = "";
		info.version = "2016-03-01";
	}
	public String describeImages(DescribeImagesRequest req) 
	{
		return image.describeImages(info, req);
	}
	

}
