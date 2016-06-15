/*******************************************************************************
 * Copyright (c) 2016 Jiocloud.com, Inc. or its affiliates.  All Rights Reserved
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, dis-
 * tribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the fol-
 * lowing conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABIL-
 * ITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT
 * SHALL THE AUTHOR BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 *******************************************************************************/
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