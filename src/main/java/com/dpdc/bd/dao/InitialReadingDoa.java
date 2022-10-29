package com.dpdc.bd.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
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

import com.dpdc.bd.model.BC_TODMTR_INTERFACE_Model;

import oracle.jdbc.internal.OracleTypes;
import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;

@Repository
public class InitialReadingDoa {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	SimpleJdbcCall getAllStatesJdbcCall;

	public InitialReadingDoa(DataSource dataSource) {
		this.getAllStatesJdbcCall = new SimpleJdbcCall(dataSource);
	}

	public String get_InitialReading(String P_User, String p_purpose_of_rdg, String p_METER_INT_ID,
			String p_meter_type) {

		Map<String, Object> result = getAllStatesJdbcCall.withCatalogName("DPG_EMP_CONSUMER_CENSUS_ENTRY")
				.withProcedureName("DPD_todmtr_reading_initial")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.VARCHAR))
				.execute(P_User, p_purpose_of_rdg, p_METER_INT_ID, p_meter_type);
		JSONObject json = new JSONObject(result);
		String out = json.get("O_STATUS").toString();
		System.out.println(out);
		return out;
	}

	public ArrayList<BC_TODMTR_INTERFACE_Model> listOf_BC_TODMTR(Integer P) {

		String sql = "SELECT * FROM BC_TODMTR_INTERFACE  BMI, BC_METER_TYPECODE_MAP BMTM,bc_TIME_CYCLE_CODE a ,BC_READING_TYPE_CODE b,BC_TOD_CODE tc\r\n"
				+ "where BMI.METER_TYPE = BMTM.OLD_METER_TYPECODE\r\n"
				+ "and BMI.TIME_CYCLE_CODE=a.TIME_CYCLE_CODE \r\n" + "and BMI.READING_TYPE_CODE=b.READING_TYPE_CODE\r\n"
				+ "and BMI.TOD_CODE=tc.TOD_CODE\r\n" + " and  BMI.REF_ID = '" + P + "'";

		ArrayList<BC_TODMTR_INTERFACE_Model> BC_TODMTR_INTERFACE_Model = (ArrayList<BC_TODMTR_INTERFACE_Model>) jdbcTemplate
				.query(sql, BeanPropertyRowMapper.newInstance(BC_TODMTR_INTERFACE_Model.class));

		return BC_TODMTR_INTERFACE_Model;
	}

	public int updateTodMeterData(ArrayList<String> TOD_ID, ArrayList<String> READING_DATE , ArrayList<String> READING) {
		Integer one[] = optIntArray(TOD_ID);
		String two[] = optStringArray(READING_DATE);
		String three[] = optStringArray(READING);

		ArrayDescriptor des1, des2, des3;
		ARRAY aOne = null, aTwo = null, aThree = null;
		CallableStatement st = null;
		int out = 0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@172.16.1.80:1521/bpdbtestdb.bpdb.gov.bd",
					"EMP", "EMP");
			des1 = ArrayDescriptor.createDescriptor("EMP.ARRAY_TOD_ID", con);
			aOne = new ARRAY(des1, con, one);
			des2 = ArrayDescriptor.createDescriptor("EMP.ARRAY_READING_DATE", con);
			aTwo = new ARRAY(des2, con, two);
			des3 = ArrayDescriptor.createDescriptor("EMP.ARRAY_READING", con);
			aThree = new ARRAY(des3, con, three);
			st = con.prepareCall("call DPG_NET_MRS_ENTRY.DPD_NET_TOD_MTR_DATA_UPDATE(?,?,?,?)");
			st.registerOutParameter(1, Types.INTEGER);
			st.setArray(2, aOne);
			st.setArray(3, aTwo);
			st.setArray(4, aThree);
			st.execute();
			out = st.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return out;
	}

	public static String[] optStringArray(ArrayList<String> arr) {

		// declaration and initialise String Array
		String str[] = new String[arr.size()];

		// Convert ArrayList to object array
		Object[] objArr = arr.toArray();

		// Iterating and converting to String
		int i = 0;
		for (Object obj : objArr) {
			str[i++] = (String) obj;
		}

		return str;
	}
	public static Integer[] optIntArray(ArrayList<String> arr) {
		// declaration and initialise String Array
		Integer intr[] = new Integer[arr.size()];

				// Convert ArrayList to object array
				Object[] objArr = arr.toArray();

				// Iterating and converting to String
				int i = 0;
				for (Object obj : objArr) {
					intr[i++] = Integer.parseInt((String) obj);
				}

				return intr;
		
		
	}
}
