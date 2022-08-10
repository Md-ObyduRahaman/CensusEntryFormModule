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

import com.dpdc.bd.model.DPD_LOCATION_LIST;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class CensusEntryDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	SimpleJdbcCall getAllStatesJdbcCall;
	SimpleJdbcCall getAllStatesJdbcCall1;

	public CensusEntryDAO(DataSource dataSource) {
		this.getAllStatesJdbcCall = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1 = new SimpleJdbcCall(dataSource);

	}

	public ArrayList<DPD_LOCATION_LIST> Get_DPD_LOCATION_LIST(String user_name) {

		ArrayList<DPD_LOCATION_LIST> dPD_LOCATION_LIST = new ArrayList<DPD_LOCATION_LIST>();
		Map<String, Object> result = getAllStatesJdbcCall.withCatalogName("DPG_EMP_CONSUMER_CENSUS_ENTRY")
				.withProcedureName("DPD_LOCATION_LIST")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.VARCHAR)).execute(user_name);

		JSONObject json = new JSONObject(result);
		String jString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			dPD_LOCATION_LIST.add(
					new DPD_LOCATION_LIST(jsonData.optString("LOCATION_CODE"), jsonData.optString("LOCATION_NAME")));
		}
		return dPD_LOCATION_LIST;
	}

	public DPD_LOCATION_LIST Get_DPD_Z_C_D_SD_LIST(String id) {

		DPD_LOCATION_LIST DPD_Z_C_D_SD_LIST = new DPD_LOCATION_LIST();
		Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("DPG_EMP_CONSUMER_CENSUS_ENTRY")
				.withProcedureName("DPD_Z_C_D_SD_LIST")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.VARCHAR)).execute(id);

		JSONObject json = new JSONObject(result);
		String jString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			DPD_Z_C_D_SD_LIST=new DPD_LOCATION_LIST(
							jsonData.optString("ZONE"), jsonData.optString("DIV"),
							jsonData.optString("SUB_DIV"), jsonData.optString("CIRCLE"));
		}
		return DPD_Z_C_D_SD_LIST;

	}

}
