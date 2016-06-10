package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DescribeKeyPairsResponse")
/// Class to handle Describe Key Pairs Request Respones
	/**
		This Response Class has member functions that returns the description of Key Pairs that are created by the user.  
	*/
public class DescribeKeyPairsResponse {
	@XmlElement
	private String requestId;
	
	@XmlElementWrapper(name = "keySet")
	@XmlElement(name = "item")
	private List<KeyPair> keys;

	public final String getRequestId() {
		return requestId;
	}
	///Getter for the Description of Key Pairs created by the authentic user.
		/**
			@return final vector<model::key_pair>  
			A vector of objects of class key_pair
		*/
	public final List<KeyPair> getKeys() {
		return keys;
	}
	///Getter for the Unique Request ID
		/**
			@return final string
		*/
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	void setKeys(List<KeyPair> keys) {
		this.keys = keys;
	}
	
	
	
}
