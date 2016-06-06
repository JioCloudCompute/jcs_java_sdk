package com.jcs_java_sdk.compute_api.model;

import java.util.ArrayList;

public class DescribeSnapshotsRequest
{
	private ArrayList<String>snapshotIds;
	private int maxResults;
	private String nextToken;
	private boolean detail;
	
	public DescribeSnapshotsRequest()
	{
		nextToken = new String();
		snapshotIds = new ArrayList<String>();
		detail = true;
		maxResults = -1;
	}

	public ArrayList<String> getSnapshotIds() {
		return snapshotIds;
	}

	public void setSnapshotIds(ArrayList<String> snapshotIds) {
		this.snapshotIds = snapshotIds;
	}

	public int getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(int maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public boolean isDetail() {
		return detail;
	}

	public void setDetail(boolean detail) {
		this.detail = detail;
	}
}