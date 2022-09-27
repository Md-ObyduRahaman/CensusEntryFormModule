package com.dpdc.bd.controller;

import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

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
import com.dpdc.bd.model.MeterDetails;
import com.dpdc.bd.model.MeterDetailsFormModel;

@Controller
public class CensusEntryController {

	@Autowired
	CensusEntryDAO censusEntryDAO;
	@Autowired
	GetDynamicMenuDAO getDynamicMenuDAO;

	@ModelAttribute
	public void addCommonData(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		String dynamicMenu = getDynamicMenuDAO.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
	}

	@GetMapping("/DATA_ENTRY_LT")
	public String censusFormTable(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<CensusFormModel> listOf_CensusEntity = censusEntryDAO.listOf_CensusFormModel();
		model.addAttribute("listOf_CensusEntity", listOf_CensusEntity);
		model.addAttribute("flag", "1");
		return "CensusEntryTable";
	}

	@GetMapping("/DATA_ENTRY_LT_FORM")
	public String censusForm(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<DPD_LOCATION_LIST> dPD_LOCATION_LIST = censusEntryDAO.Get_DPD_LOCATION_LIST(user_name);
		model.addAttribute("dPD_LOCATION_LIST", dPD_LOCATION_LIST);
		ArrayList<CensusFormModel> listeff_BC_BANKS = censusEntryDAO.listOf_Bank_Code();
		model.addAttribute("listeff_BC_BANKS", listeff_BC_BANKS);
		ArrayList<CensusFormModel> listOf_BRANCH_CODE = censusEntryDAO.listOf_BRANCH_CODE();
		model.addAttribute("listOf_BRANCH_CODE", listOf_BRANCH_CODE);
		return "CensusEntryForm";
	}

	@GetMapping("/DATA_ENTRY_LT_FORM_Update/{id}")
	public String censusFormUpdate(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") String CUST_INT_ID, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<CensusFormModel> listOf_BRANCH_CODE = censusEntryDAO.listOf_BRANCH_CODE();
		model.addAttribute("listOf_BRANCH_CODE", listOf_BRANCH_CODE);
		ArrayList<CensusFormModel> listeff_BC_BANKS = censusEntryDAO.listOf_Bank_Code();
		model.addAttribute("listeff_BC_BANKS", listeff_BC_BANKS);
		ArrayList<DPD_LOCATION_LIST> dPD_LOCATION_LIST = censusEntryDAO.Get_DPD_LOCATION_LIST(user_name);
		model.addAttribute("dPD_LOCATION_LIST", dPD_LOCATION_LIST);
		CensusFormModel single_CensusFormUpdate_Data = censusEntryDAO.Single_CensusFormUpdate_Data(CUST_INT_ID);
		model.addAttribute("SCD", single_CensusFormUpdate_Data);
		model.addAttribute("LOCATION_CODE", single_CensusFormUpdate_Data.getLOCATION_CODE());
		model.addAttribute("flag", 3);
		return "CensusUpdateEntryForm";
	}

	@PostMapping("/DATA_ENTRY_LT")
	public String censusEntry(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			HttpServletResponse response, CensusFormModel censusFormModel,
			@CookieValue(value = "O_CUST_ID", defaultValue = "") String O_CUST_ID, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<CensusFormModel> listOf_BRANCH_CODE = censusEntryDAO.listOf_BRANCH_CODE();
		model.addAttribute("listOf_BRANCH_CODE", listOf_BRANCH_CODE);
		ArrayList<CensusFormModel> listeff_BC_BANKS = censusEntryDAO.listOf_Bank_Code();
		model.addAttribute("listeff_BC_BANKS", listeff_BC_BANKS);
		String insertStatus = censusEntryDAO.insertCensusEntry(censusFormModel, user_name);
		System.out.println(censusFormModel.toString());
		int i = Integer.parseInt(insertStatus);
		if (i == 1) {
			String msg = "Save Successfull ";
			model.addAttribute("msg", msg);
			model.addAttribute("flag", 1);
			ArrayList<DPD_LOCATION_LIST> dPD_LOCATION_LIST = censusEntryDAO.Get_DPD_LOCATION_LIST(user_name);
			model.addAttribute("dPD_LOCATION_LIST", dPD_LOCATION_LIST);
			CensusFormModel single_CensusFormUpdate_Data = censusEntryDAO
					.Single_CensusFormUpdate_Data(CensusEntryDAO.O_CUST_ID);
			model.addAttribute("SCD", single_CensusFormUpdate_Data);
			model.addAttribute("LOCATION_CODE", single_CensusFormUpdate_Data.getLOCATION_CODE());
			Cookie o_cust_idCookie = new Cookie("O_CUST_ID", CensusEntryDAO.O_CUST_ID);
			response.addCookie(o_cust_idCookie);
			return "CensusUpdateEntryForm";

		} else {
			String msg = "Update Successfull ";
			model.addAttribute("msg", msg);
			System.out.println(CensusEntryDAO.O_CUST_ID + ".............ok.............");
			ArrayList<DPD_LOCATION_LIST> dPD_LOCATION_LIST = censusEntryDAO.Get_DPD_LOCATION_LIST(user_name);
			model.addAttribute("dPD_LOCATION_LIST", dPD_LOCATION_LIST);
			CensusFormModel single_CensusFormUpdate_Data = censusEntryDAO
					.Single_CensusFormUpdate_Data(CensusEntryDAO.O_CUST_ID);
			model.addAttribute("SCD", single_CensusFormUpdate_Data);
			model.addAttribute("LOCATION_CODE", single_CensusFormUpdate_Data.getLOCATION_CODE());
			model.addAttribute("flag", 2);
			Cookie o_cust_idCookie = new Cookie("O_CUST_ID", CensusEntryDAO.O_CUST_ID);
			response.addCookie(o_cust_idCookie);
			return "CensusUpdateEntryForm";

		}

	}

