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
package com.ril.jcs.services;

import java.io.IOException;
import java.security.Security;

import com.ril.jcs.services.compute.Image;
import com.ril.jcs.services.compute.Instance;
import com.ril.jcs.services.compute.KeyPair;
import com.ril.jcs.services.compute.Snapshot;
import com.ril.jcs.services.compute.Volume;
import com.ril.jcs.services.compute.model.AttachVolumeRequest;
import com.ril.jcs.services.compute.model.AttachVolumeResponse;
import com.ril.jcs.services.compute.model.CreateKeyPairRequest;
import com.ril.jcs.services.compute.model.CreateKeyPairResponse;
import com.ril.jcs.services.compute.model.CreateSnapshotRequest;
import com.ril.jcs.services.compute.model.CreateSnapshotResponse;
import com.ril.jcs.services.compute.model.CreateVolumeRequest;
import com.ril.jcs.services.compute.model.CreateVolumeResponse;
import com.ril.jcs.services.compute.model.DeleteKeyPairRequest;
import com.ril.jcs.services.compute.model.DeleteKeyPairResponse;
import com.ril.jcs.services.compute.model.DeleteSnapshotRequest;
import com.ril.jcs.services.compute.model.DeleteSnapshotResponse;
import com.ril.jcs.services.compute.model.DeleteVolumeRequest;
import com.ril.jcs.services.compute.model.DeleteVolumeResponse;
import com.ril.jcs.services.compute.model.DescribeImagesRequest;
import com.ril.jcs.services.compute.model.DescribeImagesResponse;
import com.ril.jcs.services.compute.model.DescribeInstanceTypesRequest;
import com.ril.jcs.services.compute.model.DescribeInstanceTypesResponse;
import com.ril.jcs.services.compute.model.DescribeInstancesRequest;
import com.ril.jcs.services.compute.model.DescribeInstancesResponse;
import com.ril.jcs.services.compute.model.DescribeKeyPairsResponse;
import com.ril.jcs.services.compute.model.DescribeSnapshotsRequest;
import com.ril.jcs.services.compute.model.DescribeSnapshotsResponse;
import com.ril.jcs.services.compute.model.DescribeVolumesRequest;
import com.ril.jcs.services.compute.model.DescribeVolumesResponse;
import com.ril.jcs.services.compute.model.DetachVolumeRequest;
import com.ril.jcs.services.compute.model.DetachVolumeResponse;
import com.ril.jcs.services.compute.model.GetPasswordDataRequest;
import com.ril.jcs.services.compute.model.GetPasswordDataResponse;
import com.ril.jcs.services.compute.model.ImportKeyPairRequest;
import com.ril.jcs.services.compute.model.ImportKeyPairResponse;
import com.ril.jcs.services.compute.model.RebootInstancesRequest;
import com.ril.jcs.services.compute.model.RebootInstancesResponse;
import com.ril.jcs.services.compute.model.RunInstancesRequest;
import com.ril.jcs.services.compute.model.RunInstancesResponse;
import com.ril.jcs.services.compute.model.ShowDeleteOnTerminationFlagRequest;
import com.ril.jcs.services.compute.model.ShowDeleteOnTerminationFlagResponse;
import com.ril.jcs.services.compute.model.StartInstancesRequest;
import com.ril.jcs.services.compute.model.StartInstancesResponse;
import com.ril.jcs.services.compute.model.StopInstancesRequest;
import com.ril.jcs.services.compute.model.StopInstancesResponse;
import com.ril.jcs.services.compute.model.TerminateInstancesRequest;
import com.ril.jcs.services.compute.model.TerminateInstancesResponse;
import com.ril.jcs.services.compute.model.UpdateDeleteOnTerminationFlagRequest;
import com.ril.jcs.services.compute.model.UpdateDeleteOnTerminationFlagResponse;
import com.ril.jcs.services.compute.model.transform.AttachVolumeUnmarshaller;
import com.ril.jcs.services.compute.model.transform.CreateKeyPairUnmarshaller;
import com.ril.jcs.services.compute.model.transform.CreateSnapshotUnmarshaller;
import com.ril.jcs.services.compute.model.transform.CreateVolumeUnmarshaller;
import com.ril.jcs.services.compute.model.transform.DeleteKeyPairUnmarshaller;
import com.ril.jcs.services.compute.model.transform.DeleteSnapshotUnmarshaller;
import com.ril.jcs.services.compute.model.transform.DeleteVolumeUnmarshaller;
import com.ril.jcs.services.compute.model.transform.DescribeImagesUnmarshaller;
import com.ril.jcs.services.compute.model.transform.DescribeInstanceTypesUnmarshaller;
import com.ril.jcs.services.compute.model.transform.DescribeInstancesUnmarshaller;
import com.ril.jcs.services.compute.model.transform.DescribeKeyPairsUnmarshaller;
import com.ril.jcs.services.compute.model.transform.DescribeSnapshotsUnmarshaller;
import com.ril.jcs.services.compute.model.transform.DescribeVolumesUnmarshaller;
import com.ril.jcs.services.compute.model.transform.DetachVolumeUnmarshaller;
import com.ril.jcs.services.compute.model.transform.GetPasswordDataUnmarshaller;
import com.ril.jcs.services.compute.model.transform.ImportKeyPairUnmarshaller;
import com.ril.jcs.services.compute.model.transform.RebootInstancesUnmarshaller;
import com.ril.jcs.services.compute.model.transform.RunInstancesUnmarshaller;
import com.ril.jcs.services.compute.model.transform.ShowDeleteOnTerminationFlagUnmarshaller;
import com.ril.jcs.services.compute.model.transform.StartInstancesUnmarshaller;
import com.ril.jcs.services.compute.model.transform.StopInstancesUnmarshaller;
import com.ril.jcs.services.compute.model.transform.TerminateInstancesUnmarshaller;
import com.ril.jcs.services.compute.model.transform.UpdateDeleteOnTerminationFlagUnmarshaller;

