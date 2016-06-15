package com.jcs_java_sdk;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

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
import com.jcs_java_sdk.compute_api.model.Instance;
import com.jcs_java_sdk.compute_api.model.InstanceState;
import com.jcs_java_sdk.compute_api.model.InstanceTypes;
import com.jcs_java_sdk.compute_api.model.KeyPair;
import com.jcs_java_sdk.compute_api.model.RebootInstancesRequest;
import com.jcs_java_sdk.compute_api.model.RebootInstancesResponse;
import com.jcs_java_sdk.compute_api.model.RunInstancesRequest;
import com.jcs_java_sdk.compute_api.model.RunInstancesResponse;
import com.jcs_java_sdk.compute_api.model.ShowDeleteOnTerminationFlagRequest;
import com.jcs_java_sdk.compute_api.model.ShowDeleteOnTerminationFlagResponse;
import com.jcs_java_sdk.compute_api.model.Snapshot;
import com.jcs_java_sdk.compute_api.model.StartInstancesRequest;
import com.jcs_java_sdk.compute_api.model.StartInstancesResponse;
import com.jcs_java_sdk.compute_api.model.StopInstancesRequest;
import com.jcs_java_sdk.compute_api.model.StopInstancesResponse;
import com.jcs_java_sdk.compute_api.model.TerminateInstancesRequest;
import com.jcs_java_sdk.compute_api.model.TerminateInstancesResponse;
import com.jcs_java_sdk.compute_api.model.UpdateDeleteOnTerminationFlagRequest;
import com.jcs_java_sdk.compute_api.model.UpdateDeleteOnTerminationFlagResponse;
import com.jcs_java_sdk.compute_api.model.Volume;

public class Test {

	private static Scanner scanner;

