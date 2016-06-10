package com.jcs_java_sdk.compute_api.model;

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
