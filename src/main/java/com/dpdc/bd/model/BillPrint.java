package com.dpdc.bd.model;

import org.springframework.stereotype.Component;

@Component
public class BillPrint {

	private String CUST_ID, BMONTH, NO_OF_COPIES, USAGE_TYPE, BILL_STATUS, LOCATION_CODE, LOCATION_NAME, FEEDER_NAME,
			AREA_CODE, CUSTOMER_NAME, ADDR_DESCR1, ADDR_DESCR2, ADDR_DESCR3, CITY, PIN_CODE, USAGE_TYPE1, INVOICE_NUM,
			INVOICE_CHKDIGIT, INVOICE_DATE, BOOK, BILL_GR, WLK, CONS_EXTG_NUM, CUSTOMER_NUM, OLD_CUSTNO, CONS_CHK_DIGIT,
			INVOICE_DUE_DATE, TARIFF, BUS_TYPE_CODE, CUST_STATUS, SPECIAL_CODE, SPECIAL_VALUE, RULE, SANC_LOAD,
			CONNECT_LOAD, METER_NUM_KWH, METER_COND_KWH, OMF_KWH, METER_NUM_KVARH, METER_COND_KVARH, OMF_KVARH,
			METER_COND_KW, OMF_KW, XF_LOSS_SR_CONS, XF_LOSS_OFPK_CONS, XF_LOSS_PK_CONS, PFC_SR_CONS, PFC_OFPK_CONS,
			PFC_PK_CONS, OLD_KWH_SR_CONS, OLD_KWH_OFPK_CONS, OLD_KWH_PK_CONS, OLD_KVARH_SR_CONS, OLD_KVARH_OFPK_CONS,
			OLD_KVARH_PK_CONS, CLS_KWH_SR_RDNG, CLS_KWH_OFPK_RDNG, CLS_KWH_PK_RDNG, OPN_KWH_SR_RDNG, OPN_KWH_OFPK_RDNG,
			OPN_KWH_PK_RDNG, CONS_KWH_SR, CONS_KWH_OFPK, CONS_KWH_PK, CLS_KVARH_SR_RDNG, CLS_KVARH_OFPK_RDNG,
			CLS_KVARH_PK_RDNG, OPN_KVARH_SR_RDNG, OPN_KVARH_OFPK_RDNG, OPN_KVARH_PK_RDNG, CONS_KVARH_SR,
			CONS_KVARH_OFPK, CONS_KVARH_PK, PRESENT_CUM_NO, PRESENT_DMD_RDNG, PREVIOUS_CUM_NO, PREVIOUS_DMD_RDNG,
			MAX_DMD_RDNG, POWER_FACTOR, PF_CORRECTION, ARREAR_FROMDATE, ARREAR_TODATE, VAT_ARR_FROMDATE, VAT_ARR_TODATE,
			ADJUSTED_CONS, BILL_TYPE_CODE, POLE_NUMBER, INST_PLAN_NUM1, INST_PLAN_NUM2, ENG_CHRG_SR, ENG_CHRG_OFPK,
			ENG_CHRG_PK, DEMAND_CHRG, MINIMUM_CHRG, SERVICE_CHRG, XF_LOSS_CHRG, XF_RENT, PFC_CHARGE, PRINC_AMT,
			CURRENT_VAT, CURRENT_AMT, ADJUSTED_PRN, ADJUSTED_LPS, ADJUSTED_VAT, INSTALLMENT_PRN_1, INSTALLMENT_LPS_1,
			INSTALLMENT_VAT_1, TOTAL_VAT, TOTAL_BILL, RCPT_PRN_1, RCPT_PRN_2, RCPT_DATE_1, RCPT_DATE_2,
			SARR_PRN_N_SRCHG1, SARR_PRN_N_SRCHG2, SARR_PRN_N_SRCHG3, SARR_PRN_N_SRCHG4, SARR_PRN_N_SRCHG5,
			SARR_PRN_N_SRCHG6, SARR_PRN_N_SRCHG7, SARR_PRN_N_SRCHG9, SARR_PRN_N_SRCHG10, SARR_PRN_N_SRCHG11, DARREAR1,
			DARREAR2, DARREAR3, DARREAR4, DARREAR5, DARREAR6, DARREAR7, DARREAR8, DARREAR9, DARREAR10, DARREAR11,
			DARREAR12, PRESENT_READING_DATE, PREV_READING_DATE, VAT_PERCENT, C1, C2, C3, ARR_VAT_12, CURRENT_LPS,
			TOTAL_LPS, MAX_DMD_RDNG_1, SANC_LOAD_1, USAGE_TYPE_1, F_H_NAME, MONTH1, MONTH2, MONTH3, MONTH4, MONTH5,
			MONTH6, MONTH7, MONTH8, LOC_CONTACT, NM_CLS_KWH_SR_RDNG, NM_CLS_KWH_OFPK_RDNG, NM_CLS_KWH_PK_RDNG,
			NM_OPN_KWH_SR_RDNG, NM_OPN_KWH_OFPK_RDNG, NM_OPN_KWH_PK_RDNG, NM__CONS_KWH_SR, NM_CONS_KWH_OFPK,
			NM_CONS_KWH_PK, NET_CAPACITY, SR_ADJ_UNIT, OFPK_ADJ_UNIT, PK_ADJ_UNIT, CF_UNIT, BF_UNIT, SETTLEMENT_UNIT,
			UTILITY_RATE, NET_SETTLEMENT_AMT, NET_PRIN_ADJ_AMT, NET_VAT_ADJ_AMT, NET_TOT_BILL;
	
	


