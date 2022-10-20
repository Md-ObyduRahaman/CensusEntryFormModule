package com.dpdc.bd.dao;

import java.util.ArrayList;
import java.util.Map;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.dpdc.bd.model.AddMeterModel;
import com.dpdc.bd.model.CensusFormModel;
import com.dpdc.bd.model.EMP_USER_MST;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class MRS_FinalizationDoa {

	

	@Autowired
	private JdbcTemplate jdbcTemplate;

	SimpleJdbcCall getAllStatesJdbcCallInsert;

	public MRS_FinalizationDoa(DataSource dataSource) {

		this.getAllStatesJdbcCallInsert = new SimpleJdbcCall(dataSource);

	}

	public  String insertMRSFinalization(AddMeterModel a,String user_name) {
		Map<String, Object> result = getAllStatesJdbcCallInsert.withCatalogName("DPG_NET_MRS_Validation")
				.withProcedureName("dpd_net_meter_rdg_trans")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(a.getBILL_CYCLE_CODE(), a.getLOCATION_CODE(), a.getBOOK_NO(), a.getBILL_GR(), a.getCONSUMER_NUM(),user_name);
		JSONObject json = new JSONObject(result);
		
		
		String out = json.get("O_STATUS").toString();
		
		
		return  out;
		

	}

}