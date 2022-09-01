package com.dpdc.bd.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dpdc.bd.dao.BillPrintDoa;
import com.dpdc.bd.dao.GetDynamicMenuDAO;
import com.dpdc.bd.model.AddMeterModel;
import com.dpdc.bd.model.BillPrint;

@Controller
public class BillPrintController {

	@Resource
	GetDynamicMenuDAO getDynamicMenuDAO;

	@Resource
	BillPrintDoa billPrintDoa;

	@GetMapping("/BILL_PRINT")
	public String billHome(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}

		ArrayList<AddMeterModel> Bill_Cycle_LIST = billPrintDoa.Get_Bill_Cycle_LIST(user_name);
		ArrayList<AddMeterModel> Bill_Location_LIST = billPrintDoa.Get_Location_LIST(user_name);
		model.addAttribute("Bill_Cycle_LIST", Bill_Cycle_LIST);
		model.addAttribute("Bill_Location_LIST", Bill_Location_LIST);
		BillPrint billPrint=new BillPrint();
		model.addAttribute("billPrint", billPrint);

		return "BILL_PRINT";
	}

	@RequestMapping("/Show_BillPrint")
	public String showBill(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			AddMeterModel addMeterModel,Model model) {

		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<AddMeterModel> Bill_Cycle_LIST = billPrintDoa.Get_Bill_Cycle_LIST(user_name);
		ArrayList<AddMeterModel> Bill_Location_LIST = billPrintDoa.Get_Location_LIST(user_name);
		model.addAttribute("Bill_Cycle_LIST", Bill_Cycle_LIST);
		model.addAttribute("Bill_Location_LIST", Bill_Location_LIST);
		System.out.println("showPrint......");
		String str = addMeterModel.getLOCATION_CODE();
		addMeterModel.setLOCATION_CODE(str.substring(str.length() - 2));

		System.out.println(addMeterModel.toString());
		BillPrint billPrint= billPrintDoa.get_billPrint_ShowAddMeterModelInfo(addMeterModel.getBILL_CYCLE_CODE(),
				addMeterModel.getLOCATION_CODE(), addMeterModel.getBILL_GR(), addMeterModel.getBOOK_NO(),
				addMeterModel.getCONSUMER_NUM());
		model.addAttribute("billPrint", billPrint);
		return "demo";
	}

	@ModelAttribute
	public void addCommonData(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		String dynamicMenu = getDynamicMenuDAO.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
	}

}
