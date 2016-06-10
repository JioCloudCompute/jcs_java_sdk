package com.jcs_java_sdk.compute_api.model;
/// Class to handle import key pair request
/**
	This class manages the request for import key pair. User can create an object and and initialize the needed arguments.
*/
public class ImportKeyPairRequest
{
	private String keyName;
	private String publicKeyMaterial;
	
	/// Constructor
	public ImportKeyPairRequest()
	{
		keyName = new String();
		publicKeyMaterial = new String();
	}
	/// Getter for the private variable keyName
	/**
		@return string
	*/
	public String getKeyName() {
		return keyName;
	}
	/// Setter for the private variable keyName
	/**
		@param keyName : key name (unique for each key)
	*/
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	/// Getter for the private variable publicKeyMaterial
	/**
		@return string
	*/
	public String getPublicKeyMaterial() {
		return publicKeyMaterial;
	}
	/// Setter for the private variable publicKeyMaterial
	/**
		@param publicKeyMaterial : The public key contents created by a third party software. If not base64 encoded the public key material import would fail
	*/
	public void setPublicKeyMaterial(String publicKeyMaterial) {
		this.publicKeyMaterial = publicKeyMaterial;
	}
}