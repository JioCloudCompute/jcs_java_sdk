package com.jcs_java_sdk.compute_api.model;

public class ImportKeyPairRequest
{
	private String keyName;
	private String publicKeyMaterial;
	
	public ImportKeyPairRequest(){}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getPublicKeyMaterial() {
		return publicKeyMaterial;
	}

	public void setPublicKeyMaterial(String publicKeyMaterial) {
		this.publicKeyMaterial = publicKeyMaterial;
	}
}