package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;

public class InstanceTypes {
	
	@XmlElement
	private int vcpus;
	@XmlElement
	private float ram;
	@XmlElement
	private String id;
	
	public final int getVcpus() {
		return vcpus;
	}
	public final float getRam() {
		return ram;
	}
	public final String getId() {
		return id;
	}
	void setVcpus(int vcpus) {
		this.vcpus = vcpus;
	}
	void setRam(float ram) {
		this.ram = ram;
	}
	void setId(String id) {
		this.id = id;
	}
	

}
