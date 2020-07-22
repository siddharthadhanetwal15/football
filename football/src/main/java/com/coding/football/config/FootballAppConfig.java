package com.coding.football.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties("football")
@Data
public class FootballAppConfig {

	private String hostUrl;

	private String apiKey;

	private String apiCountries;

	private String apiLeagues;

	private String apiTeams;

	private String apiStandings;

}
