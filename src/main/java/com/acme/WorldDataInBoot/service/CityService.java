package com.acme.WorldDataInBoot.service;

import java.util.List;

import com.acme.WorldDataInBoot.entity.City;

public interface CityService {

	 List<City> getByCountryCode(String code);
	 
	 List<City> getByName(String name);
}
