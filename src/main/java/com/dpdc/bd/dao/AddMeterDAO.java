package com.dpdc.bd.dao;

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
import com.dpdc.bd.model.DPD_LOCATION_LIST;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class AddMeterDAO {
	
	

	@Autowired
	private JdbcTemplate jdbcTemplate;
	SimpleJdbcCall getAllStatesJdbcCall;
	SimpleJdbcCall getAllStatesJdbcCallNet;

	public AddMeterDAO(DataSource dataSource) {
		this.getAllStatesJdbcCall = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCallNet = new SimpleJdbcCall(dataSource);

	}
	public AddMeterModel Get_AddMeterModel_LIST(String id) {
		AddMeterModel addMeterModel=new AddMeterModel();
		
		Map<String, Object> result = getAllStatesJdbcCall.withCatalogName("DPG_NET_METTARING")
				.withProcedureName("DPD_LOC_BG_AREA_BOK_LIST")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.VARCHAR)).execute(id);

		JSONObject json = new JSONObject(result);
		String jString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			addMeterModel=new AddMeterModel(
							jsonData.optString("LOCATION_CODE"), jsonData.optString("BILL_GROUP"),
							jsonData.optString("BOOK"),jsonData.optString("CHECK_DIGIT"),
							jsonData.optInt("CUST_ID"));
		}
		return addMeterModel;

	}
	public AddMeterModel Get_AddMeterModel_NET_LIST(String id) {
		AddMeterModel addMeterModelNet=new AddMeterModel();
		
		Map<String, Object> result = getAllStatesJdbcCallNet.withCatalogName("DPG_NET_METTARING")
				.withProcedureName("DPD_NET_LOC_BG_AREA_BOK_LIST")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.VARCHAR)).execute(id);
		
		JSONObject json = new JSONObject(result);
		String jString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jString);
		
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			addMeterModelNet=new AddMeterModel(
					jsonData.optString("CHECK_DIGIT"),
					jsonData.optInt("CUST_ID"),jsonData.optString("NET_CONS_NAME"));
		}
		return addMeterModelNet;
		
	}
}
