package com.dpdc.bd.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.StaticApplicationContext;
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

	static String O_CUST_IDMeter;

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
		model.addAttribute("listOf_BRANCH_CODE", null);
		return "CensusEntryForm";
	}

	@GetMapping("/DATA_ENTRY_LT_FORM_Update/{id}")
	public String censusFormUpdate(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") String CUST_INT_ID, HttpServletResponse response, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		O_CUST_IDMeter = CUST_INT_ID;

		ArrayList<CensusFormModel> listeff_BC_BANKS = censusEntryDAO.listOf_Bank_Code();
		model.addAttribute("listeff_BC_BANKS", listeff_BC_BANKS);
		ArrayList<DPD_LOCATION_LIST> dPD_LOCATION_LIST = censusEntryDAO.Get_DPD_LOCATION_LIST(user_name);
		model.addAttribute("dPD_LOCATION_LIST", dPD_LOCATION_LIST);
		CensusFormModel single_CensusFormUpdate_Data = censusEntryDAO.Single_CensusFormUpdate_Data(CUST_INT_ID);
		String cString=single_CensusFormUpdate_Data.getBANK_CODE();
		model.addAttribute("SCD", single_CensusFormUpdate_Data);
		ArrayList<CensusFormModel>  listOf_BRANCH_CODE1 = censusEntryDAO.listOf_BRANCH_CODE(single_CensusFormUpdate_Data.getBANK_CODE());
		model.addAttribute("listOf_BRANCH_CODE", listOf_BRANCH_CODE1);
		model.addAttribute("LOCATION_CODE", single_CensusFormUpdate_Data.getLOCATION_CODE());
		model.addAttribute("flag", 3);
		model.addAttribute("URL", "distribution");
		return "CensusUpdateEntryForm";
	}

	@PostMapping("/DATA_ENTRY_LT")
	public String censusEntry(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			HttpServletResponse response, CensusFormModel censusFormModel,
			@CookieValue(value = "O_CUST_ID", defaultValue = "") String O_CUST_ID, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
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
			ArrayList<CensusFormModel>  listOf_BRANCH_CODE1 = censusEntryDAO.listOf_BRANCH_CODE(single_CensusFormUpdate_Data.getBANK_CODE());
			model.addAttribute("listOf_BRANCH_CODE", listOf_BRANCH_CODE1);
			ArrayList<CensusFormModel>  listOf_BRANCH_CODE2 = censusEntryDAO.listOf_BRANCH_CODE(single_CensusFormUpdate_Data.getBANK_CODE_1());
			model.addAttribute("listOf_BRANCH_CODE2", listOf_BRANCH_CODE2);
			
			model.addAttribute("URL", "distributionEntry");
			model.addAttribute("LOCATION_CODE", single_CensusFormUpdate_Data.getLOCATION_CODE());
			String string = CensusEntryDAO.O_CUST_ID;
			O_CUST_IDMeter=string;
			Cookie o_cust_idCookie = new Cookie("O_CUST_IDNew", CensusEntryDAO.O_CUST_ID);
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
			ArrayList<CensusFormModel>  listOf_BRANCH_CODE1 = censusEntryDAO.listOf_BRANCH_CODE(single_CensusFormUpdate_Data.getBANK_CODE());
			model.addAttribute("listOf_BRANCH_CODE", listOf_BRANCH_CODE1);
			ArrayList<CensusFormModel>  listOf_BRANCH_CODE2 = censusEntryDAO.listOf_BRANCH_CODE(single_CensusFormUpdate_Data.getBANK_CODE_1());
			model.addAttribute("listOf_BRANCH_CODE2", listOf_BRANCH_CODE2);
			model.addAttribute("LOCATION_CODE", single_CensusFormUpdate_Data.getLOCATION_CODE());
			model.addAttribute("flag", 2);
			model.addAttribute("URL", "distribution");

			Cookie o_cust_idCookie = new Cookie("O_CUST_ID", CensusEntryDAO.O_CUST_ID);
			response.addCookie(o_cust_idCookie);
			O_CUST_IDMeter=CensusEntryDAO.O_CUST_ID;
			return "CensusUpdateEntryForm";

		}

	}

	@GetMapping("/distribution")
	public String distributionEntry(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "O_CUST_ID", defaultValue = "") String O_CUST_ID, HttpServletResponse response,
			Model model) {
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
		Cookie o_cust_idCookieM = new Cookie("O_CUST_IDM", O_CUST_ID);
		response.addCookie(o_cust_idCookieM);
		System.out.println("......hello...." + O_CUST_ID);
		return "distributionForm";
	}

	@GetMapping("/distribution/{id}")
	public String distributionIdBasedEntry(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "O_CUST_ID", defaultValue = "") String O_CUST_ID,
			@PathVariable("id") String CUST_INT_ID, HttpServletResponse response, Model model) {
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
		Cookie o_cust_idCookieM = new Cookie("O_CUST_ID", CUST_INT_ID);
		response.addCookie(o_cust_idCookieM);
		System.out.println("......hello...." + O_CUST_ID);

		MeterDetailsFormModel singleDistribution = censusEntryDAO.singleDistribution(CUST_INT_ID);
		model.addAttribute("SDB", singleDistribution);

		return "distributionFormUpdate";
	}

	@GetMapping("/distributionEntry/{id}")
	public String distributionIdNewEntry(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "O_CUST_ID", defaultValue = "") String O_CUST_ID,
			@PathVariable("id") String CUST_INT_ID, HttpServletResponse response, Model model) {
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
		Cookie o_cust_idCookieM = new Cookie("O_CUST_IDM", O_CUST_ID);
		response.addCookie(o_cust_idCookieM);
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
		ArrayList<MeterDetailsFormModel> listOf_BC_SPL_CODE_list = censusEntryDAO.listOf_BC_SPL_CODE_list();
		model.addAttribute("listOf_BC_SPL_CODE_list", listOf_BC_SPL_CODE_list);
		System.out.println("......hello...." + O_CUST_ID);
		System.out.println(detailsFormModel.toString());
		String insertStatus = censusEntryDAO.insertDistributionFormEntry(detailsFormModel, user_name, O_CUST_ID);
		System.out.println(detailsFormModel.toString());
		int i = Integer.parseInt(insertStatus);
		if (i == 1) {
			String msg = "Save Successfull ";
			model.addAttribute("msg", msg);
			System.out.println(CensusEntryDAO.O_CUST_ID + ".............ok.............");
			Cookie o_cust_idCookie = new Cookie("O_CUST_ID", CensusEntryDAO.O_CUST_ID);
			response.addCookie(o_cust_idCookie);
			MeterDetailsFormModel singleDistribution = censusEntryDAO.singleDistribution(O_CUST_ID);
			model.addAttribute("SDB", singleDistribution);
			System.out.println(msg);
			return "distributionFormUpdate";
		} else {
			String msg = "Update Successfull ";
			model.addAttribute("msg", msg);
			System.out.println(CensusEntryDAO.O_CUST_ID + ".............ok.............");
			Cookie o_cust_idCookie = new Cookie("O_CUST_ID", CensusEntryDAO.O_CUST_ID);
			response.addCookie(o_cust_idCookie);
			MeterDetailsFormModel singleDistribution = censusEntryDAO.singleDistribution(CensusEntryDAO.O_CUST_ID);
			model.addAttribute("SDB", singleDistribution);
			return "distributionFormUpdate";
		}

	}

	@GetMapping("/meterDetailsForm")
	public String meterDetailsEntryTable(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "O_CUST_IDNew", defaultValue = "") String O_CUST_ID, HttpServletResponse response,
			Model model) {
		String string = O_CUST_IDMeter;
		System.out.println("......hello..FFFFFFFFFFFFFF.." + O_CUST_ID);
		System.out.println("......hello..FFFFFFFFFFFFFF.." + string);
		if (string == null) {
			ArrayList<CensusFormModel> listeff_BC_CONSUMER_INTERFACE = censusEntryDAO
					.listOf_BC_CONSUMER_INTERFACE(O_CUST_ID);
			model.addAttribute("listeff_BC_CONSUMER_INTERFACE", listeff_BC_CONSUMER_INTERFACE);
		} else {
			ArrayList<CensusFormModel> listeff_BC_CONSUMER_INTERFACE = censusEntryDAO
					.listOf_BC_CONSUMER_INTERFACE(O_CUST_IDMeter);
			model.addAttribute("listeff_BC_CONSUMER_INTERFACE", listeff_BC_CONSUMER_INTERFACE);
		}

		model.addAttribute("O_CUST_ID", O_CUST_IDMeter);

		return "MeterDetailsEntryTable";
	}

	@GetMapping("/meterDetailsFormEntry")
	public String meterDetailsEntry(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "O_CUST_IDM", defaultValue = "") String O_CUST_ID, HttpServletResponse response,
			Model model) {
		ArrayList<MeterDetails> listOf_BC_METER_TYPECODE_MAP = censusEntryDAO.listOf_BC_METER_TYPECODE_MAP();
		model.addAttribute("listOf_BC_METER_TYPECODE_MAP", listOf_BC_METER_TYPECODE_MAP);
		ArrayList<MeterDetails> listOf_BC_MANUF_CODE = censusEntryDAO.listOf_BC_MANUF_CODE();
		model.addAttribute("listOf_BC_MANUF_CODE", listOf_BC_MANUF_CODE);
		ArrayList<MeterDetails> listOf_BC_METER_LOCATION = censusEntryDAO.listOf_BC_METER_LOCATION();
		model.addAttribute("listOf_BC_METER_LOCATION", listOf_BC_METER_LOCATION);
		ArrayList<MeterDetails> listOf_BC_RATED_CURRENT = censusEntryDAO.listOf_BC_RATED_CURRENT();
		model.addAttribute("listOf_BC_RATED_CURRENT", listOf_BC_RATED_CURRENT);
		ArrayList<MeterDetails> listOf_BC_DEFECTIVE_CODE = censusEntryDAO.listOf_BC_DEFECTIVE_CODE();
		model.addAttribute("listOf_BC_DEFECTIVE_CODE", listOf_BC_DEFECTIVE_CODE);

		return "meterDetailsForm";
	}

	@GetMapping("/meterDetailsForm/{id}")
	public String meterDetailsEntryForm(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") String MeterNumber, HttpServletResponse response, Model model) {

		ArrayList<MeterDetails> listOf_BC_METER_TYPECODE_MAP = censusEntryDAO.listOf_BC_METER_TYPECODE_MAP();
		model.addAttribute("listOf_BC_METER_TYPECODE_MAP", listOf_BC_METER_TYPECODE_MAP);
		ArrayList<MeterDetails> listOf_BC_MANUF_CODE = censusEntryDAO.listOf_BC_MANUF_CODE();
		model.addAttribute("listOf_BC_MANUF_CODE", listOf_BC_MANUF_CODE);
		ArrayList<MeterDetails> listOf_BC_METER_LOCATION = censusEntryDAO.listOf_BC_METER_LOCATION();
		model.addAttribute("listOf_BC_METER_LOCATION", listOf_BC_METER_LOCATION);
		ArrayList<MeterDetails> listOf_BC_RATED_CURRENT = censusEntryDAO.listOf_BC_RATED_CURRENT();
		model.addAttribute("listOf_BC_RATED_CURRENT", listOf_BC_RATED_CURRENT);
		ArrayList<MeterDetails> listOf_BC_DEFECTIVE_CODE = censusEntryDAO.listOf_BC_DEFECTIVE_CODE();
		model.addAttribute("listOf_BC_DEFECTIVE_CODE", listOf_BC_DEFECTIVE_CODE);
		MeterDetails Single_MeterDetailsFormUpdate_Data = censusEntryDAO.Single_MeterDetailsFormUpdate_Data(MeterNumber);
		model.addAttribute("SMDF", Single_MeterDetailsFormUpdate_Data);
		System.out.println(Single_MeterDetailsFormUpdate_Data.toString());
	
		System.out.println(MeterNumber);
		model.addAttribute("MeterNumber",MeterNumber);
		
		
		
		
		
		return "meterDetailsUpdateForm";
	}

	@PostMapping("/meterDetailsFormPost")
	public String meterDetailsEntryFormInsert(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			MeterDetails meterDetails, @CookieValue(value = "O_CUST_ID", defaultValue = "") String O_CUST_ID,
			Model model)

	{
		if (user_name.equals("")) {
			return "redirect:/";
		}

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String o = formatter.format(java.sql.Date.valueOf(meterDetails.getMETER_MFG_DATE()));
		meterDetails.setMETER_MFG_DATE(o);
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
		String o2 = formatter2.format(java.sql.Date.valueOf(meterDetails.getMETER_INST_DATE()));
		meterDetails.setMETER_INST_DATE(o2);

		String dsString = O_CUST_IDMeter;

		String out = censusEntryDAO.insertMeterDetailsFormEntry(meterDetails, user_name, O_CUST_IDMeter);
		System.out.println(O_CUST_ID + "..........." + user_name);
		System.out.println(meterDetails.toString());
		System.out.println(out);
		System.out.println("Hello Welcome");

		return "meterDetailsForm";
	}
	@PostMapping("/meterDetailsFormUpdate/{id}")
	public String meterDetailsEntryFormUpdate(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			MeterDetails meterDetails,@PathVariable("id") String MeterNumber, @CookieValue(value = "O_CUST_ID", defaultValue = "") String O_CUST_ID,
			Model model)
	
	{
		if (user_name.equals("")) {
			return "redirect:/";
		}
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String o = formatter.format(java.sql.Date.valueOf(meterDetails.getMETER_MFG_DATE()));
		meterDetails.setMETER_MFG_DATE(o);
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
		String o2 = formatter2.format(java.sql.Date.valueOf(meterDetails.getMETER_INST_DATE()));
		meterDetails.setMETER_INST_DATE(o2);
		meterDetails.setMETER_INT_ID(Integer.parseInt(MeterNumber));
		
		String dsString = O_CUST_IDMeter;
		
		String out = censusEntryDAO.insertMeterDetailsFormEntry(meterDetails, user_name, O_CUST_IDMeter);
		System.out.println(O_CUST_ID + "..........." + user_name);
		System.out.println(meterDetails.toString());
		System.out.println(out);
		System.out.println("Hello Welcome");
		MeterDetails Single_MeterDetailsFormUpdate_Data = censusEntryDAO.Single_MeterDetailsFormUpdate_Data(MeterNumber);
		model.addAttribute("SMDF", Single_MeterDetailsFormUpdate_Data);
		
		return "meterDetailsUpdateForm";
	}

}