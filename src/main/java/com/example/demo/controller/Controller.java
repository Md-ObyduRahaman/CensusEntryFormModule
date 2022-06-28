package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/CensusEntryForm")
	public String censusForm() {
		
		
		return "CensusEntryForm";
	}
	@RequestMapping("/meterDetailsForm")
	public String meterDetails() {
		return"meterDetailsForm";
	}
	@RequestMapping("/distribution")
	public String distribution() {
		
		return"distributionForm";
	}
	@RequestMapping("/")
	public String loginPage() {
		System.out.println("hello loginPage");
		return"loginPage";
	}
	

}
