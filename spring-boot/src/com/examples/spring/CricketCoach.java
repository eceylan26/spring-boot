package com.examples.spring;

public class CricketCoach implements Coach {

	private  FortuneService fortuneService;
	
	//add new fields for email and team
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String emailString) {
		System.out.println("CricketCoach: inside setter method - setEmail");
		this.email = emailString;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside default constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 min.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
