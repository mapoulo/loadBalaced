package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/customer")
public class CustometrController {
	
	
	
	@Autowired
	RestTemplate template;
	
	@RequestMapping(value="/getcustomer/{name}", method=RequestMethod.GET)
	public String getCustomer(@PathVariable String name) {
		return template.getForObject("http://CAR-SERVICE/car/getcar/"+name, String.class);
	}

}
