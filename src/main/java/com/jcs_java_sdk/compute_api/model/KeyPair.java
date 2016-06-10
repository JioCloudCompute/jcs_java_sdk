package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;

///Class To handle Key-Pair Object
public class KeyPair {
	
	@XmlElement
	private String keyName;
	@XmlElement
	private String keyFingerPrint;
	///Getter for the Key-Name of the Key
		/**
			@return final string
		*/
	public final String getKeyName() {
		return keyName;
	}
	///Getter for the Key-FingerPrint of the Key
	/**
		@return final string
	*/
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
