package com.dpdc.bd.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String censusFormTable(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu = getDynamicMenuDAO.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		ArrayList<CensusFormModel> listOf_CensusEntity = censusEntryDAO.listOf_CensusFormModel();
		model.addAttribute("listOf_CensusEntity", listOf_CensusEntity);

		
		return "CensusEntryTable";
	}
	@GetMapping("/DATA_ENTRY_LT_FORM")
	public String censusForm(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu = getDynamicMenuDAO.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		ArrayList<DPD_LOCATION_LIST> dPD_LOCATION_LIST = censusEntryDAO.Get_DPD_LOCATION_LIST(user_name);
		model.addAttribute("dPD_LOCATION_LIST", dPD_LOCATION_LIST);
		return "CensusEntryForm";
	}
	@GetMapping("/DATA_ENTRY_LT_FORM_Update/{id}")
	public String censusFormUpdate(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String CUST_INT_ID, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu = getDynamicMenuDAO.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		ArrayList<DPD_LOCATION_LIST> dPD_LOCATION_LIST = censusEntryDAO.Get_DPD_LOCATION_LIST(user_name);
		model.addAttribute("dPD_LOCATION_LIST", dPD_LOCATION_LIST);
		CensusFormModel single_CensusFormUpdate_Data = censusEntryDAO.Single_CensusFormUpdate_Data(CUST_INT_ID);
		model.addAttribute("SCD", single_CensusFormUpdate_Data);
		model.addAttribute("LOCATION_CODE", single_CensusFormUpdate_Data.getLOCATION_CODE());
		
		return "CensusUpdateEntryForm";
	}

	@PostMapping("/DATA_ENTRY_LT")
	public String censusEntry(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			CensusFormModel censusFormModel, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu = getDynamicMenuDAO.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		String insertStatus= censusEntryDAO.insertCensusEntry(censusFormModel, user_name);
		System.out.println(censusFormModel.toString());
		int i=Integer.parseInt(insertStatus);
		if (i==1) {
			String msg = "Save/Update Successfull ";
			model.addAttribute("msg", msg);
			System.out.println(msg);
		}
		return  "CensusEntryForm";
	}

	
}