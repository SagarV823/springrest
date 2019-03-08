package com.cognizant.di;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {

	private List<String> countryNames;
	private Set<String> cityNames;
	private Map<String,String> regionNames;
	
	public List<String> getCountryNames() {
		return countryNames;
	}
	public void setCountryNames(List<String> countryNames) {
		this.countryNames = countryNames;
	}
	public Set<String> getCityNames() {
		return cityNames;
	}
	public void setCityNames(Set<String> cityNames) {
		this.cityNames = cityNames;
	}
	public Map<String, String> getRegionNames() {
		return regionNames;
	}
	public void setRegionNames(Map<String, String> regionNames) {
		this.regionNames = regionNames;
	}
	@Override
	public String toString() {
		return "CollectionBean [countryNames=" + countryNames + ", cityNames=" + cityNames + ", regionNames="
				+ regionNames + "]";
	}
}
