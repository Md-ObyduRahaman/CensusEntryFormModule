package com.dpdc.bd.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

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

		return "BILL_PRINT";
	}

	@RequestMapping("/Show_BillPrint")
	public String showBill(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "book", defaultValue = "") String book, AddMeterModel addMeterModel, Model model) {

		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<BillPrint> billPrint = new ArrayList<BillPrint>();
		ArrayList<AddMeterModel> Bill_Cycle_LIST = billPrintDoa.Get_Bill_Cycle_LIST(user_name);
		ArrayList<AddMeterModel> Bill_Location_LIST = billPrintDoa.Get_Location_LIST(user_name);
		ArrayList<AddMeterModel> listeff_BILL_GROUP = billPrintDoa.listeff_BILL_GROUP();
		model.addAttribute("listeff_BILL_GROUP", listeff_BILL_GROUP);
		model.addAttribute("Bill_Cycle_LIST", Bill_Cycle_LIST);
		model.addAttribute("Bill_Location_LIST", Bill_Location_LIST);
		String str = addMeterModel.getLOCATION_CODE();
		addMeterModel.setLOCATION_CODE(str.substring(str.length() - 2));

		System.out.println(addMeterModel.toString());
		String string = addMeterModel.getBILL_CYCLE_CODE();
	/*	if (addMeterModel.getCONSUMER_NUM() != "") {
			AddMeterModel Get_billPrint_LIST = billPrintDoa.Get_billPrint_LIST(addMeterModel.getBILL_CYCLE_CODE(),
					addMeterModel.getLOCATION_CODE(), addMeterModel.getBILL_GR(), addMeterModel.getBOOK_NO(),
					addMeterModel.getAREA_CODE(), addMeterModel.getCONSUMER_NUM());
			billPrint = billPrintDoa.get_billPrint_ShowAddMeterModelInfo(Get_billPrint_LIST.getBILL_CYCLE_CODE(),
					Get_billPrint_LIST.getLOCATION_CODE(), Get_billPrint_LIST.getBILL_GR(),
					Get_billPrint_LIST.getBOOK_NO(), Get_billPrint_LIST.getCONSUMER_NUM());
		}

		else {*/
			billPrint = billPrintDoa.get_billPrint_ShowAddMeterModelInfo(addMeterModel.getBILL_CYCLE_CODE(),
					addMeterModel.getLOCATION_CODE(), addMeterModel.getBILL_GR(), addMeterModel.getBOOK_NO(),
					addMeterModel.getCONSUMER_NUM());
		//}

		if (billPrint.isEmpty()) {
			String msg = "Data is not Available right now, please input correct information and try again! ";
			model.addAttribute("msg", msg);

		} else {
			model.addAttribute("billPrint", billPrint);
		}

		String books = addMeterModel.getBOOK_NO();
		model.addAttribute("book", books);
		String billGrp = addMeterModel.getBILL_GR();
		model.addAttribute("billGrp", billGrp);
		String consumerNum = addMeterModel.getCONSUMER_NUM();
		model.addAttribute("consumerNum", consumerNum);
		String billCycle = addMeterModel.getBILL_CYCLE_CODE();
		model.addAttribute("billCycle", billCycle);
		String locationCode = addMeterModel.getLOCATION_CODE();
		model.addAttribute("locationCode", locationCode);
		String locationName = addMeterModel.getLOCATION_NAME();
		model.addAttribute("locationName", locationName);

		return "BillPrintShow";
	}

	@ModelAttribute
	public void addCommonData(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		String dynamicMenu = getDynamicMenuDAO.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
	}

}
