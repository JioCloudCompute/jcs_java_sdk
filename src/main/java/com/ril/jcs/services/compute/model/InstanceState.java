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
///Class Describing the Details of a Instance
public class InstanceState {
	
	@XmlElement
	private String instanceId;
	@XmlElement
	private String currentState;
	@XmlElement
	private String previousState;
	///Getter for the Instance ID
		/**
			@return final string
		*/
	public final String getInstanceId() {
		return instanceId;
	}
	///Getter for the Current State of the Instance
		/**
			@return final string
			pending, running, shutting-down, terminated, stopping, stopped
		*/
	public final String getCurrentState() {
		return currentState;
	}
	///Getter for the Previous State of the Instance
	/**
		@return final string
		pending, running, shutting-down, terminated, stopping, stopped
	*/
	public final String getPreviousState() {
		return previousState;
	}
	void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	void setPreviousState(String previousState) {
		this.previousState = previousState;
	}
	
	

}
