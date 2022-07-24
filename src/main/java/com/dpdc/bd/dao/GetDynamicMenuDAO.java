package com.dpdc.bd.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.dpdc.bd.model.EMP_MODULES_LIST;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class GetDynamicMenuDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	SimpleJdbcCall getAllStatesJdbcCall;
	SimpleJdbcCall getAllStatesJdbcCall_level_1;

	public GetDynamicMenuDAO(DataSource dataSource) {
		this.getAllStatesJdbcCall = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall_level_1 = new SimpleJdbcCall(dataSource);
	}

	public String getDynamicMenu(String user_name) {

		ArrayList<EMP_MODULES_LIST> dynamicMenu = new ArrayList<EMP_MODULES_LIST>();
		Map<String, Object> result = getAllStatesJdbcCall.withCatalogName("DPG_EMP_USER_LOGIN")
				.withProcedureName("DPD_DYNAMIC_MENU_LIST")
				.declareParameters(new SqlOutParameter("results_0cursor", OracleTypes.VARCHAR)).execute(user_name);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			dynamicMenu.add(new EMP_MODULES_LIST(jsonData.optString("PARENT"), jsonData.optString("MOD_ID"),
					jsonData.optString("MOD_APP"), jsonData.optString("EXT"), jsonData.optString("ROOTLEAF"),
					jsonData.optString("MOD_NAME"), jsonData.optString("MTYPE"), jsonData.optString("MOD_CODE"),
					jsonData.optString("PAGE_RANG"), jsonData.optString("SHORT_NAME")));
		}

		String dString = "dynamic";

		String dataHtml = " <nav id=\"sidebar\" th:fragment=\"sidebar\">\r\n"
				+ "            <div class=\"sidebar-header\">\r\n" + "                <h3>DPDC</h3>\r\n"
				+ "            </div>\r\n" + "\r\n" + "            <ul class=\"list-unstyled components\">\r\n"
				+ "                <p>Dummy Heading</p>\r\n";

		for (int i = 0; i < dynamicMenu.size(); i++) {
			if (dynamicMenu.get(i).getPARENT().equals("0")) {

				if (dynamicMenu.get(i).getMOD_APP().equals("#")) {
					String MID = dynamicMenu.get(i).getMOD_ID();
					int k = this.name(Integer.valueOf(MID));

					System.out.println(dynamicMenu.get(i).getMOD_ID()+"value of I"+i);

					dataHtml += "             \r\n" + "                <li>\r\n" + "                   \r\n"
							+ "                    <a href=\"#pageSubmenu" + i
							+ "\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">"
							+ dynamicMenu.get(i).getMOD_NAME() + "</a>\r\n"
							+ "                    <ul class=\"collapse list-unstyled\" id=\"pageSubmenu" + i
							+ "\">\r\n" + "                        <li>\r\n";
					for (int j = 0; j < dynamicMenu.size(); j++) {
						System.out.println("mode id..."+dynamicMenu.get(j).getMOD_ID());
						System.out.println("parent id..."+dynamicMenu.get(i).getPARENT()+"value of I"+i);
						if (dynamicMenu.get(j).getPARENT().equals(dynamicMenu.get(i).getMOD_ID()))
						dataHtml += "                            <a href=\"#\">" + dynamicMenu.get(j).getMOD_NAME()
								+ "</a>\r\n";
					}

					dataHtml += "                        </li>\r\n"

							+ "                    </ul>\r\n" + "                </li>\r\n";

				}

				else {

					dataHtml += "                <li>\r\n" + "                    <a href=\"#\">"
							+ dynamicMenu.get(i).getMOD_NAME() + "</a>\r\n";
				}
			}
		}
		dataHtml += "                </li>\r\n" + "                <li>\r\n" + "                    <a \r\n"
				+ "							th:onclick=\"|window.location.href='/logout'|\">Logout</a>\r\n"
				+ "                </li>\r\n" + "            </ul>\r\n" + "\r\n" + "           \r\n"
				+ "        </nav> ";
		// -----------------------------------------------------------------------------------------------------------------------------------------

		return dataHtml;
	}

	public int name(int moid) {

		// submenu level-1
		ArrayList<EMP_MODULES_LIST> dynamicMenu_level_1 = new ArrayList<EMP_MODULES_LIST>();
		Map<String, Object> result_level_1 = getAllStatesJdbcCall_level_1.withCatalogName("DPG_EMP_USER_LOGIN")
				.withProcedureName("DPD_DYNAMIC_SUB_MENU_LIST")
				.declareParameters(new SqlOutParameter("results_0cursor", OracleTypes.VARCHAR)).execute(moid);

		JSONObject json_level_1 = new JSONObject(result_level_1);
		String fjfhdj_level_1 = json_level_1.get("CUR_DATA").toString();
		JSONArray jsonArray_level_1 = new JSONArray(fjfhdj_level_1);

		for (int i = 0; i < jsonArray_level_1.length(); i++) {
			JSONObject jsonData_level_1 = jsonArray_level_1.getJSONObject(i);
			dynamicMenu_level_1.add(
					new EMP_MODULES_LIST(jsonData_level_1.optString("PARENT"), jsonData_level_1.optString("MOD_ID"),
							jsonData_level_1.optString("MOD_APP"), jsonData_level_1.optString("EXT"),
							jsonData_level_1.optString("ROOTLEAF"), jsonData_level_1.optString("MOD_NAME"),
							jsonData_level_1.optString("MTYPE"), jsonData_level_1.optString("MOD_CODE"),
							jsonData_level_1.optString("PAGE_RANG"), jsonData_level_1.optString("SHORT_NAME")));
		}
		return 1;

	}

}
