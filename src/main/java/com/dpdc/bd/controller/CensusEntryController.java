package com.dpdc.bd.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dpdc.bd.dao.CensusEntryDAO;
import com.dpdc.bd.dao.GetDynamicMenuDAO;
import com.dpdc.bd.model.DPD_LOCATION_LIST;

@Controller
public class CensusEntryController {

	@Autowired
	CensusEntryDAO censusEntryDAO;
	@Autowired
	GetDynamicMenuDAO getDynamicMenuDAO;

	@RequestMapping("/DATA_ENTRY_LT")
	public String censusForm(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<DPD_LOCATION_LIST> dPD_LOCATION_LIST = censusEntryDAO.Get_DPD_LOCATION_LIST(user_name);
		model.addAttribute("dPD_LOCATION_LIST", dPD_LOCATION_LIST);
		  String dynamicMenu= getDynamicMenuDAO.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);	
	

		return "CensusEntryForm";
	}
}