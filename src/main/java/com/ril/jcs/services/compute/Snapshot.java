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
package com.ril.jcs.services.compute;

import java.util.TreeMap;

import com.ril.jcs.services.HttpVar;
import com.ril.jcs.services.Requestify;
import com.ril.jcs.services.compute.model.CreateSnapshotRequest;
import com.ril.jcs.services.compute.model.DeleteSnapshotRequest;
import com.ril.jcs.services.compute.model.DescribeSnapshotsRequest;

public class Snapshot 
{
	public String describeSnapshots(HttpVar info, DescribeSnapshotsRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.DESCRIBE_SNAPSHOTS);
		params.put(Constants.VERSION, info.version);
		
		if(!req.getSnapshotIds().isEmpty())
		{
			for(int i=0 ; i<req.getSnapshotIds().size() ; i++)
			{
				params.put(Constants.SNAPSHOT_ID + "." + Integer.toString(i+1), req.getSnapshotIds().get(i));
			}
		}
		
		if(req.getMaxResults() != -1)	
		{
			params.put(Constants.MAX_RESULTS, Integer.toString(req.getMaxResults()));
		}

		if(req.getNextToken().length() != 0)
		{
			params.put(Constants.NEXT_TOKEN, req.getNextToken());
		}
		
		if(!req.isDetail())
		{
			params.put(Constants.DETAIL, Boolean.toString(req.isDetail()));
		}
		return Requestify.makeRequest(info, params);
	}
	
	public String createSnapshot(HttpVar info, CreateSnapshotRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.CREATE_SNAPSHOT);
		params.put(Constants.VERSION, info.version);
		
		if(req.getVolumeId().length() == 0)
		{
			System.out.println("Error : VolumeId required");
		}
		else
		{
			params.put(Constants.VOLUME_ID, req.getVolumeId());
		}
		return Requestify.makeRequest(info, params);		
	}
	
	public String deleteSnapshot(HttpVar info, DeleteSnapshotRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.DELETE_SNAPSHOT);
		params.put(Constants.VERSION, info.version);
		
		if(req.getSnapshotId().length() == 0)
		{
			System.out.println("Error : SnapshotId required");
		}
		else
		{
			params.put(Constants.SNAPSHOT_ID, req.getSnapshotId());
		}
		return Requestify.makeRequest(info, params);		
	}

}
