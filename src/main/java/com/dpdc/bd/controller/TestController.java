package com.dpdc.bd.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class TestController {
	
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
	@RequestMapping("/test")
	public String test() {
		
		return"fragments/sidebar";
	}
	
	

}