	public BillPrint() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillPrint(String cUST_ID, String bMONTH, String nO_OF_COPIES, String uSAGE_TYPE, String bILL_STATUS,
			String lOCATION_CODE, String lOCATION_NAME, String fEEDER_NAME, String aREA_CODE, String cUSTOMER_NAME,
			String aDDR_DESCR1, String aDDR_DESCR2, String aDDR_DESCR3, String cITY, String pIN_CODE,
			String uSAGE_TYPE1, String iNVOICE_NUM, String iNVOICE_CHKDIGIT, String iNVOICE_DATE, String bOOK,
			String bILL_GR, String wLK, String cONS_EXTG_NUM, String cUSTOMER_NUM, String oLD_CUSTNO,
			String cONS_CHK_DIGIT, String iNVOICE_DUE_DATE, String tARIFF, String bUS_TYPE_CODE, String cUST_STATUS,
			String sPECIAL_CODE, String sPECIAL_VALUE, String rULE, String sANC_LOAD, String cONNECT_LOAD,
			String mETER_NUM_KWH, String mETER_COND_KWH, String oMF_KWH, String mETER_NUM_KVARH,
			String mETER_COND_KVARH, String oMF_KVARH, String mETER_COND_KW, String oMF_KW, String xF_LOSS_SR_CONS,
			String xF_LOSS_OFPK_CONS, String xF_LOSS_PK_CONS, String pFC_SR_CONS, String pFC_OFPK_CONS,
			String pFC_PK_CONS, String oLD_KWH_SR_CONS, String oLD_KWH_OFPK_CONS, String oLD_KWH_PK_CONS,
			String oLD_KVARH_SR_CONS, String oLD_KVARH_OFPK_CONS, String oLD_KVARH_PK_CONS, String cLS_KWH_SR_RDNG,
			String cLS_KWH_OFPK_RDNG, String cLS_KWH_PK_RDNG, String oPN_KWH_SR_RDNG, String oPN_KWH_OFPK_RDNG,
			String oPN_KWH_PK_RDNG, String cONS_KWH_SR, String cONS_KWH_OFPK, String cONS_KWH_PK,
			String cLS_KVARH_SR_RDNG, String cLS_KVARH_OFPK_RDNG, String cLS_KVARH_PK_RDNG, String oPN_KVARH_SR_RDNG,
			String oPN_KVARH_OFPK_RDNG, String oPN_KVARH_PK_RDNG, String cONS_KVARH_SR, String cONS_KVARH_OFPK,
			String cONS_KVARH_PK, String pRESENT_CUM_NO, String pRESENT_DMD_RDNG, String pREVIOUS_CUM_NO,
			String pREVIOUS_DMD_RDNG, String mAX_DMD_RDNG, String pOWER_FACTOR, String pF_CORRECTION,
			String aRREAR_FROMDATE, String aRREAR_TODATE, String vAT_ARR_FROMDATE, String vAT_ARR_TODATE,
			String aDJUSTED_CONS, String bILL_TYPE_CODE, String pOLE_NUMBER, String iNST_PLAN_NUM1,
			String iNST_PLAN_NUM2, String eNG_CHRG_SR, String eNG_CHRG_OFPK, String eNG_CHRG_PK, String dEMAND_CHRG,
			String mINIMUM_CHRG, String sERVICE_CHRG, String xF_LOSS_CHRG, String xF_RENT, String pFC_CHARGE,
			String pRINC_AMT, String cURRENT_VAT, String cURRENT_AMT, String aDJUSTED_PRN, String aDJUSTED_LPS,
			String aDJUSTED_VAT, String iNSTALLMENT_PRN_1, String iNSTALLMENT_LPS_1, String iNSTALLMENT_VAT_1,
			String tOTAL_VAT, String tOTAL_BILL, String rCPT_PRN_1, String rCPT_PRN_2, String rCPT_DATE_1,
			String rCPT_DATE_2, String sARR_PRN_N_SRCHG1, String sARR_PRN_N_SRCHG2, String sARR_PRN_N_SRCHG3,
			String sARR_PRN_N_SRCHG4, String sARR_PRN_N_SRCHG5, String sARR_PRN_N_SRCHG6, String sARR_PRN_N_SRCHG7,
			String sARR_PRN_N_SRCHG9, String sARR_PRN_N_SRCHG10, String sARR_PRN_N_SRCHG11, String dARREAR1,
			String dARREAR2, String dARREAR3, String dARREAR4, String dARREAR5, String dARREAR6, String dARREAR7,
			String dARREAR8, String dARREAR9, String dARREAR10, String dARREAR11, String dARREAR12,
			String pRESENT_READING_DATE, String pREV_READING_DATE, String vAT_PERCENT, String c1, String c2, String c3,
			String aRR_VAT_12, String cURRENT_LPS, String tOTAL_LPS, String mAX_DMD_RDNG_1, String sANC_LOAD_1,
			String uSAGE_TYPE_1, String f_H_NAME, String mONTH1, String mONTH2, String mONTH3, String mONTH4,
			String mONTH5, String mONTH6, String mONTH7, String mONTH8, String lOC_CONTACT, String nM_CLS_KWH_SR_RDNG,
			String nM_CLS_KWH_OFPK_RDNG, String nM_CLS_KWH_PK_RDNG, String nM_OPN_KWH_SR_RDNG,
			String nM_OPN_KWH_OFPK_RDNG, String nM_OPN_KWH_PK_RDNG, String nM__CONS_KWH_SR, String nM_CONS_KWH_OFPK,
			String nM_CONS_KWH_PK, String nET_CAPACITY, String sR_ADJ_UNIT, String oFPK_ADJ_UNIT, String pK_ADJ_UNIT,
			String cF_UNIT, String bF_UNIT, String sETTLEMENT_UNIT, String uTILITY_RATE, String nET_SETTLEMENT_AMT,
			String nET_PRIN_ADJ_AMT, String nET_VAT_ADJ_AMT, String nET_TOT_BILL) {
		super();
		CUST_ID = cUST_ID;
		BMONTH = bMONTH;
		NO_OF_COPIES = nO_OF_COPIES;
		USAGE_TYPE = uSAGE_TYPE;
		BILL_STATUS = bILL_STATUS;
		LOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME = lOCATION_NAME;
		FEEDER_NAME = fEEDER_NAME;
		AREA_CODE = aREA_CODE;
		CUSTOMER_NAME = cUSTOMER_NAME;
		ADDR_DESCR1 = aDDR_DESCR1;
		ADDR_DESCR2 = aDDR_DESCR2;
		ADDR_DESCR3 = aDDR_DESCR3;
		CITY = cITY;
		PIN_CODE = pIN_CODE;
		USAGE_TYPE1 = uSAGE_TYPE1;
		INVOICE_NUM = iNVOICE_NUM;
		INVOICE_CHKDIGIT = iNVOICE_CHKDIGIT;
		INVOICE_DATE = iNVOICE_DATE;
		BOOK = bOOK;
		BILL_GR = bILL_GR;
		WLK = wLK;
		CONS_EXTG_NUM = cONS_EXTG_NUM;
		CUSTOMER_NUM = cUSTOMER_NUM;
		OLD_CUSTNO = oLD_CUSTNO;
		CONS_CHK_DIGIT = cONS_CHK_DIGIT;
		INVOICE_DUE_DATE = iNVOICE_DUE_DATE;
		TARIFF = tARIFF;
		BUS_TYPE_CODE = bUS_TYPE_CODE;
		CUST_STATUS = cUST_STATUS;
		SPECIAL_CODE = sPECIAL_CODE;
		SPECIAL_VALUE = sPECIAL_VALUE;
		RULE = rULE;
		SANC_LOAD = sANC_LOAD;
		CONNECT_LOAD = cONNECT_LOAD;
		METER_NUM_KWH = mETER_NUM_KWH;
		METER_COND_KWH = mETER_COND_KWH;
		OMF_KWH = oMF_KWH;
		METER_NUM_KVARH = mETER_NUM_KVARH;
		METER_COND_KVARH = mETER_COND_KVARH;
		OMF_KVARH = oMF_KVARH;
		METER_COND_KW = mETER_COND_KW;
		OMF_KW = oMF_KW;
		XF_LOSS_SR_CONS = xF_LOSS_SR_CONS;
		XF_LOSS_OFPK_CONS = xF_LOSS_OFPK_CONS;
		XF_LOSS_PK_CONS = xF_LOSS_PK_CONS;
		PFC_SR_CONS = pFC_SR_CONS;
		PFC_OFPK_CONS = pFC_OFPK_CONS;
		PFC_PK_CONS = pFC_PK_CONS;
		OLD_KWH_SR_CONS = oLD_KWH_SR_CONS;
		OLD_KWH_OFPK_CONS = oLD_KWH_OFPK_CONS;
		OLD_KWH_PK_CONS = oLD_KWH_PK_CONS;
		OLD_KVARH_SR_CONS = oLD_KVARH_SR_CONS;
		OLD_KVARH_OFPK_CONS = oLD_KVARH_OFPK_CONS;
		OLD_KVARH_PK_CONS = oLD_KVARH_PK_CONS;
		CLS_KWH_SR_RDNG = cLS_KWH_SR_RDNG;
		CLS_KWH_OFPK_RDNG = cLS_KWH_OFPK_RDNG;
		CLS_KWH_PK_RDNG = cLS_KWH_PK_RDNG;
		OPN_KWH_SR_RDNG = oPN_KWH_SR_RDNG;
		OPN_KWH_OFPK_RDNG = oPN_KWH_OFPK_RDNG;
		OPN_KWH_PK_RDNG = oPN_KWH_PK_RDNG;
		CONS_KWH_SR = cONS_KWH_SR;
		CONS_KWH_OFPK = cONS_KWH_OFPK;
		CONS_KWH_PK = cONS_KWH_PK;
		CLS_KVARH_SR_RDNG = cLS_KVARH_SR_RDNG;
		CLS_KVARH_OFPK_RDNG = cLS_KVARH_OFPK_RDNG;
		CLS_KVARH_PK_RDNG = cLS_KVARH_PK_RDNG;
		OPN_KVARH_SR_RDNG = oPN_KVARH_SR_RDNG;
		OPN_KVARH_OFPK_RDNG = oPN_KVARH_OFPK_RDNG;
		OPN_KVARH_PK_RDNG = oPN_KVARH_PK_RDNG;
		CONS_KVARH_SR = cONS_KVARH_SR;
		CONS_KVARH_OFPK = cONS_KVARH_OFPK;
		CONS_KVARH_PK = cONS_KVARH_PK;
		PRESENT_CUM_NO = pRESENT_CUM_NO;
		PRESENT_DMD_RDNG = pRESENT_DMD_RDNG;
		PREVIOUS_CUM_NO = pREVIOUS_CUM_NO;
		PREVIOUS_DMD_RDNG = pREVIOUS_DMD_RDNG;
		MAX_DMD_RDNG = mAX_DMD_RDNG;
		POWER_FACTOR = pOWER_FACTOR;
		PF_CORRECTION = pF_CORRECTION;
		ARREAR_FROMDATE = aRREAR_FROMDATE;
		ARREAR_TODATE = aRREAR_TODATE;
		VAT_ARR_FROMDATE = vAT_ARR_FROMDATE;
		VAT_ARR_TODATE = vAT_ARR_TODATE;
		ADJUSTED_CONS = aDJUSTED_CONS;
		BILL_TYPE_CODE = bILL_TYPE_CODE;
		POLE_NUMBER = pOLE_NUMBER;
		INST_PLAN_NUM1 = iNST_PLAN_NUM1;
		INST_PLAN_NUM2 = iNST_PLAN_NUM2;
		ENG_CHRG_SR = eNG_CHRG_SR;
		ENG_CHRG_OFPK = eNG_CHRG_OFPK;
		ENG_CHRG_PK = eNG_CHRG_PK;
		DEMAND_CHRG = dEMAND_CHRG;
		MINIMUM_CHRG = mINIMUM_CHRG;
		SERVICE_CHRG = sERVICE_CHRG;
		XF_LOSS_CHRG = xF_LOSS_CHRG;
		XF_RENT = xF_RENT;
		PFC_CHARGE = pFC_CHARGE;
		PRINC_AMT = pRINC_AMT;
		CURRENT_VAT = cURRENT_VAT;
		CURRENT_AMT = cURRENT_AMT;
		ADJUSTED_PRN = aDJUSTED_PRN;
		ADJUSTED_LPS = aDJUSTED_LPS;
		ADJUSTED_VAT = aDJUSTED_VAT;
		INSTALLMENT_PRN_1 = iNSTALLMENT_PRN_1;
		INSTALLMENT_LPS_1 = iNSTALLMENT_LPS_1;
		INSTALLMENT_VAT_1 = iNSTALLMENT_VAT_1;
		TOTAL_VAT = tOTAL_VAT;
		TOTAL_BILL = tOTAL_BILL;
		RCPT_PRN_1 = rCPT_PRN_1;
		RCPT_PRN_2 = rCPT_PRN_2;
		RCPT_DATE_1 = rCPT_DATE_1;
		RCPT_DATE_2 = rCPT_DATE_2;
		SARR_PRN_N_SRCHG1 = sARR_PRN_N_SRCHG1;
		SARR_PRN_N_SRCHG2 = sARR_PRN_N_SRCHG2;
		SARR_PRN_N_SRCHG3 = sARR_PRN_N_SRCHG3;
		SARR_PRN_N_SRCHG4 = sARR_PRN_N_SRCHG4;
		SARR_PRN_N_SRCHG5 = sARR_PRN_N_SRCHG5;
		SARR_PRN_N_SRCHG6 = sARR_PRN_N_SRCHG6;
		SARR_PRN_N_SRCHG7 = sARR_PRN_N_SRCHG7;
		SARR_PRN_N_SRCHG9 = sARR_PRN_N_SRCHG9;
		SARR_PRN_N_SRCHG10 = sARR_PRN_N_SRCHG10;
		SARR_PRN_N_SRCHG11 = sARR_PRN_N_SRCHG11;
		DARREAR1 = dARREAR1;
		DARREAR2 = dARREAR2;
		DARREAR3 = dARREAR3;
		DARREAR4 = dARREAR4;
		DARREAR5 = dARREAR5;
		DARREAR6 = dARREAR6;
		DARREAR7 = dARREAR7;
		DARREAR8 = dARREAR8;
		DARREAR9 = dARREAR9;
		DARREAR10 = dARREAR10;
		DARREAR11 = dARREAR11;
		DARREAR12 = dARREAR12;
		PRESENT_READING_DATE = pRESENT_READING_DATE;
		PREV_READING_DATE = pREV_READING_DATE;
		VAT_PERCENT = vAT_PERCENT;
		C1 = c1;
		C2 = c2;
		C3 = c3;
		ARR_VAT_12 = aRR_VAT_12;
		CURRENT_LPS = cURRENT_LPS;
		TOTAL_LPS = tOTAL_LPS;
		MAX_DMD_RDNG_1 = mAX_DMD_RDNG_1;
		SANC_LOAD_1 = sANC_LOAD_1;
		USAGE_TYPE_1 = uSAGE_TYPE_1;
		F_H_NAME = f_H_NAME;
		MONTH1 = mONTH1;
		MONTH2 = mONTH2;
		MONTH3 = mONTH3;
		MONTH4 = mONTH4;
		MONTH5 = mONTH5;
		MONTH6 = mONTH6;
		MONTH7 = mONTH7;
		MONTH8 = mONTH8;
		LOC_CONTACT = lOC_CONTACT;
		NM_CLS_KWH_SR_RDNG = nM_CLS_KWH_SR_RDNG;
		NM_CLS_KWH_OFPK_RDNG = nM_CLS_KWH_OFPK_RDNG;
		NM_CLS_KWH_PK_RDNG = nM_CLS_KWH_PK_RDNG;
		NM_OPN_KWH_SR_RDNG = nM_OPN_KWH_SR_RDNG;
		NM_OPN_KWH_OFPK_RDNG = nM_OPN_KWH_OFPK_RDNG;
		NM_OPN_KWH_PK_RDNG = nM_OPN_KWH_PK_RDNG;
		NM__CONS_KWH_SR = nM__CONS_KWH_SR;
		NM_CONS_KWH_OFPK = nM_CONS_KWH_OFPK;
		NM_CONS_KWH_PK = nM_CONS_KWH_PK;
		NET_CAPACITY = nET_CAPACITY;
		SR_ADJ_UNIT = sR_ADJ_UNIT;
		OFPK_ADJ_UNIT = oFPK_ADJ_UNIT;
		PK_ADJ_UNIT = pK_ADJ_UNIT;
		CF_UNIT = cF_UNIT;
		BF_UNIT = bF_UNIT;
		SETTLEMENT_UNIT = sETTLEMENT_UNIT;
		UTILITY_RATE = uTILITY_RATE;
		NET_SETTLEMENT_AMT = nET_SETTLEMENT_AMT;
		NET_PRIN_ADJ_AMT = nET_PRIN_ADJ_AMT;
		NET_VAT_ADJ_AMT = nET_VAT_ADJ_AMT;
		NET_TOT_BILL = nET_TOT_BILL;
	}

