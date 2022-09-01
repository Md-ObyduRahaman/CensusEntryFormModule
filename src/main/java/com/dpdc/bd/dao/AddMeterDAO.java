package com.dpdc.bd.dao;

import java.text.SimpleDateFormat;
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

import oracle.jdbc.internal.OracleTypes;

@Repository
public class AddMeterDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	SimpleJdbcCall getAllStatesJdbcCall;
	SimpleJdbcCall getAllStatesJdbcCallNet;
	SimpleJdbcCall getAllStatesJdbcCallInsert;
	SimpleJdbcCall getAllStatesJdbcCallGetList;

	public AddMeterDAO(DataSource dataSource) {
		this.getAllStatesJdbcCall = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCallNet = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCallInsert = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCallGetList = new SimpleJdbcCall(dataSource);

	}

	public AddMeterModel Get_AddMeterModel_LIST(String id) {
		AddMeterModel addMeterModel = new AddMeterModel();

		Map<String, Object> result = getAllStatesJdbcCall.withCatalogName("DPG_NET_METTARING")
				.withProcedureName("DPD_LOC_BG_AREA_BOK_LIST")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.VARCHAR)).execute(id);

		JSONObject json = new JSONObject(result);
		String jString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			addMeterModel = new AddMeterModel(jsonData.optString("LOCATION_CODE"), jsonData.optString("BILL_GROUP"),
					jsonData.optString("BOOK"), jsonData.optString("CHECK_DIGIT"), jsonData.optInt("CUST_ID"));
		}
		return addMeterModel;

	}

	public AddMeterModel Get_AddMeterModel_NET_LIST(String id) {
		AddMeterModel addMeterModelNet = new AddMeterModel();

		Map<String, Object> result = getAllStatesJdbcCallNet.withCatalogName("DPG_NET_METTARING")
				.withProcedureName("DPD_NET_LOC_BG_AREA_BOK_LIST")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.VARCHAR)).execute(id);

		JSONObject json = new JSONObject(result);
		String jString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			addMeterModelNet = new AddMeterModel(jsonData.optString("CHECK_DIGIT"), jsonData.optInt("CUST_ID"),
					jsonData.optString("NET_CONS_NAME"));
		}
		return addMeterModelNet;

	}

	public String insertAddMeterModel(AddMeterModel a, String user_name) {

		System.out.println(a.toString());

		Map<String, Object> result = getAllStatesJdbcCallInsert.withCatalogName("DPG_NET_METTARING")
				.withProcedureName("DPD_BC_NET_CUSTOMERS_SAVE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a.getREF_NO(),
						a.getREF_DATE(), a.getLOCATION_CODE(), a.getBILL_GR(), a.getBOOK_NO(), a.getCONSUMER_NUM(),
						a.getCHECK_DIGIT(), a.getCUST_ID(), a.getEFF_BILL_CYCLE_CODE(), a.getREMARKS(), a.getADJ_FLAG(),
						a.getENL_BILL_CYCLE_CODE(), a.getNET_CONS_NAME(), a.getNET_CUST_NUM(),
						a.getNET_CUST_CHECK_DIGIT(), a.getNET_CUST_ID(), a.getEXP_BILL_CYCLE(), a.getNET_CAPACITY(), 1,
						user_name);
		JSONObject json = new JSONObject(result);
		String out = json.get("O_STATUS").toString();
		System.out.println(out);
		
		return out;

	}

	public ArrayList<AddMeterModel> Get_AddMeterModel_ALL_LIST(String user_name) {

		ArrayList<AddMeterModel> addMeterModel_LIST = new ArrayList<AddMeterModel>();
		Map<String, Object> result = getAllStatesJdbcCallGetList.withCatalogName("DPG_NET_METTARING")
				.withProcedureName("DPD_BC_NET_CUSTOMERS_GRID")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.VARCHAR)).execute(user_name);

		JSONObject json = new JSONObject(result);
		String jString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			addMeterModel_LIST.add(new AddMeterModel(jsonData.optString("REF_NO"), jsonData.optString("REF_DATE").substring(0, 10),
					jsonData.optString("LOCATION_CODE"), jsonData.optString("BILL_GR"), jsonData.optString("BOOK_NO"),
					jsonData.optString("CONSUMER_NUM"), jsonData.optString("CHECK_DIGIT"), jsonData.optInt("CUST_ID"),
					jsonData.optString("EFF_BILL_CYCLE_CODE"), jsonData.optString("REMARKS"),
					jsonData.optString("ADJ_FLAG"), jsonData.optString("ENL_BILL_CYCLE_CODE"),
					jsonData.optString("NET_CONS_NAME"), jsonData.optString("NET_CUST_NUM"),
					jsonData.optString("NET_CUST_CHECK_DIGIT"), jsonData.optInt("NET_CUST_ID"),
					jsonData.optString("EXP_BILL_CYCLE"), jsonData.optInt("NET_CAPACITY")));
		}
		return addMeterModel_LIST;
	}
	
	

}