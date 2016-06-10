package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "DeleteKeyPairResponse")
/// Class to handle Delete Key Pair Request's Response
	/**
		This Response Class has member function to know whether the key was successfully deleted or not. 
	*/
public class DeleteKeyPairResponse {
	@XmlElement(name = "return")
	private boolean result;
	@XmlElement
	private String requestId;
	
	///Getter for Result of the Request
		/**
			@return bool
			True if Key Pair was successfully Deleted
		*/
	public final boolean isResult() {
		return result;
	}
	///Getter for the Unique Request ID
		/**
			@return final string
		*/
	public final String getRequestId() {
		return requestId;
	}
	void setResult(boolean result) {
		this.result = result;
	}
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	

}
