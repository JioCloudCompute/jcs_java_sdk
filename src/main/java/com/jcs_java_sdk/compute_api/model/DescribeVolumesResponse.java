package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DescribeVolumeResponse")
public class DescribeVolumesResponse {
	
	@XmlElement
	private String requestId;
	@XmlElement
	private List<Volume> volumes;
	public final String getRequestId() {
		return requestId;
	}
	public final List<Volume> getVolumes() {
		return volumes;
	}
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setVolumes(List<Volume> volumes) {
		this.volumes = volumes;
	}
	

}
