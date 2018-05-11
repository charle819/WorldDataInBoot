package com.acme.WorldDataInBoot.service;

import java.util.List;

import com.acme.WorldDataInBoot.entity.Country;

public interface CountryService {

	Country getByCode(String code);

	List<Country> getByContinent(String continent);
	
	Integer getPopulationByCode(String code);
}
