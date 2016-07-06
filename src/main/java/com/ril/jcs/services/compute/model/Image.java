/*******************************************************************************
 * Copyright (c) 2016 Jiocloud.com, Inc. or its affiliates.  All Rights Reserved
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, dis-
 * tribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the fol-
 * lowing conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABIL-
 * ITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT
 * SHALL THE AUTHOR BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 *******************************************************************************/
package com.ril.jcs.services.compute.model;

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
