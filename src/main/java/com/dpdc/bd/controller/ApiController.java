package com.dpdc.bd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dpdc.bd.dao.AddMeterDAO;
import com.dpdc.bd.dao.BillPrintDoa;
import com.dpdc.bd.dao.CensusEntryDAO;
import com.dpdc.bd.model.AddMeterModel;
import com.dpdc.bd.model.DPD_LOCATION_LIST;

@RestController
@RequestMapping(path = "/api")
public class ApiController {

	@Autowired
	CensusEntryDAO censusEntryDAO;
	@Autowired
	AddMeterDAO addMeterDAO;
	@Autowired
	BillPrintDoa billPrintDoa;
	@Autowired
	DPD_LOCATION_LIST dpd_LOCATION_LIST;
	@Autowired
	AddMeterModel addMeterModel;

	@GetMapping("/location/{id}")
	public DPD_LOCATION_LIST get_DPD_Z_C_D_SD_LIST(@PathVariable("id") String id) {

		DPD_LOCATION_LIST DPD_Z_C_D_SD_LIST = censusEntryDAO.Get_DPD_Z_C_D_SD_LIST(id);

		return DPD_Z_C_D_SD_LIST;

	}
	@GetMapping("/billGrp/{lid}/{bid}")
	public String get_billGrp(@PathVariable("lid") String P_LOCATION,@PathVariable("bid") String P_BOOK) {		
		String BILL_GRP = censusEntryDAO.Get_billGrp(P_LOCATION, P_BOOK);	
		System.out.println(P_LOCATION);
		System.out.println(P_BOOK);
		System.out.println(BILL_GRP);
		return BILL_GRP;
		
	}

	@GetMapping("/locationAddMeter/{id}")
	public AddMeterModel get_Add_Meter_List_LIST(@PathVariable("id") String id) {

		AddMeterModel addMeterModel = addMeterDAO.Get_AddMeterModel_LIST(id);

		return addMeterModel;

	}

	@GetMapping("/locationAddMeterNet/{id}")
	public AddMeterModel get_Add_Meter_Net_LIST(@PathVariable("id") String id) {

		AddMeterModel addMeterModelNet = addMeterDAO.Get_AddMeterModel_NET_LIST(id);

		return addMeterModelNet;

	}

	@GetMapping("/billprint/{lid}/{bid}/{cid}")
	public AddMeterModel get_billprint_LIST(@PathVariable("lid") String lid, @PathVariable("bid") String bid,
			@PathVariable("cid") String cid) {
		AddMeterModel addMeterModelNet = billPrintDoa.Get_billPrint(lid,bid,"","","",cid);
		System.out.println(addMeterModelNet);
		return addMeterModelNet;
		

		

	}
}