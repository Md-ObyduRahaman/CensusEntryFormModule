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
public class MRS_processDao {

	

	@Autowired
	private JdbcTemplate jdbcTemplate;

	SimpleJdbcCall getAllStatesJdbcCallInsert;

	public MRS_processDao(DataSource dataSource) {

		this.getAllStatesJdbcCallInsert = new SimpleJdbcCall(dataSource);

	}

	public  ArrayList<AddMeterModel> insertMRSProcessEntry(AddMeterModel a,String user_name) {
		ArrayList<AddMeterModel> addMeterModel_LIST = new ArrayList<AddMeterModel>();
		Map<String, Object> result = getAllStatesJdbcCallInsert.withCatalogName("DPG_NET_MRS_Validation")
				.withProcedureName("dpd_net_meter_MRS_PROC")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(a.getBILL_CYCLE_CODE(), a.getLOCATION_CODE(), a.getBOOK_NO(), a.getBILL_GR(), a.getCONSUMER_NUM(),user_name);
		JSONObject json = new JSONObject(result);
		
		
		String data = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(data);
	
		System.out.println(jsonArray);
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			addMeterModel_LIST.add(new AddMeterModel(
					jsonData.optString("ERROR_DESC"), jsonData.optString("CUSTOMER_NUM"),0));

		}	
	
		return addMeterModel_LIST;
		
		
		

	}

}