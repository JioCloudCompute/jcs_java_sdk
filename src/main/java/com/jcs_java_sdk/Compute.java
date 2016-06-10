package com.jcs_java_sdk;

import java.io.IOException;

import com.jcs_java_sdk.compute_api.Image;
import com.jcs_java_sdk.compute_api.Instance;
import com.jcs_java_sdk.compute_api.KeyPair;
import com.jcs_java_sdk.compute_api.Snapshot;
import com.jcs_java_sdk.compute_api.Volume;
import com.jcs_java_sdk.compute_api.model.AttachVolumeRequest;
import com.jcs_java_sdk.compute_api.model.AttachVolumeResponse;
import com.jcs_java_sdk.compute_api.model.CreateKeyPairRequest;
import com.jcs_java_sdk.compute_api.model.CreateKeyPairResponse;
import com.jcs_java_sdk.compute_api.model.CreateSnapshotRequest;
import com.jcs_java_sdk.compute_api.model.CreateSnapshotResponse;
import com.jcs_java_sdk.compute_api.model.CreateVolumeRequest;
import com.jcs_java_sdk.compute_api.model.CreateVolumeResponse;
import com.jcs_java_sdk.compute_api.model.DeleteKeyPairRequest;
import com.jcs_java_sdk.compute_api.model.DeleteKeyPairResponse;
import com.jcs_java_sdk.compute_api.model.DeleteSnapshotRequest;
import com.jcs_java_sdk.compute_api.model.DeleteSnapshotResponse;
import com.jcs_java_sdk.compute_api.model.DeleteVolumeRequest;
import com.jcs_java_sdk.compute_api.model.DeleteVolumeResponse;
import com.jcs_java_sdk.compute_api.model.DescribeImagesRequest;
import com.jcs_java_sdk.compute_api.model.DescribeImagesResponse;
import com.jcs_java_sdk.compute_api.model.DescribeInstanceTypesRequest;
import com.jcs_java_sdk.compute_api.model.DescribeInstanceTypesResponse;
import com.jcs_java_sdk.compute_api.model.DescribeInstancesRequest;
import com.jcs_java_sdk.compute_api.model.DescribeInstancesResponse;
import com.jcs_java_sdk.compute_api.model.DescribeKeyPairsResponse;
import com.jcs_java_sdk.compute_api.model.DescribeSnapshotsRequest;
import com.jcs_java_sdk.compute_api.model.DescribeSnapshotsResponse;
import com.jcs_java_sdk.compute_api.model.DescribeVolumesRequest;
import com.jcs_java_sdk.compute_api.model.DescribeVolumesResponse;
import com.jcs_java_sdk.compute_api.model.DetachVolumeRequest;
import com.jcs_java_sdk.compute_api.model.DetachVolumeResponse;
import com.jcs_java_sdk.compute_api.model.GetPasswordDataRequest;
import com.jcs_java_sdk.compute_api.model.GetPasswordDataResponse;
import com.jcs_java_sdk.compute_api.model.ImportKeyPairRequest;
import com.jcs_java_sdk.compute_api.model.ImportKeyPairResponse;
import com.jcs_java_sdk.compute_api.model.RebootInstancesRequest;
import com.jcs_java_sdk.compute_api.model.RebootInstancesResponse;
import com.jcs_java_sdk.compute_api.model.RunInstancesRequest;
import com.jcs_java_sdk.compute_api.model.RunInstancesResponse;
import com.jcs_java_sdk.compute_api.model.ShowDeleteOnTerminationFlagRequest;
import com.jcs_java_sdk.compute_api.model.ShowDeleteOnTerminationFlagResponse;
import com.jcs_java_sdk.compute_api.model.StartInstancesRequest;
import com.jcs_java_sdk.compute_api.model.StartInstancesResponse;
import com.jcs_java_sdk.compute_api.model.StopInstancesRequest;
import com.jcs_java_sdk.compute_api.model.StopInstancesResponse;
import com.jcs_java_sdk.compute_api.model.TerminateInstancesRequest;
import com.jcs_java_sdk.compute_api.model.TerminateInstancesResponse;
import com.jcs_java_sdk.compute_api.model.UpdateDeleteOnTerminationFlagRequest;
import com.jcs_java_sdk.compute_api.model.UpdateDeleteOnTerminationFlagResponse;
import com.jcs_java_sdk.compute_api.model.transform.AttachVolumeUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.CreateKeyPairUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.CreateSnapshotUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.CreateVolumeUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.DeleteKeyPairUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.DeleteSnapshotUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.DeleteVolumeUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.DescribeImagesUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.DescribeInstanceTypesUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.DescribeInstancesUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.DescribeKeyPairsUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.DescribeSnapshotsUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.DescribeVolumesUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.DetachVolumeUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.GetPasswordDataUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.ImportKeyPairUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.RebootInstancesUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.RunInstancesUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.ShowDeleteOnTerminationFlagUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.StartInstancesUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.StopInstancesUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.TerminateInstancesUnmarshaller;
import com.jcs_java_sdk.compute_api.model.transform.UpdateDeleteOnTerminationFlagUnmarshaller;

public class Compute 
{
	private HttpVar info;
	private Image image;
	private Instance instance;
	private KeyPair keyPair;
	private Snapshot snapshot;
	private Volume volume;
	private Config config;
	
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
			config = new Config();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
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
			res.setPasswordData((instance.decryptInstancePassword(res.getPasswordData(), "/home/gowtham/Desktop/reliance/pkcs8_key", "")));
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