public class Compute 
{
	private HttpVar info;
	private Image image;
	private Instance instance;
	private KeyPair keyPair;
	private Snapshot snapshot;
	private Volume volume;
	public Compute()
	{
		info = new HttpVar();
		image = new Image();
		instance = new Instance();
		keyPair = new KeyPair();
		snapshot = new Snapshot();
		volume = new Volume();
		try 
		{
			new Config();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		info.url = Config.getServiceUrl("compute");
		info.verb = "GET";
		info.headers = "";
		info.version = "2016-03-01";
		
	}
	public DescribeImagesResponse describeImages(DescribeImagesRequest req) 
	{
		String response =  image.describeImages(info, req);
		if(response != null)
		{
			return DescribeImagesUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public DescribeInstancesResponse describeInstances(DescribeInstancesRequest req) 
	{
		String response =  instance.describeInstances(info, req);
		if(response != null)
		{
			return DescribeInstancesUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest req) 
	{
		String response =  instance.describeInstanceTypes(info, req);
		if(response != null)
		{
			return DescribeInstanceTypesUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public StartInstancesResponse startInstances(StartInstancesRequest req) 
	{
		String response =  instance.startInstances(info, req);
		if(response != null)
		{
			return StartInstancesUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public StopInstancesResponse stopInstances(StopInstancesRequest req) 
	{
		String response =  instance.stopInstances(info, req);
		if(response != null)
		{
			return StopInstancesUnmarshaller.XMLObject(response);
		}
		return null;
	}

	public RebootInstancesResponse rebootInstances(RebootInstancesRequest req) 
	{
		String response =  instance.rebootInstances(info, req);
		if(response != null)
		{
			return RebootInstancesUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public TerminateInstancesResponse terminateInstances(TerminateInstancesRequest req) 
	{
		String response =  instance.terminateInstances(info, req);
		if(response != null)
		{
			return TerminateInstancesUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public RunInstancesResponse runInstances(RunInstancesRequest req) 
	{
		String response =  instance.runInstances(info, req);
		if(response != null)
		{
			return RunInstancesUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public GetPasswordDataResponse getPasswordData(GetPasswordDataRequest req)
	{
		String response = instance.getPasswordData(info, req);
		if(response != null)
		{
			GetPasswordDataResponse res =  GetPasswordDataUnmarshaller.XMLObject(response);
			res.setData((instance.decryptInstancePassword(res.getPasswordData(),req.getPrivateKeyFile(), req.getPassphrase())));
			return res;
		}
		return null;
	}

	public CreateVolumeResponse createVolume(CreateVolumeRequest req) 
	{
		String response =  volume.createVolume(info, req);
		if(response != null)
		{
			return CreateVolumeUnmarshaller.XMLObject(response);
		}
		return null;
	}

	public DeleteVolumeResponse deleteVolume(DeleteVolumeRequest req) 
	{
		String response =  volume.deleteVolume(info, req);
		if(response != null)
		{
			return DeleteVolumeUnmarshaller.XMLObject(response);
		}
		return null;
	}

	public AttachVolumeResponse attachVolume(AttachVolumeRequest req) 
	{
		String response =  volume.attachVolume(info, req);
		if(response != null)
		{
			return AttachVolumeUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public DetachVolumeResponse detachVolume(DetachVolumeRequest req) 
	{
		String response =  volume.detachVolume(info, req);
		if(response != null)
		{
			return DetachVolumeUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public DescribeVolumesResponse describeVolumes(DescribeVolumesRequest req) 
	{
		String response =  volume.describeVolumes(info, req);
		if(response != null)
		{
			return DescribeVolumesUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public ShowDeleteOnTerminationFlagResponse showDeleteOnTerminationFlag(ShowDeleteOnTerminationFlagRequest req) 
	{
		String response =  volume.showDeleteOnTerminationFlag(info, req);
		if(response != null)
		{
			return ShowDeleteOnTerminationFlagUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public UpdateDeleteOnTerminationFlagResponse updateDeleteOnTerminationFlag(UpdateDeleteOnTerminationFlagRequest req) 
	{
		String response =  volume.updateDeleteOnTerminationFlag(info, req);
		if(response != null)
		{
			return UpdateDeleteOnTerminationFlagUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest req) 
	{
		String response =  snapshot.createSnapshot(info, req);
		if(response != null)
		{
			return CreateSnapshotUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest req) 
	{
		String response =  snapshot.deleteSnapshot(info, req);
		if(response != null)
		{
			return DeleteSnapshotUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest req) 
	{
		String response =  snapshot.describeSnapshots(info, req);
		if(response != null)
		{
			return DescribeSnapshotsUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public CreateKeyPairResponse createKeyPair(CreateKeyPairRequest req) 
	{
		String response =  keyPair.createKeyPair(info, req);
		if(response != null)
		{
			return CreateKeyPairUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public DeleteKeyPairResponse deleteKeyPair(DeleteKeyPairRequest req) 
	{
		String response =  keyPair.deleteKeyPair(info, req);
		if(response != null)
		{
			return DeleteKeyPairUnmarshaller.XMLObject(response);
		}
		return null;
	}
	
	public DescribeKeyPairsResponse describeKeyPairs() 
	{
		String response =  keyPair.describeKeyPairs(info);
		if(response != null)
		{
			return DescribeKeyPairsUnmarshaller.XMLObject(response);
		}
		return null;
	}

	public ImportKeyPairResponse importKeyPair(ImportKeyPairRequest req) 
	{
		String response =  keyPair.importKeyPair(info, req);
		if(response != null)
		{
			return ImportKeyPairUnmarshaller.XMLObject(response);
		}
		return null;
	}

}
