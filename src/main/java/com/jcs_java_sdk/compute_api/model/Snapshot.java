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

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
///Class to Handle Snapshot Object
public class Snapshot {
	@XmlElement
	private String status;
	@XmlElement
	private String volumeId;
	@XmlElementWrapper(name = "attachmentSet")
	@XmlElement(name = "item")
	private List<AttachmentSet> attachments;
	@XmlElement
	private String snapshotId;
	@XmlElement
	private String createTime;
	@XmlElement (name = "volumeSize")
	private float size;
	
	void setStatus(String status) {
		this.status = status;
	}
	void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	void setAttachments(List<AttachmentSet> attachments) {
		this.attachments = attachments;
	}
	void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}
	void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	void setSize(float size) {
		this.size = size;
	}
	
	public final String getStatus() {
		return status;
	}
	///Getter for the Volume ID 
		/**
			@return final string
		*/
	public final String getVolumeId() {
		return volumeId;
	}
	///Getter for Attachments to the snapshot
	/**
		@return final List<AttachmentSet>
	*/
	public final List<AttachmentSet> getAttachments() {
		return attachments;
	}
	///Getter for the Snapshot ID of the snapshot
		/**
			@return final string
		*/
	public final String getSnapshotId() {
		return snapshotId;
	}
	///Getter for the start time of the Snapshot
		/**
			@return final string 
		*/
	public final String getCreateTime() {
		return createTime;
	}
	///Getter for the Volume Size of the Snapshot
	/**
		@return final float
	*/
	public final float getSize() {
		return size;
	}

}
