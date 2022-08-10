package com.dpdc.bd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dpdc.bd.dao.GetDynamicMenuDAO;

@Controller
public class AddMeterController {

	@Autowired
	GetDynamicMenuDAO getDynamicMenuDAO;

	@RequestMapping("/ADD_METER")
	public String ADD_METER(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu = getDynamicMenuDAO.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "DPD_BC_NET_CUSTOMERS_FORM";
	}

}
