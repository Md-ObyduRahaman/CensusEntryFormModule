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
import com.dpdc.bd.model.EMP_MODULES_LIST;
import oracle.jdbc.internal.OracleTypes;

@Repository
public class GetDynamicMenuDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	SimpleJdbcCall getAllStatesJdbcCall;

	public GetDynamicMenuDAO(DataSource dataSource) {
		this.getAllStatesJdbcCall = new SimpleJdbcCall(dataSource);

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

		String dataHtml = " <nav id=\"sidebar\" th:fragment=\"sidebar\">\r\n"
				+ "     <div class=\"sidebar-header\">\r\n" + "               \r\n" + "\r\n" + "\r\n"
				+ "                    <div class=\"custom-thumbnail m-8\">\r\n"
				+ "                      <img style=\"margin-left: 40px;\" src=\"../img/DPDC.png\" alt=\"Image\" width=\"100\" height=\"60\" class=\"img-fluid\">\r\n"
				+ "                    </div>\r\n"

				+ "\r\n" + "\r\n" + "\r\n" + "            </div>   " + "\r\n"
				+ "            <ul class=\"list-unstyled components\">\r\n"
				+ "        ";

		for (int menu_level_0 = 0; menu_level_0 < dynamicMenu.size(); menu_level_0++) {
			if (dynamicMenu.get(menu_level_0).getPARENT().equals("0")) {

				// code starting for finding level_0 and sub menu of level_0
				if (dynamicMenu.get(menu_level_0).getMOD_APP().equals("#")) {

					dataHtml += "             \r\n" + "                <li>\r\n" + "                   \r\n"
							+ "                    <a href=\"#pageSubmenu" + menu_level_0
							+ "\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">"
							+ dynamicMenu.get(menu_level_0).getMOD_NAME() + "</a>\r\n"
							+ "                    <ul class=\"collapse list-unstyled\" id=\"pageSubmenu" + menu_level_0
							+ "\">\r\n" + "                        <li>\r\n";
					for (int menu_level_1 = 0; menu_level_1 < dynamicMenu.size(); menu_level_1++) {
						if (dynamicMenu.get(menu_level_1).getPARENT().equals(dynamicMenu.get(menu_level_0).getMOD_ID()))

							// code starting for finding level_1 and sub menu of level_1
							if (dynamicMenu.get(menu_level_1).getMOD_APP().equals("#")) {

								dataHtml += "             \r\n" + "                <li>\r\n" + "                   \r\n"
										+ "                    <a href=\"#pageSubmenu" + menu_level_1
										+ "\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">"
										+ dynamicMenu.get(menu_level_1).getMOD_NAME() + "</a>\r\n"
										+ "                    <ul class=\"collapse list-unstyled\" id=\"pageSubmenu"
										+ menu_level_1 + "\">\r\n" + "                        <li>\r\n";
								for (int menu_level_2 = 0; menu_level_2 < dynamicMenu.size(); menu_level_2++) {
									if (dynamicMenu.get(menu_level_2).getPARENT()
											.equals(dynamicMenu.get(menu_level_1).getMOD_ID()))
										// code starting for finding level_2 and sub menu of level_2
										if (dynamicMenu.get(menu_level_2).getMOD_APP().equals("#")) {

											dataHtml += "             \r\n" + "                <li>\r\n"
													+ "                   \r\n"
													+ "                    <a href=\"#pageSubmenu" + menu_level_2
													+ "\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">"
													+ dynamicMenu.get(menu_level_2).getMOD_NAME() + "</a>\r\n"
													+ "                    <ul class=\"collapse list-unstyled\" id=\"pageSubmenu"
													+ menu_level_2 + "\">\r\n" + "                        <li>\r\n";
											for (int menu_level_3 = 0; menu_level_3 < dynamicMenu
													.size(); menu_level_3++) {
												if (dynamicMenu.get(menu_level_3).getPARENT()
														.equals(dynamicMenu.get(menu_level_2).getMOD_ID()))
													dataHtml += "                            <a id="+dynamicMenu.get(menu_level_3).getMOD_APP()+" href="
															+ dynamicMenu.get(menu_level_3).getMOD_APP() + ">"
															+ dynamicMenu.get(menu_level_3).getMOD_NAME() + "</a>\r\n";
											}

											dataHtml += "              <hr>          </li>\r\n"

													+ "                    </ul>\r\n" + "                </li>\r\n";

										}

										else {

											dataHtml += "                <li>\r\n" + "                    <a href="
													+ dynamicMenu.get(menu_level_2).getMOD_APP() + ">"
													+ dynamicMenu.get(menu_level_2).getMOD_NAME() + "</a>\r\n";
										}
									// code ending for finding level_2 and sub menu of level_2
								}

								dataHtml += "                        </li>\r\n"

										+ "                    </ul>\r\n" + "                </li>\r\n";

							}

							else {

								dataHtml += "                <li>\r\n" + "                    <a href="
										+ dynamicMenu.get(menu_level_1).getMOD_APP() + ">"
										+ dynamicMenu.get(menu_level_1).getMOD_NAME() + "</a>\r\n";
							}
						// code ending for finding level_1 and sub menu of level_1

					}

					dataHtml += "                        </li>\r\n"

							+ "                    </ul>\r\n" + "                </li>\r\n";

				}

				else {

					dataHtml += "                <li>\r\n" + "                    <a href="
							+ dynamicMenu.get(menu_level_0).getMOD_APP() + ">"
							+ dynamicMenu.get(menu_level_0).getMOD_NAME() + "</a>\r\n";
				}
				// code ending for finding level_0 and sub menu of level_0
			}

		}
		dataHtml += "                </li>\r\n" + "         <li>\r\n" + "                    <a \r\n"
				+ "							href=\"../../../logout\">Logout</a>\r\n" + "                </li>        "
				+ "            </ul>\r\n" + "\r\n" + "           \r\n" + "      <div >\r\n" + "                \r\n"
				+ "                <img src=\"../img/itbt.jfif\" alt=\"picture not available\" width=\"250\" height=\"60\">\r\n"
				+ "                \r\n" + "                </div>   </nav> ";

		return dataHtml;
	}

}
