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
package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "CreateVolumeResponse")
/// Class to handle Create Volume Request's Response.
	/**
		This class object describes the volume created
	*/
public class CreateVolumeResponse {
	@XmlElement
	private String requestId;
	@XmlElement
	private String status;
	@XmlElement
	private String volumeId;
	@XmlElement
	private String snapshotId;
	@XmlElement
	private float size;
	@XmlElement
	private String createTime;
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setStatus(String status) {
		this.status = status;
	}
	void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}
	void setSize(float size) {
		this.size = size;
	}
	void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	///Getter for the Unique Request ID
		/**
			@return final string
		*/
	public final String getRequestId() {
		return requestId;
	}
	///Getter for the Status of the volume created
		/**
			@return final string
		*/
	public final String getStatus() {
		return status;
	}
	///Getter for the ID of the volume created
		/**
			@return final string
		*/
	public final String getVolumeId() {
		return volumeId;
	}
	///Getter for the ID of the snapshot to which the volume is attached
		/**
			@return final string
		*/
	public final String getSnapshotId() {
		return snapshotId;
	}
	///Getter for the Size of the Volume Created
		/**
			@return float
		*/
	public final float getSize() {
		return size;
	}
	///Getter for the time Volume was created
		/**
			@return final string
		*/
	public final String getCreateTime() {
		return createTime;
	}

}
