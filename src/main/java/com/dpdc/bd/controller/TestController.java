package com.dpdc.bd.controller;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dpdc.bd.dao.GetDynamicMenuDAO;

@org.springframework.stereotype.Controller
public class TestController {
	
	@Resource
	GetDynamicMenuDAO getDynamicMenuDAO;
	 
	
	@RequestMapping("/meterDetailsForm")
	public String meterDetails(@CookieValue(value = "user_name", defaultValue = "") String user_name,Model model) {
		
		return"meterDetailsForm";
	}
	@RequestMapping("/distribution")
	public String distribution(@CookieValue(value = "user_name", defaultValue = "") String user_name,Model model) {
		 
		
		return"distributionForm";
	}
	@RequestMapping("/DASHBOARD")
	
	public String test(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}				
		 
		return"dashBoard";
	}
	@ModelAttribute
	public void addCommonData(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {					
		  String dynamicMenu= getDynamicMenuDAO.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
	}
	@RequestMapping("/test")
	public String test() {

		return"website";
	}
	@RequestMapping("/BILL_PRINT")
	public String BILL_PRINT() {
		
		return"BILL_PRINT";
	}
	
	
	

}
