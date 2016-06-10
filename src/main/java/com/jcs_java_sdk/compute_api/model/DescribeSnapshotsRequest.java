package com.jcs_java_sdk.compute_api.model;

import java.util.ArrayList;
/// Class to handle describe snapshots request
/**
	This class manages the request for describe snapshots. User can create an object and and initialize the needed arguments.
*/
public class DescribeSnapshotsRequest
{
	private ArrayList<String>snapshotIds;
	private int maxResults;
	private String nextToken;
	private boolean detail;
	
	/// Constructor
	public DescribeSnapshotsRequest()
	{
		nextToken = new String();
		snapshotIds = new ArrayList<String>();
		detail = true;
		maxResults = -1;
	}
	/// Getter for the private variable snapshotsIds
	/**
		@return ArrayList<String>
	*/
	public ArrayList<String> getSnapshotIds() {
		return snapshotIds;
	}
	/// Setter for the private variable snapshotsIds
	/**
		@param snapshotIds (optional): Array of snapshot ids
	*/
	public void setSnapshotIds(ArrayList<String> snapshotIds) {
		this.snapshotIds = snapshotIds;
	}
	/// Getter for the private variable maxResults
	/**
		@return int
	*/
	public int getMaxResults() {
		return maxResults;
	}
	/// Setter for the private variable maxResults
	/**
		@param maxResults (optional): Max number of results to be shown in response.
	*/
	public void setMaxResults(int maxResults) {
		this.maxResults = maxResults;
	}
	/// Getter for the private variable nextToken
	/**
		@return string
	*/
	public String getNextToken() {
		return nextToken;
	}
	/// Setter for the private variable nextToken
	/**
		@param nextToken (optional): NextToken - Id of last snapshot seen if max number of results is less than total snapshots
	*/
	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}
	/// Getter for the private variable detail
	/**
		@return bool
	*/
	public boolean isDetail() {
		return detail;
	}
	/// Setter for the private variable detail
	/**
		@param detail (optional): Detail - by default this is true. Set to false to will supress detailed response
	*/
	public void setDetail(boolean detail) {
		this.detail = detail;
	}
}