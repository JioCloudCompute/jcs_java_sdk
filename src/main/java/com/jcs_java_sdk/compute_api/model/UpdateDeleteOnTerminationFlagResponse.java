package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "UpdateDeleteOnTerminationFlagResponse")
/// Class to handle Update DeleteOnTermination Flag Request's Respones
	/**
		This Response Class has member functions that returns the description of DeleteOn termination Flag
	*/
public class UpdateDeleteOnTerminationFlagResponse {
	
	@XmlElement
	private String requestId;
	
	@XmlElement(name = "volume")
	private VolumeTerminationInfo volume;
	///Getter for the Unique Request ID
		/**
			@return final string
		*/

	public final String getRequestId() {
		return requestId;
	}
	///Getter for the Instance ID to which the volume is attached
		/**
			@return final string
		*/
	public final String getInstanceId() {
		return volume.getInstanceId();
	}
	///Getter for the Volume ID whose Flag has to be updated
		/**
			@return final string
		*/
		
	public final String getVolumeId() {
		return volume.getVolumeId();
	}
	///Getter for the Delete On termination Flag corresponding to the Volume
	/**
		@return final bool
	*/
	public final boolean isDeleteOnTermination() {
		return volume.isDeleteOnTermination();
	}
	
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	void setVolume(VolumeTerminationInfo volume) {
		this.volume = volume;
	}


}
