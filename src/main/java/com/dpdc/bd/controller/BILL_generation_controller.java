package com.dpdc.bd.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.dpdc.bd.dao.BillPrintDoa;
import com.dpdc.bd.dao.GetDynamicMenuDAO;
import com.dpdc.bd.model.AddMeterModel;

@Controller
public class BILL_generation_controller {
	@Resource
	GetDynamicMenuDAO getDynamicMenuDAO;
	@Resource
	BillPrintDoa billPrintDoa;
	
	@GetMapping("/BILL_GENERATION")
	public String billHome(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model,
			HttpServletResponse response) {
		if (user_name.equals("")) {
			return "redirect:/";
		}

		ArrayList<AddMeterModel> Bill_Cycle_LIST = billPrintDoa.Get_Bill_Cycle_LIST(user_name);
		ArrayList<AddMeterModel> Bill_Location_LIST = billPrintDoa.Get_Location_LIST(user_name);
		ArrayList<AddMeterModel> listeff_BILL_GROUP = billPrintDoa.listeff_BILL_GROUP();
		
		ArrayList<AddMeterModel> listeff_BOOK_NO = billPrintDoa.listeff_BOOK_NO("J6", "22");
		//model.addAttribute("listeff_BOOK_NO", listeff_BOOK_NO);
		System.out.println(listeff_BOOK_NO);
		model.addAttribute("listeff_BILL_GROUP", listeff_BILL_GROUP);
		model.addAttribute("Bill_Cycle_LIST", Bill_Cycle_LIST);
		model.addAttribute("Bill_Location_LIST", Bill_Location_LIST);

		return "Bill_Generation";
	}
	
	
	@ModelAttribute
	public void addCommonData(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		String dynamicMenu = getDynamicMenuDAO.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
	}
	
}
