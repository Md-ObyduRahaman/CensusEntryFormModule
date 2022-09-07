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
	private int CUST_ID;
	private String EFF_BILL_CYCLE_CODE;
	private String REMARKS, ADJ_FLAG;
	private String ENL_BILL_CYCLE_CODE;
	private String NET_CONS_NAME;
	private String NET_CUST_NUM;
	private String NET_CUST_CHECK_DIGIT;
	private int NET_CUST_ID;
	private String EXP_BILL_CYCLE;
	private int NET_CAPACITY;
	private String BILL_CYCLE_CODE;
	private String AREA_CODE;
	private String LOCATION_NAME;
	private String CUSTOMER_NAME ;

	


	

	public AddMeterModel(String lOCATION_CODE, String bILL_GR, String bOOK_NO, String cONSUMER_NUM,
			String bILL_CYCLE_CODE,String aREA_CODE) {
		super();
		LOCATION_CODE = lOCATION_CODE;
		BILL_GR = bILL_GR;
		BOOK_NO = bOOK_NO;
		CONSUMER_NUM = cONSUMER_NUM;
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		AREA_CODE=aREA_CODE;
	}


	public AddMeterModel( String bILL_CYCLE_CODE) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}
	

	public AddMeterModel(String lOCATION_CODE,String lOCATION_NAME) {
		super();
		LOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME=lOCATION_NAME;
	}


	public AddMeterModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddMeterModel(String rEF_NO, String rEF_DATE, String lOCATION_CODE, String bILL_GR, String bOOK_NO,
			String cONSUMER_NUM, String cHECK_DIGIT, int cUST_ID, String eFF_BILL_CYCLE_CODE, String rEMARKS,
			String aDJ_FLAG, String eNL_BILL_CYCLE_CODE, String nET_CONS_NAME, String nET_CUST_NUM,
			String nET_CUST_CHECK_DIGIT, int nET_CUST_ID, String eXP_BILL_CYCLE, int nET_CAPACITY,String cUSTOMER_NAME) {
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
		NET_CONS_NAME = nET_CONS_NAME;
		NET_CUST_NUM = nET_CUST_NUM;
		NET_CUST_CHECK_DIGIT = nET_CUST_CHECK_DIGIT;
		NET_CUST_ID = nET_CUST_ID;
		EXP_BILL_CYCLE = eXP_BILL_CYCLE;
		NET_CAPACITY = nET_CAPACITY;
		CUSTOMER_NAME=cUSTOMER_NAME;
	}

	public AddMeterModel(String cHECK_DIGIT, int cUST_ID, String nET_CONS_NAME) {
		super();
		CHECK_DIGIT = cHECK_DIGIT;
		CUST_ID = cUST_ID;
		NET_CONS_NAME = nET_CONS_NAME;
	}

	public AddMeterModel(String lOCATION_CODE, String bILL_GR, String bOOK_NO, String cHECK_DIGIT, int cUST_ID,String cUSTOMER_NAME ) {
		super();
		LOCATION_CODE = lOCATION_CODE;
		BILL_GR = bILL_GR;
		BOOK_NO = bOOK_NO;
		CHECK_DIGIT = cHECK_DIGIT;
		CUST_ID = cUST_ID;
		CUSTOMER_NAME=cUSTOMER_NAME;
		
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

	public int getCUST_ID() {
		return CUST_ID;
	}

	public void setCUST_ID(int cUST_ID) {
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

	public int getNET_CUST_ID() {
		return NET_CUST_ID;
	}

	public void setNET_CUST_ID(int nET_CUST_ID) {
		NET_CUST_ID = nET_CUST_ID;
	}

	public String getEXP_BILL_CYCLE() {
		return EXP_BILL_CYCLE;
	}

	public void setEXP_BILL_CYCLE(String eXP_BILL_CYCLE) {
		EXP_BILL_CYCLE = eXP_BILL_CYCLE;
	}

	public int getNET_CAPACITY() {
		return NET_CAPACITY;
	}

	public void setNET_CAPACITY(int nET_CAPACITY) {
		NET_CAPACITY = nET_CAPACITY;
	}

	public String getBILL_CYCLE_CODE() {
		return BILL_CYCLE_CODE;
	}

	public void setBILL_CYCLE_CODE(String bILL_CYCLE_CODE) {
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
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
				+ ", LOCATION_NAME=" + LOCATION_NAME + ", CUSTOMER_NAME=" + CUSTOMER_NAME + "]";
	}







}
