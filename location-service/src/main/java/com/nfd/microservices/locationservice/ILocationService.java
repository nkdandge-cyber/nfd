package com.nfd.microservices.locationservice;

import java.util.List;

import com.nfd.microservices.locationservice.bean.LocationBean;
import com.nfd.microservices.locationservice.bean.UserBean;

public interface ILocationService {
	public void updateLocations(LocationBean locationBean);

	public List<LocationBean> getLocationHistory(long userId);

	public List<UserBean> getPetListByLocation(double logitude, long latitude);

}
