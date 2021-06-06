package com.nfd.microservices.locationservice.bean;

import java.util.Date;

public class LocationBean {
	private long locationId;
	private long userId;
	private double longitude;
	private double latitude;
	private String createdBy;
	private Date createdTimestamp;
	private String lastUpdatedBy;
	private Date lastUpdatedTimestamp;

	public LocationBean() {
	}

	public LocationBean(long locationId, long userId, double longitude, double latitude, String createdBy,
			Date createdTimestamp, String lastUpdatedBy, Date lastUpdatedTimestamp) {
		super();
		this.locationId = locationId;
		this.userId = userId;
		this.longitude = longitude;
		this.latitude = latitude;
		this.createdBy = createdBy;
		this.createdTimestamp = createdTimestamp;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
	}

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
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
