package com.cg.gs.beans;

import java.util.List;
import java.util.Map;

public class DaySummary {
	Day day;
	Map<Game, List<Player>> daysum;
	
	public DaySummary(Day day, Map<Game, List<Player>> daysum) {
		super();
		this.day = day;
		this.daysum = daysum;
	}
	public Day getDay() {
		return day;
	}
	public void setDay(Day day) {
		this.day = day;
	}
	public Map<Game, List<Player>> getDaysummary() {
		return daysum;
	}
	public void setDaysummary(Map<Game, List<Player>> daysum) {
		this.daysum = daysum;
	}
	
}
