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
import com.ril.jcs.services.compute.exception.ComputeClientException;
import com.ril.jcs.services.compute.model.AttachVolumeRequest;
import com.ril.jcs.services.compute.model.CreateVolumeRequest;
import com.ril.jcs.services.compute.model.DeleteVolumeRequest;
import com.ril.jcs.services.compute.model.DescribeVolumesRequest;
import com.ril.jcs.services.compute.model.DetachVolumeRequest;
import com.ril.jcs.services.compute.model.ShowDeleteOnTerminationFlagRequest;
import com.ril.jcs.services.compute.model.UpdateDeleteOnTerminationFlagRequest;

public class Volume
{
	public String describeVolumes(HttpVar info, DescribeVolumesRequest req) throws ComputeClientException
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.DESCRIBE_VOLUMES);
		params.put(Constants.VERSION, info.version);
		
		if(!req.getVolumeIds().isEmpty())
		{
			for(int i=0 ; i<req.getVolumeIds().size() ; i++)
			{
				params.put(Constants.VOLUME_ID + "." + Integer.toString(i+1), req.getVolumeIds().get(i));
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
	
	public String createVolume(HttpVar info, CreateVolumeRequest req) throws ComputeClientException
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.CREATE_VOLUME);
		params.put(Constants.VERSION, info.version);
		
		if(req.getSize() == -1 && req.getSnapshotId().length() == 0)
		{
			System.out.println("Parameters missing, Atleast one of size or snapshot id is needed");
		}
		if(req.getSnapshotId().length() != 0)
		{
			params.put(Constants.SNAPSHOT_ID, req.getSnapshotId());
		}
		if(req.getSize() != -1)
		{
			params.put(Constants.SIZE, Integer.toString(req.getSize()));
		}
		
		return Requestify.makeRequest(info, params);		
	}
	
	public String deleteVolume(HttpVar info, DeleteVolumeRequest req) throws ComputeClientException
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.DELETE_VOLUME);
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
	
	
	public String attachVolume(HttpVar info, AttachVolumeRequest req) throws ComputeClientException
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.ATTACH_VOLUME);
		params.put(Constants.VERSION, info.version);
		if(req.getInstanceId().length() == 0)
		{
			System.out.println("Error : InstanceId required");
		}
		else
		{
			params.put(Constants.INSTANCE_ID, req.getInstanceId());
		}
		if(req.getDevice().length() == 0)
		{
			System.out.println("Error : Device required");
		}
		else
		{
			params.put(Constants.DEVICE, req.getDevice());
		}
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
	

	
	public String detachVolume(HttpVar info, DetachVolumeRequest req) throws ComputeClientException
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.DETACH_VOLUME);
		params.put(Constants.VERSION, info.version);

		if(req.getInstanceId().length() != 0)
		{
			params.put(Constants.INSTANCE_ID, req.getInstanceId());
		}
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

	public String showDeleteOnTerminationFlag(HttpVar info, ShowDeleteOnTerminationFlagRequest req) throws ComputeClientException
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.SHOW_DELETE_ON_TERMINATION_FLAG);
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
	
	public String updateDeleteOnTerminationFlag(HttpVar info, UpdateDeleteOnTerminationFlagRequest req) throws ComputeClientException
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.UPDATE_DELETE_ON_TERMINATION_FLAG);
		params.put(Constants.VERSION, info.version);
		
		if(req.getVolumeId().length() == 0)
		{
			System.out.println("Error : VolumeId required");
		}
		else
		{
			params.put(Constants.VOLUME_ID, req.getVolumeId());
		}
		
		params.put(Constants.DELETE_ON_TERMINATION, Boolean.toString(req.isDeleteOnTermination()));
		
		return Requestify.makeRequest(info, params);		
	}
}
