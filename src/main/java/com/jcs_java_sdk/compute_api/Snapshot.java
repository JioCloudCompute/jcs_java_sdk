/*******************************************************************************
 * Copyright (c) 2016 Jiocloud.com, Inc. or its affiliates.  All Rights Reserved
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, dis-
 * tribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the fol-
 * lowing conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABIL-
 * ITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT
 * SHALL THE AUTHOR BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 *******************************************************************************/
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
