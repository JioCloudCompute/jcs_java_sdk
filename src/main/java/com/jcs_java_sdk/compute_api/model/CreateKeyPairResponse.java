package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CreateKeyPairResponse")
/// Class to handle Create Key Pair Request's Response.
	/**
		This class object describes the key fingerprint, key material, key name of the created key pair.
	*/
public class CreateKeyPairResponse {
	
	@XmlElement
	private String requestId;
	@XmlElement
	private String keyFingerprint;
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
	///Getter for the Key FingerPrint of the Key Created
		/**
			@return const string
		*/
	public final String getKeyFingerprint() {
		return keyFingerprint;
	}
	final void setKeyFingerPrint(String keyFingerprint) {
		this.keyFingerprint = keyFingerprint;
	}
	///Getter for the Key Material(RSA Private Key) of the Key Created
		/**
			@return const string
		*/
	public final String getKeyMaterial() {
		return keyMaterial;
	}

	final void setKeyMaterial(String keyMaterial) {
		this.keyMaterial = keyMaterial;
	}
	///Getter for the Key Name of the Key Created
		/**
			@return const string
		*/
	public final String getKeyName() {
		return keyName;
	}
	final void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	
}
