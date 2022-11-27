package com.dpdc.bd.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
					jsonData.optString("BOOK"), jsonData.optString("CHECK_DIGIT"), jsonData.optInt("CUST_ID"),
					jsonData.optString("CUSTOMER_NAME"));
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

		Map<String, Object> result = getAllStatesJdbcCallInsert.withCatalogName("DPG_NET_METTARING")
				.withProcedureName("DPD_BC_NET_CUSTOMERS_SAVE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a.getREF_NO(),
						a.getREF_DATE(), a.getLOCATION_CODE(), a.getBILL_GR(), a.getBOOK_NO(), a.getCONSUMER_NUM(),
						a.getCHECK_DIGIT(), a.getCUST_ID(), a.getEFF_BILL_CYCLE_CODE(), a.getREMARKS(), a.getADJ_FLAG(),
						a.getENL_BILL_CYCLE_CODE(), a.getEXP_BILL_CYCLE(), a.getNET_CAPACITY(), a.getNET_METER_DIGIT(),
						a.getNET_METER_OMF(), a.getCUSTOMER_NAME(), 1, user_name, a.getSOLAR_GRID_TYPE(),
						a.getNO_OF_PANELS(), a.getPANEL_LENGTH(), a.getPANEL_WIDTH(), a.getWATT_PK_PANEL(),
						a.getTOTAL_SOLAR_LOAD(), a.getSOLAR_METER_NUM(), a.getINVERTER_CAPACITY(),
						a.getINVERTER_PHASE(), a.getINVERTER_STATUS(),a.getPANEL_LENGTH_TYPE(),a.getPANEL_WIDTH_TYPE(),
						a.getAREA_CODE(),a.getIMAGE_SYSTEM()

				);
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
			addMeterModel_LIST.add(new AddMeterModel(jsonData.optString("REF_NO"),
					jsonData.optString("REF_DATE").substring(0, 10), jsonData.optString("LOCATION_CODE"),
					jsonData.optString("BILL_GR"), jsonData.optString("BOOK_NO"), jsonData.optString("CONSUMER_NUM"),
					jsonData.optString("CHECK_DIGIT"), jsonData.optInt("CUST_ID"),
					jsonData.optString("EFF_BILL_CYCLE_CODE"), jsonData.optString("REMARKS"),
					jsonData.optString("ADJ_FLAG"), jsonData.optString("ENL_BILL_CYCLE_CODE"),
					jsonData.optString("EXP_BILL_CYCLE"), jsonData.optString("CUSTOMER_NAME"),
					jsonData.optInt("NET_METER_DIGIT"), jsonData.optInt("NET_METER_OMF"),
					jsonData.optInt("NET_CAPACITY"), jsonData.optInt("SOLAR_GRID_TYPE"),
					jsonData.optInt("NO_OF_PANELS"), jsonData.optInt("PANEL_LENGTH"),
					jsonData.optInt("PANEL_WIDTH"), jsonData.optInt("WATT_PK_PANEL"),
					jsonData.optInt("TOTAL_SOLAR_LOAD"), jsonData.optString("SOLAR_METER_NUM"),
					jsonData.optString("IMAGE_SYSTEM"), jsonData.optString("INVERTER_CAPACITY"),
					jsonData.optString("INVERTER_PHASE"), jsonData.optString("INVERTER_STATUS"),
					jsonData.optString("PANEL_LENGTH_TYPE"), jsonData.optString("PANEL_WIDTH_TYPE")

			));
		}
		return addMeterModel_LIST;
	}

	public ArrayList<AddMeterModel> listeff_BILL_CYCLE_CODE() {

		String sql = "SELECT BILL_CYCLE_CODE FROM BC_BILL_CYCLE_MASTER ORDER BY BILL_CYCLE_CODE DESC";

		ArrayList<AddMeterModel> BILL_CYCLE_CODE = (ArrayList<AddMeterModel>) jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(AddMeterModel.class));

		return BILL_CYCLE_CODE;
	}

}