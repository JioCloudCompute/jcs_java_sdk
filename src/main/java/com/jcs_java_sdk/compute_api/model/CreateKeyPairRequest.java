package com.jcs_java_sdk.compute_api.model;
/// Class to handle create key pair request
/**
	This class manages the request for create key pair. User can create an object and and initialize the needed arguments.
*/
public class CreateKeyPairRequest
{
	private String keyName;
	/// Constructor
	public CreateKeyPairRequest()
	{
		keyName = new String();
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
		@param keyName : key name of the key pair created (unique for each key pair)
	*/ 
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	
	
}