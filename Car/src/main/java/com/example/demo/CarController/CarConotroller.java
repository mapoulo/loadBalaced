package com.example.demo.CarController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")

public class CarConotroller {

	
	@Value("${server.port}")
	private int port;
	
	@RequestMapping(value="/getcar/{name}", method=RequestMethod.GET)
	public String getCustomer(@PathVariable String name) {
		return "The service is running on port  "+port;
	}
}
