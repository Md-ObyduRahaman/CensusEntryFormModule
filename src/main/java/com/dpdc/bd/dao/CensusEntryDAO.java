package com.dpdc.bd.dao;

import java.beans.BeanProperty;
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
import com.dpdc.bd.model.CensusFormModel;
import com.dpdc.bd.model.DPD_LOCATION_LIST;
import com.dpdc.bd.model.MeterDetails;
import com.dpdc.bd.model.MeterDetailsFormModel;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class CensusEntryDAO {

	public static String O_CUST_ID;

	@Autowired
	private JdbcTemplate jdbcTemplate;
	SimpleJdbcCall getAllStatesJdbcCall;
	SimpleJdbcCall getAllStatesJdbcCall1;
	SimpleJdbcCall getAllStatesJdbcCallbillGrp;
	SimpleJdbcCall getAllStatesJdbcCallInsert;
	SimpleJdbcCall getAllStatesJdbcCallInsertMeterDetails;

	public CensusEntryDAO(DataSource dataSource) {
		this.getAllStatesJdbcCall = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCallbillGrp = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCallInsert = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCallInsertMeterDetails = new SimpleJdbcCall(dataSource);

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
			DPD_Z_C_D_SD_LIST = new DPD_LOCATION_LIST(jsonData.optString("ZONE"), jsonData.optString("DIV"),
					jsonData.optString("SUB_DIV"), jsonData.optString("CIRCLE"));
		}
		return DPD_Z_C_D_SD_LIST;

	}

	public String Get_billGrp(String P_LOCATION, String P_BOOK) {

		DPD_LOCATION_LIST DPD_Z_C_D_SD_LIST = new DPD_LOCATION_LIST();
		Map<String, Object> result = getAllStatesJdbcCallbillGrp.withCatalogName("DPG_EMP_CONSUMER_CENSUS_ENTRY")
				.withProcedureName("DPD_BILL_GROUP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.VARCHAR))
				.execute(P_LOCATION, P_BOOK);

		JSONObject json = new JSONObject(result);
		String jString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			DPD_Z_C_D_SD_LIST.setBILL_GRP(jsonData.optString("BILL_GRP"));

		}
		return DPD_Z_C_D_SD_LIST.getBILL_GRP();

	}

	public String insertCensusEntry(CensusFormModel a, String user_name) {

		Map<String, Object> result = getAllStatesJdbcCallInsert.withCatalogName("DPG_CENSUS")
				.withProcedureName("DPD_CENSUS_CUSTOMERS_SAVE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a.getBANK_CODE(),
						a.getBANK_CODE_1(), a.getBILL_GRP(), a.getBLOCK_NO(), a.getBRANCH_CODE(), a.getBRANCH_CODE_1(),
						a.getCONS_SRL_NO(), a.getCIRCLE(), a.getCONSUMER_FLAG(), a.getCONSUMER_STATUS(),
						a.getCUSTOMER_NAME(), a.getCUSTOMER_NUM(), a.getDIVISION(), a.getF_H_NAME(),
						a.getLOCATION_CODE(), a.getMAIL_ADDR_DESCR1(), a.getMAIL_ADDR_DESCR1(), a.getMAIL_ADDR_DESCR1(),
						a.getMAIL_PIN_CODE(), a.getMAIL_CITY(), a.getOLD_TRANS_CONNECTION_ID(), a.getSERV_ADDR_DESCR1(),
						a.getSERV_ADDR_DESCR1(), a.getSERV_ADDR_DESCR1(), a.getSERV_CITY(), a.getSERV_PIN_CODE(),
						a.getWALKING_SEQUENCE(), a.getZONE(), a.getCUST_INT_ID(), user_name);
		JSONObject json = new JSONObject(result);
		String out = json.get("O_STATUS").toString();
		O_CUST_ID = json.get("O_CUST_ID").toString();
		System.out.println(out);
		return out;

	}

	public String insertDistributionFormEntry(MeterDetailsFormModel a, String user_name, String O_CUST_ID) {

		Map<String, Object> result = getAllStatesJdbcCallInsertMeterDetails.withCatalogName("DPG_CENSUS")
				.withProcedureName("DPD_CENSUS_METERDETAILS_SAVE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a.getSUPPLY_TYPE(),
						a.getFEEDER_TRANS_CODE(), a.getFEEDER_TRANS_ID(), a.getPHASE_TYPE(), a.getPHASE_CONNECT(),
						a.getSERV_CONNEC_TYPE(), a.getSERV_DROP_LENGTH(), a.getSERV_DROP_SIZE(), a.getSUB_STATION_33(),
						a.getSUB_STATION_11(), a.getPOLE_NUM(), a.getSANC_LOAD(), a.getUSAGE_CATEGORY(),
						a.getLIKELY_MONTHLY_CONSUMP(), a.getCONNECT_LOAD(), a.getCONSUMER_STATUS(),
						a.getSECURITY_DEPOSIT(), a.getCOOK_FUEL_TYPE(), a.getBUS_TYPE_CODE(), a.getSPL_CONS_CODE(),
						a.getSPL_TYPE_DESC(), a.getSPL_TYPE_CODE(), a.getUSAGE_CATEGORY_CODE(), a.getBUS_TYPE_DESC(),
						a.getSPL_TYPE(), "", O_CUST_ID);
		JSONObject json = new JSONObject(result);
		String out = json.get("O_STATUS").toString();
		return out;

	}

	public ArrayList<CensusFormModel> listOf_CensusFormModel() {

		String sql = "SELECT * FROM BC_CONSUMER_INTERFACE WHERE SOURCE_FLAG='BC_CONSCEN' ORDER BY CUSTOMER_NAME ASC ";

		ArrayList<CensusFormModel> listeff_CensusFormModel = (ArrayList<CensusFormModel>) jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(CensusFormModel.class));

		return listeff_CensusFormModel;
	}
	public ArrayList<CensusFormModel> listOf_Bank_Code() {
		
		String sql = "SELECT * FROM BC_BANKS ";
		
		ArrayList<CensusFormModel> listeff_BC_BANKS = (ArrayList<CensusFormModel>) jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(CensusFormModel.class));
		
		return listeff_BC_BANKS;
	}
	public ArrayList<CensusFormModel> listOf_BC_CONSUMER_INTERFACE() {
		
		String sql = "SELECT * FROM BC_CONSUMER_INTERFACE";
		
		ArrayList<CensusFormModel> listeff_BC_CONSUMER_INTERFACE = (ArrayList<CensusFormModel>) jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(CensusFormModel.class));
		
		return listeff_BC_CONSUMER_INTERFACE;
	}
	public ArrayList<CensusFormModel> listOf_BRANCH_CODE() {
		
		String sql = "SELECT * FROM BC_BANK_BRANCHES";
		
		ArrayList<CensusFormModel> listOf_BRANCH_CODE = (ArrayList<CensusFormModel>) jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(CensusFormModel.class));
		
		return listOf_BRANCH_CODE;
	}

	public ArrayList<MeterDetailsFormModel> listOf_BC_SPL_TYPE() {

		String sql = "select * from BC_SPL_TYPE";

		ArrayList<MeterDetailsFormModel> listeff_MeterDetailsFormModel = (ArrayList<MeterDetailsFormModel>) jdbcTemplate
				.query(sql, BeanPropertyRowMapper.newInstance(MeterDetailsFormModel.class));

		return listeff_MeterDetailsFormModel;
	}

	public ArrayList<MeterDetailsFormModel> listOf_USAGE_CATEGORY_CODE() {

		String sql = "select USAGE_CATEGORY_CODE,CODE_DESCR as CODE_DESCR_tarrif from BC_USAGE_CATEGORY_CODE where length( USAGE_CATEGORY_CODE) >=4";

		ArrayList<MeterDetailsFormModel> listeff_MeterDetailsFormModel = (ArrayList<MeterDetailsFormModel>) jdbcTemplate
				.query(sql, BeanPropertyRowMapper.newInstance(MeterDetailsFormModel.class));

		return listeff_MeterDetailsFormModel;
	}

	public ArrayList<MeterDetailsFormModel> listOf_Bus_type() {

		String sql = "select * from BC_BUS_TYPE_CODE";

		ArrayList<MeterDetailsFormModel> listOf_Bus_type = (ArrayList<MeterDetailsFormModel>) jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(MeterDetailsFormModel.class));

		return listOf_Bus_type;
	}

	public ArrayList<MeterDetailsFormModel> listOf_BC_SPL_CODE_list() {

		String sql = "select * from BC_SPL_CODE";

		ArrayList<MeterDetailsFormModel> listOf_BC_SPL_CODE_list = (ArrayList<MeterDetailsFormModel>) jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(MeterDetailsFormModel.class));

		return listOf_BC_SPL_CODE_list;
	}
	public ArrayList<MeterDetailsFormModel> listOf_Status_list() {
		
		String sql = "select * from BC_CUSTOMER_TYPE_CODE";
		
		ArrayList<MeterDetailsFormModel> listOf_Status_list = (ArrayList<MeterDetailsFormModel>) jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(MeterDetailsFormModel.class));
		
		return listOf_Status_list;
	}
	public ArrayList<MeterDetails> listOf_BC_METER_TYPECODE_MAP() {
		
		String sql = "select * from BC_METER_TYPECODE_MAP";
		
		ArrayList<MeterDetails> listOf_BC_METER_TYPECODE_MAP = (ArrayList<MeterDetails>) jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(MeterDetails.class));
		
		return listOf_BC_METER_TYPECODE_MAP;
	}

	public CensusFormModel Single_CensusFormUpdate_Data(String CUST_INT_ID) {

		String sql = "SELECT * FROM BC_CONSUMER_INTERFACE where CUST_INT_ID= ?";

		CensusFormModel single_CensusFormUpdate_Data = (CensusFormModel) jdbcTemplate.queryForObject(sql,
				new Object[] { CUST_INT_ID }, new BeanPropertyRowMapper(CensusFormModel.class));
		return single_CensusFormUpdate_Data;
	}

}