	public String getCUST_ID() {
		return CUST_ID;
	}

	public void setCUST_ID(String cUST_ID) {
		CUST_ID = cUST_ID;
	}

	public String getBMONTH() {
		return BMONTH;
	}

	public void setBMONTH(String bMONTH) {
		BMONTH = bMONTH;
	}

	public String getNO_OF_COPIES() {
		return NO_OF_COPIES;
	}

	public void setNO_OF_COPIES(String nO_OF_COPIES) {
		NO_OF_COPIES = nO_OF_COPIES;
	}

	public String getUSAGE_TYPE() {
		return USAGE_TYPE;
	}

	public void setUSAGE_TYPE(String uSAGE_TYPE) {
		USAGE_TYPE = uSAGE_TYPE;
	}

	public String getBILL_STATUS() {
		return BILL_STATUS;
	}

	public void setBILL_STATUS(String bILL_STATUS) {
		BILL_STATUS = bILL_STATUS;
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

	public String getFEEDER_NAME() {
		return FEEDER_NAME;
	}

	public void setFEEDER_NAME(String fEEDER_NAME) {
		FEEDER_NAME = fEEDER_NAME;
	}

	public String getAREA_CODE() {
		return AREA_CODE;
	}

	public void setAREA_CODE(String aREA_CODE) {
		AREA_CODE = aREA_CODE;
	}

	public String getCUSTOMER_NAME() {
		return CUSTOMER_NAME;
	}

	public void setCUSTOMER_NAME(String cUSTOMER_NAME) {
		CUSTOMER_NAME = cUSTOMER_NAME;
	}

	public String getADDR_DESCR1() {
		return ADDR_DESCR1;
	}

	public void setADDR_DESCR1(String aDDR_DESCR1) {
		ADDR_DESCR1 = aDDR_DESCR1;
	}

	public String getADDR_DESCR2() {
		return ADDR_DESCR2;
	}

	public void setADDR_DESCR2(String aDDR_DESCR2) {
		ADDR_DESCR2 = aDDR_DESCR2;
	}

	public String getADDR_DESCR3() {
		return ADDR_DESCR3;
	}

	public void setADDR_DESCR3(String aDDR_DESCR3) {
		ADDR_DESCR3 = aDDR_DESCR3;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public String getPIN_CODE() {
		return PIN_CODE;
	}

	public void setPIN_CODE(String pIN_CODE) {
		PIN_CODE = pIN_CODE;
	}

	public String getUSAGE_TYPE1() {
		return USAGE_TYPE1;
	}

	public void setUSAGE_TYPE1(String uSAGE_TYPE1) {
		USAGE_TYPE1 = uSAGE_TYPE1;
	}

	public String getINVOICE_NUM() {
		return INVOICE_NUM;
	}

	public void setINVOICE_NUM(String iNVOICE_NUM) {
		INVOICE_NUM = iNVOICE_NUM;
	}

	public String getINVOICE_CHKDIGIT() {
		return INVOICE_CHKDIGIT;
	}

	public void setINVOICE_CHKDIGIT(String iNVOICE_CHKDIGIT) {
		INVOICE_CHKDIGIT = iNVOICE_CHKDIGIT;
	}

	public String getINVOICE_DATE() {
		return INVOICE_DATE;
	}

	public void setINVOICE_DATE(String iNVOICE_DATE) {
		INVOICE_DATE = iNVOICE_DATE;
	}

	public String getBOOK() {
		return BOOK;
	}

	public void setBOOK(String bOOK) {
		BOOK = bOOK;
	}

	public String getBILL_GR() {
		return BILL_GR;
	}

	public void setBILL_GR(String bILL_GR) {
		BILL_GR = bILL_GR;
	}

	public String getWLK() {
		return WLK;
	}

	public void setWLK(String wLK) {
		WLK = wLK;
	}

	public String getCONS_EXTG_NUM() {
		return CONS_EXTG_NUM;
	}

	public void setCONS_EXTG_NUM(String cONS_EXTG_NUM) {
		CONS_EXTG_NUM = cONS_EXTG_NUM;
	}

	public String getCUSTOMER_NUM() {
		return CUSTOMER_NUM;
	}

	public void setCUSTOMER_NUM(String cUSTOMER_NUM) {
		CUSTOMER_NUM = cUSTOMER_NUM;
	}

	public String getOLD_CUSTNO() {
		return OLD_CUSTNO;
	}

	public void setOLD_CUSTNO(String oLD_CUSTNO) {
		OLD_CUSTNO = oLD_CUSTNO;
	}

	public String getCONS_CHK_DIGIT() {
		return CONS_CHK_DIGIT;
	}

	public void setCONS_CHK_DIGIT(String cONS_CHK_DIGIT) {
		CONS_CHK_DIGIT = cONS_CHK_DIGIT;
	}

	public String getINVOICE_DUE_DATE() {
		return INVOICE_DUE_DATE;
	}

	public void setINVOICE_DUE_DATE(String iNVOICE_DUE_DATE) {
		INVOICE_DUE_DATE = iNVOICE_DUE_DATE;
	}

	public String getTARIFF() {
		return TARIFF;
	}

	public void setTARIFF(String tARIFF) {
		TARIFF = tARIFF;
	}

	public String getBUS_TYPE_CODE() {
		return BUS_TYPE_CODE;
	}

	public void setBUS_TYPE_CODE(String bUS_TYPE_CODE) {
		BUS_TYPE_CODE = bUS_TYPE_CODE;
	}

	public String getCUST_STATUS() {
		return CUST_STATUS;
	}

	public void setCUST_STATUS(String cUST_STATUS) {
		CUST_STATUS = cUST_STATUS;
	}

	public String getSPECIAL_CODE() {
		return SPECIAL_CODE;
	}

	public void setSPECIAL_CODE(String sPECIAL_CODE) {
		SPECIAL_CODE = sPECIAL_CODE;
	}

	public String getSPECIAL_VALUE() {
		return SPECIAL_VALUE;
	}

	public void setSPECIAL_VALUE(String sPECIAL_VALUE) {
		SPECIAL_VALUE = sPECIAL_VALUE;
	}

	public String getRULE() {
		return RULE;
	}

	public void setRULE(String rULE) {
		RULE = rULE;
	}

	public String getSANC_LOAD() {
		return SANC_LOAD;
	}

	public void setSANC_LOAD(String sANC_LOAD) {
		SANC_LOAD = sANC_LOAD;
	}

	public String getCONNECT_LOAD() {
		return CONNECT_LOAD;
	}

	public void setCONNECT_LOAD(String cONNECT_LOAD) {
		CONNECT_LOAD = cONNECT_LOAD;
	}

	public String getMETER_NUM_KWH() {
		return METER_NUM_KWH;
	}

	public void setMETER_NUM_KWH(String mETER_NUM_KWH) {
		METER_NUM_KWH = mETER_NUM_KWH;
	}

	public String getMETER_COND_KWH() {
		return METER_COND_KWH;
	}

	public void setMETER_COND_KWH(String mETER_COND_KWH) {
		METER_COND_KWH = mETER_COND_KWH;
	}

	public String getOMF_KWH() {
		return OMF_KWH;
	}

	public void setOMF_KWH(String oMF_KWH) {
		OMF_KWH = oMF_KWH;
	}

	public String getMETER_NUM_KVARH() {
		return METER_NUM_KVARH;
	}

	public void setMETER_NUM_KVARH(String mETER_NUM_KVARH) {
		METER_NUM_KVARH = mETER_NUM_KVARH;
	}

	public String getMETER_COND_KVARH() {
		return METER_COND_KVARH;
	}

	public void setMETER_COND_KVARH(String mETER_COND_KVARH) {
		METER_COND_KVARH = mETER_COND_KVARH;
	}

	public String getOMF_KVARH() {
		return OMF_KVARH;
	}

	public void setOMF_KVARH(String oMF_KVARH) {
		OMF_KVARH = oMF_KVARH;
	}

	public String getMETER_COND_KW() {
		return METER_COND_KW;
	}

	public void setMETER_COND_KW(String mETER_COND_KW) {
		METER_COND_KW = mETER_COND_KW;
	}

	public String getOMF_KW() {
		return OMF_KW;
	}

	public void setOMF_KW(String oMF_KW) {
		OMF_KW = oMF_KW;
	}

	public String getXF_LOSS_SR_CONS() {
		return XF_LOSS_SR_CONS;
	}

	public void setXF_LOSS_SR_CONS(String xF_LOSS_SR_CONS) {
		XF_LOSS_SR_CONS = xF_LOSS_SR_CONS;
	}

	public String getXF_LOSS_OFPK_CONS() {
		return XF_LOSS_OFPK_CONS;
	}

	public void setXF_LOSS_OFPK_CONS(String xF_LOSS_OFPK_CONS) {
		XF_LOSS_OFPK_CONS = xF_LOSS_OFPK_CONS;
	}

	public String getXF_LOSS_PK_CONS() {
		return XF_LOSS_PK_CONS;
	}

	public void setXF_LOSS_PK_CONS(String xF_LOSS_PK_CONS) {
		XF_LOSS_PK_CONS = xF_LOSS_PK_CONS;
	}

	public String getPFC_SR_CONS() {
		return PFC_SR_CONS;
	}

	public void setPFC_SR_CONS(String pFC_SR_CONS) {
		PFC_SR_CONS = pFC_SR_CONS;
	}

	public String getPFC_OFPK_CONS() {
		return PFC_OFPK_CONS;
	}

	public void setPFC_OFPK_CONS(String pFC_OFPK_CONS) {
		PFC_OFPK_CONS = pFC_OFPK_CONS;
	}

	public String getPFC_PK_CONS() {
		return PFC_PK_CONS;
	}

	public void setPFC_PK_CONS(String pFC_PK_CONS) {
		PFC_PK_CONS = pFC_PK_CONS;
	}

	public String getOLD_KWH_SR_CONS() {
		return OLD_KWH_SR_CONS;
	}

	public void setOLD_KWH_SR_CONS(String oLD_KWH_SR_CONS) {
		OLD_KWH_SR_CONS = oLD_KWH_SR_CONS;
	}

	public String getOLD_KWH_OFPK_CONS() {
		return OLD_KWH_OFPK_CONS;
	}

	public void setOLD_KWH_OFPK_CONS(String oLD_KWH_OFPK_CONS) {
		OLD_KWH_OFPK_CONS = oLD_KWH_OFPK_CONS;
	}

	public String getOLD_KWH_PK_CONS() {
		return OLD_KWH_PK_CONS;
	}

	public void setOLD_KWH_PK_CONS(String oLD_KWH_PK_CONS) {
		OLD_KWH_PK_CONS = oLD_KWH_PK_CONS;
	}

	public String getOLD_KVARH_SR_CONS() {
		return OLD_KVARH_SR_CONS;
	}

	public void setOLD_KVARH_SR_CONS(String oLD_KVARH_SR_CONS) {
		OLD_KVARH_SR_CONS = oLD_KVARH_SR_CONS;
	}

	public String getOLD_KVARH_OFPK_CONS() {
		return OLD_KVARH_OFPK_CONS;
	}

	public void setOLD_KVARH_OFPK_CONS(String oLD_KVARH_OFPK_CONS) {
		OLD_KVARH_OFPK_CONS = oLD_KVARH_OFPK_CONS;
	}

	public String getOLD_KVARH_PK_CONS() {
		return OLD_KVARH_PK_CONS;
	}

	public void setOLD_KVARH_PK_CONS(String oLD_KVARH_PK_CONS) {
		OLD_KVARH_PK_CONS = oLD_KVARH_PK_CONS;
	}

	public String getCLS_KWH_SR_RDNG() {
		return CLS_KWH_SR_RDNG;
	}

	public void setCLS_KWH_SR_RDNG(String cLS_KWH_SR_RDNG) {
		CLS_KWH_SR_RDNG = cLS_KWH_SR_RDNG;
	}

	public String getCLS_KWH_OFPK_RDNG() {
		return CLS_KWH_OFPK_RDNG;
	}

	public void setCLS_KWH_OFPK_RDNG(String cLS_KWH_OFPK_RDNG) {
		CLS_KWH_OFPK_RDNG = cLS_KWH_OFPK_RDNG;
	}

	public String getCLS_KWH_PK_RDNG() {
		return CLS_KWH_PK_RDNG;
	}

	public void setCLS_KWH_PK_RDNG(String cLS_KWH_PK_RDNG) {
		CLS_KWH_PK_RDNG = cLS_KWH_PK_RDNG;
	}

	public String getOPN_KWH_SR_RDNG() {
		return OPN_KWH_SR_RDNG;
	}

	public void setOPN_KWH_SR_RDNG(String oPN_KWH_SR_RDNG) {
		OPN_KWH_SR_RDNG = oPN_KWH_SR_RDNG;
	}

	public String getOPN_KWH_OFPK_RDNG() {
		return OPN_KWH_OFPK_RDNG;
	}

	public void setOPN_KWH_OFPK_RDNG(String oPN_KWH_OFPK_RDNG) {
		OPN_KWH_OFPK_RDNG = oPN_KWH_OFPK_RDNG;
	}

	public String getOPN_KWH_PK_RDNG() {
		return OPN_KWH_PK_RDNG;
	}

	public void setOPN_KWH_PK_RDNG(String oPN_KWH_PK_RDNG) {
		OPN_KWH_PK_RDNG = oPN_KWH_PK_RDNG;
	}

	public String getCONS_KWH_SR() {
		return CONS_KWH_SR;
	}

	public void setCONS_KWH_SR(String cONS_KWH_SR) {
		CONS_KWH_SR = cONS_KWH_SR;
	}

	public String getCONS_KWH_OFPK() {
		return CONS_KWH_OFPK;
	}

	public void setCONS_KWH_OFPK(String cONS_KWH_OFPK) {
		CONS_KWH_OFPK = cONS_KWH_OFPK;
	}

	public String getCONS_KWH_PK() {
		return CONS_KWH_PK;
	}

	public void setCONS_KWH_PK(String cONS_KWH_PK) {
		CONS_KWH_PK = cONS_KWH_PK;
	}

	public String getCLS_KVARH_SR_RDNG() {
		return CLS_KVARH_SR_RDNG;
	}

	public void setCLS_KVARH_SR_RDNG(String cLS_KVARH_SR_RDNG) {
		CLS_KVARH_SR_RDNG = cLS_KVARH_SR_RDNG;
	}

	public String getCLS_KVARH_OFPK_RDNG() {
		return CLS_KVARH_OFPK_RDNG;
	}

	public void setCLS_KVARH_OFPK_RDNG(String cLS_KVARH_OFPK_RDNG) {
		CLS_KVARH_OFPK_RDNG = cLS_KVARH_OFPK_RDNG;
	}

	public String getCLS_KVARH_PK_RDNG() {
		return CLS_KVARH_PK_RDNG;
	}

	public void setCLS_KVARH_PK_RDNG(String cLS_KVARH_PK_RDNG) {
		CLS_KVARH_PK_RDNG = cLS_KVARH_PK_RDNG;
	}

	public String getOPN_KVARH_SR_RDNG() {
		return OPN_KVARH_SR_RDNG;
	}

	public void setOPN_KVARH_SR_RDNG(String oPN_KVARH_SR_RDNG) {
		OPN_KVARH_SR_RDNG = oPN_KVARH_SR_RDNG;
	}

	public String getOPN_KVARH_OFPK_RDNG() {
		return OPN_KVARH_OFPK_RDNG;
	}

	public void setOPN_KVARH_OFPK_RDNG(String oPN_KVARH_OFPK_RDNG) {
		OPN_KVARH_OFPK_RDNG = oPN_KVARH_OFPK_RDNG;
	}

	public String getOPN_KVARH_PK_RDNG() {
		return OPN_KVARH_PK_RDNG;
	}

	public void setOPN_KVARH_PK_RDNG(String oPN_KVARH_PK_RDNG) {
		OPN_KVARH_PK_RDNG = oPN_KVARH_PK_RDNG;
	}

	public String getCONS_KVARH_SR() {
		return CONS_KVARH_SR;
	}

	public void setCONS_KVARH_SR(String cONS_KVARH_SR) {
		CONS_KVARH_SR = cONS_KVARH_SR;
	}

	public String getCONS_KVARH_OFPK() {
		return CONS_KVARH_OFPK;
	}

	public void setCONS_KVARH_OFPK(String cONS_KVARH_OFPK) {
		CONS_KVARH_OFPK = cONS_KVARH_OFPK;
	}

	public String getCONS_KVARH_PK() {
		return CONS_KVARH_PK;
	}

	public void setCONS_KVARH_PK(String cONS_KVARH_PK) {
		CONS_KVARH_PK = cONS_KVARH_PK;
	}

	public String getPRESENT_CUM_NO() {
		return PRESENT_CUM_NO;
	}

	public void setPRESENT_CUM_NO(String pRESENT_CUM_NO) {
		PRESENT_CUM_NO = pRESENT_CUM_NO;
	}

	public String getPRESENT_DMD_RDNG() {
		return PRESENT_DMD_RDNG;
	}

	public void setPRESENT_DMD_RDNG(String pRESENT_DMD_RDNG) {
		PRESENT_DMD_RDNG = pRESENT_DMD_RDNG;
	}

	public String getPREVIOUS_CUM_NO() {
		return PREVIOUS_CUM_NO;
	}

	public void setPREVIOUS_CUM_NO(String pREVIOUS_CUM_NO) {
		PREVIOUS_CUM_NO = pREVIOUS_CUM_NO;
	}

	public String getPREVIOUS_DMD_RDNG() {
		return PREVIOUS_DMD_RDNG;
	}

	public void setPREVIOUS_DMD_RDNG(String pREVIOUS_DMD_RDNG) {
		PREVIOUS_DMD_RDNG = pREVIOUS_DMD_RDNG;
	}

	public String getMAX_DMD_RDNG() {
		return MAX_DMD_RDNG;
	}

	public void setMAX_DMD_RDNG(String mAX_DMD_RDNG) {
		MAX_DMD_RDNG = mAX_DMD_RDNG;
	}

	public String getPOWER_FACTOR() {
		return POWER_FACTOR;
	}

	public void setPOWER_FACTOR(String pOWER_FACTOR) {
		POWER_FACTOR = pOWER_FACTOR;
	}

	public String getPF_CORRECTION() {
		return PF_CORRECTION;
	}

	public void setPF_CORRECTION(String pF_CORRECTION) {
		PF_CORRECTION = pF_CORRECTION;
	}

	public String getARREAR_FROMDATE() {
		return ARREAR_FROMDATE;
	}

	public void setARREAR_FROMDATE(String aRREAR_FROMDATE) {
		ARREAR_FROMDATE = aRREAR_FROMDATE;
	}

	public String getARREAR_TODATE() {
		return ARREAR_TODATE;
	}

	public void setARREAR_TODATE(String aRREAR_TODATE) {
		ARREAR_TODATE = aRREAR_TODATE;
	}

	public String getVAT_ARR_FROMDATE() {
		return VAT_ARR_FROMDATE;
	}

	public void setVAT_ARR_FROMDATE(String vAT_ARR_FROMDATE) {
		VAT_ARR_FROMDATE = vAT_ARR_FROMDATE;
	}

	public String getVAT_ARR_TODATE() {
		return VAT_ARR_TODATE;
	}

	public void setVAT_ARR_TODATE(String vAT_ARR_TODATE) {
		VAT_ARR_TODATE = vAT_ARR_TODATE;
	}

	public String getADJUSTED_CONS() {
		return ADJUSTED_CONS;
	}

	public void setADJUSTED_CONS(String aDJUSTED_CONS) {
		ADJUSTED_CONS = aDJUSTED_CONS;
	}

	public String getBILL_TYPE_CODE() {
		return BILL_TYPE_CODE;
	}

	public void setBILL_TYPE_CODE(String bILL_TYPE_CODE) {
		BILL_TYPE_CODE = bILL_TYPE_CODE;
	}

	public String getPOLE_NUMBER() {
		return POLE_NUMBER;
	}

	public void setPOLE_NUMBER(String pOLE_NUMBER) {
		POLE_NUMBER = pOLE_NUMBER;
	}

	public String getINST_PLAN_NUM1() {
		return INST_PLAN_NUM1;
	}

	public void setINST_PLAN_NUM1(String iNST_PLAN_NUM1) {
		INST_PLAN_NUM1 = iNST_PLAN_NUM1;
	}

	public String getINST_PLAN_NUM2() {
		return INST_PLAN_NUM2;
	}

	public void setINST_PLAN_NUM2(String iNST_PLAN_NUM2) {
		INST_PLAN_NUM2 = iNST_PLAN_NUM2;
	}

	public String getENG_CHRG_SR() {
		return ENG_CHRG_SR;
	}

	public void setENG_CHRG_SR(String eNG_CHRG_SR) {
		ENG_CHRG_SR = eNG_CHRG_SR;
	}

	public String getENG_CHRG_OFPK() {
		return ENG_CHRG_OFPK;
	}

	public void setENG_CHRG_OFPK(String eNG_CHRG_OFPK) {
		ENG_CHRG_OFPK = eNG_CHRG_OFPK;
	}

	public String getENG_CHRG_PK() {
		return ENG_CHRG_PK;
	}

	public void setENG_CHRG_PK(String eNG_CHRG_PK) {
		ENG_CHRG_PK = eNG_CHRG_PK;
	}

	public String getDEMAND_CHRG() {
		return DEMAND_CHRG;
	}

	public void setDEMAND_CHRG(String dEMAND_CHRG) {
		DEMAND_CHRG = dEMAND_CHRG;
	}

	public String getMINIMUM_CHRG() {
		return MINIMUM_CHRG;
	}

	public void setMINIMUM_CHRG(String mINIMUM_CHRG) {
		MINIMUM_CHRG = mINIMUM_CHRG;
	}

	public String getSERVICE_CHRG() {
		return SERVICE_CHRG;
	}

	public void setSERVICE_CHRG(String sERVICE_CHRG) {
		SERVICE_CHRG = sERVICE_CHRG;
	}

	public String getXF_LOSS_CHRG() {
		return XF_LOSS_CHRG;
	}

	public void setXF_LOSS_CHRG(String xF_LOSS_CHRG) {
		XF_LOSS_CHRG = xF_LOSS_CHRG;
	}

	public String getXF_RENT() {
		return XF_RENT;
	}

	public void setXF_RENT(String xF_RENT) {
		XF_RENT = xF_RENT;
	}

	public String getPFC_CHARGE() {
		return PFC_CHARGE;
	}

	public void setPFC_CHARGE(String pFC_CHARGE) {
		PFC_CHARGE = pFC_CHARGE;
	}

	public String getPRINC_AMT() {
		return PRINC_AMT;
	}

	public void setPRINC_AMT(String pRINC_AMT) {
		PRINC_AMT = pRINC_AMT;
	}

	public String getCURRENT_VAT() {
		return CURRENT_VAT;
	}

	public void setCURRENT_VAT(String cURRENT_VAT) {
		CURRENT_VAT = cURRENT_VAT;
	}

	public String getCURRENT_AMT() {
		return CURRENT_AMT;
	}

	public void setCURRENT_AMT(String cURRENT_AMT) {
		CURRENT_AMT = cURRENT_AMT;
	}

	public String getADJUSTED_PRN() {
		return ADJUSTED_PRN;
	}

	public void setADJUSTED_PRN(String aDJUSTED_PRN) {
		ADJUSTED_PRN = aDJUSTED_PRN;
	}

	public String getADJUSTED_LPS() {
		return ADJUSTED_LPS;
	}

	public void setADJUSTED_LPS(String aDJUSTED_LPS) {
		ADJUSTED_LPS = aDJUSTED_LPS;
	}

	public String getADJUSTED_VAT() {
		return ADJUSTED_VAT;
	}

	public void setADJUSTED_VAT(String aDJUSTED_VAT) {
		ADJUSTED_VAT = aDJUSTED_VAT;
	}

	public String getINSTALLMENT_PRN_1() {
		return INSTALLMENT_PRN_1;
	}

	public void setINSTALLMENT_PRN_1(String iNSTALLMENT_PRN_1) {
		INSTALLMENT_PRN_1 = iNSTALLMENT_PRN_1;
	}

	public String getINSTALLMENT_LPS_1() {
		return INSTALLMENT_LPS_1;
	}

	public void setINSTALLMENT_LPS_1(String iNSTALLMENT_LPS_1) {
		INSTALLMENT_LPS_1 = iNSTALLMENT_LPS_1;
	}

	public String getINSTALLMENT_VAT_1() {
		return INSTALLMENT_VAT_1;
	}

	public void setINSTALLMENT_VAT_1(String iNSTALLMENT_VAT_1) {
		INSTALLMENT_VAT_1 = iNSTALLMENT_VAT_1;
	}

	public String getTOTAL_VAT() {
		return TOTAL_VAT;
	}

	public void setTOTAL_VAT(String tOTAL_VAT) {
		TOTAL_VAT = tOTAL_VAT;
	}

	public String getTOTAL_BILL() {
		return TOTAL_BILL;
	}

	public void setTOTAL_BILL(String tOTAL_BILL) {
		TOTAL_BILL = tOTAL_BILL;
	}

	public String getRCPT_PRN_1() {
		return RCPT_PRN_1;
	}

	public void setRCPT_PRN_1(String rCPT_PRN_1) {
		RCPT_PRN_1 = rCPT_PRN_1;
	}

	public String getRCPT_PRN_2() {
		return RCPT_PRN_2;
	}

	public void setRCPT_PRN_2(String rCPT_PRN_2) {
		RCPT_PRN_2 = rCPT_PRN_2;
	}

	public String getRCPT_DATE_1() {
		return RCPT_DATE_1;
	}

	public void setRCPT_DATE_1(String rCPT_DATE_1) {
		RCPT_DATE_1 = rCPT_DATE_1;
	}

	public String getRCPT_DATE_2() {
		return RCPT_DATE_2;
	}

	public void setRCPT_DATE_2(String rCPT_DATE_2) {
		RCPT_DATE_2 = rCPT_DATE_2;
	}

	public String getSARR_PRN_N_SRCHG1() {
		return SARR_PRN_N_SRCHG1;
	}

	public void setSARR_PRN_N_SRCHG1(String sARR_PRN_N_SRCHG1) {
		SARR_PRN_N_SRCHG1 = sARR_PRN_N_SRCHG1;
	}

	public String getSARR_PRN_N_SRCHG2() {
		return SARR_PRN_N_SRCHG2;
	}

	public void setSARR_PRN_N_SRCHG2(String sARR_PRN_N_SRCHG2) {
		SARR_PRN_N_SRCHG2 = sARR_PRN_N_SRCHG2;
	}

	public String getSARR_PRN_N_SRCHG3() {
		return SARR_PRN_N_SRCHG3;
	}

	public void setSARR_PRN_N_SRCHG3(String sARR_PRN_N_SRCHG3) {
		SARR_PRN_N_SRCHG3 = sARR_PRN_N_SRCHG3;
	}

	public String getSARR_PRN_N_SRCHG4() {
		return SARR_PRN_N_SRCHG4;
	}

	public void setSARR_PRN_N_SRCHG4(String sARR_PRN_N_SRCHG4) {
		SARR_PRN_N_SRCHG4 = sARR_PRN_N_SRCHG4;
	}

	public String getSARR_PRN_N_SRCHG5() {
		return SARR_PRN_N_SRCHG5;
	}

	public void setSARR_PRN_N_SRCHG5(String sARR_PRN_N_SRCHG5) {
		SARR_PRN_N_SRCHG5 = sARR_PRN_N_SRCHG5;
	}

	public String getSARR_PRN_N_SRCHG6() {
		return SARR_PRN_N_SRCHG6;
	}

	public void setSARR_PRN_N_SRCHG6(String sARR_PRN_N_SRCHG6) {
		SARR_PRN_N_SRCHG6 = sARR_PRN_N_SRCHG6;
	}

	public String getSARR_PRN_N_SRCHG7() {
		return SARR_PRN_N_SRCHG7;
	}

	public void setSARR_PRN_N_SRCHG7(String sARR_PRN_N_SRCHG7) {
		SARR_PRN_N_SRCHG7 = sARR_PRN_N_SRCHG7;
	}

	public String getSARR_PRN_N_SRCHG9() {
		return SARR_PRN_N_SRCHG9;
	}

	public void setSARR_PRN_N_SRCHG9(String sARR_PRN_N_SRCHG9) {
		SARR_PRN_N_SRCHG9 = sARR_PRN_N_SRCHG9;
	}

	public String getSARR_PRN_N_SRCHG10() {
		return SARR_PRN_N_SRCHG10;
	}

	public void setSARR_PRN_N_SRCHG10(String sARR_PRN_N_SRCHG10) {
		SARR_PRN_N_SRCHG10 = sARR_PRN_N_SRCHG10;
	}

	public String getSARR_PRN_N_SRCHG11() {
		return SARR_PRN_N_SRCHG11;
	}

	public void setSARR_PRN_N_SRCHG11(String sARR_PRN_N_SRCHG11) {
		SARR_PRN_N_SRCHG11 = sARR_PRN_N_SRCHG11;
	}

	public String getDARREAR1() {
		return DARREAR1;
	}

	public void setDARREAR1(String dARREAR1) {
		DARREAR1 = dARREAR1;
	}

	public String getDARREAR2() {
		return DARREAR2;
	}

	public void setDARREAR2(String dARREAR2) {
		DARREAR2 = dARREAR2;
	}

	public String getDARREAR3() {
		return DARREAR3;
	}

	public void setDARREAR3(String dARREAR3) {
		DARREAR3 = dARREAR3;
	}

	public String getDARREAR4() {
		return DARREAR4;
	}

	public void setDARREAR4(String dARREAR4) {
		DARREAR4 = dARREAR4;
	}

	public String getDARREAR5() {
		return DARREAR5;
	}

	public void setDARREAR5(String dARREAR5) {
		DARREAR5 = dARREAR5;
	}

	public String getDARREAR6() {
		return DARREAR6;
	}

	public void setDARREAR6(String dARREAR6) {
		DARREAR6 = dARREAR6;
	}

	public String getDARREAR7() {
		return DARREAR7;
	}

	public void setDARREAR7(String dARREAR7) {
		DARREAR7 = dARREAR7;
	}

	public String getDARREAR8() {
		return DARREAR8;
	}

	public void setDARREAR8(String dARREAR8) {
		DARREAR8 = dARREAR8;
	}

	public String getDARREAR9() {
		return DARREAR9;
	}

	public void setDARREAR9(String dARREAR9) {
		DARREAR9 = dARREAR9;
	}

	public String getDARREAR10() {
		return DARREAR10;
	}

	public void setDARREAR10(String dARREAR10) {
		DARREAR10 = dARREAR10;
	}

	public String getDARREAR11() {
		return DARREAR11;
	}

	public void setDARREAR11(String dARREAR11) {
		DARREAR11 = dARREAR11;
	}

	public String getDARREAR12() {
		return DARREAR12;
	}

	public void setDARREAR12(String dARREAR12) {
		DARREAR12 = dARREAR12;
	}

	public String getPRESENT_READING_DATE() {
		return PRESENT_READING_DATE;
	}

	public void setPRESENT_READING_DATE(String pRESENT_READING_DATE) {
		PRESENT_READING_DATE = pRESENT_READING_DATE;
	}

	public String getPREV_READING_DATE() {
		return PREV_READING_DATE;
	}

	public void setPREV_READING_DATE(String pREV_READING_DATE) {
		PREV_READING_DATE = pREV_READING_DATE;
	}

	public String getVAT_PERCENT() {
		return VAT_PERCENT;
	}

	public void setVAT_PERCENT(String vAT_PERCENT) {
		VAT_PERCENT = vAT_PERCENT;
	}

	public String getC1() {
		return C1;
	}

	public void setC1(String c1) {
		C1 = c1;
	}

	public String getC2() {
		return C2;
	}

	public void setC2(String c2) {
		C2 = c2;
	}

	public String getC3() {
		return C3;
	}

	public void setC3(String c3) {
		C3 = c3;
	}

	public String getARR_VAT_12() {
		return ARR_VAT_12;
	}

	public void setARR_VAT_12(String aRR_VAT_12) {
		ARR_VAT_12 = aRR_VAT_12;
	}

	public String getCURRENT_LPS() {
		return CURRENT_LPS;
	}

	public void setCURRENT_LPS(String cURRENT_LPS) {
		CURRENT_LPS = cURRENT_LPS;
	}

	public String getTOTAL_LPS() {
		return TOTAL_LPS;
	}

	public void setTOTAL_LPS(String tOTAL_LPS) {
		TOTAL_LPS = tOTAL_LPS;
	}

	public String getMAX_DMD_RDNG_1() {
		return MAX_DMD_RDNG_1;
	}

	public void setMAX_DMD_RDNG_1(String mAX_DMD_RDNG_1) {
		MAX_DMD_RDNG_1 = mAX_DMD_RDNG_1;
	}

	public String getSANC_LOAD_1() {
		return SANC_LOAD_1;
	}

	public void setSANC_LOAD_1(String sANC_LOAD_1) {
		SANC_LOAD_1 = sANC_LOAD_1;
	}

	public String getUSAGE_TYPE_1() {
		return USAGE_TYPE_1;
	}

	public void setUSAGE_TYPE_1(String uSAGE_TYPE_1) {
		USAGE_TYPE_1 = uSAGE_TYPE_1;
	}

	public String getF_H_NAME() {
		return F_H_NAME;
	}

	public void setF_H_NAME(String f_H_NAME) {
		F_H_NAME = f_H_NAME;
	}

	public String getMONTH1() {
		return MONTH1;
	}

	public void setMONTH1(String mONTH1) {
		MONTH1 = mONTH1;
	}

	public String getMONTH2() {
		return MONTH2;
	}

	public void setMONTH2(String mONTH2) {
		MONTH2 = mONTH2;
	}

	public String getMONTH3() {
		return MONTH3;
	}

	public void setMONTH3(String mONTH3) {
		MONTH3 = mONTH3;
	}

	public String getMONTH4() {
		return MONTH4;
	}

	public void setMONTH4(String mONTH4) {
		MONTH4 = mONTH4;
	}

	public String getMONTH5() {
		return MONTH5;
	}

	public void setMONTH5(String mONTH5) {
		MONTH5 = mONTH5;
	}

	public String getMONTH6() {
		return MONTH6;
	}

	public void setMONTH6(String mONTH6) {
		MONTH6 = mONTH6;
	}

	public String getMONTH7() {
		return MONTH7;
	}

	public void setMONTH7(String mONTH7) {
		MONTH7 = mONTH7;
	}

	public String getMONTH8() {
		return MONTH8;
	}

	public void setMONTH8(String mONTH8) {
		MONTH8 = mONTH8;
	}

	public String getLOC_CONTACT() {
		return LOC_CONTACT;
	}

	public void setLOC_CONTACT(String lOC_CONTACT) {
		LOC_CONTACT = lOC_CONTACT;
	}

	public String getNM_CLS_KWH_SR_RDNG() {
		return NM_CLS_KWH_SR_RDNG;
	}

	public void setNM_CLS_KWH_SR_RDNG(String nM_CLS_KWH_SR_RDNG) {
		NM_CLS_KWH_SR_RDNG = nM_CLS_KWH_SR_RDNG;
	}

	public String getNM_CLS_KWH_OFPK_RDNG() {
		return NM_CLS_KWH_OFPK_RDNG;
	}

	public void setNM_CLS_KWH_OFPK_RDNG(String nM_CLS_KWH_OFPK_RDNG) {
		NM_CLS_KWH_OFPK_RDNG = nM_CLS_KWH_OFPK_RDNG;
	}

	public String getNM_CLS_KWH_PK_RDNG() {
		return NM_CLS_KWH_PK_RDNG;
	}

	public void setNM_CLS_KWH_PK_RDNG(String nM_CLS_KWH_PK_RDNG) {
		NM_CLS_KWH_PK_RDNG = nM_CLS_KWH_PK_RDNG;
	}

	public String getNM_OPN_KWH_SR_RDNG() {
		return NM_OPN_KWH_SR_RDNG;
	}

	public void setNM_OPN_KWH_SR_RDNG(String nM_OPN_KWH_SR_RDNG) {
		NM_OPN_KWH_SR_RDNG = nM_OPN_KWH_SR_RDNG;
	}

	public String getNM_OPN_KWH_OFPK_RDNG() {
		return NM_OPN_KWH_OFPK_RDNG;
	}

	public void setNM_OPN_KWH_OFPK_RDNG(String nM_OPN_KWH_OFPK_RDNG) {
		NM_OPN_KWH_OFPK_RDNG = nM_OPN_KWH_OFPK_RDNG;
	}

	public String getNM_OPN_KWH_PK_RDNG() {
		return NM_OPN_KWH_PK_RDNG;
	}

	public void setNM_OPN_KWH_PK_RDNG(String nM_OPN_KWH_PK_RDNG) {
		NM_OPN_KWH_PK_RDNG = nM_OPN_KWH_PK_RDNG;
	}

	public String getNM__CONS_KWH_SR() {
		return NM__CONS_KWH_SR;
	}

	public void setNM__CONS_KWH_SR(String nM__CONS_KWH_SR) {
		NM__CONS_KWH_SR = nM__CONS_KWH_SR;
	}

	public String getNM_CONS_KWH_OFPK() {
		return NM_CONS_KWH_OFPK;
	}

	public void setNM_CONS_KWH_OFPK(String nM_CONS_KWH_OFPK) {
		NM_CONS_KWH_OFPK = nM_CONS_KWH_OFPK;
	}

	public String getNM_CONS_KWH_PK() {
		return NM_CONS_KWH_PK;
	}

	public void setNM_CONS_KWH_PK(String nM_CONS_KWH_PK) {
		NM_CONS_KWH_PK = nM_CONS_KWH_PK;
	}

	public String getNET_CAPACITY() {
		return NET_CAPACITY;
	}

	public void setNET_CAPACITY(String nET_CAPACITY) {
		NET_CAPACITY = nET_CAPACITY;
	}

	public String getSR_ADJ_UNIT() {
		return SR_ADJ_UNIT;
	}

	public void setSR_ADJ_UNIT(String sR_ADJ_UNIT) {
		SR_ADJ_UNIT = sR_ADJ_UNIT;
	}

	public String getOFPK_ADJ_UNIT() {
		return OFPK_ADJ_UNIT;
	}

	public void setOFPK_ADJ_UNIT(String oFPK_ADJ_UNIT) {
		OFPK_ADJ_UNIT = oFPK_ADJ_UNIT;
	}

	public String getPK_ADJ_UNIT() {
		return PK_ADJ_UNIT;
	}

	public void setPK_ADJ_UNIT(String pK_ADJ_UNIT) {
		PK_ADJ_UNIT = pK_ADJ_UNIT;
	}

	public String getCF_UNIT() {
		return CF_UNIT;
	}

	public void setCF_UNIT(String cF_UNIT) {
		CF_UNIT = cF_UNIT;
	}

	public String getBF_UNIT() {
		return BF_UNIT;
	}

	public void setBF_UNIT(String bF_UNIT) {
		BF_UNIT = bF_UNIT;
	}

	public String getSETTLEMENT_UNIT() {
		return SETTLEMENT_UNIT;
	}

	public void setSETTLEMENT_UNIT(String sETTLEMENT_UNIT) {
		SETTLEMENT_UNIT = sETTLEMENT_UNIT;
	}

	public String getUTILITY_RATE() {
		return UTILITY_RATE;
	}

	public void setUTILITY_RATE(String uTILITY_RATE) {
		UTILITY_RATE = uTILITY_RATE;
	}

	public String getNET_SETTLEMENT_AMT() {
		return NET_SETTLEMENT_AMT;
	}

	public void setNET_SETTLEMENT_AMT(String nET_SETTLEMENT_AMT) {
		NET_SETTLEMENT_AMT = nET_SETTLEMENT_AMT;
	}

	public String getNET_PRIN_ADJ_AMT() {
		return NET_PRIN_ADJ_AMT;
	}

	public void setNET_PRIN_ADJ_AMT(String nET_PRIN_ADJ_AMT) {
		NET_PRIN_ADJ_AMT = nET_PRIN_ADJ_AMT;
	}

	public String getNET_VAT_ADJ_AMT() {
		return NET_VAT_ADJ_AMT;
	}

	public void setNET_VAT_ADJ_AMT(String nET_VAT_ADJ_AMT) {
		NET_VAT_ADJ_AMT = nET_VAT_ADJ_AMT;
	}

	public String getNET_TOT_BILL() {
		return NET_TOT_BILL;
	}

	public void setNET_TOT_BILL(String nET_TOT_BILL) {
		NET_TOT_BILL = nET_TOT_BILL;
	}

	@Override
	public String toString() {
		return "BillPrint [CUST_ID=" + CUST_ID + ", BMONTH=" + BMONTH + ", NO_OF_COPIES=" + NO_OF_COPIES
				+ ", USAGE_TYPE=" + USAGE_TYPE + ", BILL_STATUS=" + BILL_STATUS + ", LOCATION_CODE=" + LOCATION_CODE
				+ ", LOCATION_NAME=" + LOCATION_NAME + ", FEEDER_NAME=" + FEEDER_NAME + ", AREA_CODE=" + AREA_CODE
				+ ", CUSTOMER_NAME=" + CUSTOMER_NAME + ", ADDR_DESCR1=" + ADDR_DESCR1 + ", ADDR_DESCR2=" + ADDR_DESCR2
				+ ", ADDR_DESCR3=" + ADDR_DESCR3 + ", CITY=" + CITY + ", PIN_CODE=" + PIN_CODE + ", USAGE_TYPE1="
				+ USAGE_TYPE1 + ", INVOICE_NUM=" + INVOICE_NUM + ", INVOICE_CHKDIGIT=" + INVOICE_CHKDIGIT
				+ ", INVOICE_DATE=" + INVOICE_DATE + ", BOOK=" + BOOK + ", BILL_GR=" + BILL_GR + ", WLK=" + WLK
				+ ", CONS_EXTG_NUM=" + CONS_EXTG_NUM + ", CUSTOMER_NUM=" + CUSTOMER_NUM + ", OLD_CUSTNO=" + OLD_CUSTNO
				+ ", CONS_CHK_DIGIT=" + CONS_CHK_DIGIT + ", INVOICE_DUE_DATE=" + INVOICE_DUE_DATE + ", TARIFF=" + TARIFF
				+ ", BUS_TYPE_CODE=" + BUS_TYPE_CODE + ", CUST_STATUS=" + CUST_STATUS + ", SPECIAL_CODE=" + SPECIAL_CODE
				+ ", SPECIAL_VALUE=" + SPECIAL_VALUE + ", RULE=" + RULE + ", SANC_LOAD=" + SANC_LOAD + ", CONNECT_LOAD="
				+ CONNECT_LOAD + ", METER_NUM_KWH=" + METER_NUM_KWH + ", METER_COND_KWH=" + METER_COND_KWH
				+ ", OMF_KWH=" + OMF_KWH + ", METER_NUM_KVARH=" + METER_NUM_KVARH + ", METER_COND_KVARH="
				+ METER_COND_KVARH + ", OMF_KVARH=" + OMF_KVARH + ", METER_COND_KW=" + METER_COND_KW + ", OMF_KW="
				+ OMF_KW + ", XF_LOSS_SR_CONS=" + XF_LOSS_SR_CONS + ", XF_LOSS_OFPK_CONS=" + XF_LOSS_OFPK_CONS
				+ ", XF_LOSS_PK_CONS=" + XF_LOSS_PK_CONS + ", PFC_SR_CONS=" + PFC_SR_CONS + ", PFC_OFPK_CONS="
				+ PFC_OFPK_CONS + ", PFC_PK_CONS=" + PFC_PK_CONS + ", OLD_KWH_SR_CONS=" + OLD_KWH_SR_CONS
				+ ", OLD_KWH_OFPK_CONS=" + OLD_KWH_OFPK_CONS + ", OLD_KWH_PK_CONS=" + OLD_KWH_PK_CONS
				+ ", OLD_KVARH_SR_CONS=" + OLD_KVARH_SR_CONS + ", OLD_KVARH_OFPK_CONS=" + OLD_KVARH_OFPK_CONS
				+ ", OLD_KVARH_PK_CONS=" + OLD_KVARH_PK_CONS + ", CLS_KWH_SR_RDNG=" + CLS_KWH_SR_RDNG
				+ ", CLS_KWH_OFPK_RDNG=" + CLS_KWH_OFPK_RDNG + ", CLS_KWH_PK_RDNG=" + CLS_KWH_PK_RDNG
				+ ", OPN_KWH_SR_RDNG=" + OPN_KWH_SR_RDNG + ", OPN_KWH_OFPK_RDNG=" + OPN_KWH_OFPK_RDNG
				+ ", OPN_KWH_PK_RDNG=" + OPN_KWH_PK_RDNG + ", CONS_KWH_SR=" + CONS_KWH_SR + ", CONS_KWH_OFPK="
				+ CONS_KWH_OFPK + ", CONS_KWH_PK=" + CONS_KWH_PK + ", CLS_KVARH_SR_RDNG=" + CLS_KVARH_SR_RDNG
				+ ", CLS_KVARH_OFPK_RDNG=" + CLS_KVARH_OFPK_RDNG + ", CLS_KVARH_PK_RDNG=" + CLS_KVARH_PK_RDNG
				+ ", OPN_KVARH_SR_RDNG=" + OPN_KVARH_SR_RDNG + ", OPN_KVARH_OFPK_RDNG=" + OPN_KVARH_OFPK_RDNG
				+ ", OPN_KVARH_PK_RDNG=" + OPN_KVARH_PK_RDNG + ", CONS_KVARH_SR=" + CONS_KVARH_SR + ", CONS_KVARH_OFPK="
				+ CONS_KVARH_OFPK + ", CONS_KVARH_PK=" + CONS_KVARH_PK + ", PRESENT_CUM_NO=" + PRESENT_CUM_NO
				+ ", PRESENT_DMD_RDNG=" + PRESENT_DMD_RDNG + ", PREVIOUS_CUM_NO=" + PREVIOUS_CUM_NO
				+ ", PREVIOUS_DMD_RDNG=" + PREVIOUS_DMD_RDNG + ", MAX_DMD_RDNG=" + MAX_DMD_RDNG + ", POWER_FACTOR="
				+ POWER_FACTOR + ", PF_CORRECTION=" + PF_CORRECTION + ", ARREAR_FROMDATE=" + ARREAR_FROMDATE
				+ ", ARREAR_TODATE=" + ARREAR_TODATE + ", VAT_ARR_FROMDATE=" + VAT_ARR_FROMDATE + ", VAT_ARR_TODATE="
				+ VAT_ARR_TODATE + ", ADJUSTED_CONS=" + ADJUSTED_CONS + ", BILL_TYPE_CODE=" + BILL_TYPE_CODE
				+ ", POLE_NUMBER=" + POLE_NUMBER + ", INST_PLAN_NUM1=" + INST_PLAN_NUM1 + ", INST_PLAN_NUM2="
				+ INST_PLAN_NUM2 + ", ENG_CHRG_SR=" + ENG_CHRG_SR + ", ENG_CHRG_OFPK=" + ENG_CHRG_OFPK
				+ ", ENG_CHRG_PK=" + ENG_CHRG_PK + ", DEMAND_CHRG=" + DEMAND_CHRG + ", MINIMUM_CHRG=" + MINIMUM_CHRG
				+ ", SERVICE_CHRG=" + SERVICE_CHRG + ", XF_LOSS_CHRG=" + XF_LOSS_CHRG + ", XF_RENT=" + XF_RENT
				+ ", PFC_CHARGE=" + PFC_CHARGE + ", PRINC_AMT=" + PRINC_AMT + ", CURRENT_VAT=" + CURRENT_VAT
				+ ", CURRENT_AMT=" + CURRENT_AMT + ", ADJUSTED_PRN=" + ADJUSTED_PRN + ", ADJUSTED_LPS=" + ADJUSTED_LPS
				+ ", ADJUSTED_VAT=" + ADJUSTED_VAT + ", INSTALLMENT_PRN_1=" + INSTALLMENT_PRN_1 + ", INSTALLMENT_LPS_1="
				+ INSTALLMENT_LPS_1 + ", INSTALLMENT_VAT_1=" + INSTALLMENT_VAT_1 + ", TOTAL_VAT=" + TOTAL_VAT
				+ ", TOTAL_BILL=" + TOTAL_BILL + ", RCPT_PRN_1=" + RCPT_PRN_1 + ", RCPT_PRN_2=" + RCPT_PRN_2
				+ ", RCPT_DATE_1=" + RCPT_DATE_1 + ", RCPT_DATE_2=" + RCPT_DATE_2 + ", SARR_PRN_N_SRCHG1="
				+ SARR_PRN_N_SRCHG1 + ", SARR_PRN_N_SRCHG2=" + SARR_PRN_N_SRCHG2 + ", SARR_PRN_N_SRCHG3="
				+ SARR_PRN_N_SRCHG3 + ", SARR_PRN_N_SRCHG4=" + SARR_PRN_N_SRCHG4 + ", SARR_PRN_N_SRCHG5="
				+ SARR_PRN_N_SRCHG5 + ", SARR_PRN_N_SRCHG6=" + SARR_PRN_N_SRCHG6 + ", SARR_PRN_N_SRCHG7="
				+ SARR_PRN_N_SRCHG7 + ", SARR_PRN_N_SRCHG9=" + SARR_PRN_N_SRCHG9 + ", SARR_PRN_N_SRCHG10="
				+ SARR_PRN_N_SRCHG10 + ", SARR_PRN_N_SRCHG11=" + SARR_PRN_N_SRCHG11 + ", DARREAR1=" + DARREAR1
				+ ", DARREAR2=" + DARREAR2 + ", DARREAR3=" + DARREAR3 + ", DARREAR4=" + DARREAR4 + ", DARREAR5="
				+ DARREAR5 + ", DARREAR6=" + DARREAR6 + ", DARREAR7=" + DARREAR7 + ", DARREAR8=" + DARREAR8
				+ ", DARREAR9=" + DARREAR9 + ", DARREAR10=" + DARREAR10 + ", DARREAR11=" + DARREAR11 + ", DARREAR12="
				+ DARREAR12 + ", PRESENT_READING_DATE=" + PRESENT_READING_DATE + ", PREV_READING_DATE="
				+ PREV_READING_DATE + ", VAT_PERCENT=" + VAT_PERCENT + ", C1=" + C1 + ", C2=" + C2 + ", C3=" + C3
				+ ", ARR_VAT_12=" + ARR_VAT_12 + ", CURRENT_LPS=" + CURRENT_LPS + ", TOTAL_LPS=" + TOTAL_LPS
				+ ", MAX_DMD_RDNG_1=" + MAX_DMD_RDNG_1 + ", SANC_LOAD_1=" + SANC_LOAD_1 + ", USAGE_TYPE_1="
				+ USAGE_TYPE_1 + ", F_H_NAME=" + F_H_NAME + ", MONTH1=" + MONTH1 + ", MONTH2=" + MONTH2 + ", MONTH3="
				+ MONTH3 + ", MONTH4=" + MONTH4 + ", MONTH5=" + MONTH5 + ", MONTH6=" + MONTH6 + ", MONTH7=" + MONTH7
				+ ", MONTH8=" + MONTH8 + ", LOC_CONTACT=" + LOC_CONTACT + ", NM_CLS_KWH_SR_RDNG=" + NM_CLS_KWH_SR_RDNG
				+ ", NM_CLS_KWH_OFPK_RDNG=" + NM_CLS_KWH_OFPK_RDNG + ", NM_CLS_KWH_PK_RDNG=" + NM_CLS_KWH_PK_RDNG
				+ ", NM_OPN_KWH_SR_RDNG=" + NM_OPN_KWH_SR_RDNG + ", NM_OPN_KWH_OFPK_RDNG=" + NM_OPN_KWH_OFPK_RDNG
				+ ", NM_OPN_KWH_PK_RDNG=" + NM_OPN_KWH_PK_RDNG + ", NM__CONS_KWH_SR=" + NM__CONS_KWH_SR
				+ ", NM_CONS_KWH_OFPK=" + NM_CONS_KWH_OFPK + ", NM_CONS_KWH_PK=" + NM_CONS_KWH_PK + ", NET_CAPACITY="
				+ NET_CAPACITY + ", SR_ADJ_UNIT=" + SR_ADJ_UNIT + ", OFPK_ADJ_UNIT=" + OFPK_ADJ_UNIT + ", PK_ADJ_UNIT="
				+ PK_ADJ_UNIT + ", CF_UNIT=" + CF_UNIT + ", BF_UNIT=" + BF_UNIT + ", SETTLEMENT_UNIT=" + SETTLEMENT_UNIT
				+ ", UTILITY_RATE=" + UTILITY_RATE + ", NET_SETTLEMENT_AMT=" + NET_SETTLEMENT_AMT
				+ ", NET_PRIN_ADJ_AMT=" + NET_PRIN_ADJ_AMT + ", NET_VAT_ADJ_AMT=" + NET_VAT_ADJ_AMT + ", NET_TOT_BILL="
				+ NET_TOT_BILL + "]";
	}
	
	
	
	
	

}
