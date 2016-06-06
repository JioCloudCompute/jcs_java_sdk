package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Response")
public class ErrorResponse {
	@XmlElementWrapper(name = "Errors")
	@XmlElementWrapper(name = "Error")
	@XmlElement(name = "code")
	private String code;
	private String message;
	

}
