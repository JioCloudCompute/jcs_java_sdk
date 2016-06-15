package com.jcs_java_sdk.compute_api;

import java.util.TreeMap;

import com.jcs_java_sdk.HttpVar;
import com.jcs_java_sdk.Requestify;
import com.jcs_java_sdk.compute_api.model.DescribeImagesRequest;

public class Image 
{
	public String describeImages(HttpVar info, DescribeImagesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put("Action", "DescribeImages");
		params.put("Version", info.version);
		for(int i=0 ;  i<req.getImageIds().size() ; i++)
		{
			params.put("ImageId." + Integer.toString(i+1), req.getImageIds().get(i));
		}
		return Requestify.makeRequest(info, params);
	}
}
