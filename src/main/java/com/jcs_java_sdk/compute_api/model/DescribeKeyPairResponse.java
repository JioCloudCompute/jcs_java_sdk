package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DescribeKeyPairResponse {
	@XmlElement
	private String requestId;
	
	@XmlElementWrapper(name = "keySet")
	@XmlElement(name = "item")
	private List<KeyPair> keys;

	public final String getRequestId() {
		return requestId;
	}

	public final List<KeyPair> getKeys() {
		return keys;
	}

	void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	void setKeys(List<KeyPair> keys) {
		this.keys = keys;
	}
	
	
	
}
