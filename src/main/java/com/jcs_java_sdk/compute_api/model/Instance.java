package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

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
	public final String getDnsName() {
		return dnsName;
	}
	public final String getInstanceId() {
		return instanceId;
	}
	public final String getInstanceState() {
		return instanceState;
	}
	public final String getImageId() {
		return imageId;
	}
	public final String getPrivateDnsName() {
		return privateDnsName;
	}
	public final String getKeyName() {
		return keyName;
	}
	public final String getLaunchTime() {
		return launchTime;
	}
	public final String getSubnetId() {
		return subnetId;
	}
	public final List<Group> getGroups() {
		return groups;
	}
	public final String getVpcId() {
		return vpcId;
	}
	public final String getInstanceType() {
		return instanceType;
	}
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
