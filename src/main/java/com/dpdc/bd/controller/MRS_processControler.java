package com.dpdc.bd.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dpdc.bd.dao.BillPrintDoa;
import com.dpdc.bd.dao.GetDynamicMenuDAO;
import com.dpdc.bd.dao.MRS_GenerationDao;
import com.dpdc.bd.dao.MRS_processDao;
import com.dpdc.bd.model.AddMeterModel;

@Controller
public class MRS_processControler {
	@Resource
	GetDynamicMenuDAO getDynamicMenuDAO;
	@Resource
	BillPrintDoa billPrintDoa;
	
	@Resource
	MRS_processDao mrs_processDao;
	
	@GetMapping("/MRS_PROCESS")
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

		return "MRS_PROCESS";
	}
	
	@PostMapping("/Result_MrsProcessEntry")
	public String showBilll(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			 AddMeterModel addMeterModel, Model model) {

		if (user_name.equals("")) {
			return "redirect:/";
		}
		
		
		ArrayList<AddMeterModel> Bill_Cycle_LIST = billPrintDoa.Get_Bill_Cycle_LIST(user_name);
		ArrayList<AddMeterModel> Bill_Location_LIST = billPrintDoa.Get_Location_LIST(user_name);
		ArrayList<AddMeterModel> listeff_BILL_GROUP = billPrintDoa.listeff_BILL_GROUP();
		
		
		model.addAttribute("listeff_BILL_GROUP", listeff_BILL_GROUP);
		model.addAttribute("Bill_Cycle_LIST", Bill_Cycle_LIST);
		model.addAttribute("Bill_Location_LIST", Bill_Location_LIST);
		
		String str = addMeterModel.getLOCATION_CODE();
		addMeterModel.setLOCATION_CODE(str.substring(str.length() - 2));

		System.out.println(addMeterModel.toString());
		
		ArrayList<AddMeterModel> outPut=mrs_processDao.insertMRSProcessEntry(addMeterModel,user_name);
		System.out.println(outPut+"..............");
		if (outPut.isEmpty()) {
			
			model.addAttribute("msg", "MRS process not successfull! Please try again! ");
			model.addAttribute("alrt", "0");
		}
		else {
	
			model.addAttribute("msg", "MRS process Data");
			model.addAttribute("outPut", outPut);
			System.out.println("Hello msg");
		}
		
		
		String string = addMeterModel.getBILL_CYCLE_CODE();
	

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

		return "MRS_PROCESS";
	}
	
	
	@ModelAttribute
	public void addCommonData(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		String dynamicMenu = getDynamicMenuDAO.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
	}
	
}
