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
