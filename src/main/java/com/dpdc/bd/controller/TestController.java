package com.dpdc.bd.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dpdc.bd.dao.BillPrintDoa;
import com.dpdc.bd.dao.GetDynamicMenuDAO;
import com.dpdc.bd.model.AddMeterModel;

@org.springframework.stereotype.Controller
public class TestController {

	@Resource
	GetDynamicMenuDAO getDynamicMenuDAO;
	@Resource
	BillPrintDoa billPrintDoa;

	@RequestMapping("/meterDetailsForm")
	public String meterDetails(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {

		return "meterDetailsForm";
	}

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

	@RequestMapping("/test")
	public String test() {

		return "fragments/sidebar";
	}
	
	  @RequestMapping("/itr") 
	  public String BILL_PRINT(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model,HttpServletResponse response) {
			if (user_name.equals("")) {
				return "redirect:/";
			}

			ArrayList<AddMeterModel> Bill_Cycle_LIST = billPrintDoa.Get_Bill_Cycle_LIST(user_name);
			
			model.addAttribute("Bill_Cycle_LIST", Bill_Cycle_LIST);
	  return"iter"; }
	  
	 

}
