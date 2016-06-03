package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.jcs_java_sdk.compute_api.model.KeyPair;

@XmlRootElement
public class ImportKeyPairResponse {
	
	@XmlElement
	private String requestId;
	@XmlElement
	private KeyPair keyPair;
	
	public final String getRequestId() {
		return requestId;
	}
	public final KeyPair getKeyPair() {
		return keyPair;
	}
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setKeyPair(KeyPair keyPair) {
		this.keyPair = keyPair;
	}
	

}
