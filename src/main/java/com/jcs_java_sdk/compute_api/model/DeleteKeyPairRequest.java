package com.jcs_java_sdk.compute_api.model;

/// Class to handle delete key pair request
/**
	This class manages the request for delete key pair. User can create an object and and initialize the needed arguments.
*/
public class DeleteKeyPairRequest
{
	private String keyName;
	
	/// Constructor
	public DeleteKeyPairRequest()
	{
		keyName = new String();
	}
	/// Getter for the private variable key_name
	/**
		@return string
	*/
	public String getKeyName() {
		return keyName;
	}
	/// Setter for the private variable keyName
	/**
		@param keyName : key name to be deleted(unique for each key)
	*/
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	
	
}