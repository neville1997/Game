package com.cg.gs.beans;

import java.util.List;
import java.util.Map;

public class DaySummary {
	Day day;
	Map<Game, List<Player>> daysummary;
	
	public DaySummary(Day day, Map<Game, List<Player>> daysummary) {
		super();
		this.day = day;
		this.daysummary = daysummary;
	}
	public Day getDay() {
		return day;
	}
	public void setDay(Day day) {
		this.day = day;
	}
	public Map<Game, List<Player>> getDaysummary() {
		return daysummary;
	}
	public void setDaysummary(Map<Game, List<Player>> daysummary) {
		this.daysummary = daysummary;
	}
	
}
