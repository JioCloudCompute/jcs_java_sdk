package com.jcs_java_sdk.compute_api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DescribeSnapshotsResponse {
	@XmlElement
	private String requestId;
	@XmlElementWrapper(name="snapshotSet")
	private List<Snapshot> snapshots;
}
