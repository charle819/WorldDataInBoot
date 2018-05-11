package com.acme.WorldDataInBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.acme.WorldDataInBoot.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getCountryByCode(@RequestParam(name = "code", defaultValue = "AFG") String code) {
		return new ResponseEntity<>(countryService.getByCode(code), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{continent}",method = RequestMethod.GET)
	public ResponseEntity<?> getCountryByContinent(@PathVariable("continent") String continent) {
		return new ResponseEntity<>(countryService.getByContinent(continent), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/popul/{code}",method = RequestMethod.GET)
	public ResponseEntity<?> getCountryPopulation(@PathVariable("code") String code) {
		return new ResponseEntity<>(countryService.getPopulationByCode(code), HttpStatus.OK);
	}
}
