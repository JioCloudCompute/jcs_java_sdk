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
