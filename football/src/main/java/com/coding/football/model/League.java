package com.coding.football.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class League {
	@JsonProperty("country_id")
	private String countryId;
	@JsonProperty("league_id")
	private String leagueId;
}
