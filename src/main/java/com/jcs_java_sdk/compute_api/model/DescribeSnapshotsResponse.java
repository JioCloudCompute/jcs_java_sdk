package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DescribeSnapshotsResponse")
/// Class to handle Describe Snapshots Request's Response
	/**
		This Response Class has member functions that returns the description of the Snapshots requested.  
	*/
public class DescribeSnapshotsResponse {
	
	@XmlElement
	private String requestId;
	@XmlElementWrapper(name="snapshotSet")
	@XmlElement(name = "item")
	private List<Snapshot> snapshots;
	///Getter for the Unique Request ID
		/**
			@return final string
		*/
	public final String getRequestId() {
		return requestId;
	}
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	///Getter for the Description of Snapshots
		/**
			@return final vector<model::snapshot>  
			A vector of objects of class snapshot
		*/
	public final List<Snapshot> getSnapshots() {
		return snapshots;
	}
	void setSnapshots(List<Snapshot> snapshots) {
		this.snapshots = snapshots;
	}
}
