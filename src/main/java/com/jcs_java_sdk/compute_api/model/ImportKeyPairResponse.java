package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.jcs_java_sdk.compute_api.model.KeyPair;

@XmlRootElement(name = "ImportKeyPairResponse")
/// Class to handle Import Key Pair Request's Response
	/**
		This Response Class has member functions that returns description of the Key pair Imported  
	*/
public class ImportKeyPairResponse {
	
	@XmlElement
	private String requestId;
	@XmlElement
	private String keyFingerprint;
	@XmlElement
	private String keyName;
	///Getter for the Unique Request ID
		/**
			@return final string
		*/
	public final String getRequestId() {
		return requestId;
	}
	///Getter for the Key Fingerprint
		/**
			@return final string
		*/
	public final String getKeyFingerprint() {
		return keyFingerprint;
	}
	///Getter for the key name
		/**
			@return final string
		*/
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
