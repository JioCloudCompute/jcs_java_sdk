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
@XmlRootElement(name = "CreateSnapshotResponse")
/// Class to handle Create Snapshot Request's Response
	/**
		This Response Class has member variables and functions to get details of
		the snapshot that was created.
	*/
public class CreateSnapshotResponse {
	
	@XmlElement
	private String requestId;
	@XmlElement
	private String status;
	@XmlElement
	private String snapshotId;
	@XmlElement
	private float volumeSize;
	@XmlElement
	private String volumeId;
	@XmlElement
	private String startTime;
	///Getter for the Unique Request ID
		/**
			@return final string
		*/
	public final String getRequestId() {
		return requestId;
	}
	///Getter for the Status of the Snapshot created
		/**
			@return final string
		*/
	public final String getStatus() {
		return status;
	}
	///Getter for the ID of the snapshot created
		/**
			@return final string
		*/
	public final String getSnapshotId() {
		return snapshotId;
	}
	///Getter for the Volume Size attached with the Snapshot created
		/**
			@return float
		*/
	public final float getVolumeSize() {
		return volumeSize;
	}
	///Getter for the Volume ID attached with the Snapshot created
		/**
			@return final string
		*/
	public final String getVolumeId() {
		return volumeId;
	}
	///Getter for the time Snapshot was created
		/**
			@return final string
		*/
	public final String getStartTime() {
		return startTime;
	}
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setStatus(String status) {
		this.status = status;
	}
	void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}
	void setVolumeSize(float volumeSize) {
		this.volumeSize = volumeSize;
	}
	void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	

}
