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
import com.ril.jcs.services.compute.model.AttachVolumeRequest;
import com.ril.jcs.services.compute.model.CreateVolumeRequest;
import com.ril.jcs.services.compute.model.DeleteVolumeRequest;
import com.ril.jcs.services.compute.model.DescribeVolumesRequest;
import com.ril.jcs.services.compute.model.DetachVolumeRequest;
import com.ril.jcs.services.compute.model.ShowDeleteOnTerminationFlagRequest;
import com.ril.jcs.services.compute.model.UpdateDeleteOnTerminationFlagRequest;

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
