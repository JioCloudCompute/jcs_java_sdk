package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;

public class KeyPair {
	
	@XmlElement
	private String keyName;
	@XmlElement
	private String keyFingerPrint;
	public final String getKeyName() {
		return keyName;
	}
	public final String getKeyFingerPrint() {
		return keyFingerPrint;
	}
	void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	void setKeyFingerPrint(String keyFingerPrint) {
		this.keyFingerPrint = keyFingerPrint;
	}
	

}
