package com.acme.WorldDataInBoot.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.WorldDataInBoot.dao.CountryDao;
import com.acme.WorldDataInBoot.entity.Country;
import com.acme.WorldDataInBoot.service.CountryService;

@Service(value = "countryService")
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryDao countryDao;
	
	private static final Logger LOGGER = Logger.getLogger(CountryServiceImpl.class.getName());
	
	@Override
	public Country getByCode(String code) {
		Optional<Country> c  = countryDao.findById(code.toUpperCase());
		return (c.isPresent() ? c.get() : null);
	}

	@Override
	public List<Country> getByContinent(String continent) {

		// TODO :  add pagination support
		return countryDao.getByContinentIgnoreCase(continent);
	}

}
