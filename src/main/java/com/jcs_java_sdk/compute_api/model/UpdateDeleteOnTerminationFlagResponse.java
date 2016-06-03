package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class UpdateDeleteOnTerminationFlagResponse {
	
	@XmlElement
	private String requestId;
	@XmlElementWrapper(name = "volume")
	@XmlElement
	private String instanceId;
	@XmlElementWrapper(name = "volume")
	@XmlElement
	private String volumeId;
	@XmlElementWrapper(name = "volume")
	@XmlElement
	private boolean deleteOnTermination;
	public final String getRequestId() {
		return requestId;
	}
	public final String getInstanceId() {
		return instanceId;
	}
	public final String getVolumeId() {
		return volumeId;
	}
	public final boolean isDeleteOnTermination() {
		return deleteOnTermination;
	}
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	void setDeleteOnTermination(boolean deleteOnTermination) {
		this.deleteOnTermination = deleteOnTermination;
	}


}
