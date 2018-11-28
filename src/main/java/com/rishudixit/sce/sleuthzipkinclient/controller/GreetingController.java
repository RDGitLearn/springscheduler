package com.rishudixit.sce.sleuthzipkinclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	 
	private static final Logger log = LoggerFactory.getLogger(GreetingController.class);


	  @RequestMapping("/")
	  public String home() {
	    log.info("Handling home");
	    return "Hello World";
	  }
}
