package com.jcs_java_sdk.compute_api;

import java.util.TreeMap;

import com.jcs_java_sdk.HttpVar;
import com.jcs_java_sdk.Requestify;
import com.jcs_java_sdk.compute_api.model.DescribeInstancesRequest;

public class Instance
{
	public String describeInstances(HttpVar info, DescribeInstancesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<>();
		params.put("Action", "DescribeInstances");
		params.put("Version", info.version);
		
		for(int i=0 ;  i<req.getInstanceIds().size() ; i++)
		{
			params.put("ImageId." + Integer.toString(i+1), req.getInstanceIds().get(i));
		}
		
		return Requestify.makeRequest(info, params);
	}
}
