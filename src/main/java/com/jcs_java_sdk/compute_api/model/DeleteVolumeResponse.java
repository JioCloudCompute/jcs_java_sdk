package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class DeleteVolumeResponse {
	
	@XmlElement
	private boolean result;
	@XmlElement
	private String requestId;
	public final boolean isResult() {
		return result;
	}
	public final String getRequestId() {
		return requestId;
	}
	void setResult(boolean result) {
		this.result = result;
	}
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
