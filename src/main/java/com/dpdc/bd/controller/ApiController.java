package com.dpdc.bd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dpdc.bd.dao.CensusEntryDAO;
import com.dpdc.bd.model.DPD_LOCATION_LIST;

@RestController
@RequestMapping(path = "/api")
public class ApiController {

	@Autowired
	CensusEntryDAO censusEntryDAO;
	@Autowired
	DPD_LOCATION_LIST dpd_LOCATION_LIST;
	
	@GetMapping("/location/{id}")
	public DPD_LOCATION_LIST get_DPD_Z_C_D_SD_LIST(@PathVariable("id") String id, Model model) {
		
		DPD_LOCATION_LIST DPD_Z_C_D_SD_LIST =censusEntryDAO.Get_DPD_Z_C_D_SD_LIST(id);
		
		return DPD_Z_C_D_SD_LIST;

	}
}
