package com.dpdc.bd.dao;

import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.dpdc.bd.model.AddMeterModel;
import com.dpdc.bd.model.BillPrint;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class BillPrintDoa {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	SimpleJdbcCall getAllStatesJdbcCallGetBillCycleList;
	SimpleJdbcCall getAllStatesJdbcCallGetLocation;
	SimpleJdbcCall getAllStatesJdbcCallGetbillprintFormInfo;
	SimpleJdbcCall getAllStatesJdbcCallGetbillprintForm;
	SimpleJdbcCall getAllStatesJdbcCallGetbillprintShowinfo;

	public BillPrintDoa(DataSource dataSource) {

		this.getAllStatesJdbcCallGetBillCycleList = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCallGetLocation = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCallGetbillprintFormInfo = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCallGetbillprintShowinfo = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCallGetbillprintForm = new SimpleJdbcCall(dataSource);

	}

	public ArrayList<AddMeterModel> Get_Bill_Cycle_LIST(String user_name) {

		ArrayList<AddMeterModel> Bill_Cycle_LIST = new ArrayList<AddMeterModel>();
		Map<String, Object> result = getAllStatesJdbcCallGetBillCycleList.withCatalogName("DPG_NET_METTAR_BILL_PRINT")
				.withProcedureName("DPD_BILL_CYCLE_LIST")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.VARCHAR)).execute(user_name);

		JSONObject json = new JSONObject(result);
		String jString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			Bill_Cycle_LIST.add(new AddMeterModel(jsonData.optString("BILL_CYCLE_CODE")));
		}
		return Bill_Cycle_LIST;
	}

	public ArrayList<AddMeterModel> Get_Location_LIST(String user_name) {

		ArrayList<AddMeterModel> Bill_Location_LIST = new ArrayList<AddMeterModel>();
		Map<String, Object> result = getAllStatesJdbcCallGetLocation.withCatalogName("DPG_NET_METTAR_BILL_PRINT")
				.withProcedureName("DPD_LOCATION_LIST")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.VARCHAR)).execute(user_name);

		JSONObject json = new JSONObject(result);
		String jString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			Bill_Location_LIST
					.add(new AddMeterModel(jsonData.optString("LOCATION_CODE"), jsonData.optString("LOCATION_NAME")));
		}
		return Bill_Location_LIST;
	}

	public ArrayList<AddMeterModel> Get_billPrint_LIST(String P_BILL_CYCLE, String P_LOCATION,String P_BILL_GROUP,String P_BOOK,String P_AREA_CODE, String P_CUSTOMER_NO) {

		ArrayList<AddMeterModel> Bill_Location_LIST = new ArrayList<AddMeterModel>();
		Map<String, Object> result = getAllStatesJdbcCallGetbillprintFormInfo
				.withCatalogName("DPG_NET_METTAR_BILL_PRINT").withProcedureName("DPD_CUSTOMER_DATA")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.VARCHAR))
				.execute( P_BILL_CYCLE,P_LOCATION,P_BILL_GROUP,P_BOOK,P_AREA_CODE, P_CUSTOMER_NO);

		JSONObject json = new JSONObject(result);
		String jString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			Bill_Location_LIST.add(new AddMeterModel(jsonData.optString("LOCATION_CODE"),
					jsonData.optString("BILL_GROUP"), jsonData.optString("BOOK"), jsonData.optString("CONSUMER_NUM"),
					jsonData.optString("BILL_CYCLE_CODE"), jsonData.optString("AREA_CODE")));
		}
		return Bill_Location_LIST;
	}
	public AddMeterModel Get_billPrint(String P_BILL_CYCLE, String P_LOCATION,String P_BILL_GROUP,String P_BOOK,String P_AREA_CODE, String P_CUSTOMER_NO) {

		AddMeterModel Bill_Location_LIST = new AddMeterModel();
		Map<String, Object> result = getAllStatesJdbcCallGetbillprintForm
				.withCatalogName("DPG_NET_METTAR_BILL_PRINT").withProcedureName("DPD_CUSTOMER_DATA")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.VARCHAR))
				.execute(P_LOCATION, P_BILL_CYCLE,P_BILL_GROUP,P_BOOK,P_AREA_CODE, P_CUSTOMER_NO);


		JSONObject json = new JSONObject(result);
		String jString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			Bill_Location_LIST = new AddMeterModel(jsonData.optString("LOCATION_CODE"),
					jsonData.optString("BILL_GROUP"), jsonData.optString("BOOK"), jsonData.optString("CONSUMER_NUM"),
					jsonData.optString("BILL_CYCLE_CODE"), jsonData.optString("AREA_CODE"));
		}
		return Bill_Location_LIST;
	}

	public BillPrint get_billPrint_ShowAddMeterModelInfo(String P_BILL_CYCLE, String P_LOCATION, String P_BILL_GROUP,
			String P_BOOK, String P_CUSTOMER_NO) {

		BillPrint Bill_print = new BillPrint();
		Map<String, Object> result = getAllStatesJdbcCallGetbillprintShowinfo
				.withCatalogName("DPG_NET_METTAR_BILL_PRINT").withProcedureName("DPD_BILL_PRINT")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.VARCHAR))
				.execute(P_BILL_CYCLE, P_LOCATION, P_BILL_GROUP, P_BOOK, P_CUSTOMER_NO);

		JSONObject json = new JSONObject(result);
		String jString1 = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jString1);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			Bill_print = new BillPrint(jsonData.optString("CUST_ID"), jsonData.optString("BMONTH"),
					jsonData.optString("NO_OF_COPIES"), jsonData.optString("USAGE_TYPE"),
					jsonData.optString("BILL_STATUS"), jsonData.optString("LOCATION_CODE"),
					jsonData.optString("LOCATION_NAME"), jsonData.optString("FEEDER_NAME"),
					jsonData.optString("AREA_CODE"), jsonData.optString("CUSTOMER_NAME"),
					jsonData.optString("ADDR_DESCR1"), jsonData.optString("ADDR_DESCR2"),
					jsonData.optString("ADDR_DESCR3"), jsonData.optString("CITY"), jsonData.optString("PIN_CODE"),
					jsonData.optString("USAGE_TYPE1"), jsonData.optString("INVOICE_NUM"),
					jsonData.optString("INVOICE_CHKDIGIT"), jsonData.optString("INVOICE_DATE"),
					jsonData.optString("BOOK"), jsonData.optString("BILL_GR"), jsonData.optString("WLK"),
					jsonData.optString("CONS_EXTG_NUM"), jsonData.optString("CUSTOMER_NUM"),
					jsonData.optString("OLD_CUSTNO"), jsonData.optString("CONS_CHK_DIGIT"),
					jsonData.optString("INVOICE_DUE_DATE"), jsonData.optString("TARIFF"),
					jsonData.optString("BUS_TYPE_CODE"), jsonData.optString("CUST_STATUS"),
					jsonData.optString("SPECIAL_CODE"), jsonData.optString("SPECIAL_VALUE"), jsonData.optString("RULE"),
					jsonData.optString("SANC_LOAD"), jsonData.optString("CONNECT_LOAD"),
					jsonData.optString("METER_NUM_KWH"), jsonData.optString("METER_COND_KWH"),
					jsonData.optString("OMF_KWH"), jsonData.optString("METER_NUM_KVARH"),
					jsonData.optString("METER_COND_KVARH"), jsonData.optString("OMF_KVARH"),
					jsonData.optString("METER_COND_KW"), jsonData.optString("OMF_KW"),
					jsonData.optString("XF_LOSS_SR_CONS"), jsonData.optString("XF_LOSS_OFPK_CONS"),
					jsonData.optString("XF_LOSS_PK_CONS"), jsonData.optString("PFC_SR_CONS"),
					jsonData.optString("PFC_OFPK_CONS"), jsonData.optString("PFC_PK_CONS"),
					jsonData.optString("OLD_KWH_SR_CONS"), jsonData.optString("OLD_KWH_OFPK_CONS"),
					jsonData.optString("OLD_KWH_PK_CONS"), jsonData.optString("OLD_KVARH_SR_CONS"),
					jsonData.optString("OLD_KVARH_OFPK_CONS"), jsonData.optString("OLD_KVARH_PK_CONS"),
					jsonData.optString("CLS_KWH_SR_RDNG"), jsonData.optString("CLS_KWH_OFPK_RDNG"),
					jsonData.optString("CLS_KWH_PK_RDNG"), jsonData.optString("OPN_KWH_SR_RDNG"),
					jsonData.optString("OPN_KWH_OFPK_RDNG"), jsonData.optString("OPN_KWH_PK_RDNG"),
					jsonData.optString("CONS_KWH_SR"), jsonData.optString("CONS_KWH_OFPK"),
					jsonData.optString("CONS_KWH_PK"), jsonData.optString("CLS_KVARH_SR_RDNG"),
					jsonData.optString("CLS_KVARH_OFPK_RDNG"), jsonData.optString("CLS_KVARH_PK_RDNG"),
					jsonData.optString("OPN_KVARH_SR_RDNG"), jsonData.optString("OPN_KVARH_OFPK_RDNG"),
					jsonData.optString("OPN_KVARH_PK_RDNG"), jsonData.optString("CONS_KVARH_SR"),
					jsonData.optString("CONS_KVARH_OFPK"), jsonData.optString("CONS_KVARH_PK"),
					jsonData.optString("PRESENT_CUM_NO"), jsonData.optString("PRESENT_DMD_RDNG"),
					jsonData.optString("PREVIOUS_CUM_NO"), jsonData.optString("PREVIOUS_DMD_RDNG"),
					jsonData.optString("MAX_DMD_RDNG"), jsonData.optString("POWER_FACTOR"),
					jsonData.optString("PF_CORRECTION"), jsonData.optString("ARREAR_FROMDATE"),
					jsonData.optString("ARREAR_TODATE"), jsonData.optString("VAT_ARR_FROMDATE"),
					jsonData.optString("VAT_ARR_TODATE"), jsonData.optString("ADJUSTED_CONS"),
					jsonData.optString("BILL_TYPE_CODE"), jsonData.optString("POLE_NUMBER"),
					jsonData.optString("INST_PLAN_NUM1"), jsonData.optString("INST_PLAN_NUM2"),
					jsonData.optString("ENG_CHRG_SR"), jsonData.optString("ENG_CHRG_OFPK"),
					jsonData.optString("ENG_CHRG_PK"), jsonData.optString("DEMAND_CHRG"),
					jsonData.optString("MINIMUM_CHRG"), jsonData.optString("SERVICE_CHRG"),
					jsonData.optString("XF_LOSS_CHRG"), jsonData.optString("XF_RENT"), jsonData.optString("PFC_CHARGE"),
					jsonData.optString("PRINC_AMT"), jsonData.optString("CURRENT_VAT"),
					jsonData.optString("CURRENT_AMT"), jsonData.optString("ADJUSTED_PRN"),
					jsonData.optString("ADJUSTED_LPS"), jsonData.optString("ADJUSTED_VAT"),
					jsonData.optString("INSTALLMENT_PRN_1"), jsonData.optString("INSTALLMENT_LPS_1"),
					jsonData.optString("INSTALLMENT_VAT_1"), jsonData.optString("TOTAL_VAT"),
					jsonData.optString("TOTAL_BILL"), jsonData.optString("RCPT_PRN_1"),
					jsonData.optString("RCPT_PRN_2"), jsonData.optString("RCPT_DATE_1"),
					jsonData.optString("RCPT_DATE_2"), jsonData.optString("SARR_PRN_N_SRCHG1"),
					jsonData.optString("SARR_PRN_N_SRCHG2"), jsonData.optString("SARR_PRN_N_SRCHG3"),
					jsonData.optString("SARR_PRN_N_SRCHG4"), jsonData.optString("SARR_PRN_N_SRCHG5"),
					jsonData.optString("SARR_PRN_N_SRCHG6"), jsonData.optString("SARR_PRN_N_SRCHG7"),
					jsonData.optString("SARR_PRN_N_SRCHG9"), jsonData.optString("SARR_PRN_N_SRCHG10"),
					jsonData.optString("SARR_PRN_N_SRCHG11"), jsonData.optString("DARREAR1"),
					jsonData.optString("DARREAR2"), jsonData.optString("DARREAR3"), jsonData.optString("DARREAR4"),
					jsonData.optString("DARREAR5"), jsonData.optString("DARREAR6"), jsonData.optString("DARREAR7"),
					jsonData.optString("DARREAR8"), jsonData.optString("DARREAR9"), jsonData.optString("DARREAR10"),
					jsonData.optString("DARREAR11"), jsonData.optString("DARREAR12"),
					jsonData.optString("PRESENT_READING_DATE"), jsonData.optString("PREV_READING_DATE"),
					jsonData.optString("VAT_PERCENT"), jsonData.optString("C1"), jsonData.optString("C2"),
					jsonData.optString("C3"), jsonData.optString("ARR_VAT_12"), jsonData.optString("CURRENT_LPS"),
					jsonData.optString("TOTAL_LPS"), jsonData.optString("MAX_DMD_RDNG_1"),
					jsonData.optString("SANC_LOAD_1"), jsonData.optString("USAGE_TYPE_1"),
					jsonData.optString("F_H_NAME"), jsonData.optString("MONTH1"), jsonData.optString("MONTH2"),
					jsonData.optString("MONTH3"), jsonData.optString("MONTH4"), jsonData.optString("MONTH5"),
					jsonData.optString("MONTH6"), jsonData.optString("MONTH7"), jsonData.optString("MONTH8"),
					jsonData.optString("LOC_CONTACT"), jsonData.optString("NM_CLS_KWH_SR_RDNG"),
					jsonData.optString("NM_CLS_KWH_OFPK_RDNG"), jsonData.optString("NM_CLS_KWH_PK_RDNG"),
					jsonData.optString("NM_OPN_KWH_SR_RDNG"), jsonData.optString("NM_OPN_KWH_OFPK_RDNG"),
					jsonData.optString("NM_OPN_KWH_PK_RDNG"), jsonData.optString("NM__CONS_KWH_SR"),
					jsonData.optString("NM_CONS_KWH_OFPK"), jsonData.optString("NM_CONS_KWH_PK"),
					jsonData.optString("NET_CAPACITY"), jsonData.optString("SR_ADJ_UNIT"),
					jsonData.optString("OFPK_ADJ_UNIT"), jsonData.optString("PK_ADJ_UNIT"),
					jsonData.optString("CF_UNIT"), jsonData.optString("BF_UNIT"), jsonData.optString("SETTLEMENT_UNIT"),
					jsonData.optString("UTILITY_RATE"), jsonData.optString("NET_SETTLEMENT_AMT"),
					jsonData.optString("NET_PRIN_ADJ_AMT"), jsonData.optString("NET_VAT_ADJ_AMT"),
					jsonData.optString("NET_TOT_BILL"));

		}

		return Bill_print;
	}

}
