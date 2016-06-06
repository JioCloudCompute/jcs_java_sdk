package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "CreateVolumeResponse")
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
	public final String getRequestId() {
		return requestId;
	}
	public final String getStatus() {
		return status;
	}
	public final String getVolumeId() {
		return volumeId;
	}
	public final String getSnapshotId() {
		return snapshotId;
	}
	public final float getSize() {
		return size;
	}
	public final String getCreateTime() {
		return createTime;
	}

}
