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
/// Class to handle update delete on termination flag request
/**
	This class manages the request for update delete on termination flag. User can create an object and and initialize the needed arguments.
*/
public class UpdateDeleteOnTerminationFlagRequest 
{
	private String volumeId;
	private boolean deleteOnTermination;
	
	///Constructor
	public UpdateDeleteOnTerminationFlagRequest()
	{
		volumeId = new String();
		deleteOnTermination = false;
	}
	/// Getter for the private variable volumeId
	/**
		@return string
	*/
	public String getVolumeId() {
		return volumeId;
	}
	/// Setter for the private variable volumeId
	/**
		@param volumeId : Particular volume id to be updated for DeleteOnTermination flag.
	*/
	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
	/// Getter for the private variable deleteOnTermination
	/**
		@return bool
	*/
	public boolean isDeleteOnTermination() {
		return deleteOnTermination;
	}
	/// Setter for the private variable deleteOnTermination
	/**
		@param deleteOnTermination : Boolean value for the DeleteOnTermination flag 
	*/
	public void setDeleteOnTermination(boolean deleteOnTermination) {
		this.deleteOnTermination = deleteOnTermination;
	}
}