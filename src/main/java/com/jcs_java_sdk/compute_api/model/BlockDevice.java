package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;

public class BlockDevice {
	
	@XmlElement
	private String deviceName;
	@XmlElement
	private float volumeSize;
	@XmlElement
	private boolean deleteOnTermination;
	@XmlElement
	private String snapshotId;
	
	public final float getVolumeSize() {
		return volumeSize;
	}
	final void setVolumeSize(float volumeSize) {
		this.volumeSize = volumeSize;
	}

	public final boolean isDeleteOnTermination() {
		return deleteOnTermination;
	}
	final void setDeleteOnTermination(boolean deleteOnTermination) {
		this.deleteOnTermination = deleteOnTermination;
	}
	
	public final String getDeviceName() {
		return deviceName;
	}
	final void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	public final String getSnapshotId() {
		return snapshotId;
	}
	final void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}
	
}
