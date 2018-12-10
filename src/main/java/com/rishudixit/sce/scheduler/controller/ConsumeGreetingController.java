package com.rishudixit.sce.scheduler.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumeGreetingController {
	
	
	@Scheduled(fixedRate = 5000)
	@RequestMapping(value="/consume")
	public String consumeGreetingService() {
		RestTemplate restTemplate = new RestTemplate();
		String s = restTemplate.getForObject("http://localhost:8080", String.class);
		return "Result after consuming : "  + s;
	}

}
