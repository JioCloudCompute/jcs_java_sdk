package com.jcs_java_sdk.compute_api.model;

import javax.xml.bind.annotation.XmlElement;

public class Group {
	
	@XmlElement
	private String groupName;
	@XmlElement
	private String groupId;
	void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	///Getter for Group Name of the Group
		/**
			@return final string
		*/
	public final String getGroupName() {
		return groupName;
	}
	///Getter for Unique Group ID
		/**
			@return final string
		*/
	public final String getGroupId() {
		return groupId;
	}

}
