package com.acme.WorldDataInBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acme.WorldDataInBoot.entity.City;

@Repository
public interface CityDao extends JpaRepository<City, Integer>{

	List<City> getByCountryCodeIgnoreCase(String code);
	
	List<City> getByNameIgnoreCase(String name);
}
