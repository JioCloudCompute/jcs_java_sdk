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
package com.ril.jcs.services.compute.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ShowDeleteOnTerminationFlagResponse")
/// Class to handle Show Delete On Termination Flag Request's Response
	/**
		This Response Class has member functions that returns the description of the volume whose flag is requested .  
	*/
public class ShowDeleteOnTerminationFlagResponse {
	@XmlElement
	private String requestId;
	
	@XmlElement(name = "volume")
	private VolumeTerminationInfo volume;
	///Getter for the Unique Request ID
		/**
			@return final string
		*/
	public final String getRequestId() {
		return requestId;
	}
	///Getter for the Instance ID to which the volume is attached
		/**
			@return final string
		*/
	public final String getInstanceId() {
		return volume.getInstanceId();
	}
	///Getter for the Volume ID
		/**
			@return final string
		*/
	public final String getVolumeId() {
		return volume.getVolumeId();
	}
	///Getter for the Delete On termination Flag corresponding to the Volume
	/**
		@return final bool
	*/
	public final boolean isDeleteOnTermination() {
		return volume.isDeleteOnTermination();
	}
	
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	void setVolume(VolumeTerminationInfo volume) {
		this.volume = volume;
	}
		
	
	
}
