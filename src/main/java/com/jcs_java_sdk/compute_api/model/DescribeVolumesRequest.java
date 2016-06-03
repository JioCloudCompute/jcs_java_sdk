package com.jcs_java_sdk.compute_api.model;

import java.util.ArrayList;

public class DescribeVolumesRequest
{
	private ArrayList<String>volumeIds;
	private int maxResults;
	private String nextToken;
	private boolean detail;
	
	public DescribeVolumesRequest()
	{
		maxResults = -1;
		detail = true;
	}

	public ArrayList<String> getVolumeIds() {
		return volumeIds;
	}

	public void setVolumeIds(ArrayList<String> volumeIds) {
		this.volumeIds = volumeIds;
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