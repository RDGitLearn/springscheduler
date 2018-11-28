package com.rishudixit.sce.sleuthzipkinclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumeGreetingController {
	
	
	
	@RequestMapping(value="/consume")
	public String consumeGreetingService() {
		RestTemplate restTemplate = new RestTemplate();
		String s = restTemplate.getForObject("http://localhost:8080", String.class);
		return "Result after consuming : "  + s;
	}

}
