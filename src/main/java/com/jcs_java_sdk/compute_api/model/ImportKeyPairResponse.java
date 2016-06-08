package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.jcs_java_sdk.compute_api.model.KeyPair;

@XmlRootElement(name = "ImportKeyPairResponse")
public class ImportKeyPairResponse {
	
	@XmlElement
	private String requestId;
	@XmlElement
	private String keyFingerprint;
	@XmlElement
	private String keyName;
	public final String getRequestId() {
		return requestId;
	}
	public final String getKeyFingerprint() {
		return keyFingerprint;
	}
	public final String getKeyName() {
		return keyName;
	}
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	void setKeyFingerprint(String keyFingerprint) {
		this.keyFingerprint = keyFingerprint;
	}
	void setKeyName(String keyName) {
		this.keyName = keyName;
	}

}
