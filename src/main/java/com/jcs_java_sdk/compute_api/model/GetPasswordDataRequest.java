package com.jcs_java_sdk.compute_api.model;

public class GetPasswordDataRequest
{
	private String instanceId;
	private String privateKeyFile;
	private String passphrase;
	
	public GetPasswordDataRequest(){}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getPrivateKeyFile() {
		return privateKeyFile;
	}

	public void setPrivateKeyFile(String privateKeyFile) {
		this.privateKeyFile = privateKeyFile;
	}

	public String getPassphrase() {
		return passphrase;
	}

	public void setPassphrase(String passphrase) {
		this.passphrase = passphrase;
	}
	
	
}