package com.cg.gs.beans;

import java.util.List;

public class Day {
	String name;
	List<Game> games;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	public Day(String name, List<Game> games) {
		super();
		this.name = name;
		this.games = games;
	}
	
}
