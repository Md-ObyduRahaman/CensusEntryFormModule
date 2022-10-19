package com.dpdc.bd.dao;

import java.util.Map;

import javax.sql.DataSource;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.dpdc.bd.model.AddMeterModel;
import com.dpdc.bd.model.CensusFormModel;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class MRS_GenerationDao {

	public static String O_CUST_ID;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	SimpleJdbcCall getAllStatesJdbcCallInsert;

	public MRS_GenerationDao(DataSource dataSource) {

		this.getAllStatesJdbcCallInsert = new SimpleJdbcCall(dataSource);

	}

	public String insertMRSEntry(AddMeterModel a) {

		Map<String, Object> result = getAllStatesJdbcCallInsert.withProcedureName("dpd_net_meter_Card_gen")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(a.getBILL_CYCLE_CODE(), a.getLOCATION_CODE(), a.getBOOK_NO(), a.getBILL_GR(), a.getCONSUMER_NUM());
		JSONObject json = new JSONObject(result);
		String out = json.get("O_STATUS").toString();
		System.out.println(out);
		return out;

	}

}