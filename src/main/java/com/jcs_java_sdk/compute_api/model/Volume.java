package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
///Class to Handle Volume Oject
public class Volume {
	@XmlElement
	private String status;
	@XmlElement
	private String volumeId;
	@XmlElementWrapper(name="attachmentSet")
	@XmlElement(name = "item")
	private List<AttachmentSet> attachmentSet;
	@XmlElement
	private String snapshotId;
	@XmlElement
	private String createTime;
	@XmlElement
	private float size;
	///Getter for the Current Status of the Volume Object
		/**
			@return final string
		*/
	public final String getStatus() {
		return status;
	}
	///Getter for the current volume ID
		/**
			@return final string
		*/
	public final String getVolumeId() {
		return volumeId;
	}
		///Getter for the Attachment Info Related to Volume
		/**
			@return final List<AttachmentSet>
		*/
	public final List<AttachmentSet> getAttachmentSet() {
		return attachmentSet;
	}
	///Getter for the Snapshot ID 
		/**
			@return final string
		*/
	public final String getSnapshotId() {
		return snapshotId;
	}
	///Getter for the Create Time of the Volume
		/**
			@return final string
		*/
	public final String getCreateTime() {
		return createTime;
	}
		///Getter for the Size of the Volume
		/**
			@return final float
		*/
	public final float getSize() {
		return size;
	}

	void setStatus(String status) {
		this.status = status;
	}
	void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	void setAttachmentSet(List<AttachmentSet> attachmentSet) {
		this.attachmentSet = attachmentSet;
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
	

}
