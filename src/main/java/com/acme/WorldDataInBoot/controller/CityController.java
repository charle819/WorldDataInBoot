package com.acme.WorldDataInBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.acme.WorldDataInBoot.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	@Autowired
	private CityService cityService;
	
	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public ResponseEntity<?> getStatus(){
		return new ResponseEntity<>("Api is up and running", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{code}",method = RequestMethod.GET)
	public ResponseEntity<?> getCityByCountryCode(@PathVariable("code") String code){
		return new ResponseEntity<>(cityService.getByCountryCode(code), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getCityByName(@RequestParam("name") String name){
		return new ResponseEntity<>(cityService.getByName(name), HttpStatus.OK);
	}

}
