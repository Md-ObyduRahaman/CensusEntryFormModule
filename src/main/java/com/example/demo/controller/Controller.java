package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/")
	public String censusForm() {
		
		
		return "CensusEntryForm";
	}
	@RequestMapping("/meterDetailsForm")
	public String meterDetails() {
		return"meterDetailsForm";
	}
	@RequestMapping("/distribution")
	public String distribution() {
		System.out.println("hello distributionForm");
		return"distributionForm";
	}
	

}
