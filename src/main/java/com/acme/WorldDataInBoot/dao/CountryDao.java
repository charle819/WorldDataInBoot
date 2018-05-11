package com.acme.WorldDataInBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acme.WorldDataInBoot.entity.Country;

@Repository
public interface CountryDao extends JpaRepository<Country, String> {

	List<Country> getByContinentIgnoreCase(String continent);
}
