package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;

public class Image {
	
	@XmlElement(name = "blockDeviceMapping")
	private BlockDevice blockDeviceMapping;
	@XmlElement
	private boolean isPublic;
	@XmlElement
	private String name;
	@XmlElement
	private String imageId;
	@XmlElement
	private String imageState;
	@XmlElement
	private String architecture;
	@XmlElement
	private String imageType;
	
	///Getter for whether the Block is Public or not
		/**
			@return final boolean
		*/
	
	public final boolean isPublic() {
		return isPublic;
	}
	
	void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}
	///Getter for Name of BLock Device
		/**
			@return final string
		*/
	public final String getName() {
		return name;
	}
	final void setName(String name) {
		this.name = name;
	}
	///Getter for Image Id
		/**
			@return final string
		*/
	public final String getImageId() {
		return imageId;
	}
	final void setImageId(String imageId) {
		this.imageId = imageId;
	}
	///Getter for State Of Image
		/**
			@return final string
		*/
	public final String getImageState() {
		return imageState;
	}
	final void setImageState(String imageState) {
		this.imageState = imageState;
	}
	///Getter for Architecture Type of the Image
		/**
			@return final string
		*/
	public final String getArchitecture() {
		return architecture;
	}
	final void setArchitecture(String architecture) {
		this.architecture = architecture;
	}
	///Getter for type of Image
		/**
			@return final string
		*/
	public final String getImageType() {
		return imageType;
	}
	final void setImageType(String imageType) {
		this.imageType = imageType;
	}
	///Getter for Block Device Related Information Of image
		/**
			@return final BlockDevice
		*/
	public final BlockDevice getBlockDeviceMapping() {
		return blockDeviceMapping;
	}
	final void setBlockDeviceMapping(BlockDevice blockDeviceMapping) {
		this.blockDeviceMapping = blockDeviceMapping;
	}
	
	

}
