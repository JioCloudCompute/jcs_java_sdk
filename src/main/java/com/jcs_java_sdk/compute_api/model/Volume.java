package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

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
	public final String getStatus() {
		return status;
	}
	public final String getVolumeId() {
		return volumeId;
	}
	public final List<AttachmentSet> getAttachmentSet() {
		return attachmentSet;
	}
	public final String getSnapshotId() {
		return snapshotId;
	}
	public final String getCreateTime() {
		return createTime;
	}
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
