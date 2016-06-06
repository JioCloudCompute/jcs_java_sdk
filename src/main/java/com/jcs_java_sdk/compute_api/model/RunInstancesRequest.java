package com.jcs_java_sdk.compute_api.model;

import java.util.ArrayList;
import com.jcs_java_sdk.compute_api.model.BlockDeviceMapping;

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

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getInstanceTypeId() {
		return instanceTypeId;
	}

	public void setInstanceTypeId(String instanceTypeId) {
		this.instanceTypeId = instanceTypeId;
	}

	public ArrayList<BlockDeviceMapping> getBlockDeviceMapping() {
		return blocks;
	}

	public void setBlockDeviceMapping(ArrayList<BlockDeviceMapping> blocks) {
		this.blocks = blocks;
	}

	public int getInstanceCount() {
		return instanceCount;
	}

	public void setInstanceCount(int instanceCount) {
		this.instanceCount = instanceCount;
	}

	public String getSubnetId() {
		return subnetId;
	}

	public void setSubnetId(String subnetId) {
		this.subnetId = subnetId;
	}

	public String getPrivateIpAddress() {
		return privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
	}

	public ArrayList<String> getSecurityGroupIds() {
		return securityGroupIds;
	}

	public void setSecurityGroupIds(ArrayList<String> securityGroupIds) {
		this.securityGroupIds = securityGroupIds;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
}