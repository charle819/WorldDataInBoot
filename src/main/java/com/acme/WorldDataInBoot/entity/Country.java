package com.acme.WorldDataInBoot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@Column(columnDefinition = "character(3)", nullable = false)
	private String code;

	@Column(columnDefinition = "text", nullable = false)
	private String name;

	@Column(columnDefinition = "text", nullable = false) // TODO :  need to add constrain to add only selected continents
	private String continent;

	@Column(columnDefinition = "text", nullable = false)
	private String region;

	@Column(name = "surfacearea", columnDefinition = "real", nullable = false)
	private Float surfaceArea;

	@Column(name = "indepyear")
	private Integer independenceYear;

	@Column(precision = 10, scale = 2)
	private Double gnp;

	@Column(precision = 10, scale = 2)
	private Double gnpold;

	@Column(name = "localname", columnDefinition = "text", nullable = false)
	private String localName;

	@Column(name = "governmentform", columnDefinition = "text", nullable = false)
	private String governmentFrom;

	@Column(name = "headofstate", columnDefinition = "text")
	private String headOfState;

	private Integer capital;

	@Column(columnDefinition = "character(2)", nullable = false)
	private String code2;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Float getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(Float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public Integer getIndependenceYear() {
		return independenceYear;
	}

	public void setIndependenceYear(Integer independenceYear) {
		this.independenceYear = independenceYear;
	}

	public Double getGnp() {
		return gnp;
	}

	public void setGnp(Double gnp) {
		this.gnp = gnp;
	}

	public Double getGnpold() {
		return gnpold;
	}

	public void setGnpold(Double gnpold) {
		this.gnpold = gnpold;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getGovernmentFrom() {
		return governmentFrom;
	}

	public void setGovernmentFrom(String governmentFrom) {
		this.governmentFrom = governmentFrom;
	}

	public String getHeadOfState() {
		return headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public Integer getCapital() {
		return capital;
	}

	public void setCapital(Integer capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

}
