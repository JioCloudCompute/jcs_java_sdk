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
	///Getter for VolumeSize
		/**
			@return  float
		*/
	public final float getVolumeSize() {
		return volumeSize;
	}
	final void setVolumeSize(float volumeSize) {
		this.volumeSize = volumeSize;
	}
	///Getter for Delete On Termination Flag
		/**
			@return boolean
		*/

	public final boolean isDeleteOnTermination() {
		return deleteOnTermination;
	}
	final void setDeleteOnTermination(boolean deleteOnTermination) {
		this.deleteOnTermination = deleteOnTermination;
	}
	///Getter for Device Name
		/**
			@return  String
		*/
	
	public final String getDeviceName() {
		return deviceName;
	}
	final void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	///Getter for the Snapshot ID
		/**
			@return  String
		*/
	public final String getSnapshotId() {
		return snapshotId;
	}
	final void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}
	
}
