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