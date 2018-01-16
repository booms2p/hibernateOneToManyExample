package com.waramun;

import java.util.HashSet;
import java.util.Set;

public class Country implements java.io.Serializable {

	private Integer countryId;
	private String countryName;
	private Set <FootballPlayer> footballPlayer = new HashSet<FootballPlayer>(0);
	
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Set<FootballPlayer> getFootballPlayer() {
		return footballPlayer;
	}
	public void setFootballPlayer(Set<FootballPlayer> footballPlayer) {
		this.footballPlayer = footballPlayer;
	}
}
