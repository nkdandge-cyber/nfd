package com.nfd.microservices.locationservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nfd.microservices.locationservice.ILocationService;
import com.nfd.microservices.locationservice.bean.LocationBean;

@RestController
public class LocationServiceController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ILocationService locationService;

	@RequestMapping(value = "/location-service/update", method = RequestMethod.PUT, headers = "Accept=application/json")
	@ResponseBody
	public String updateLocation(@RequestBody LocationBean locationBean) {

		logger.info("Start - updateLocation");
		locationService.updateLocations(locationBean);

		return "Success";
	}

	@GetMapping("/location-service/from/{from}/to")
	public String getLocationHistory(@PathVariable String from, @PathVariable String to) {

		logger.info("{}");

		return null;
	}

	@GetMapping("/location-service/")
	public String getNearbyPets(@PathVariable String from, @PathVariable String to) {

		logger.info("{}");

		return null;
	}

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public String retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

		logger.info("{}");

		return null;
	}
}
