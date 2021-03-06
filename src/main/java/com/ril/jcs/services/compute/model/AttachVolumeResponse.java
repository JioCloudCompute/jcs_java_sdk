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
@XmlRootElement(name = "AttachVolumeResponse")
/// Class to handle Attach Volume Response
	/**
		This Response Class has member variables and functions to get details of
		the volume that was requested to attach to a particular instance. 
	*/
public class AttachVolumeResponse {
	@XmlElement
	String requestId;
	@XmlElement
	String deviceName;
	@XmlElement
	String instanceId;
	@XmlElement
	boolean deleteOnTermination;
	@XmlElement
	String status;
	@XmlElement
	String volumeId;

	///Getter for the Request ID
		/**
			\return  String
		*/
	public final String getRequestId() {
		return requestId;
	}
	
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	///Getter for the Device Name
		/**
			\return  String
		*/
	public final String getDeviceName() {
		return deviceName;
	}
	void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	///Getter for the Instance ID
		/**
			\return  String
		*/
	public final String getInstanceId() {
		return instanceId;
	}
	
	void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	///Getter for the Delete On Termination Flag 
		/**
			\return  Bool
		*/
	public final boolean isDeleteOnTermination() {
		return deleteOnTermination;
	}
	void setDeleteOnTermination(boolean deleteOnTermination) {
		this.deleteOnTermination = deleteOnTermination;
	}
	///Getter for the Status of the Request
		/**
			\return  String
		*/
		
	public final String getStatus() {
		return status;
	}
	void setStatus(String status) {
		this.status = status;
	}
	///Getter for the Volume Id
		/**
			\return  String
		*/
	public final String getVolumeId() {
		return volumeId;
	}
	void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	
}
