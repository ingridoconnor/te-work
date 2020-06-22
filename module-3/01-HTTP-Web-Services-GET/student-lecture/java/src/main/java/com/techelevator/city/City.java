package com.techelevator.city;

public class City {
	private String full_name;
	private int geoname_id;
	private long population;
	

	public City() {
		// TODO Auto-generated constructor stub
	}


	public String getFull_name() {
		return full_name;
	}


	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}


	public int getGeoname_id() {
		return geoname_id;
	}


	public void setGeoname_id(int geoname_id) {
		this.geoname_id = geoname_id;
	}


	public long getPopulation() {
		return population;
	}


	public void setPopulation(long population) {
		this.population = population;
	}


	@Override
	public String toString() {
		return "City [full_name=" + full_name + ", geoname_id=" + geoname_id + ", population=" + population + "]";
	}


	


	
	

}
