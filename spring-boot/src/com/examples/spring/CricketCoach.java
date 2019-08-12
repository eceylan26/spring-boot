package com.examples.spring;

public class CricketCoach implements Coach {

	private  FortuneService fortuneService;
	
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
