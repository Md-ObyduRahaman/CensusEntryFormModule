package com.dpdc.bd.model;

import org.springframework.stereotype.Component;

@Component
public class AddMeterModel {

	private String REF_NO;
	private String REF_DATE;
	private String LOCATION_CODE;
	private String BILL_GR, BOOK_NO;
	private String CONSUMER_NUM;
	private String CHECK_DIGIT;
	private Integer CUST_ID;
	private String EFF_BILL_CYCLE_CODE;
	private String REMARKS, ADJ_FLAG;
	private String ENL_BILL_CYCLE_CODE;
	private String NET_CONS_NAME;
	private String NET_CUST_NUM;
	private String NET_CUST_CHECK_DIGIT;
	private Integer NET_CUST_ID;
	private String EXP_BILL_CYCLE;
	private Integer NET_CAPACITY;
	private String BILL_CYCLE_CODE;
	private String AREA_CODE;
	private String LOCATION_NAME;
	private String CUSTOMER_NAME;
	private Integer NET_METER_DIGIT;
	private Integer NET_METER_OMF;
	private String EFF_BILL_CYCLE_CODE_UPDATE;
	private Integer SOLAR_GRID_TYPE;
	private Integer NO_OF_PANELS;
	private Integer PANEL_LENGTH;
	private Integer PANEL_WIDTH;
	private Integer WATT_PK_PANEL;
	private Integer TOTAL_SOLAR_LOAD;
	private String SOLAR_METER_NUM;
	private String IMAGE_SYSTEM;
	private String INVERTER_CAPACITY;
	private String INVERTER_PHASE;
	private String INVERTER_STATUS;
	private String PANEL_LENGTH_TYPE;
	private String PANEL_WIDTH_TYPE;

	public AddMeterModel(String lOCATION_CODE, String bILL_GR, String bOOK_NO, String cONSUMER_NUM,
			String bILL_CYCLE_CODE, String aREA_CODE) {
		super();
		LOCATION_CODE = lOCATION_CODE;
		BILL_GR = bILL_GR;
		BOOK_NO = bOOK_NO;
		CONSUMER_NUM = cONSUMER_NUM;
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		AREA_CODE = aREA_CODE;
	}

