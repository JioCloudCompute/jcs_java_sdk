package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CreateKeyPairResponse {
	
	@XmlElement
	private String requestId;
	@XmlElement
	private String keyFingerPrint;
	@XmlElement
	private String keyMaterial;
	@XmlElement
	private String keyName;
	
	public final String getRequestId() {
		return requestId;
	}
	final void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public final String getKeyFingerPrint() {
		return keyFingerPrint;
	}
	final void setKeyFingerPrint(String keyFingerPrint) {
		this.keyFingerPrint = keyFingerPrint;
	}
	public final String getKeyMaterial() {
		return keyMaterial;
	}
	final void setKeyMaterial(String keyMaterial) {
		this.keyMaterial = keyMaterial;
	}
	public final String getKeyName() {
		return keyName;
	}
	final void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	
}
