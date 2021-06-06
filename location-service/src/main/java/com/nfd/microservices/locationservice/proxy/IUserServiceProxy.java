package com.nfd.microservices.locationservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nfd.microservices.locationservice.bean.UserBean;

@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "location-service")
// move it to location service as this used user data
public interface IUserServiceProxy {

	@GetMapping("/location-service/user-service/longitude/{longitude}/latitude/{latitude}")
	@ResponseBody
	public List<UserBean> getPetListByLocation(@PathVariable("longitude") double longitude,
			@PathVariable("latitude") double latitude);
}
