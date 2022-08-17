package com.dpdc.bd.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dpdc.bd.dao.AddMeterDAO;
import com.dpdc.bd.dao.GetDynamicMenuDAO;
import com.dpdc.bd.model.AddMeterModel;

@Controller
public class AddMeterController {
	@Autowired
	AddMeterDAO addMeterDAO;

	@Autowired
	GetDynamicMenuDAO getDynamicMenuDAO;

	@GetMapping("/ADD_METER")
	public String ADD_METER(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model,
			AddMeterModel addMeterModel) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<AddMeterModel> addMeterModelList = addMeterDAO.Get_AddMeterModel_ALL_LIST(user_name);
		model.addAttribute("addMeterModelList", addMeterModelList);
		model.addAttribute("addMeterModel", addMeterModel);

		return "ADD_METER";
	}

	@PostMapping("/ADD_METER")
	public void ADD_METER_SAVE(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			AddMeterModel addMeterModel, Model model) {
		ArrayList<AddMeterModel> addMeterModelList = addMeterDAO.Get_AddMeterModel_ALL_LIST(user_name);
		model.addAttribute("addMeterModelList", addMeterModelList);
		model.addAttribute("addMeterModel", addMeterModel);

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		String o = formatter.format(java.sql.Date.valueOf(addMeterModel.getREF_DATE()));
		System.out.println(o);
		addMeterModel.setREF_DATE(o);
		String insertStatus = addMeterDAO.insertAddMeterModel(addMeterModel, user_name);
		int i=Integer.parseInt(insertStatus);
		if (i==1) {
			String msg = "Save/Update Successfull ";
			model.addAttribute("msg", msg);
			System.out.println(msg);
		}

		// return "redirect:/IC_FUEL_TYPE";

	}

	@ModelAttribute
	public void addCommonData(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		String dynamicMenu = getDynamicMenuDAO.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
	}

}
