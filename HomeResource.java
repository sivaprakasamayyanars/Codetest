package com.example.demolog4j.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource 
{
	Logger logger =LoggerFactory.getLogger(HomeResource.class);
	@RequestMapping("/")
	public String home()
	{
		logger.info ("Starting the Home service....");
		logger.trace("Error happened");
		return "Hello from spring Boot";
	}

		logger.info ("The Home service is completed successfully....");

}
