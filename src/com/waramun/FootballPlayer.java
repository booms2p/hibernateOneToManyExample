package com.waramun;

import java.util.Date;

public class FootballPlayer implements java.io.Serializable {

	private Integer playerId;
	private String playerFname;
	private String playerLname;
	private Date playerBirthdate;
	private Integer countryId;
	private Country country;
	
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getPlayerFname() {
		return playerFname;
	}
	public void setPlayerFname(String playerFname) {
		this.playerFname = playerFname;
	}
	public String getPlayerLname() {
		return playerLname;
	}
	public void setPlayerLname(String playerLname) {
		this.playerLname = playerLname;
	}
	public Date getPlayerBirthdate() {
		return playerBirthdate;
	}
	public void setPlayerBirthdate(Date playerBirthdate) {
		this.playerBirthdate = playerBirthdate;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
}
