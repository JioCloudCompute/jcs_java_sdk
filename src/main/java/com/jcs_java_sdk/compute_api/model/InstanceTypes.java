package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
///Class to handle Instance Type
public class InstanceTypes {
	
	@XmlElement
	private int vcpus;
	@XmlElement
	private float ram;
	@XmlElement
	private String id;
	///Getter for the VC Pus of the Instance
		/**
			@return final float
		*/
	public final int getVcpus() {
		return vcpus;
	}
	///Getter for the Ram of the Instance
		/**
			@return final float
		*/
	public final float getRam() {
		return ram;
	}
	///Getter for the ID of the Instance
		/**
			@return final string
		*/
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
