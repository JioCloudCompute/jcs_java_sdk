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

import java.util.List;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
/// Class to handle Describe Image Request's Response
	/**
		This Response Class has member functions that returns the description of images requested.
	*/
@XmlRootElement(name ="DescribeImagesResponse")
public class DescribeImagesResponse {
	
	@XmlElement(name = "requestId")
	private String requestId;
	@XmlElementWrapper(name="imagesSet")
	@XmlElement(name = "item")
	private List<Image> images;
	
	///Getter for the Unique Request ID
		/**
			@return final string
		*/
	public final String getRequestId() {
		return requestId;
	}
	final void setRequestId(String requestId) {
		this.requestId = requestId;
	}
		///Getter for the Description of Images requested
		/**
			@return vector<image> *
			A vector of objects of class image
		*/
	public final List<Image> getImages() {
		return images;
	}
	final void setImages(List<Image> images) {
		this.images = images;
	} 

}
