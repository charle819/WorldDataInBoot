package com.acme.WorldDataInBoot.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.WorldDataInBoot.dao.CityDao;
import com.acme.WorldDataInBoot.entity.City;
import com.acme.WorldDataInBoot.service.CityService;

@Service(value = "cityService")
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao cityDao;

	private static final Logger LOGGER = Logger.getLogger(CityServiceImpl.class.getName());

	@Override
	public List<City> getByCountryCode(String code) {
		
		// TODO : add pagination support 
		return cityDao.getByCountryCodeIgnoreCase(code);
	}
	
	@Override
	public List<City> getByName(String name) {
		return cityDao.getByNameIgnoreCase(name);
	}
}
