package com.dpdc.bd.model;

import org.springframework.stereotype.Component;

@Component
public class DPD_LOCATION_LIST {
	 
	private String LOCATION_CODE;
	private String LOCATION_NAME;
	private String ZONE;
	private String DIV;
	private String SUB_DIV;
	private String CIRCLE;
	private String BILL_GRP;
	
	
	
	
	public DPD_LOCATION_LIST() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DPD_LOCATION_LIST(String lOCATION_CODE, String lOCATION_NAME) {
		super();
		LOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME = lOCATION_NAME;
	}
	public DPD_LOCATION_LIST( String zONE, String dIV, String sUB_DIV,
			String cIRCLE) {
		super();
		
		ZONE = zONE;
		DIV = dIV;
		SUB_DIV = sUB_DIV;
		CIRCLE = cIRCLE;
	}
	
	public String getBILL_GRP() {
		return BILL_GRP;
	}
	public void setBILL_GRP(String bILL_GRP) {
		BILL_GRP = bILL_GRP;
	}
	public String getLOCATION_CODE() {
		return LOCATION_CODE;
	}
	public void setLOCATION_CODE(String lOCATION_CODE) {
		LOCATION_CODE = lOCATION_CODE;
	}
	public String getLOCATION_NAME() {
		return LOCATION_NAME;
	}
	public void setLOCATION_NAME(String lOCATION_NAME) {
		LOCATION_NAME = lOCATION_NAME;
	}
	public String getZONE() {
		return ZONE;
	}
	public void setZONE(String zONE) {
		ZONE = zONE;
	}
	public String getDIV() {
		return DIV;
	}
	public void setDIV(String dIV) {
		DIV = dIV;
	}
	public String getSUB_DIV() {
		return SUB_DIV;
	}
	public void setSUB_DIV(String sUB_DIV) {
		SUB_DIV = sUB_DIV;
	}
	public String getCIRCLE() {
		return CIRCLE;
	}
	public void setCIRCLE(String cIRCLE) {
		CIRCLE = cIRCLE;
	}
	@Override
	public String toString() {
		return "DPD_LOCATION_LIST [LOCATION_CODE=" + LOCATION_CODE + ", LOCATION_NAME=" + LOCATION_NAME + ", ZONE="
				+ ZONE + ", DIV=" + DIV + ", SUB_DIV=" + SUB_DIV + ", CIRCLE=" + CIRCLE + "]";
	}
	
	

	
	
	
	

}