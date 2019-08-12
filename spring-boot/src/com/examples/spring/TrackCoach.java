package com.examples.spring;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method - doMyStartupStuff ");
	}
	
	// add a destroy method
	public void doMyDestoyStuff() {
		System.out.println("TrackCoach: inside method - doMyDestoyStuff ");
	}
	
	
	
	
	

}
