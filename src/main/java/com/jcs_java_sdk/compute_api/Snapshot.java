package com.jcs_java_sdk.compute_api;

import java.util.TreeMap;

import com.jcs_java_sdk.HttpVar;
import com.jcs_java_sdk.Requestify;
import com.jcs_java_sdk.compute_api.model.CreateSnapshotRequest;
import com.jcs_java_sdk.compute_api.model.DeleteSnapshotRequest;
import com.jcs_java_sdk.compute_api.model.DescribeSnapshotsRequest;

public class Snapshot 
{
	public String describeSnapshots(HttpVar info, DescribeSnapshotsRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put("Action", "DescribeSnapshots");
		params.put("Version", info.version);
		
		if(!req.getSnapshotIds().isEmpty())
		{
			for(int i=0 ; i<req.getSnapshotIds().size() ; i++)
			{
				params.put("SnapshotId." + Integer.toString(i+1), req.getSnapshotIds().get(i));
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
	
	public String createSnapshot(HttpVar info, CreateSnapshotRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put("Action", "CreateSnapshot");
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
	
	public String deleteSnapshot(HttpVar info, DeleteSnapshotRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put("Action", "DeleteSnapshot");
		params.put("Version", info.version);
		
		if(req.getSnapshotId().length() == 0)
		{
			System.out.println("Error : SnapshotId required");
		}
		else
		{
			params.put("SnapshotId", req.getSnapshotId());
		}
		return Requestify.makeRequest(info, params);		
	}

}
