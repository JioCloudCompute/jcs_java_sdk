package com.jcs_java_sdk.compute_api.model;
/// Class to handle attach volume request
/**
	This class manages the request for attach volume. User can create an object and and initialize the needed arguments.
*/
public class GetPasswordDataRequest
{
	private String instanceId;
	private String privateKeyFile;
	private String passphrase;
	
	/// Constructor
	public GetPasswordDataRequest()
	{
		instanceId = new String();
		privateKeyFile = new String();
		passphrase = new String();
	}
	/// Getter for the private variable instanceId
	/**
		@return string
	*/
	public String getInstanceId() {
		return instanceId;
	}
	/// Setter for the private variable instanceId 
	/**
		@param instanceId : instance id  with which volume will be attached(unique for each instance)
	*/
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	/// Getter for the private variable privateKeyFile
	/**
		@return string
	*/
	public String getPrivateKeyFile() {
		return privateKeyFile;
	}
	/// Setter for the private variable privateKeyFile
	/**
		@param privateKeyFile (optional): path to the private key file
	*/
	public void setPrivateKeyFile(String privateKeyFile) {
		this.privateKeyFile = privateKeyFile;
	}
	/// Getter for the private variable passphrase 
	/**
		@return string
	*/
	public String getPassphrase() {
		return passphrase;
	}
	/// Setter for the private variable passphrase 
	/**
		@param passphrase_ (optional): password if the private key file is password protected
	*/
	public void setPassphrase(String passphrase) {
		this.passphrase = passphrase;
	}
	
	
}