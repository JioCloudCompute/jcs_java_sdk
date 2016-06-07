package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DescribeSnapshotsResponse")
public class DescribeSnapshotsResponse {
	
	@XmlElement
	private String requestId;
	@XmlElementWrapper(name="snapshotSet")
	@XmlElement(name = "item")
	private List<Snapshot> snapshots;
	
	public final String getRequestId() {
		return requestId;
	}
	void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public final List<Snapshot> getSnapshots() {
		return snapshots;
	}
	void setSnapshots(List<Snapshot> snapshots) {
		this.snapshots = snapshots;
	}
}
