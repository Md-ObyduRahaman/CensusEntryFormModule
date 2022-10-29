package com.dpdc.bd.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dpdc.bd.dao.BillPrintDoa;
import com.dpdc.bd.dao.CensusEntryDAO;
import com.dpdc.bd.dao.GetDynamicMenuDAO;
import com.dpdc.bd.model.AddMeterModel;
import com.dpdc.bd.model.DPD_LOCATION_LIST;

@org.springframework.stereotype.Controller
public class TestController {

	@Resource
	GetDynamicMenuDAO getDynamicMenuDAO;
	@Resource
	BillPrintDoa billPrintDoa;
	@Resource
	CensusEntryDAO censusEntryDAO;

	

	@RequestMapping("/distribution")
	public String distribution(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {

		return "distributionForm";
	}

	@RequestMapping("/DASHBOARD")

	public String test(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}

		return "dashBoard";
	}

	@ModelAttribute
	public void addCommonData(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		String dynamicMenu = getDynamicMenuDAO.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
	}

	@RequestMapping("/test2")
	public String test() {

		return "fragments/sidebar";
	}
	
	
	  @RequestMapping("/test") 
	  public String BILL_PRINT() {
				
			

			
	  return"InitialReading"; }
	  
	 

}
