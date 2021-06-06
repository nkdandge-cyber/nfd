package com.nfd.microservices.locationservice.bean;

import java.util.Date;

public class UserBean {
	
	private long userId;
	private String username;
	private String petName;
	private boolean isPremium;
	private boolean isOpted;
	private String createdBy;
	private Date createdTimestamp;
	private String lastUpdatedBy;
	private Date lastUpdatedTimestamp;

	public UserBean() {

	}

	public UserBean(long userId, String username, String petName, boolean isPremium, boolean isOpted, String createdBy,
			Date createdTimestamp, String lastUpdatedBy, Date lastUpdatedTimestamp) {
		super();
		this.userId = userId;
		this.username = username;
		this.petName = petName;
		this.isPremium = isPremium;
		this.isOpted = isOpted;
		this.createdBy = createdBy;
		this.createdTimestamp = createdTimestamp;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}

	public boolean isOpted() {
		return isOpted;
	}

	public void setOpted(boolean isOpted) {
		this.isOpted = isOpted;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdatedTimestamp() {
		return lastUpdatedTimestamp;
	}

	public void setLastUpdatedTimestamp(Date lastUpdatedTimestamp) {
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
	}

}
