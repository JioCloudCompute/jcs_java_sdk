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
	
	
	final boolean isPublic() {
		return isPublic;
	}
	
	final void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}
	
	public final String getName() {
		return name;
	}
	final void setName(String name) {
		this.name = name;
	}
	public final String getImageId() {
		return imageId;
	}
	final void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public final String getImageState() {
		return imageState;
	}
	final void setImageState(String imageState) {
		this.imageState = imageState;
	}
	public final String getArchitecture() {
		return architecture;
	}
	final void setArchitecture(String architecture) {
		this.architecture = architecture;
	}
	public final String getImageType() {
		return imageType;
	}
	final void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public final BlockDevice getBlockDeviceMapping() {
		return blockDeviceMapping;
	}
	final void setBlockDeviceMapping(BlockDevice blockDeviceMapping) {
		this.blockDeviceMapping = blockDeviceMapping;
	}
	
	

}
