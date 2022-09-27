package com.dpdc.bd.model;

import org.springframework.stereotype.Component;

@Component
public class MeterDetailsFormModel {
	private String SUPPLY_TYPE;
	private String FEEDER_TRANS_CODE;
	private int FEEDER_TRANS_ID;
	private String PHASE_TYPE;
	private String PHASE_CONNECT;
	private int SERV_CONNEC_TYPE;
	private String SERV_DROP_LENGTH;
	private String SERV_DROP_SIZE;
	private String SUB_STATION_33;
	private String SUB_STATION_11;
	private String POLE_NUM;
	private String SANC_LOAD;
	private String USAGE_CATEGORY;
	private int LIKELY_MONTHLY_CONSUMP;
	private String CONNECT_LOAD;
	private int CONSUMER_STATUS;
	private int SECURITY_DEPOSIT;
	private String COOK_FUEL_TYPE;
	private String BUS_TYPE_CODE;
	private String SPL_CONS_CODE;
	private String SPL_TYPE_DESC;
	private String SPL_TYPE_CODE;
	private String USAGE_CATEGORY_CODE;
	private String BUS_TYPE_DESC;
	private String CUSTOMER_TYPE_CODE;
	private String SPL_TYPE;
	private String SPL_CODE;
	private String SPL_CODE_DESC;
	private String CODE_DESCR;
	private String CODE_DESCR_tarrif;
	private String CUSTOMER_TYPE;

	public MeterDetailsFormModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	public String getCUSTOMER_TYPE() {
		return CUSTOMER_TYPE;
	}



	public void setCUSTOMER_TYPE(String cUSTOMER_TYPE) {
		CUSTOMER_TYPE = cUSTOMER_TYPE;
	}



	public String getCODE_DESCR_tarrif() {
		return CODE_DESCR_tarrif;
	}



	public void setCODE_DESCR_tarrif(String cODE_DESCR_tarrif) {
		CODE_DESCR_tarrif = cODE_DESCR_tarrif;
	}



	public String getCODE_DESCR() {
		return CODE_DESCR;
	}


	public void setCODE_DESCR(String cODE_DESCR) {
		CODE_DESCR = cODE_DESCR;
	}


	public String getSPL_TYPE() {
		return SPL_TYPE;
	}

	public void setSPL_TYPE(String sPL_TYPE) {
		SPL_TYPE = sPL_TYPE;
	}

	public String getCUSTOMER_TYPE_CODE() {
		return CUSTOMER_TYPE_CODE;
	}

	public void setCUSTOMER_TYPE_CODE(String cUSTOMER_TYPE_CODE) {
		CUSTOMER_TYPE_CODE = cUSTOMER_TYPE_CODE;
	}

	public String getBUS_TYPE_DESC() {
		return BUS_TYPE_DESC;
	}

	public void setBUS_TYPE_DESC(String bUS_TYPE_DESC) {
		BUS_TYPE_DESC = bUS_TYPE_DESC;
	}

	public String getUSAGE_CATEGORY_CODE() {
		return USAGE_CATEGORY_CODE;
	}

	public void setUSAGE_CATEGORY_CODE(String uSAGE_CATEGORY_CODE) {
		USAGE_CATEGORY_CODE = uSAGE_CATEGORY_CODE;
	}

	public String getSUPPLY_TYPE() {
		return SUPPLY_TYPE;
	}

	public void setSUPPLY_TYPE(String sUPPLY_TYPE) {
		SUPPLY_TYPE = sUPPLY_TYPE;
	}

	public String getFEEDER_TRANS_CODE() {
		return FEEDER_TRANS_CODE;
	}

	public void setFEEDER_TRANS_CODE(String fEEDER_TRANS_CODE) {
		FEEDER_TRANS_CODE = fEEDER_TRANS_CODE;
	}

	public int getFEEDER_TRANS_ID() {
		return FEEDER_TRANS_ID;
	}

	public void setFEEDER_TRANS_ID(int fEEDER_TRANS_ID) {
		FEEDER_TRANS_ID = fEEDER_TRANS_ID;
	}

	public String getPHASE_TYPE() {
		return PHASE_TYPE;
	}

	public void setPHASE_TYPE(String pHASE_TYPE) {
		PHASE_TYPE = pHASE_TYPE;
	}

	public String getPHASE_CONNECT() {
		return PHASE_CONNECT;
	}

	public void setPHASE_CONNECT(String pHASE_CONNECT) {
		PHASE_CONNECT = pHASE_CONNECT;
	}

	public int getSERV_CONNEC_TYPE() {
		return SERV_CONNEC_TYPE;
	}

	public void setSERV_CONNEC_TYPE(int sERV_CONNEC_TYPE) {
		SERV_CONNEC_TYPE = sERV_CONNEC_TYPE;
	}

	public String getSERV_DROP_LENGTH() {
		return SERV_DROP_LENGTH;
	}

	public void setSERV_DROP_LENGTH(String sERV_DROP_LENGTH) {
		SERV_DROP_LENGTH = sERV_DROP_LENGTH;
	}

	public String getSERV_DROP_SIZE() {
		return SERV_DROP_SIZE;
	}

	public void setSERV_DROP_SIZE(String sERV_DROP_SIZE) {
		SERV_DROP_SIZE = sERV_DROP_SIZE;
	}

	public String getSUB_STATION_33() {
		return SUB_STATION_33;
	}

	public void setSUB_STATION_33(String sUB_STATION_33) {
		SUB_STATION_33 = sUB_STATION_33;
	}

	public String getSUB_STATION_11() {
		return SUB_STATION_11;
	}