	@GetMapping("/distribution")
	public String distributionEntry(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "O_CUST_ID", defaultValue = "") String O_CUST_ID, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<MeterDetailsFormModel> listOf_BC_SPL_TYPE = censusEntryDAO.listOf_BC_SPL_TYPE();
		model.addAttribute("listOf_BC_SPL_TYPE", listOf_BC_SPL_TYPE);
		ArrayList<MeterDetailsFormModel> listOf_USAGE_CATEGORY_CODE = censusEntryDAO.listOf_USAGE_CATEGORY_CODE();
		model.addAttribute("listOf_USAGE_CATEGORY_CODE", listOf_USAGE_CATEGORY_CODE);
		ArrayList<MeterDetailsFormModel> listOf_Bus_type = censusEntryDAO.listOf_Bus_type();
		model.addAttribute("listOf_Bus_type", listOf_Bus_type);
		ArrayList<MeterDetailsFormModel> listOf_Status_list = censusEntryDAO.listOf_Status_list();
		model.addAttribute("listOf_Status_list", listOf_Status_list);
		ArrayList<MeterDetailsFormModel> listOf_BC_SPL_CODE_list = censusEntryDAO.listOf_BC_SPL_CODE_list();
		model.addAttribute("listOf_BC_SPL_CODE_list", listOf_BC_SPL_CODE_list);
		System.out.println("......hello...." + O_CUST_ID);
		return "distributionForm";
	}

	@PostMapping("/distribution")
	public String distributionEntrySave(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "O_CUST_ID", defaultValue = "") String O_CUST_ID, HttpServletResponse response,
			MeterDetailsFormModel detailsFormModel, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<MeterDetailsFormModel> listOf_BC_SPL_TYPE = censusEntryDAO.listOf_BC_SPL_TYPE();
		model.addAttribute("listOf_BC_SPL_TYPE", listOf_BC_SPL_TYPE);
		ArrayList<MeterDetailsFormModel> listOf_USAGE_CATEGORY_CODE = censusEntryDAO.listOf_USAGE_CATEGORY_CODE();
		model.addAttribute("listOf_USAGE_CATEGORY_CODE", listOf_USAGE_CATEGORY_CODE);
		ArrayList<MeterDetailsFormModel> listOf_Bus_type = censusEntryDAO.listOf_Bus_type();
		model.addAttribute("listOf_Bus_type", listOf_Bus_type);
		ArrayList<MeterDetailsFormModel> listOf_Status_list = censusEntryDAO.listOf_Status_list();
		model.addAttribute("listOf_Status_list", listOf_Status_list);
		System.out.println("......hello...." + O_CUST_ID);
		System.out.println(detailsFormModel.toString());
		String insertStatus = censusEntryDAO.insertDistributionFormEntry(detailsFormModel, user_name, O_CUST_ID);
		System.out.println(detailsFormModel.toString());
		int i = Integer.parseInt(insertStatus);
		if (i == 1) {
			String msg = "Save/Update Successfull ";
			model.addAttribute("msg", msg);
			System.out.println(CensusEntryDAO.O_CUST_ID + ".............ok.............");
			Cookie o_cust_idCookie = new Cookie("O_CUST_ID", CensusEntryDAO.O_CUST_ID);
			response.addCookie(o_cust_idCookie);
		}

		return "distributionForm";
	}

	@GetMapping("/meterDetailsForm")
	public String meterDetailsEntryTable(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			Model model) {

		ArrayList<CensusFormModel> listeff_BC_CONSUMER_INTERFACE = censusEntryDAO.listOf_BC_CONSUMER_INTERFACE();
		model.addAttribute("listeff_BC_CONSUMER_INTERFACE", listeff_BC_CONSUMER_INTERFACE);
		return "MeterDetailsEntryTable";
	}

	@GetMapping("/meterDetailsForm/{id}")
	public String meterDetailsEntryForm(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") String CUST_INT_ID, Model model) {

		ArrayList<MeterDetails> listOf_BC_METER_TYPECODE_MAP = censusEntryDAO.listOf_BC_METER_TYPECODE_MAP();
		model.addAttribute("listOf_BC_METER_TYPECODE_MAP", listOf_BC_METER_TYPECODE_MAP);
		System.out.println(CUST_INT_ID + ".........");
		System.out.println("Hello World");
		return "meterDetailsForm";
	}

}