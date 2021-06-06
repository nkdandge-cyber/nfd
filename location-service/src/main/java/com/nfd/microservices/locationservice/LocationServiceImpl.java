package com.nfd.microservices.locationservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nfd.microservices.locationservice.bean.LocationBean;
import com.nfd.microservices.locationservice.bean.UserBean;
import com.nfd.microservices.locationservice.proxy.IUserServiceProxy;

public class LocationServiceImpl implements ILocationService {
	private static List<LocationBean> locationBeans = new ArrayList<LocationBean>();
	/*@Autowired*/
	private IUserServiceProxy userServiceProxy;

	@Override
	public void updateLocations(LocationBean locationBean) {
		locationBeans.add(locationBean);
	}

	@Override
	public List<LocationBean> getLocationHistory(long userId) {

		return locationBeans;
	}

	@Override
	public List<UserBean> getPetListByLocation(double longitude, long latitude) {

		return userServiceProxy.getPetListByLocation(longitude, latitude);
	}

	static {
		for (int i = 1; i < 10; i++) {
			locationBeans.add(new LocationBean(i, i, 77 + i, 78 + i, "", new Date(), "", new Date()));
		}
	}

}