	public void setSUB_STATION_11(String sUB_STATION_11) {
		SUB_STATION_11 = sUB_STATION_11;
	}

	public String getPOLE_NUM() {
		return POLE_NUM;
	}

	public void setPOLE_NUM(String pOLE_NUM) {
		POLE_NUM = pOLE_NUM;
	}

	public String getSANC_LOAD() {
		return SANC_LOAD;
	}

	public void setSANC_LOAD(String sANC_LOAD) {
		SANC_LOAD = sANC_LOAD;
	}

	public String getUSAGE_CATEGORY() {
		return USAGE_CATEGORY;
	}

	public void setUSAGE_CATEGORY(String uSAGE_CATEGORY) {
		USAGE_CATEGORY = uSAGE_CATEGORY;
	}

	public int getLIKELY_MONTHLY_CONSUMP() {
		return LIKELY_MONTHLY_CONSUMP;
	}

	public void setLIKELY_MONTHLY_CONSUMP(int lIKELY_MONTHLY_CONSUMP) {
		LIKELY_MONTHLY_CONSUMP = lIKELY_MONTHLY_CONSUMP;
	}

	public String getCONNECT_LOAD() {
		return CONNECT_LOAD;
	}

	public void setCONNECT_LOAD(String cONNECT_LOAD) {
		CONNECT_LOAD = cONNECT_LOAD;
	}

	public int getCONSUMER_STATUS() {
		return CONSUMER_STATUS;
	}

	public void setCONSUMER_STATUS(int cONSUMER_STATUS) {
		CONSUMER_STATUS = cONSUMER_STATUS;
	}

	public int getSECURITY_DEPOSIT() {
		return SECURITY_DEPOSIT;
	}

	public void setSECURITY_DEPOSIT(int sECURITY_DEPOSIT) {
		SECURITY_DEPOSIT = sECURITY_DEPOSIT;
	}

	public String getCOOK_FUEL_TYPE() {
		return COOK_FUEL_TYPE;
	}

	public void setCOOK_FUEL_TYPE(String cOOK_FUEL_TYPE) {
		COOK_FUEL_TYPE = cOOK_FUEL_TYPE;
	}

	public String getBUS_TYPE_CODE() {
		return BUS_TYPE_CODE;
	}

	public void setBUS_TYPE_CODE(String bUS_TYPE_CODE) {
		BUS_TYPE_CODE = bUS_TYPE_CODE;
	}

	public String getSPL_CONS_CODE() {
		return SPL_CONS_CODE;
	}

	public void setSPL_CONS_CODE(String sPL_CONS_CODE) {
		SPL_CONS_CODE = sPL_CONS_CODE;
	}

	public String getSPL_TYPE_DESC() {
		return SPL_TYPE_DESC;
	}

	public void setSPL_TYPE_DESC(String sPL_TYPE_DESC) {
		SPL_TYPE_DESC = sPL_TYPE_DESC;
	}

	public String getSPL_TYPE_CODE() {
		return SPL_TYPE_CODE;
	}

	public void setSPL_TYPE_CODE(String sPL_TYPE_CODE) {
		SPL_TYPE_CODE = sPL_TYPE_CODE;
	}

	public String getSPL_CODE() {
		return SPL_CODE;
	}

	public void setSPL_CODE(String sPL_CODE) {
		SPL_CODE = sPL_CODE;
	}

	public String getSPL_CODE_DESC() {
		return SPL_CODE_DESC;
	}

	public void setSPL_CODE_DESC(String sPL_CODE_DESC) {
		SPL_CODE_DESC = sPL_CODE_DESC;
	}

	@Override
	public String toString() {
		return "MeterDetailsFormModel [SUPPLY_TYPE=" + SUPPLY_TYPE + ", FEEDER_TRANS_CODE=" + FEEDER_TRANS_CODE
				+ ", FEEDER_TRANS_ID=" + FEEDER_TRANS_ID + ", PHASE_TYPE=" + PHASE_TYPE + ", PHASE_CONNECT="
				+ PHASE_CONNECT + ", SERV_CONNEC_TYPE=" + SERV_CONNEC_TYPE + ", SERV_DROP_LENGTH=" + SERV_DROP_LENGTH
				+ ", SERV_DROP_SIZE=" + SERV_DROP_SIZE + ", SUB_STATION_33=" + SUB_STATION_33 + ", SUB_STATION_11="
				+ SUB_STATION_11 + ", POLE_NUM=" + POLE_NUM + ", SANC_LOAD=" + SANC_LOAD + ", USAGE_CATEGORY="
				+ USAGE_CATEGORY + ", LIKELY_MONTHLY_CONSUMP=" + LIKELY_MONTHLY_CONSUMP + ", CONNECT_LOAD="
				+ CONNECT_LOAD + ", CONSUMER_STATUS=" + CONSUMER_STATUS + ", SECURITY_DEPOSIT=" + SECURITY_DEPOSIT
				+ ", COOK_FUEL_TYPE=" + COOK_FUEL_TYPE + ", BUS_TYPE_CODE=" + BUS_TYPE_CODE + ", SPL_CONS_CODE="
				+ SPL_CONS_CODE + ", SPL_TYPE_DESC=" + SPL_TYPE_DESC + ", SPL_TYPE_CODE=" + SPL_TYPE_CODE
				+ ", USAGE_CATEGORY_CODE=" + USAGE_CATEGORY_CODE + ", BUS_TYPE_DESC=" + BUS_TYPE_DESC
				+ ", CUSTOMER_TYPE_CODE=" + CUSTOMER_TYPE_CODE + ", SPL_TYPE=" + SPL_TYPE + "]";
	}

}
