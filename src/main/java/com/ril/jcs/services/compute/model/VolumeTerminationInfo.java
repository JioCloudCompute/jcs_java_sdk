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

public class VolumeTerminationInfo {
	
	@XmlElement
	private String instanceId;
	@XmlElement
	private String volumeId;
	@XmlElement
	private boolean DeleteOnTermination;
	public final String getInstanceId() {
		return instanceId;
	}
	public final String getVolumeId() {
		return volumeId;
	}
	public final boolean isDeleteOnTermination() {
		return DeleteOnTermination;
	}
	void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	void setDeleteOnTermination(boolean deleteOnTermination) {
		DeleteOnTermination = deleteOnTermination;
	}
	
	

}
