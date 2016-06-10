package com.jcs_java_sdk.compute_api.model;

import java.util.ArrayList;
import com.jcs_java_sdk.compute_api.model.BlockDeviceMapping;
/// Class to handle run instances request
/**
	This class manages the request for run instances. User can create an object and and initialize the needed arguments.
*/
public class RunInstancesRequest
{
	private String imageId;
	private String instanceTypeId;
	private ArrayList<BlockDeviceMapping>blocks;
	private int instanceCount;
	private String subnetId;
	private String privateIpAddress;
	private ArrayList<String>securityGroupIds;
	String keyName;
	
	/// Constructor
	public RunInstancesRequest()
	{
		imageId = new String();
		instanceTypeId = new String();
		blocks = new ArrayList<BlockDeviceMapping>();
		subnetId = new String();
		privateIpAddress = new String();
		keyName = new String();
		securityGroupIds = new ArrayList<String>();
		instanceCount = -1;
	}
	/// Getter for the private variable imageId
	/**
		@return string
	*/
	public String getImageId() {
		return imageId;
	}
	/// Setter for the private variable imageId
	/**
		@param imageId : image id of new instances to be created
	*/
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	/// Getter for the private variable inatanceTypeId
	/**
		@return string
	*/
	public String getInstanceTypeId() {
		return instanceTypeId;
	}
	/// Setter for the private variable instance_type_id
	/**
		@param instanceTypeId : instance type id of the new instances to be created
	*/
	public void setInstanceTypeId(String instanceTypeId) {
		this.instanceTypeId = instanceTypeId;
	}
	/// Getter for the private variable blocks
	/**
		@return ArrayList<BlockDeviceMapping>
	*/
	public ArrayList<BlockDeviceMapping> getBlockDeviceMapping() {
		return blocks;
	}
	/// Setter for the private variable blocks
	/**
		@param blocks (optional): List of settings to be used for volumes being created during
		instance launch. This itself is a structure which supports the
		following options.\n
    		DeleteOnTermination\n
    		VolumeSize\n
    		DeviceName\n
    		SnapshotId\n
		Please refer to the Compute help guide for more information on
	    how to work with these parameters.
	    If not specified, JCS takes the boot volume information from the
	    OS image properties.		
	*/
	public void setBlockDeviceMapping(ArrayList<BlockDeviceMapping> blocks) {
		this.blocks = blocks;
	}
	/// Getter for the private variable instanceCount
	/**
		@return int
	*/
	public int getInstanceCount() {
		return instanceCount;
	}
	/// Setter for the private variable instanceCount
	/**
		@param instanceCount (optional): Integer representing how many instances to be launched. Default is 1.
	*/
	public void setInstanceCount(int instanceCount) {
		this.instanceCount = instanceCount;
	}
	/// Getter for the private variable subnetId
	/**
		@return string
	*/
	public String getSubnetId() {
		return subnetId;
	}
	/// Setter for the private variable subnetId
	/**
		@param subnetId (optional): Unique identifier for the subnet where the instance is created.
	    Incase one doesnt provide this value, an appropriate subnet is
	    selected
	*/
	public void setSubnetId(String subnetId) {
		this.subnetId = subnetId;
	}
	/// Getter for the private variable privateIpAddress
	/**
		@return string
	*/
	public String getPrivateIpAddress() {
		return privateIpAddress;
	}
	/// Setter for the private variable privateIpAddress
	/**
		@param privateIpAddress (optional): Valid IP address from the subnet CIDR block. If not given, an
		available private IP address is selected
	*/
	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
	}
	/// Getter for the private variable securityGroupIds
	/**
		@return vector<string> *
	*/
	public ArrayList<String> getSecurityGroupIds() {
		return securityGroupIds;
	}
	/// Getter for the private variable securityGroupIds
	/**
		@param securityGroupIds (optional): One or more security groups to be associated to the instance.
	    If not given, default security group is associated with the
	    instance
	*/
	public void setSecurityGroupIds(ArrayList<String> securityGroupIds) {
		this.securityGroupIds = securityGroupIds;
	}
	/// Getter for the private variable keyName
	/**
		@return string
	*/
	public String getKeyName() {
		return keyName;
	}
	/// Setter for the private variable keyName
	/**
		@param keyName (optional): Key Name to be used while launching the instance. If not given
		instance can be still launched but not reached
	*/
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
}