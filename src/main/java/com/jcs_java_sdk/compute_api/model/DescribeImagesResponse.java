package com.jcs_java_sdk.compute_api.model;

import java.util.List;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement(name ="DescribeImagesResponse")
public class DescribeImagesResponse {
	
	@XmlElement(name = "requestId")
	private String requestId;
	@XmlElementWrapper(name="imagesSet")
	@XmlElement(name = "item")
	private List<Image> images;
	
	
	public final String getRequestId() {
		return requestId;
	}
	final void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public final List<Image> getImages() {
		return images;
	}
	final void setImages(List<Image> images) {
		this.images = images;
	} 

}