	public AddMeterModel(String bILL_CYCLE_CODE) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}

	public AddMeterModel(String lOCATION_CODE, String lOCATION_NAME) {
		super();
		LOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME = lOCATION_NAME;
	}

	public AddMeterModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddMeterModel(String rEF_NO, String rEF_DATE, String lOCATION_CODE, String bILL_GR, String bOOK_NO,
			String cONSUMER_NUM, String cHECK_DIGIT, Integer cUST_ID, String eFF_BILL_CYCLE_CODE, String rEMARKS,
			String aDJ_FLAG, String eNL_BILL_CYCLE_CODE, String eXP_BILL_CYCLE, String cUSTOMER_NAME,
			Integer nET_METER_DIGIT, Integer nET_METER_OMF, Integer nET_CAPACITY,
			Integer sOLAR_GRID_TYPE, Integer nO_OF_PANELS, Integer pANEL_LENGTH, Integer pANEL_WIDTH, Integer wATT_PK_PANEL,
			Integer tOTAL_SOLAR_LOAD, String sOLAR_METER_NUM, String iMAGE_SYSTEM, String iNVERTER_CAPACITY,
			String iNVERTER_PHASE, String iNVERTER_STATUS,
			
			String pANEL_LENGTH_TYPE,
	 String pANEL_WIDTH_TYPE

	) {
		super();
		REF_NO = rEF_NO;
		REF_DATE = rEF_DATE;
		LOCATION_CODE = lOCATION_CODE;
		BILL_GR = bILL_GR;
		BOOK_NO = bOOK_NO;
		CONSUMER_NUM = cONSUMER_NUM;
		CHECK_DIGIT = cHECK_DIGIT;
		CUST_ID = cUST_ID;
		EFF_BILL_CYCLE_CODE = eFF_BILL_CYCLE_CODE;
		REMARKS = rEMARKS;
		ADJ_FLAG = aDJ_FLAG;
		ENL_BILL_CYCLE_CODE = eNL_BILL_CYCLE_CODE;
		EXP_BILL_CYCLE = eXP_BILL_CYCLE;
		CUSTOMER_NAME = cUSTOMER_NAME;
		NET_METER_DIGIT = nET_METER_DIGIT;
		NET_METER_OMF = nET_METER_OMF;
		NET_CAPACITY = nET_CAPACITY;
		SOLAR_GRID_TYPE = sOLAR_GRID_TYPE;
		NO_OF_PANELS = nO_OF_PANELS;
		PANEL_LENGTH = pANEL_LENGTH;
		PANEL_WIDTH = pANEL_WIDTH;
		WATT_PK_PANEL = wATT_PK_PANEL;
		TOTAL_SOLAR_LOAD = tOTAL_SOLAR_LOAD;
		SOLAR_METER_NUM = sOLAR_METER_NUM;
		IMAGE_SYSTEM = iMAGE_SYSTEM;
		INVERTER_CAPACITY = iNVERTER_CAPACITY;
		INVERTER_PHASE = iNVERTER_PHASE;
		INVERTER_STATUS = iNVERTER_STATUS;
		PANEL_LENGTH_TYPE = pANEL_LENGTH_TYPE;
		PANEL_WIDTH_TYPE=pANEL_WIDTH_TYPE;
	}

	
	public String getPANEL_WIDTH_TYPE() {
		return PANEL_WIDTH_TYPE;
	}

	public void setPANEL_WIDTH_TYPE(String pANEL_WIDTH_TYPE) {
		PANEL_WIDTH_TYPE = pANEL_WIDTH_TYPE;
	}

	public String getPANEL_LENGTH_TYPE() {
		return PANEL_LENGTH_TYPE;
	}

	public void setPANEL_LENGTH_TYPE(String pANEL_LENGTH_TYPE) {
		PANEL_LENGTH_TYPE = pANEL_LENGTH_TYPE;
	}

	public AddMeterModel(String cHECK_DIGIT, Integer cUST_ID, String nET_CONS_NAME) {
		super();
		CHECK_DIGIT = cHECK_DIGIT;
		CUST_ID = cUST_ID;
		NET_CONS_NAME = nET_CONS_NAME;
	}

	public AddMeterModel(String lOCATION_CODE, String bILL_GR, String bOOK_NO, String cHECK_DIGIT, Integer cUST_ID,
			String cUSTOMER_NAME) {
		super();
		LOCATION_CODE = lOCATION_CODE;
		BILL_GR = bILL_GR;
		BOOK_NO = bOOK_NO;
		CHECK_DIGIT = cHECK_DIGIT;
		CUST_ID = cUST_ID;
		CUSTOMER_NAME = cUSTOMER_NAME;

	}

	public String getEFF_BILL_CYCLE_CODE_UPDATE() {
		return EFF_BILL_CYCLE_CODE_UPDATE;
	}

	public void setEFF_BILL_CYCLE_CODE_UPDATE(String eFF_BILL_CYCLE_CODE_UPDATE) {
		EFF_BILL_CYCLE_CODE_UPDATE = eFF_BILL_CYCLE_CODE_UPDATE;
	}

	public Integer getNET_METER_DIGIT() {
		return NET_METER_DIGIT;
	}

	public void setNET_METER_DIGIT(Integer nET_METER_DIGIT) {
		NET_METER_DIGIT = nET_METER_DIGIT;
	}

	public Integer getNET_METER_OMF() {
		return NET_METER_OMF;
	}

	public void setNET_METER_OMF(Integer nET_METER_OMF) {
		NET_METER_OMF = nET_METER_OMF;
	}

	public String getCUSTOMER_NAME() {
		return CUSTOMER_NAME;
	}

	public void setCUSTOMER_NAME(String cUSTOMER_NAME) {
		CUSTOMER_NAME = cUSTOMER_NAME;
	}

	public String getAREA_CODE() {
		return AREA_CODE;
	}

	public void setAREA_CODE(String aREA_CODE) {
		AREA_CODE = aREA_CODE;
	}

	public String getLOCATION_NAME() {
		return LOCATION_NAME;
	}

	public void setLOCATION_NAME(String lOCATION_NAME) {
		LOCATION_NAME = lOCATION_NAME;
	}

	public String getREF_NO() {
		return REF_NO;
	}

	public void setREF_NO(String rEF_NO) {
		REF_NO = rEF_NO;
	}

	public String getREF_DATE() {
		return REF_DATE;
	}

	public void setREF_DATE(String rEF_DATE) {
		REF_DATE = rEF_DATE;
	}

	public String getLOCATION_CODE() {
		return LOCATION_CODE;
	}

	public void setLOCATION_CODE(String lOCATION_CODE) {
		LOCATION_CODE = lOCATION_CODE;
	}

	public String getBILL_GR() {
		return BILL_GR;
	}

	public void setBILL_GR(String bILL_GR) {
		BILL_GR = bILL_GR;
	}

	public String getBOOK_NO() {
		return BOOK_NO;
	}

	public void setBOOK_NO(String bOOK_NO) {
		BOOK_NO = bOOK_NO;
	}

	public String getCONSUMER_NUM() {
		return CONSUMER_NUM;
	}

	public void setCONSUMER_NUM(String cONSUMER_NUM) {
		CONSUMER_NUM = cONSUMER_NUM;
	}

	public String getCHECK_DIGIT() {
		return CHECK_DIGIT;
	}

	public void setCHECK_DIGIT(String cHECK_DIGIT) {
		CHECK_DIGIT = cHECK_DIGIT;
	}

	public Integer getCUST_ID() {
		return CUST_ID;
	}

	public void setCUST_ID(Integer cUST_ID) {
		CUST_ID = cUST_ID;
	}

	public String getEFF_BILL_CYCLE_CODE() {
		return EFF_BILL_CYCLE_CODE;
	}

	public void setEFF_BILL_CYCLE_CODE(String eFF_BILL_CYCLE_CODE) {
		EFF_BILL_CYCLE_CODE = eFF_BILL_CYCLE_CODE;
	}

	public String getREMARKS() {
		return REMARKS;
	}

	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}

	public String getADJ_FLAG() {
		return ADJ_FLAG;
	}

	public void setADJ_FLAG(String aDJ_FLAG) {
		ADJ_FLAG = aDJ_FLAG;
	}

	public String getENL_BILL_CYCLE_CODE() {
		return ENL_BILL_CYCLE_CODE;
	}

	public void setENL_BILL_CYCLE_CODE(String eNL_BILL_CYCLE_CODE) {
		ENL_BILL_CYCLE_CODE = eNL_BILL_CYCLE_CODE;
	}

	public String getNET_CONS_NAME() {
		return NET_CONS_NAME;
	}

	public void setNET_CONS_NAME(String nET_CONS_NAME) {
		NET_CONS_NAME = nET_CONS_NAME;
	}

	public String getNET_CUST_NUM() {
		return NET_CUST_NUM;
	}

	public void setNET_CUST_NUM(String nET_CUST_NUM) {
		NET_CUST_NUM = nET_CUST_NUM;
	}

	public String getNET_CUST_CHECK_DIGIT() {
		return NET_CUST_CHECK_DIGIT;
	}

	public void setNET_CUST_CHECK_DIGIT(String nET_CUST_CHECK_DIGIT) {
		NET_CUST_CHECK_DIGIT = nET_CUST_CHECK_DIGIT;
	}

	public Integer getNET_CUST_ID() {
		return NET_CUST_ID;
	}

	public void setNET_CUST_ID(Integer nET_CUST_ID) {
		NET_CUST_ID = nET_CUST_ID;
	}

	public String getEXP_BILL_CYCLE() {
		return EXP_BILL_CYCLE;
	}

	public void setEXP_BILL_CYCLE(String eXP_BILL_CYCLE) {
		EXP_BILL_CYCLE = eXP_BILL_CYCLE;
	}

	public Integer getNET_CAPACITY() {
		return NET_CAPACITY;
	}

	public void setNET_CAPACITY(Integer nET_CAPACITY) {
		NET_CAPACITY = nET_CAPACITY;
	}

	public String getBILL_CYCLE_CODE() {
		return BILL_CYCLE_CODE;
	}

	public void setBILL_CYCLE_CODE(String bILL_CYCLE_CODE) {
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}

	public Integer getSOLAR_GRID_TYPE() {
		return SOLAR_GRID_TYPE;
	}

	public void setSOLAR_GRID_TYPE(Integer sOLAR_GRID_TYPE) {
		SOLAR_GRID_TYPE = sOLAR_GRID_TYPE;
	}

	public Integer getNO_OF_PANELS() {
		return NO_OF_PANELS;
	}

	public void setNO_OF_PANELS(Integer nO_OF_PANELS) {
		NO_OF_PANELS = nO_OF_PANELS;
	}

	public Integer getPANEL_LENGTH() {
		return PANEL_LENGTH;
	}

	public void setPANEL_LENGTH(Integer pANEL_LENGTH) {
		PANEL_LENGTH = pANEL_LENGTH;
	}

	public Integer getPANEL_WIDTH() {
		return PANEL_WIDTH;
	}

	public void setPANEL_WIDTH(Integer pANEL_WIDTH) {
		PANEL_WIDTH = pANEL_WIDTH;
	}

	public Integer getWATT_PK_PANEL() {
		return WATT_PK_PANEL;
	}

	public void setWATT_PK_PANEL(Integer wATT_PK_PANEL) {
		WATT_PK_PANEL = wATT_PK_PANEL;
	}

	public Integer getTOTAL_SOLAR_LOAD() {
		return TOTAL_SOLAR_LOAD;
	}

	public void setTOTAL_SOLAR_LOAD(Integer tOTAL_SOLAR_LOAD) {
		TOTAL_SOLAR_LOAD = tOTAL_SOLAR_LOAD;
	}

	public String getSOLAR_METER_NUM() {
		return SOLAR_METER_NUM;
	}

	public void setSOLAR_METER_NUM(String sOLAR_METER_NUM) {
		SOLAR_METER_NUM = sOLAR_METER_NUM;
	}

	public String getINVERTER_CAPACITY() {
		return INVERTER_CAPACITY;
	}

	public void setINVERTER_CAPACITY(String iNVERTER_CAPACITY) {
		INVERTER_CAPACITY = iNVERTER_CAPACITY;
	}

	public String getINVERTER_PHASE() {
		return INVERTER_PHASE;
	}

	public void setINVERTER_PHASE(String iNVERTER_PHASE) {
		INVERTER_PHASE = iNVERTER_PHASE;
	}

	public String getINVERTER_STATUS() {
		return INVERTER_STATUS;
	}

	public void setINVERTER_STATUS(String iNVERTER_STATUS) {
		INVERTER_STATUS = iNVERTER_STATUS;
	}

	public String getIMAGE_SYSTEM() {
		return IMAGE_SYSTEM;
	}

	public void setIMAGE_SYSTEM(String iMAGE_SYSTEM) {
		IMAGE_SYSTEM = iMAGE_SYSTEM;
	}

	@Override
	public String toString() {
		return "AddMeterModel [REF_NO=" + REF_NO + ", REF_DATE=" + REF_DATE + ", LOCATION_CODE=" + LOCATION_CODE
				+ ", BILL_GR=" + BILL_GR + ", BOOK_NO=" + BOOK_NO + ", CONSUMER_NUM=" + CONSUMER_NUM + ", CHECK_DIGIT="
				+ CHECK_DIGIT + ", CUST_ID=" + CUST_ID + ", EFF_BILL_CYCLE_CODE=" + EFF_BILL_CYCLE_CODE + ", REMARKS="
				+ REMARKS + ", ADJ_FLAG=" + ADJ_FLAG + ", ENL_BILL_CYCLE_CODE=" + ENL_BILL_CYCLE_CODE
				+ ", NET_CONS_NAME=" + NET_CONS_NAME + ", NET_CUST_NUM=" + NET_CUST_NUM + ", NET_CUST_CHECK_DIGIT="
				+ NET_CUST_CHECK_DIGIT + ", NET_CUST_ID=" + NET_CUST_ID + ", EXP_BILL_CYCLE=" + EXP_BILL_CYCLE
				+ ", NET_CAPACITY=" + NET_CAPACITY + ", BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", AREA_CODE=" + AREA_CODE
				+ ", LOCATION_NAME=" + LOCATION_NAME + ", CUSTOMER_NAME=" + CUSTOMER_NAME + ", NET_METER_DIGIT="
				+ NET_METER_DIGIT + ", NET_METER_OMF=" + NET_METER_OMF + ", EFF_BILL_CYCLE_CODE_UPDATE="
				+ EFF_BILL_CYCLE_CODE_UPDATE + ", SOLAR_GRID_TYPE=" + SOLAR_GRID_TYPE + ", NO_OF_PANELS=" + NO_OF_PANELS
				+ ", PANEL_LENGTH=" + PANEL_LENGTH + ", PANEL_WIDTH=" + PANEL_WIDTH + ", WATT_PK_PANEL=" + WATT_PK_PANEL
				+ ", TOTAL_SOLAR_LOAD=" + TOTAL_SOLAR_LOAD + ", SOLAR_METER_NUM=" + SOLAR_METER_NUM + ", IMAGE_SYSTEM="
				+ IMAGE_SYSTEM + ", INVERTER_CAPACITY=" + INVERTER_CAPACITY + ", INVERTER_PHASE=" + INVERTER_PHASE
				+ ", INVERTER_STATUS=" + INVERTER_STATUS + ", PANEL_LENGTH_TYPE=" + PANEL_LENGTH_TYPE
				+ ", PANEL_WIDTH_TYPE=" + PANEL_WIDTH_TYPE + "]";
	}



}