	public static void main(String[] args)
	{	
		Compute obj = new Compute();
		ArrayList<String> imageIds = new ArrayList<String>();
		ArrayList<String> instanceIds = new ArrayList<String>();
		int option;
		scanner = new Scanner(System.in);
		
		option = scanner.nextInt();
		
		
		
		while(option!=-1)
		{
			
			switch(option)
			{
				case 0:
				{
					//describe Images
					DescribeImagesRequest req0 = new DescribeImagesRequest();
					DescribeImagesResponse res0;
					res0 = obj.describeImages(req0);
					if(res0 != null)System.out.println( res0.getImages().get(0).getImageId());
					break;
				}
				case 1:
				{
					//describe Instance 
					DescribeInstancesRequest req1 = new DescribeInstancesRequest();
					DescribeInstancesResponse res1;
					res1 = obj.describeInstances(req1);
					if(res1 != null){
						ArrayList<Instance> tr = new ArrayList<Instance>(res1.getInstances());
						for(int i = 0;i<tr.size();i++)
						{
							System.out.println(tr.get(i).getInstanceId());
							System.out.println(tr.get(i).getInstanceState());
						}
					}
					break;
				}
				case 2:
				{
					//describe instance types
					DescribeInstanceTypesRequest req2 = new DescribeInstanceTypesRequest();
					DescribeInstanceTypesResponse res2;
					res2 = obj.describeInstanceTypes(req2);
					if(res2!=null){
						ArrayList<InstanceTypes> tr = new ArrayList<InstanceTypes>(res2.getInstanceTypes());
						for(int i=0 ; i<tr.size() ; i++)System.out.println(tr.get(i).getRam());
					}
					break;
				}
				case 3:
				{
					// Stop instances
					StopInstancesRequest req3 = new StopInstancesRequest();
					StopInstancesResponse res3;
					instanceIds.add("i-02eb8842");
					req3.setInstanceIds(instanceIds);
					res3 = obj.stopInstances(req3);
					if(res3!=null){
						ArrayList<InstanceState> tr = new ArrayList<InstanceState>(res3.getInstances());

						for(int i=0 ; i<tr.size() ; i++)
						{
							System.out.println(tr.get(i).getInstanceId());
							System.out.println(tr.get(i).getCurrentState());
							
						}
					}
					break;
				}
				case 4:	
				{	//start Instances
					StartInstancesRequest req4 = new StartInstancesRequest();
					StartInstancesResponse res4;
					instanceIds.add("i-02eb8842");
					req4.setInstanceIds(instanceIds);
					res4 = obj.startInstances(req4);
					if(res4!=null){	
						ArrayList<InstanceState> tr = new ArrayList<InstanceState>(res4.getInstances());

						for(int i =0;i<tr.size();i++)
						{
							System.out.println(tr.get(i).getInstanceId());
							System.out.println(tr.get(i).getCurrentState());
							
						}
					}
					break;
				}
				case 5:
				{
					//Reboot Instances
					RebootInstancesRequest req5 = new RebootInstancesRequest();
					RebootInstancesResponse res5;
					instanceIds.add("i-02eb8842");
					req5.setInstanceIds(instanceIds);
					res5 = obj.rebootInstances(req5);
					if(res5!=null){
						ArrayList< InstanceState> tr = new ArrayList<InstanceState>(res5.getInstances());
						for(int i =0;i<tr.size();i++)
						{
							System.out.println(tr.get(i).getInstanceId());
							System.out.println(tr.get(i).getCurrentState());
							
						}
					}
					break;
				}
				case 6:
				{
					//terminate Instances
					TerminateInstancesRequest req6 = new TerminateInstancesRequest();
					TerminateInstancesResponse res6;
					instanceIds.add("i-02eb8842");
					req6.setInstanceIds(instanceIds);
					res6 = obj.terminateInstances(req6);
					if(res6!=null){
						ArrayList<InstanceState> tr = new ArrayList<InstanceState>(res6.getInstances());
						for(int i =0;i<tr.size();i++)
						{
							System.out.println(tr.get(i).getInstanceId());
							System.out.println(tr.get(i).getCurrentState());
							
						}
					}
					break;
				}		
				case 7:
				{
					// Run Instances
					RunInstancesRequest req7 = new RunInstancesRequest();
					RunInstancesResponse res7;
					req7.setImageId("jmi-bc345d58");
					req7.setInstanceTypeId("c1.large");
					res7 = obj.runInstances(req7);
					if(res7!=null){
						ArrayList< Instance> tr = new ArrayList<Instance>(res7.getInstances());

						for(int i =0;i<tr.size();i++)
						{
							System.out.println(tr.get(i).getInstanceId());	
							System.out.println(tr.get(i).getInstanceState());
						}
					}
					break;
				}
				case 8:
				{
					//describe key pairs 
					DescribeKeyPairsResponse res8;
					res8 = obj.describeKeyPairs();
					if(res8!=null){
						ArrayList<KeyPair> tr = new ArrayList<KeyPair>(res8.getKeys());
						for(int i=0 ; i<tr.size() ; i++)
						{
							System.out.println(tr.get(i).getKeyName());	
						}
					}
					break;
				}
				case 9:
				{
					//create key pair 
					CreateKeyPairRequest req9 = new CreateKeyPairRequest();
					CreateKeyPairResponse res9;
					req9.setKeyName("cpp_test");
					res9 = obj.createKeyPair(req9);
					if(res9!=null){
						System.out.println(res9.getKeyMaterial());
						System.out.println(res9.getKeyFingerprint());
						System.out.println(res9.getKeyName())	;
					}
					break;
				}
				case 10:
				{
					// Delete key pair
					DeleteKeyPairRequest req10 = new DeleteKeyPairRequest();
					DeleteKeyPairResponse res10;
					req10.setKeyName("cpp_test");
					res10 = obj.deleteKeyPair(req10);
					if(res10!=null){
						if(res10.isResult())
							System.out.println(res10.isResult());
					}
					break;
				}
				case 11:
				{
					// create snapshot
					CreateSnapshotRequest req11 = new CreateSnapshotRequest();
					CreateSnapshotResponse res11;
					req11.setVolumeId("816109b0-5e42-4612-9f67-6a233a699cb7");
					res11 = obj.createSnapshot(req11);
					if(res11!=null){
						System.out.println(res11.getStatus());
						System.out.println(res11.getSnapshotId());
						System.out.println(res11.getVolumeSize());
						System.out.println(res11.getVolumeId());
					}
					break;
				}
				case 12:
				{
					//Delete snapshot
					DeleteSnapshotRequest req12 = new DeleteSnapshotRequest();
					DeleteSnapshotResponse res12;
					req12.setSnapshotId("9832ef5b-f139-4727-95da-bd558414618e");
					res12 = obj.deleteSnapshot(req12);
					if(res12!=null){
						System.out.println(res12.isResult());
					}
					break;
				}
				case 13:
				{
					//describe snapshots 
					DescribeSnapshotsRequest req13 = new DescribeSnapshotsRequest();
					DescribeSnapshotsResponse res13;
					res13 = obj.describeSnapshots(req13);
					if(res13!=null){
						ArrayList<Snapshot> tr = new ArrayList<Snapshot>(res13.getSnapshots());
						for(int i=0 ; i<tr.size() ; i++)
						{
							System.out.println(tr.get(i).getSnapshotId());
							System.out.println(tr.get(i).getVolumeId());
							System.out.println(tr.get(i).getSize());
						}
					}
					break;
				}
				case 14:
				{	// Create volume
					CreateVolumeRequest req14 = new CreateVolumeRequest();
					CreateVolumeResponse res14;
					// req14.set_snapshot_id("54790b1f-0d24-4375-9d33-1437036ef877");
					req14.setSize(6);
					res14 = obj.createVolume(req14);
					if(res14!=null){
						System.out.println(res14.getStatus());
						System.out.println(res14.getVolumeId());
						System.out.println(res14.getSnapshotId());
					}
					break;
				}
				case 15:
				{	// delete volume
					DeleteVolumeRequest req15 = new DeleteVolumeRequest();
					DeleteVolumeResponse res15;
					req15.setVolumeId("3d018698-f39d-4aac-9b42-b59446bf490d");
					res15 = obj.deleteVolume(req15);
					if(res15!=null){
						System.out.println(res15.isResult());
					}
					break;
				}
				case 16:
				{	//attach volume
					AttachVolumeRequest req16 = new AttachVolumeRequest();
					AttachVolumeResponse res16;
					req16.setVolumeId("816109b0-5e42-4612-9f67-6a233a699cb7");
					req16.setInstanceId("i-02eb8842");
					req16.setDevice("/dev/vdb");
					res16 = obj.attachVolume(req16);
					if(res16!=null){
						System.out.println(res16.getStatus());
					}
					break;
				}
				case 17:
				{
					//detach volume
					DetachVolumeRequest req17 = new DetachVolumeRequest();
					DetachVolumeResponse res17;
					req17.setVolumeId("816109b0-5e42-4612-9f67-6a233a699cb7");
					res17 = obj.detachVolume(req17);
					if(res17!=null){
						System.out.println(res17.getStatus());
					}
					break;
				}
				case 18:
				{
					// Describe volumes
					DescribeVolumesRequest req18 = new DescribeVolumesRequest();
					DescribeVolumesResponse res18;
					res18 = obj.describeVolumes(req18);
					if(res18!=null){
						ArrayList<Volume> tr = new ArrayList<Volume>(res18.getVolumes());
						for(int i=0 ; i<tr.size() ; i++)
						{
							System.out.println(tr.get(i).getVolumeId());
							System.out.println(tr.get(i).getStatus());
							System.out.println(tr.get(i).getSize());
						}
					}
					break;
				}
				case 19:
				{	// show delete on termination flag
					ShowDeleteOnTerminationFlagRequest req19 = new ShowDeleteOnTerminationFlagRequest();
					ShowDeleteOnTerminationFlagResponse res19;
					req19.setVolumeId("ddabc7d3-276f-408c-8dc7-098f400cd3dd");
					res19 = obj.showDeleteOnTerminationFlag(req19);
					if(res19!=null){
					System.out.println(res19.getVolumeId());
						System.out.println(res19.isDeleteOnTermination());
					}
					break;
				}
				case 20:
				{
					// update delete on termination flag
					UpdateDeleteOnTerminationFlagRequest req20 = new UpdateDeleteOnTerminationFlagRequest();
					UpdateDeleteOnTerminationFlagResponse res20;
					req20.setVolumeId("816109b0-5e42-4612-9f67-6a233a699cb7");
					req20.setDeleteOnTermination(true);
					res20 = obj.updateDeleteOnTerminationFlag(req20);
					if(res20!=null){
						System.out.println(res20.getVolumeId());
						System.out.println(res20.isDeleteOnTermination());
					}
					break;
				}
				case 21:
				{
					// import key pair
					ImportKeyPairRequest req21 = new ImportKeyPairRequest();
					ImportKeyPairResponse res21;
					File f = new File("/home/gowtham/Desktop/reliance/workspace/jcs_java_sdk/src/main/java/com/jcs_java_sdk/key.pub");
					String s = new String();
					Scanner scanner;
					try 
					{
						scanner = new Scanner(f);
						s = scanner.nextLine();
						scanner.close();
					} 
					catch (FileNotFoundException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					req21.setKeyName("import_test_java");
					System.out.println(s);
					req21.setPublicKeyMaterial(DatatypeConverter.printBase64Binary(s.getBytes()));
					res21 = obj.importKeyPair(req21);
					if(res21!=null){
						System.out.println(res21.getKeyFingerprint());
						System.out.println(res21.getKeyName());
					}
					break;
				}
				case 22:
				{
					//  get password data
					GetPasswordDataRequest req22 = new GetPasswordDataRequest();
					GetPasswordDataResponse res22;
					req22.setInstanceId("i-4218c456");
					req22.setPrivateKeyFile("/home/gowtham/Desktop/reliance/key.pem");
					req22.setPassphrase("hello");
					res22 = obj.getPasswordData(req22);
					if(res22!=null){
						System.out.println(res22.getPasswordData());
					}
					break;
				}

				default:
					break;
			}
			option = scanner.nextInt();
			instanceIds.clear();
		}

	}

}
