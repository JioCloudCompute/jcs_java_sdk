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
/// Class to handle create volume request
/**
	This class manages the request for create volume. User can create an object and and initialize the needed arguments.
*/
public class CreateVolumeRequest
{
	private String snapshotId;
	private int size;

	/// Constructor	
	public CreateVolumeRequest()
	{
		snapshotId = new String();
		size = -1;
	}
	/// Getter for the private variable snapshotId
	/**
		@return string
	*/
	public String getSnapshotId() {
		return snapshotId;
	}
	/// Setter for the private variable snapshotId
	/**
		@param snapshotId (optional) : snapshot id to create volume similar to the volume from which snapshot is created(unique for each snapshot). Not necessary if size is given
	*/
	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}
	/// Getter for the private variable size
	/**
		@return string
	*/
	public int getSize() {
		return size;
	}
	/// Setter for the private variable size
	/**
		@param size(optional) : size of the volume. Not necessary if snapshot id is given
	*/
	public void setSize(int size) {
		this.size = size;
	}
	
	
}