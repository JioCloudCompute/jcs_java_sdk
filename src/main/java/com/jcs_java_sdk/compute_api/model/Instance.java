package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
///Class Describing Details of Instance
public class Instance {
	
	@XmlElementWrapper(name = "blockDeviceMapping")
	@XmlElement(name="item")
	private List<BlockDeviceInstance> blockDeviceMapping;
	@XmlElement
	private String dnsName;
	@XmlElement
	private String instanceId;
	@XmlElement
	private String instanceState;
	@XmlElement
	private String imageId;
	@XmlElement
	private String privateDnsName;
	@XmlElement
	private String keyName;
	@XmlElement
	private String launchTime;
	@XmlElement
	private String subnetId;
	
	@XmlElementWrapper(name = "groupSet")
	@XmlElement(name = "item")
	private List<Group> groups;
	@XmlElement
	private String vpcId;
	@XmlElement
	private String instanceType;
	@XmlElement
	private String privateIpAddress;
	
	public final List<BlockDeviceInstance> getBlockDeviceMapping() {
		return blockDeviceMapping;
	}
	///Getter for the DNS Name 
		/**
			@return final string
		*/
	public final String getDnsName() {
		return dnsName;
	}
	///Getter for the Unique Instance ID of the instance
		/**
			@return final string
		*/
	public final String getInstanceId() {
		return instanceId;
	}
	///Getter for the State of the instance
		/**
			@return final string
		*/
	public final String getInstanceState() {
		return instanceState;
	}
	///Getter for the Image Id to which the Instance belongs
		/**
			@return final string
		*/
	public final String getImageId() {
		return imageId;
	}
	///Getter for the Private DNS Name
		/**
			@return final string
		*/
	public final String getPrivateDnsName() {
		return privateDnsName;
	}
	///Getter for Key Name
		/**
			@return final string
		*/
	public final String getKeyName() {
		return keyName;
	}
	///Getter for the Launch Time of the Instance
		/**
			@return final string
		*/
		
	public final String getLaunchTime() {
		return launchTime;
	}
	///Getter for the Subet ID to which the Instance belongs
		/**
			@return final string
		*/
	public final String getSubnetId() {
		return subnetId;
	}
	///Getter for the Groups to which instance belongs to.
		/**
			@return final vector<group>
			A List of objects of class group_set
		*/
	public final List<Group> getGroups() {
		return groups;
	}
	///Getter for the VPC ID of the Instance
		/**
			@return final string
		*/
	public final String getVpcId() {
		return vpcId;
	}
	///Getter for the Type of the Instance
		/**
			@return final string
		*/
	public final String getInstanceType() {
		return instanceType;
	}
	///Getter for the Private IP address of the Instance
		/**
			@return final string
		*/
	public final String getPrivateIpAddress() {
		return privateIpAddress;
	}
	void setBlockDeviceMapping(List<BlockDeviceInstance> blockDeviceMapping) {
		this.blockDeviceMapping = blockDeviceMapping;
	}
	void setDnsName(String dnsName) {
		this.dnsName = dnsName;
	}
	void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	void setInstanceState(String instanceState) {
		this.instanceState = instanceState;
	}
	void setImageId(String imageId) {
		this.imageId = imageId;
	}
	void setPrivateDnsName(String privateDnsName) {
		this.privateDnsName = privateDnsName;
	}
	void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	void setLaunchTime(String launchTime) {
		this.launchTime = launchTime;
	}
	void setSubnetId(String subnetId) {
		this.subnetId = subnetId;
	}
	void setGroups(List<Group> groups) {
		this.groups = groups;
	}
	void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}
	void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}
	void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
	}
	
	
	
}
