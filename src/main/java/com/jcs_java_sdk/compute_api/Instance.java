package com.jcs_java_sdk.compute_api;

import java.util.TreeMap;

import com.jcs_java_sdk.HttpVar;
import com.jcs_java_sdk.Requestify;
import com.jcs_java_sdk.compute_api.model.DescribeInstanceTypesRequest;
import com.jcs_java_sdk.compute_api.model.DescribeInstancesRequest;
import com.jcs_java_sdk.compute_api.model.RebootInstancesRequest;
import com.jcs_java_sdk.compute_api.model.RunInstancesRequest;
import com.jcs_java_sdk.compute_api.model.StartInstancesRequest;
import com.jcs_java_sdk.compute_api.model.StopInstancesRequest;
import com.jcs_java_sdk.compute_api.model.TerminateInstancesRequest;
import com.jcs_java_sdk.compute_api.model.GetPasswordDataRequest;

public class Instance
{
	public String describeInstances(HttpVar info, DescribeInstancesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<>();
		params.put("Action", "DescribeInstances");
		params.put("Version", info.version);
		
		for(int i=0 ;  i<req.getInstanceIds().size() ; i++)
		{
			params.put("InstanceId." + Integer.toString(i+1), req.getInstanceIds().get(i));
		}
		
		return Requestify.makeRequest(info, params);
	}
	
	public String describeInstanceTypes(HttpVar info, DescribeInstanceTypesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<>();
		params.put("Action", "DescribeInstanceTypes");
		params.put("Version", info.version);
		
		for(int i=0 ;  i<req.getInstanceTypeIds().size() ; i++)
		{
			params.put("InstanceTypeId." + Integer.toString(i+1), req.getInstanceTypeIds().get(i));
		}
		
		return Requestify.makeRequest(info, params);
	}
	
	public String startInstances(HttpVar info, StartInstancesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<>();
		params.put("Action", "StartInstances");
		params.put("Version", info.version);
		if(req.getInstanceIds().size() == 0)
		{
			System.out.println("Error : Instance-Id needed");
		}
		else
		{
			for(int i=0 ;  i<req.getInstanceIds().size() ; i++)
			{
				params.put("InstanceId." + Integer.toString(i+1), req.getInstanceIds().get(i));
			}
		}
		
		return Requestify.makeRequest(info, params);
	}
	
	public String stopInstances(HttpVar info, StopInstancesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<>();
		params.put("Action", "StopInstances");
		params.put("Version", info.version);
		
		if(req.getInstanceIds().size() == 0)
		{
			System.out.println("Error : Instance-Id needed");
		}
		else
		{
			for(int i=0 ;  i<req.getInstanceIds().size() ; i++)
			{
				params.put("InstanceId." + Integer.toString(i+1), req.getInstanceIds().get(i));
			}
		}
		
		return Requestify.makeRequest(info, params);
	}	
	
	public String rebootInstances(HttpVar info, RebootInstancesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<>();
		params.put("Action", "RebootInstances");
		params.put("Version", info.version);
		
		if(req.getInstanceIds().size() == 0)
		{
			System.out.println("Error : Instance-Id needed");
		}
		else
		{
			for(int i=0 ;  i<req.getInstanceIds().size() ; i++)
			{
				params.put("InstanceId." + Integer.toString(i+1), req.getInstanceIds().get(i));
			}
		}
		
		return Requestify.makeRequest(info, params);
	}
	
	public String terminateInstances(HttpVar info, TerminateInstancesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<>();
		params.put("Action", "TerminateInstances");
		params.put("Version", info.version);
		
		if(req.getInstanceIds().size() == 0)
		{
			System.out.println("Error : Instance-Id needed");
		}
		else
		{
			for(int i=0 ;  i<req.getInstanceIds().size() ; i++)
			{
				params.put("InstanceId." + Integer.toString(i+1), req.getInstanceIds().get(i));
			}
		}
		
		return Requestify.makeRequest(info, params);
	}
	
	public String runInstances(HttpVar info, RunInstancesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<>();
		params.put("Action", "RunInstances");
		params.put("Version", info.version);
		
		if(req.getImageId().length() == 0)
		{
			System.out.println("Error : Image-Id needed");
		}
		else
		{
			params.put("ImageId", req.getImageId());
		}

		if(req.getInstanceTypeId().length() == 0)
		{
			System.out.println("Error : InstanceType-Id needed");
		}
		else
		{
			params.put("InstanceTypeId", req.getInstanceTypeId());
		}
		if(req.getBlockDeviceMapping().size() != 0)
		{
			for(int i=0 ; i<req.getBlockDeviceMapping().size() ; i++)
			{
				params.put("BlockDeviceMapping." + Integer.toString(i+1) + ".DeviceName", req.getBlockDeviceMapping().get(i).deviceName);
				params.put("BlockDeviceMapping." + Integer.toString(i+1) + ".DeleteOnTermination", Boolean.toString(req.getBlockDeviceMapping().get(i).deleteOnTermination));
				params.put("BlockDeviceMapping." + Integer.toString(i+1) + ".VolumeSize", Double.toString(req.getBlockDeviceMapping().get(i).volumeSize));
			}
		}
		if(req.getInstanceCount() != -1)
		{
			params.put("InstanceCount", Integer.toString(req.getInstanceCount()));
		}
		if(req.getSubnetId().length()!=0)
		{
			params.put("SubnetId", req.getSubnetId());
		}
		if(req.getPrivateIpAddress().length()!=0)
		{
			params.put("PrivateIpAddress", req.getPrivateIpAddress());
		}
		if(!req.getSecurityGroupIds().isEmpty())
		{
			for(int i=0 ;  i<req.getSecurityGroupIds().size() ; i++)
			{
				params.put("SecurityGroupId." + Integer.toString(i+1), req.getSecurityGroupIds().get(i));
			}
		}
		
		if(req.getKeyName().length()!=0)
		{
			params.put("KeyName", req.getKeyName());
		}
		
		return Requestify.makeRequest(info, params);
	}
	
	public String getPasswordData(HttpVar info, GetPasswordDataRequest req)
	{
		TreeMap<String, String>params = new TreeMap<>();
		params.put("Action", "GetPasswordData");
		params.put("Version", info.version);
		
		if(req.getInstanceId().length() == 0)
		{
			System.out.println("Instance-Id required");
		}
		else
		{
			params.put("InstanceId", req.getInstanceId());
		}
		return Requestify.makeRequest(info, params);
	}
}
