package com.jcs_java_sdk.compute_api;

import java.util.TreeMap;

import com.jcs_java_sdk.HttpVar;
import com.jcs_java_sdk.Requestify;
import com.jcs_java_sdk.compute_api.model.AttachVolumeRequest;
import com.jcs_java_sdk.compute_api.model.CreateVolumeRequest;
import com.jcs_java_sdk.compute_api.model.DeleteVolumeRequest;
import com.jcs_java_sdk.compute_api.model.DescribeVolumesRequest;
import com.jcs_java_sdk.compute_api.model.DetachVolumeRequest;
import com.jcs_java_sdk.compute_api.model.ShowDeleteOnTerminationFlagRequest;
import com.jcs_java_sdk.compute_api.model.UpdateDeleteOnTerminationFlagRequest;

public class Volume
{
	public String describeVolumes(HttpVar info, DescribeVolumesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put("Action", "DescribeVolumes");
		params.put("Version", info.version);
		
		if(!req.getVolumeIds().isEmpty())
		{
			for(int i=0 ; i<req.getVolumeIds().size() ; i++)
			{
				params.put("VolumeId." + Integer.toString(i+1), req.getVolumeIds().get(i));
			}
		}
		
		if(req.getMaxResults() != -1)
		{
			params.put("MaxResults", Integer.toString(req.getMaxResults()));
		}

		if(req.getNextToken().length() != 0)
		{
			params.put("NextToken", req.getNextToken());
		}
		
		if(!req.isDetail())
		{
			params.put("Detail", Boolean.toString(req.isDetail()));
		}
		return Requestify.makeRequest(info, params);
	}
	
	public String createVolume(HttpVar info, CreateVolumeRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put("Action", "CreateVolume");
		params.put("Version", info.version);
		
		if(req.getSize() == -1 && req.getSnapshotId().length() == 0)
		{
			System.out.println("Parameters missing, Atleast one of size or snapshot id is needed");
		}
		if(req.getSnapshotId().length() != 0)
		{
			params.put("SnapshotId", req.getSnapshotId());
		}
		if(req.getSize() != -1)
		{
			params.put("Size", Integer.toString(req.getSize()));
		}
		
		return Requestify.makeRequest(info, params);		
	}
	
	public String deleteVolume(HttpVar info, DeleteVolumeRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put("Action", "DeleteVolume");
		params.put("Version", info.version);
		
		if(req.getVolumeId().length() == 0)
		{
			System.out.println("Error : VolumeId required");
		}
		else
		{
			params.put("VolumeId", req.getVolumeId());
		}
		return Requestify.makeRequest(info, params);		
	}
	
	
	public String attachVolume(HttpVar info, AttachVolumeRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put("Action", "AttachVolume");
		params.put("Version", info.version);
		System.out.println("ac");
		if(req.getInstanceId().length() == 0)
		{
			System.out.println("Error : InstanceId required");
		}
		else
		{
			params.put("InstanceId", req.getInstanceId());
		}
		if(req.getDevice().length() == 0)
		{
			System.out.println("Error : Device required");
		}
		else
		{
			params.put("Device", req.getDevice());
		}
		if(req.getVolumeId().length() == 0)
		{
			System.out.println("Error : VolumeId required");
		}
		else
		{
			params.put("VolumeId", req.getVolumeId());
		}
		return Requestify.makeRequest(info, params);		
	}
	

	
	public String detachVolume(HttpVar info, DetachVolumeRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put("Action", "DetachVolume");
		params.put("Version", info.version);

		if(req.getInstanceId().length() != 0)
		{
			params.put("InstanceId", req.getInstanceId());
		}
		if(req.getVolumeId().length() == 0)
		{
			System.out.println("Error : VolumeId required");
		}
		else
		{
			params.put("VolumeId", req.getVolumeId());
		}
		return Requestify.makeRequest(info, params);		
	}

	public String showDeleteOnTerminationFlag(HttpVar info, ShowDeleteOnTerminationFlagRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put("Action", "ShowDeleteOnTerminationFlag");
		params.put("Version", info.version);
		
		if(req.getVolumeId().length() == 0)
		{
			System.out.println("Error : VolumeId required");
		}
		else
		{
			params.put("VolumeId", req.getVolumeId());
		}
		return Requestify.makeRequest(info, params);		
	}
	
	public String updateDeleteOnTerminationFlag(HttpVar info, UpdateDeleteOnTerminationFlagRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put("Action", "UpdateDeleteOnTerminationFlag");
		params.put("Version", info.version);
		
		if(req.getVolumeId().length() == 0)
		{
			System.out.println("Error : VolumeId required");
		}
		else
		{
			params.put("VolumeId", req.getVolumeId());
		}
		
		params.put("DeleteOnTermination", Boolean.toString(req.isDeleteOnTermination()));
		
		return Requestify.makeRequest(info, params);		
	}
}
