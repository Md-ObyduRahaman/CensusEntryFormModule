package com.dpdc.bd.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dpdc.bd.dao.CensusEntryDAO;
import com.dpdc.bd.dao.GetDynamicMenuDAO;
import com.dpdc.bd.model.CensusFormModel;
import com.dpdc.bd.model.DPD_LOCATION_LIST;

@Controller
public class CensusEntryController {

	@Autowired
	CensusEntryDAO censusEntryDAO;
	@Autowired
	GetDynamicMenuDAO getDynamicMenuDAO;

	@GetMapping("/DATA_ENTRY_LT")
	public String censusForm(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<DPD_LOCATION_LIST> dPD_LOCATION_LIST = censusEntryDAO.Get_DPD_LOCATION_LIST(user_name);
		model.addAttribute("dPD_LOCATION_LIST", dPD_LOCATION_LIST);

		return "CensusEntryForm";
	}

	@PostMapping("/DATA_ENTRY_LT")
	public String censusEntry(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			CensusFormModel censusFormModel, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		censusEntryDAO.insertCensusEntry(censusFormModel, user_name);
		System.out.println(censusFormModel.toString());
		return  "redirect:/DATA_ENTRY_LT";
	}

	@ModelAttribute
	public void addCommonData(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		String dynamicMenu = getDynamicMenuDAO.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
	}
}