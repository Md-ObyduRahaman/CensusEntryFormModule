package com.dpdc.bd.dao;

import java.util.Map;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.dpdc.bd.model.EMP_USER_MST;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class LoginDAO {

	SimpleJdbcCall getAllStatesJdbcCall;

	public LoginDAO(DataSource dataSource) {

		this.getAllStatesJdbcCall = new SimpleJdbcCall(dataSource);
	}

	public EMP_USER_MST getLogin(String name, String pass)
	{
	
		EMP_USER_MST user = null;
		Map<String, Object> result = getAllStatesJdbcCall.withCatalogName("DPG_EMP_USER_LOGIN")
				.withProcedureName("DPD_USER_LOGIN_DATA")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR)).execute(name, pass);
	
		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);
	
		System.out.println(jsonArray);
	//{"USER_PASSWORD":"1234","USER_ID":"49","USER_NAME":"SOJIB"}
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			user = new EMP_USER_MST(
					jsonData.optString("USER_NAME"), jsonData.optString("USER_PASSWORD"));

		}	
	
		return user;
	
	}
	
	
	
}
